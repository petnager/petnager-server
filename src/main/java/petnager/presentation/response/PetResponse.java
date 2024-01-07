package petnager.presentation.response;

import petnager.application.dto.PetDto;

public record PetResponse(
        Long id,
        String name,
        int age,
        String profileImage
) {

    public PetResponse(PetDto petDto) {
        this(petDto.id(), petDto.name(), petDto.age().calculateAge(), petDto.profileImage());
    }
}
