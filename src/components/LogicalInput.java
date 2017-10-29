package components;

public class LogicalInput {

    private Boolean value;

    public LogicalInput() {
        this.value = false;
    }

    public LogicalInput(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LogicalInput{value=" + value + "}";
    }
}
