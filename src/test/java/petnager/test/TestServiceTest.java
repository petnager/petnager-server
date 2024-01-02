package petnager.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class TestServiceTest {

    @Autowired
    private TestService testService;

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void saveTest() throws JsonProcessingException {
        final List<InspectionUnit> inspectionUnits1 = List.of(
                new InspectionUnit("a", "1"),
                new InspectionUnit("b", "122")
        );

        final List<InspectionUnit> inspectionUnits2 = List.of(
                new InspectionUnit("a", "1"),
                new InspectionUnit("b", "122"),
                new InspectionUnit("c", "13"),
                new InspectionUnit("d", "100"),
                new InspectionUnit("e", "0.231")
        );

        final TestResult testResult1 = new TestResult(1L, inspectionUnits1);
        final TestResult testResult2 = new TestResult(2L, inspectionUnits2);

        testService.save(testResult1);
        testService.save(testResult2);

        final List<TestResult> all = testRepository.findAll();

        for (TestResult testResult : all) {
            final String prettyJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(testResult);
            System.out.println(prettyJson);
        }

        assertThat(all).hasSize(2);
    }
}
