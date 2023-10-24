package edu.petstore.pet.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder(toBuilder = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private Integer id;
    private String name;
    private String status;
    private List<String> imageUrls;
    private PetCategory category;
    private List<String> tags;
}
