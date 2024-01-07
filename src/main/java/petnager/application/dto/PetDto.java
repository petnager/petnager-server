package petnager.application.dto;

import petnager.application.domain.Age;
import petnager.application.domain.Pet;

public record PetDto(
        Long id,
        String name,
        String type,
        String kind,
        String gender,
        String profileImage,
        Age age,
        Boolean neutering
) {

    public PetDto(Pet pet) {
        this(pet.getId(), pet.getName(), pet.getType(), pet.getKind(), pet.getGender(), pet.getGender(), pet.getAge(),
                pet.getNeutering());
    }
}
