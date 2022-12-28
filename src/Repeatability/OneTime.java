package Repeatability;


import Tasks.DivisionByType;
import Tasks.Task;
import Tasks.TypeOfTaskRepeat;

import java.time.LocalDateTime;

public class OneTime extends Task implements Repeatability {
    public OneTime(String heading, String description, TypeOfTaskRepeat repeatTask, DivisionByType tapeTask) {
        super(heading, description, repeatTask, tapeTask);
    }

    // Однократная

    @Override
    public void nextDateAndTimeOfExecution() {

    }
}
