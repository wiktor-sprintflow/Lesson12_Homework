package task03.model;

public abstract class ComputerPart {
    private String modelName;
    private String producer;
    private String serialNumber;

    ComputerPart(String modelName, String producer, String serialNumber) {
        this.modelName = modelName;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Model: " + modelName + ", Producent: " + producer + ", Numer seryjny: " + serialNumber;
    }
}
