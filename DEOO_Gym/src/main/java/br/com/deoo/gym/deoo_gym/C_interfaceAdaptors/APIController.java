package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @GetMapping("/send")
    public String send(@RequestParam String prompt) {

        APIRequest request = new APIRequest(prompt);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<APIRequest> requestEntity = new HttpEntity<>(request, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=", //colocar a chave da api quando for usar mas sempre lembrar de tirar
                //link pra fazer a key : https://aistudio.google.com/app/apikey?hl=pt-br
                //como fazer o teste no navegador
                //faça a key e adicione ao dado de 'key='
                //rode o projeto
                //coloque use o link http://localhost:8080/send?prompt=
                //o prompt pode ser alguma pergunta
                //por enquanto ele so responde o obj JSON
                //depois que testar tire a key!!> nao pode fazer commit com ela no codigo<
                HttpMethod.POST,
                requestEntity,
                String.class
        );
        return responseEntity.toString();

    }
}
