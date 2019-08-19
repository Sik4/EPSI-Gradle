package hello;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradleController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
    public String HelloGradle() {
        return "Hello Gradle!";
    }    

}