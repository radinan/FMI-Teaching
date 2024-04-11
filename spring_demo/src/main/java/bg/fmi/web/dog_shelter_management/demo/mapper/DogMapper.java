package bg.fmi.web.dog_shelter_management.demo.mapper;

import bg.fmi.web.dog_shelter_management.demo.dto.DogDTO;
import bg.fmi.web.dog_shelter_management.demo.model.Dog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DogMapper {
    Dog dogDtoToDog(DogDTO dog);
}
