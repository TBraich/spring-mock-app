package edu.petstore.pet.service.impl;

import edu.petstore.pet.dto.request.CreatePetRequest;
import edu.petstore.pet.dto.request.SearchPetRequest;
import edu.petstore.pet.dto.request.UpdatePetRequest;
import edu.petstore.pet.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

  @Override
  public ResponseEntity<Object> create(String traceId, CreatePetRequest petRequest) {
    return null;
  }

  @Override
  public ResponseEntity<Object> update(String traceId, UpdatePetRequest petRequest) {
    return null;
  }

  @Override
  public ResponseEntity<Object> find(String traceId, Integer petId) {
    return null;
  }

  @Override
  public ResponseEntity<Object> search(String traceId, SearchPetRequest searchRequest) {
    return null;
  }
}
