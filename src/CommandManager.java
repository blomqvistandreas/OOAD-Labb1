import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CommandManager {
    private static CommandManager instance = null;
    private QueueStack<List<Command>> queueStackNormal;
    private QueueStack<List<Command>> queueStackReverse;

    private List<String> actionHistory;

    static CommandManager getInstance() {
        if (instance != null) {
            return instance;
        }
        return new CommandManager();
    }

    private CommandManager() {
        queueStackNormal = new QueueStack<>();
        queueStackReverse = new QueueStack<>();
        actionHistory = new ArrayList<>();
    }

    void execute(List<Command> actionList){
        actionList.forEach(Command::execute);
        queueStackNormal.push(actionList);
        System.out.println("Executing...");
    }

    void undo() {
        Optional<List<Command>> optionalActions = queueStackNormal.pop();
        optionalActions.ifPresent(aList -> {
            aList.forEach(Command::undo);
            queueStackReverse.push(aList);
            aList.forEach(a -> actionHistory.add(" - undo"));
        });
        System.out.println("Undoing...");
    }

    void redo() {
        Optional<List<Command>> optionalActions = queueStackReverse.pop();
        optionalActions.ifPresent(aList -> {
            aList.forEach(Command::execute);
            queueStackNormal.push(aList);
            aList.forEach(a -> actionHistory.add( " - redo"));
        });
        System.out.println("Redoing...");
    }
}
