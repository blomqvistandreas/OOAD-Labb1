public class ComputerBuilder {
    private String processor;
    private String motherboard;
    private String graphicsCard;
    private String memory;
    private String storageType;
    private int memorySlots;
    private String computerCase;

    public static ComputerBuilder getBuilder() {
        return new ComputerBuilder();
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }
    public ComputerBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public ComputerBuilder setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public ComputerBuilder setDefaultMemorySlots() {
        this.memorySlots = 4;
        return this;
    }

    public ComputerBuilder setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
        return this;
    }

    public ComputerBuilder setComputerCase(String computerCase) {
        this.computerCase = computerCase;
        return this;
    }

    public Computer createComputer() {
        return new Computer(processor, motherboard, graphicsCard, memory, storageType, memorySlots, computerCase);
    }
}
