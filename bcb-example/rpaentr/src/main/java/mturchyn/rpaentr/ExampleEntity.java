package mturchyn.rpaentr;

public class ExampleEntity {

    private String exampleStringProperty;

    public String getExampleStringProperty() {
        return exampleStringProperty;
    }

    public void setExampleStringProperty(String exampleStringProperty) {
        this.exampleStringProperty = exampleStringProperty;
    }

    @Override
    public String toString() {
        return "ExampleEntity{" +
                "exampleStringProperty='" + exampleStringProperty + '\'' +
                '}';
    }
}