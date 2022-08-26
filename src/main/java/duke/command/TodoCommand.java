package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.Task;

public class TodoCommand extends Command {
    private String task;
    
    public TodoCommand(String task) {
        super();
        this.task = task;
    }
    
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.add(new Task(task));
        ui.printAddTaskSuccessfully(tasks);
    }
}
