import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Computer myComputer = ComputerBuilder.getBuilder()
                .setProcessor("Intel(R) Core(TM) i5-4590 CPU @ 3.30GHz")
                .setMotherboard("Gigabyte B85m-ds3h-a")
                .setGraphicsCard("NVIDIA GeForce GTX 1060 6GB")
                .setMemory("DDR3 16GB")
                .setStorageType("SSD & HDD")
                .setComputerCase("Kolink Aviator M Micro-ATX Case - Black - Window")
                .createComputer();

        System.out.println(myComputer);

        CommandManager commandManager = CommandManager.getInstance();
        List<Command> actionList = new ArrayList<>();
        actionList.add(new ChangeCaseAction(myComputer, "Kolink Oversvatory RGB Black"));
        commandManager.execute(actionList);
        commandManager.undo();
        commandManager.redo();
        System.out.println(myComputer);


    }
}
