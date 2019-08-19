package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvierMetalGradleController {

    @RequestMapping("/evier")
    public String helloEvierMetal() {
        return "Evier Metal!";
    }

}