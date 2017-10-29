package components;

public class LogicalOr implements LogicalOperation {

    private LogicalInput logicalInput;

    public LogicalOr() {
        this.logicalInput = new LogicalInput();
    }

    public LogicalOr(LogicalInput... logicalInputs) throws Exception {
        this.logicalInput = new LogicalInput();
        this.performLogicalAction(logicalInputs);
    }

    @Override
    public LogicalInput getInput() {
        return this.logicalInput;
    }

    @Override
    public Boolean getInputValue() {
        return logicalInput.getValue();
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

        for (LogicalInput input : logicalInputs) {

            if (input.getValue()) {
                this.setInputValue(true);
                return;
            }

        }
    }

    @Override
    public String toString() {
        return "LogicalOr{" + "logicalInput=" + logicalInput + '}';
    }
}
