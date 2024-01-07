package petnager.application.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AgeTest {

    @Test
    @DisplayName("출생년도가 현재시간을 넘을 수 없다.")
    void ageCanNotThrowPresent() {
        // given & when & then
        assertThatThrownBy(() -> new Age(LocalDate.of(2024, 2, 1)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("출생년도가 현재시간보다 빠를 수 없습니다.");
    }

    @Test
    @DisplayName("Age 생성 테스트")
    void ageCreateTest() {
        // given & when & then
        assertDoesNotThrow(() -> new Age(LocalDate.of(2022, 2, 1)));
    }

    @ParameterizedTest
    @DisplayName("나이를 계산할 수 있다.")
    @CsvSource(value = {"2023,1", "2022,2"})
    void calculateAgeTest(int year, int expected) {
        // given
        var age = new Age(LocalDate.of(year, 2, 1));

        // when
        int result = age.calculateAge();

        // then
        assertThat(result).isEqualTo(expected);
    }
}
