package duke.command;

import duke.Deadline;
import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.exception.DukeException;
import duke.note.NoteList;

/**
 * Represents a command to add a deadline.
 */
public class DeadlineCommand extends Command {
    private String task;
    private String by;

    /**
     * Creates a new DeadlineCommand.
     *
     * @param task
     * @param by
     */
    public DeadlineCommand(String task, String by) {
        super();
        this.task = task;
        this.by = by;
    }

    @Override
    public String execute(TaskList tasks, NoteList notes, Ui ui, Storage storage) throws DukeException {
        tasks.add(new Deadline(task, by));
        return ui.printAddTaskSuccessfully(tasks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o instanceof DeadlineCommand == false) {
            return false;
        }
        DeadlineCommand that = (DeadlineCommand) o;
        return task.equals(that.task)
                && by.equals(that.by);
    }
}
