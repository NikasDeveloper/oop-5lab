import components.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        Schema schema = new Schema();

        ArrayList<LogicalInput> logicalInputs = new ArrayList<>();

        logicalInputs.add(new LogicalInput(false));
        logicalInputs.add(new LogicalInput(true));
        logicalInputs.add(new LogicalInput(true));
        logicalInputs.add(new LogicalInput(false));

        schema.setLogicalInputs(logicalInputs);

        ArrayList<LogicalOperation> logicalOperations = new ArrayList<>();

        logicalOperations.add(new LogicalNot(schema.getLogicalInput(0)));
        logicalOperations.add(new LogicalAnd(
                schema.getLogicalInput(0),
                schema.getLogicalInput(1),
                schema.getLogicalInput(2)
        ));
        logicalOperations.add(new LogicalOr(schema.getLogicalInput(2), schema.getLogicalInput(3)));

        schema.setLogicalOperations(logicalOperations);

        LogicalOperation logicalOperation = new LogicalXOr(
                schema.getLogicalInput(0),
                schema.getLogicalInput(1),
                schema.getLogicalInput(2)
        );

        schema.addLogicalOperation(logicalOperation);

        for (LogicalOperation operation : schema.getLogicalOperations()) {
            System.out.println(operation);
        }

    }

}