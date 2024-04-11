package bg.fmi.web.dog_shelter_management.demo.model;

import lombok.Data;

@Data
public class Dog {
    private Long id;
    private String name;
    private Integer age;
    private String breed;

    public Dog() {

    }
}
