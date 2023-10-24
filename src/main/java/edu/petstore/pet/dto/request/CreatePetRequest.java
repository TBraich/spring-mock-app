package edu.petstore.pet.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePetRequest {
    private String name;
    private Integer categoryId;
    private List<String> imageUrls;
    private List<String> tags;
    private String status;
}
