package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors;

import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dto.PhyCharacteristicsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APIController {
    @Qualifier("APIRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    @GetMapping("/send")
    public String send(@RequestParam String prompt) {
        PhyCharacteristicsDTO dto = new PhyCharacteristicsDTO("feminino", "aumento Massa", 16);
        APIRequest request = new APIRequest(dto.toString());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<APIRequest> requestEntity = new HttpEntity<>(request, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey,
                HttpMethod.POST,
                requestEntity,
                String.class
        );
        //recebe a requisição e envia pra classe JSONFormatting
        String responseBody = responseEntity.getBody();
        JSONFormatting jf = new JSONFormatting(responseBody);

        //usa o metodo da classe que pega so oq tem dentro de text !
        jf.processJSON();
        return jf.getClearText();

//        como testar:
//        1- abra o arquivo application.properties que ta dentro da pasta resousers e coloque sua api key
//        ao lado de api.key (coloque sem aspas)
//        2-modifique a instancia do PhyCharacteristicsDTO
//        3-rode o programa
//        4-coloque o link no navegador     http://localhost:8080/send?prompt !!

    }
}



