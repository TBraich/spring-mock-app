package edu.petstore.pet.dto.request;

import java.util.List;
import lombok.Builder;

@Builder
public class SearchPetRequest {
  List<String> tags;
  String name;
  List<String> categoryIds;
  String status;
}
