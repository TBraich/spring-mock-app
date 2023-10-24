package edu.petstore.pet.api;

import java.net.InetAddress;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
@Log4j2
@RequiredArgsConstructor
public class HealthController {
  @GetMapping
  public ResponseEntity<Object> health() {
    return ResponseEntity.ok()
        .body(
            "Spring app say hello from IP: "
                + InetAddress.getLoopbackAddress().getHostAddress()
                + "!");
  }
}
