package Repeatability;

import Tasks.DivisionByType;
import Tasks.Task;
import Tasks.TypeOfTaskRepeat;

import java.time.LocalDateTime;

public class Annual extends Task implements Repeatability {
    public Annual(String heading, String description, TypeOfTaskRepeat repeatTask, DivisionByType tapeTask) {
        super(heading, description, repeatTask, tapeTask);
    }

    // Ежегодная

    @Override
    public void nextDateAndTimeOfExecution() {

    }
}
