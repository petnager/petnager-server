package petnager.application.domain;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class Pet {

    private final Long id;
    private final String name;
    private final String type;
    private final String kind;
    private final String gender;
    private final String profileImage;
    private final Age age;
    private final Boolean neutering;

    public Pet(Long id, String name, String type, String kind, String gender, String profileImage, LocalDate birth,
               Boolean neutering) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.gender = gender;
        this.profileImage = profileImage;
        this.age = new Age(birth);
        this.neutering = neutering;
    }
}
