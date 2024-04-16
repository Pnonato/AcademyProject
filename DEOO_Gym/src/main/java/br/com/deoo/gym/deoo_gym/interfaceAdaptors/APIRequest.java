package br.com.deoo.gym.deoo_gym.interfaceAdaptors;
import br.com.deoo.gym.deoo_gym.entity.Contents; //isso aq nao pode ser feito pq viola o principio de camadas
//vou tirar dps, deixei assim so pra facilitar

public class APIRequest{    private Contents contents;

    public APIRequest(String prompt) {
        this.contents = new Contents("user", prompt);
    }

    public Contents getContents() {
        return contents;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }
}
