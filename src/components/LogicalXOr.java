package components;

public class LogicalXOr implements LogicalOperation {

    private LogicalInput logicalInput;

    public LogicalXOr() {
        this.logicalInput = new LogicalInput(true);
    }

    public LogicalXOr(LogicalInput ... logicalInputs) throws Exception {
        this.logicalInput = new LogicalInput();
        this.performLogicalAction(logicalInputs);
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

        if (logicalInputs.length < 2) {
            throw new Exception("Not enough logical inputs passed.");
        }

        Boolean localInputValue = logicalInputs[0].getValue() != logicalInputs[1].getValue();

        for (int i = 2; i < logicalInputs.length; i++) {
            if (localInputValue != logicalInputs[i].getValue()) localInputValue = true;
            else localInputValue = false;
        }

        this.setInputValue(localInputValue);

    }

    @Override
    public String toString() {
        return "LogicalXOr{" + "logicalInput=" + logicalInput + '}';
    }
}
