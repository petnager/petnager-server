package petnager.application;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import petnager.persistence.PetEntityRepository;
import petnager.persistence.entity.PetEntity;

@SpringBootTest
class PetServiceTest {

    @Autowired
    PetService petService;

    @Autowired
    PetEntityRepository petEntityRepository;

    @Test
    @DisplayName("반려동물 전체 조회 테스트")
    void findAllPets() {
        // given
        var petEntity = new PetEntity("나미", "고양이", "폼폼", "femail", "test.jpg", LocalDate.of(2023, 10, 3), true);
        petEntityRepository.save(petEntity);

        // when
        var result = petService.findAll();

        // then
        assertThat(result).hasSize(1);
        assertThat(result.get(0).id()).isNotNull();
    }
}
