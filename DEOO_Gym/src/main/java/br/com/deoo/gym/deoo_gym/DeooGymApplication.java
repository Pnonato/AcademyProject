package br.com.deoo.gym.deoo_gym;

import br.com.deoo.gym.deoo_gym.A_entity.Enuns.Gender;
import br.com.deoo.gym.deoo_gym.A_entity.Enuns.PhysicalGoal;
import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;
import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.B_useCases.UserService;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dto.UserDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class DeooGymApplication {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DeooGymApplication.class, args);
	}

	@PostConstruct
	public void init() throws Exception {
		User liz = new User("liz", "liz@gmail", "123456");
		PhysicalCharacteristics lizchar = new PhysicalCharacteristics(40, 1.70, Gender.FEMININO, PhysicalGoal.DEFINIR, 20);
		liz.setCharacteristics(lizchar);
		userService.add(liz);
	}
}
