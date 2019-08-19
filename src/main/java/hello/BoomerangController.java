package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoomerangController {

    @RequestMapping("boomerang")
    public String boomerangGradle() { return "Le boomerang revient!"; }
}