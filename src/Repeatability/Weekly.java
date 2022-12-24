package Repeatability;

import Tasks.DivisionByType;
import Tasks.Task;
import Tasks.TypeOfTaskRepeat;

public class Weekly extends Task implements Repeatability {
    public Weekly(String heading, String description, TypeOfTaskRepeat repeatTask, DivisionByType tapeTask) {
        super(heading, description, repeatTask, tapeTask);
    }

    @Override
    public void nextDateAndTimeOfExecution() {

    } // Еженедельная

}
