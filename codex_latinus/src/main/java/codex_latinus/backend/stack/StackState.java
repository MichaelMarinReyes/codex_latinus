package codex_latinus.backend.stack;

import java.util.List;

public class StackState {
    private int stepId;
    private List<String> stackElements;
    private String operation;

    public StackState(int stepId, List<String> stackElements, String operation) {
        this.stepId = stepId;
        this.stackElements = stackElements;
        this.operation = operation;
    }

    public int getStepId() {
        return stepId;
    }

    public void setStepId(int stepId) {
        this.stepId = stepId;
    }

    public List<String> getStackElements() {
        return stackElements;
    }

    public void setStackElements(List<String> stackElements) {
        this.stackElements = stackElements;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "StackState{" +
                "stepId=" + stepId +
                ", stackElements=" + stackElements +
                ", operation='" + operation + '\'' +
                '}';
    }
}