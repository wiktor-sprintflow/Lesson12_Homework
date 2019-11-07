package task03.model;

public class Computer {
    private HardDrive hardDrive;
    private Processor processor;
    private RamMemory ramMemory;

    public Computer(HardDrive hardDrive, Processor processor, RamMemory ramMemory) {
        this.hardDrive = hardDrive;
        this.processor = processor;
        this.ramMemory = ramMemory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RamMemory getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    @Override
    public String toString() {
        return "Computer: \n" + hardDrive + "\n" + processor + "\n" + ramMemory + "\n";
    }
}
