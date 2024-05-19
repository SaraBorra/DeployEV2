package DeployEV2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/")
    public String getMessage() {
        return welcomeMsg;
    }
}