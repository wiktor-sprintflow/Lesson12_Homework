package task03.model;

public class HardDrive extends ComputerPart {
    private double discCapacity;

    public HardDrive(String modelName, String producer, String serialNumber, double discCapacity) {
        super(modelName, producer, serialNumber);
        this.discCapacity = discCapacity;
    }

    public double getDiscCapacity() {
        return discCapacity;
    }

    public void setDiscCapacity(double discCapacity) {
        this.discCapacity = discCapacity;
    }

    @Override
    public String toString() {
        return "Dysk twardy: " + super.toString() + ", Pojemność dysku: " + discCapacity + " GB";
    }
}
