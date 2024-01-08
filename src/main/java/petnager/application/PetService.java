package petnager.application;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import petnager.application.domain.Pet;
import petnager.application.dto.PetDto;
import petnager.persistence.PetRepository;
import petnager.persistence.dto.PetEntityDto;

@Service
@Transactional(readOnly = true)
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<PetDto> findAll() {
        var petEntityDtos = petRepository.findAll();

        var pets = petEntityDtos.stream()
                .map(this::toDomain)
                .toList();

        return pets.stream()
                .map(PetDto::new)
                .toList();
    }

    private Pet toDomain(PetEntityDto petEntityDto) {
        return new Pet(petEntityDto.id(), petEntityDto.name(), petEntityDto.type(), petEntityDto.kind(),
                petEntityDto.gender(), petEntityDto.profileImage(), petEntityDto.birth(), petEntityDto.neutering());
    }
}
