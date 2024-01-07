package petnager.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import petnager.persistence.entity.PetEntity;

public interface PetEntityRepository extends JpaRepository<PetEntity, Long> {
}
