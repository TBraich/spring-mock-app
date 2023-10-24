package edu.petstore.pet.service;

import edu.petstore.pet.dto.request.CreatePetRequest;
import edu.petstore.pet.dto.request.SearchPetRequest;
import edu.petstore.pet.dto.request.UpdatePetRequest;
import org.springframework.http.ResponseEntity;

public interface PetService {
  ResponseEntity<Object> create(String traceId, CreatePetRequest petRequest);

  ResponseEntity<Object> update(String traceId, UpdatePetRequest petRequest);

  ResponseEntity<Object> find(String traceId, Integer petId);

  ResponseEntity<Object> search(String traceId, SearchPetRequest searchRequest);
}
