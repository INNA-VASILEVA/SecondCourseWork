package Repeatability;

import Tasks.DivisionByType;
import Tasks.Task;
import Tasks.TypeOfTaskRepeat;

public class Daily extends Task implements Repeatability {
    public Daily(String heading, String description, TypeOfTaskRepeat repeatTask, DivisionByType tapeTask) {
        super(heading, description, repeatTask, tapeTask);
    }

    // Ежедневная

    @Override
    public void nextDateAndTimeOfExecution() {

    }
}
