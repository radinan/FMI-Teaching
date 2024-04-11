package bg.fmi.web.dog_shelter_management.demo.controller;

import bg.fmi.web.dog_shelter_management.demo.dto.DogDTO;
import bg.fmi.web.dog_shelter_management.demo.mapper.DogMapper;
import bg.fmi.web.dog_shelter_management.demo.model.Dog;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/shelter")
public class ShelterController {
    private final DogMapper dogMapper;

//    @GetMapping("/dogs")
//    public List<Dog> getAllDogs() {
//        Dog dog1 = new Dog();
//        dog1.setAge(12);
//        Dog dog2 = new Dog();
//        dog2.setAge(24);
//
//        return List.of(dog1, dog2);
//    }

/*    @GetMapping("/dogs")
//    public Dog getDogByName(@RequestParam(value = "name", required = false) String name) {
    public Dog getDogByName(@RequestParam(value = "name") Optional<String> name) {
        Dog dog1 = new Dog();
        dog1.setName("John");
        Dog dog2 = new Dog();
        dog2.setName("Ivan");

        if ("John".equals(name)) {
            return dog1;
        } else {
            return dog2;
        }
    }

    @GetMapping("/dogs/{age}")
    public Dog getDogByAge(@PathVariable("age") Integer age) {
        Dog dog1 = new Dog();
        dog1.setAge(12);
        Dog dog2 = new Dog();
        dog2.setAge(24);

        if (age == 12) {
            return dog1;
        } else {
            return dog2;
        }
    }*/


    @PostMapping("/dogs")
    public ResponseEntity<Dog> addDogs(@RequestBody Dog dog) {
        return new ResponseEntity<>(dog, HttpStatus.CREATED);
    }

    @PutMapping("/dogs/{id}")
    public ResponseEntity<Void> updateDogs(@PathVariable("id") Integer id, @RequestBody Dog dog) {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/dogs/{id}")
    public Dog updateDogPartially(@PathVariable("id") Integer id, @Valid @RequestBody DogDTO dog) {
        return dogMapper.dogDtoToDog(dog);
    }

}
