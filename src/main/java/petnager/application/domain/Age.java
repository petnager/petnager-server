package petnager.application.domain;

import java.time.LocalDate;
import java.util.Objects;
import lombok.Getter;

@Getter
public class Age {

    private final LocalDate birth;

    public Age(LocalDate birth) {
        if (birth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("출생년도가 현재시간보다 빠를 수 없습니다.");
        }
        this.birth = birth;
    }

    public int calculateAge() {
        return LocalDate.now().getYear() - birth.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Age age = (Age) o;
        return Objects.equals(birth, age.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birth);
    }
}
