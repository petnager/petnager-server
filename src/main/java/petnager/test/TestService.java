package petnager.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void save(final TestResult testResult) {
        testRepository.save(testResult);
    }
}
