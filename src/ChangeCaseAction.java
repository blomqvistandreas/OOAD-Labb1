public class ChangeCaseAction implements Command {

    Computer computer;
    String oldComputerCase;
    String newComputerCase;

    public ChangeCaseAction(Computer computer, String newComputerCase) {
        this.computer = computer;
        this.newComputerCase = newComputerCase;
        this.oldComputerCase = computer.getComputerCase();
    }

    @Override
    public void execute() {
        computer.setComputerCase(newComputerCase);
    }

    @Override
    public void undo() {
        computer.setComputerCase(oldComputerCase);
    }
}
