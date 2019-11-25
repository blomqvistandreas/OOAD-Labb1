public class Computer {

    private String processor;
    private String motherboard;
    private String graphicsCard;
    private String memory;
    private String storageType;

    private String computerCase;
    private int memorySlots;

    public Computer(String processor, String motherboard, String graphicsCard, String memory, String storageType, int memorySlots, String computerCase) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.graphicsCard = graphicsCard;
        this.memory = memory;
        this.storageType = storageType;
        this.memorySlots = memorySlots;
        this.computerCase = computerCase;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public String getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    @Override
    public String toString() {
        return "\n_________________COMPUTER SPECS_________________\n" +
                "*> Processor: " + processor + "\n" +
                "*> Motherboard: " + motherboard + "\n" +
                "*> GraphicsCard: " + graphicsCard + "\n" +
                "*> Memory/RAM: " + memory + "\n" +
                "*> Amount of memory slots: " + memorySlots + "\n" +
                "*> Storage type: " + storageType + "\n" +
                "*> Case: " + computerCase + "\n" +
                "________________________________________________";
    }
}