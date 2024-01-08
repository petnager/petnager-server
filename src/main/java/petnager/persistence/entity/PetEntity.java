package petnager.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String type;

    @NotNull
    private String kind;

    @NotNull
    private String gender;

    @NotNull
    private String profileImage;

    @NotNull
    private LocalDate birth;

    @NotNull
    private Boolean neutering;

    public PetEntity(String name, String type, String kind, String gender, String profileImage, LocalDate birth,
                     Boolean neutering) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.gender = gender;
        this.profileImage = profileImage;
        this.birth = birth;
        this.neutering = neutering;
    }
}
