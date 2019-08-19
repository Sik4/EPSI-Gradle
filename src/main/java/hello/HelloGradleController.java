package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/lapinNM")
public class HelloGradleController {

    @GetMapping
    public String helloGradle() {
        return "Hello Lapin de NM!";
    }

}