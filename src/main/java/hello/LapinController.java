package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/lapin")
public class LapinController {

    @GetMapping
    public String getLapin() {
        return "Le lapin est mort";
    }


}