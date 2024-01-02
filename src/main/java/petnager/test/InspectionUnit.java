package petnager.test;

import org.bson.types.ObjectId;

public class InspectionUnit {

    private ObjectId objectId;
    private String name;
    private String value;

    public InspectionUnit(final String name, final String value) {
        this.objectId = ObjectId.get();
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
