package petnager.persistence.dto;

import java.time.LocalDate;
import petnager.persistence.entity.PetEntity;

public record PetEntityDto(
        Long id,
        String name,
        String type,
        String kind,
        String gender,
        String profileImage,
        LocalDate birth,
        Boolean neutering
) {

    public PetEntityDto(PetEntity petEntity) {
        this(petEntity.getId(), petEntity.getName(), petEntity.getType(), petEntity.getKind(), petEntity.getGender(),
                petEntity.getProfileImage(), petEntity.getBirth(), petEntity.getNeutering());
    }
}
