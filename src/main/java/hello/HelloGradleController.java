package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradleController {

    @RequestMapping("/")
    public String helloGradle() {
        return "Hello Gradle!";
    }

}