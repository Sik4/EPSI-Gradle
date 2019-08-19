package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HoboChangeController {

    @RequestMapping("/hobo")
    public String hoboChange() {
        return "Une p'tite pièce ?";
    }

}