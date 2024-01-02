package petnager.test;

import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "testResult")
public class TestResult {

    @Id
    private Long id;

    private LocalDateTime createdAt = LocalDateTime.now();

    private List<InspectionUnit> inspectionUnits;

    public TestResult(final Long id, final List<InspectionUnit> inspectionUnits) {
        this.id = id;
        this.inspectionUnits = inspectionUnits;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<InspectionUnit> getInspectionUnits() {
        return inspectionUnits;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", inspectionUnits=" + inspectionUnits +
                '}';
    }
}
