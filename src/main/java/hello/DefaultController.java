package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class DefaultController {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello there!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DefaultController.class, args);
		System.out.println("=== LAUNCH SUCCESS ===");
	}

}
