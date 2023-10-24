package edu.petstore.pet.dto.request;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePetRequest {
    private String name;
    private Integer categoryId;
    private List<String> imageUrls;
    private List<String> tags;
    private String status;
}
