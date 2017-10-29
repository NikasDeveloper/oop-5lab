package components;

import java.util.ArrayList;

public class Schema {

    private ArrayList<LogicalInput> logicalInputs;
    private ArrayList<LogicalOperation> logicalOperations;

    public Schema() {
        this.logicalInputs = new ArrayList<>();
        this.logicalOperations = new ArrayList<>();
    }

    public LogicalInput getLogicalInput(int index) {
        return this.logicalInputs.get(index);
    }

    public ArrayList<LogicalInput> getLogicalInputs() {
        return logicalInputs;
    }

    public void setLogicalInputs(ArrayList<LogicalInput> logicalInputs) {
        this.logicalInputs = logicalInputs;
    }

    public ArrayList<LogicalOperation> getLogicalOperations() {
        return logicalOperations;
    }

    public void setLogicalOperations(ArrayList<LogicalOperation> logicalOperations) {
        this.logicalOperations = logicalOperations;
    }

    public void addLogicalOperation(LogicalOperation logicalOperation) {
        this.logicalOperations.add(logicalOperation);
    }
}
