package petnager.persistence;

import java.util.List;
import org.springframework.stereotype.Repository;
import petnager.persistence.dto.PetEntityDto;
import petnager.persistence.entity.PetEntity;

@Repository
public class PetRepository {

    private final PetEntityRepository petEntityRepository;

    public PetRepository(PetEntityRepository petEntityRepository) {
        this.petEntityRepository = petEntityRepository;
    }

    public List<PetEntityDto> findAll() {
        List<PetEntity> petEntities = petEntityRepository.findAll();

        return petEntities.stream()
                .map(PetEntityDto::new)
                .toList();
    }
}
