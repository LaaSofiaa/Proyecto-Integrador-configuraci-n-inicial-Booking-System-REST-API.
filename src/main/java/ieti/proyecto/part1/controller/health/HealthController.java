package ieti.proyecto.part1.controller.health;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<String> checkAPI(){
        return ResponseEntity.ok("<h1>The API is working ok!</h1>");
    }

}
