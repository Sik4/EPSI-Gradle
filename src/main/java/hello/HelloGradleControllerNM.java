package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/lapinNM")
public class HelloGradleControllerNM {

    @GetMapping
    public String helloGradleNM() {
        return "Hello Lapin de NM!";
    }

}