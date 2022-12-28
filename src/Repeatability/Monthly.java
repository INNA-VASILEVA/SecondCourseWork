package Repeatability;

import Tasks.DivisionByType;
import Tasks.Task;
import Tasks.TypeOfTaskRepeat;

public class Monthly extends Task implements Repeatability {
    public Monthly(String heading, String description, TypeOfTaskRepeat repeatTask, DivisionByType tapeTask) {
        super(heading, description, repeatTask, tapeTask);
    }

    // Ежемесячная

    @Override
    public void nextDateAndTimeOfExecution() {

    }
}
