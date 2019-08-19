package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VincentGradleController {

	@RequestMapping(value = "/bonjourvincent", method = RequestMethod.GET)
	@ResponseBody
    public String BonjourGradle() {
        return "Bonjour c'est Vincent!";
    }    

}
