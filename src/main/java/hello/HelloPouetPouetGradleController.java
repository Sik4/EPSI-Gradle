package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPouetPouetGradleController {

    @RequestMapping("pouet")
    public String pouetPouetGradle() {
        return "Hello PouetPouet!";
    }
}
