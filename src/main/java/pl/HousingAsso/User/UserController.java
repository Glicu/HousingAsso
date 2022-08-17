package pl.HousingAsso.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class UserController {

    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "It's Alive!";
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }

}

