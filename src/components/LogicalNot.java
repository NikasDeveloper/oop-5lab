package components;

public class LogicalNot implements LogicalOperation {

    private LogicalInput logicalInput;

    public LogicalNot() {
        this.logicalInput = new LogicalInput();
    }

    public LogicalNot(LogicalInput logicalInput) throws Exception {
        this.logicalInput = new LogicalInput();
        this.performLogicalAction(logicalInput);
    }

    @Override
    public LogicalInput getInput() {
        return this.logicalInput;
    }

    @Override
    public Boolean getInputValue() {
        return this.logicalInput.getValue();
    }

    @Override
    public void setInputValue(Boolean value) {
        this.logicalInput.setValue(value);
    }

    @Override
    public void performLogicalAction(LogicalInput... logicalInputs) throws Exception {

        if (logicalInputs.length == 0) {
            throw new Exception("Not enough logical inputs passed.");
        }

        this.setInputValue(!logicalInputs[0].getValue());
    }

    @Override
    public String toString() {
        return "LogicalNot{" + "logicalInput=" + logicalInput + '}';
    }
}
