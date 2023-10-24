package edu.petstore.pet.api;

import edu.petstore.pet.dto.request.CreatePetRequest;
import edu.petstore.pet.dto.request.SearchPetRequest;
import edu.petstore.pet.dto.request.UpdatePetRequest;
import edu.petstore.pet.service.PetService;
import jakarta.websocket.server.PathParam;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
@Log4j2
@RequiredArgsConstructor
public class PetController {
  private final PetService createService;
  private final PetService updateService;
  private final PetService findService;

  @PostMapping
  public ResponseEntity<Object> create(
      @RequestHeader("trace-id") String traceId, @Validated @RequestBody CreatePetRequest petData) {
    return createService.create(traceId, petData);
  }

  @PutMapping
  public ResponseEntity<Object> update(
      @RequestHeader("trace-id") String traceId, @Validated @RequestBody UpdatePetRequest petData) {
    return updateService.update(traceId, petData);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> find(
      @RequestHeader("trace-id") String traceId, @PathParam("id") Integer id) {
    return findService.find(traceId, id);
  }

  @GetMapping
  public ResponseEntity<Object> search(
      @RequestHeader("trace-id") String traceId,
      @RequestParam(value = "tags", required = false) List<String> tags,
      @RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "categories", required = false) List<String> categoryIds,
      @RequestParam(value = "status", required = false) String status) {
    return findService.search(
        traceId,
        SearchPetRequest.builder()
            .tags(tags)
            .name(name)
            .categoryIds(categoryIds)
            .status(status)
            .build());
  }
}
