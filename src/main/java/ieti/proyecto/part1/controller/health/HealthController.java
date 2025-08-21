package ieti.proyecto.part1.Controller.health;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<String> checkAPI(){
        return ResponseEntity.ok("The API is working ok!");
    }

}
