package Tasks;

import Repeatability.Daily;
import Repeatability.Monthly;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class Task {
    final int id;
    static int idGenerator = 0;           // id генератор
    final String heading;               // Заголовок
    final String description;           // Описание задачи
    LocalDate date;               // Дата и время задачи
    final TypeOfTaskRepeat repeatTask;              // Повторяемость
    final DivisionByType tapeTask;                  // Тип Личная/Рабочая
    LocalDate nextDate;                // Следующая повторяемость

    public Task(String heading, String description, TypeOfTaskRepeat repeatTask, DivisionByType tapeTask) {
        id = idGenerator++;
        this.heading = heading;
        this.description = description;
        date = LocalDate.now();                // Получение текущей даты
        this.repeatTask = repeatTask;
        this.tapeTask = tapeTask;
        this.nextDate = nextDate();
    }

    @Override
    public String toString() {
        return " Задача - " +
                ", Заголовок - '" + heading + '\'' +
                ", Описание - '" + description + '\'' +
                ", Дата - " + date +
                ", Повторяемость - " + repeatTask.getRepeatTask() +
                ", Тип - " + tapeTask.getTapeTask() + "\n";
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public TypeOfTaskRepeat getRepeatTask() {
        return repeatTask;
    }

    public LocalDate getNextDate() {
        return nextDate;
    }

    public LocalDate nextDate() {  // Заполнение следующей даты ежедневника
        switch (this.repeatTask) {
            case ONE_TIME:
                return date.plusDays(0);
            case DAILY:
                return date= LocalDate.now();
            case WEEKLY:
                return date.plusWeeks(1);
            case MONTHLY:
                return date.plusMonths(1);
            case ANNUAL:
                return date.plusYears(1);
            default:
            return date;
        }
    }
}