package components;

import java.util.ArrayList;

public interface LogicalOperation {
    LogicalInput getInput();

    Boolean getInputValue();

    void setInputValue(Boolean value);

    void performLogicalAction(LogicalInput... logicalInputs) throws Exception;

}
