package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.web;

import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;
import br.com.deoo.gym.deoo_gym.A_entity.Training;
import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.B_useCases.UserService;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.JSONFormatting;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dto.PhyCharacteristicsDTO;
import br.com.deoo.gym.deoo_gym.B_useCases.DAOInterfaces.UserDAO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class APIController {

    @Qualifier("APIRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private UserService userService;

    private User getLoggedInUser(HttpSession session) {
        return (User) session.getAttribute("loggedInUser");
    }

    @GetMapping("/generate_training")
    public String generateTraining(HttpSession session) throws Exception {
        User loggedInUser = getLoggedInUser(session);

        if (loggedInUser != null) {
            if (loggedInUser.getCharacteristics() != null) {

                PhysicalCharacteristics characteristics = loggedInUser.getCharacteristics();
                PhyCharacteristicsDTO phyCharacteristicsDTO = new PhyCharacteristicsDTO(
                        characteristics.getGender(),
                        characteristics.getPhysicalGoal()
                );

                String prompt = phyCharacteristicsDTO.toString();
                APIRequest request = new APIRequest(prompt);
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                HttpEntity<APIRequest> requestEntity = new HttpEntity<>(request, headers);

                ResponseEntity<String> responseEntity = restTemplate.exchange(
                        "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey,
                        HttpMethod.POST,
                        requestEntity,
                        String.class
                );
                String responseBody = responseEntity.getBody();
                JSONFormatting jf = new JSONFormatting(responseBody);

                jf.processJSON();
                String clearText = jf.getClearText();

                Training training = new Training();
                training.setDescription(clearText);
                loggedInUser.setTraining(training);

                userService.update(loggedInUser.getId(), loggedInUser);

                return "redirect:/user_profile";
            } else {
                return "redirect:/add_characteristics";
            }
        } else {
            return "redirect:/add_user";
        }
    }
}
