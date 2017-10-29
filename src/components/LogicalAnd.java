package components;

public class LogicalAnd implements LogicalOperation {

    private LogicalInput logicalInput;

    public LogicalAnd() {
        this.logicalInput = new LogicalInput(true);
    }

    public LogicalAnd(LogicalInput ... logicalInputs) throws Exception {
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

        for (LogicalInput input : logicalInputs) {
            if (!input.getValue()) {
                this.setInputValue(false);
                return;
            }
        }

    }

    @Override
    public String toString() {
        return "LogicalAnd{" + "logicalInput=" + logicalInput + '}';
    }
}
