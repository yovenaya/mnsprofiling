package mu.mns.internal.demo.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remote")
public class RemoteController {

    @GetMapping
    public Integer testControllerMethod(@RequestParam int iterations) {

        Integer count = 0;

        for (int i = 0; i < iterations; i++) {
            count += (int) RandomNumberGenerator.generate();
        }

        return count;
    }
}
