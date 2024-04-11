package bg.fmi.web.dog_shelter_management.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DogDTO {
    String name;

    @NotNull
    @Min(value = 0, message = "Should be positive number")
    Integer age;
}
