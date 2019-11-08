package task03.model;

import task03.exceptions.NoMemoryException;
import task03.exceptions.TooHighMemoryTemperatureException;
import task03.exceptions.TooLowMemoryFrequencyException;

public class RamMemory extends ComputerPart implements FrequencyChangeable {
    private int memoryAmount;
    private double frequency;
    private double temperature;
    private static final double MAX_MEMORY_SECURE_TEMP = 90;
    private static final double TEMP_TO_MEMORY_FREQUENCY_FACTOR = 0.15;
    private static final double MIN_MEMORY_AMOUNT = 1024;

    public RamMemory(String modelName, String producer, String serialNumber, int memoryAmount, double frequency, double temperature) {
        super(modelName, producer, serialNumber);
        setTemperature(temperature);
        setFrequency(frequency);
        setMemoryAmount(memoryAmount);
    }

    @Override
    public void overclock(double additionalFrequency) {
        double newTemperature = temperature + additionalFrequency * TEMP_TO_MEMORY_FREQUENCY_FACTOR;
        if (newTemperature > MAX_MEMORY_SECURE_TEMP) {
            throw new TooHighMemoryTemperatureException();
        }
        setFrequency(frequency + additionalFrequency);
        temperature = newTemperature;
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        if (memoryAmount < MIN_MEMORY_AMOUNT) {
            throw new NoMemoryException();
        }
        this.memoryAmount = memoryAmount;
    }

    public double getFrequency() {
        return frequency;
    }

    private void setFrequency(double frequency) {
        if (frequency <= 0) {
            throw new TooLowMemoryFrequencyException();
        }
        this.frequency = frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature > MAX_MEMORY_SECURE_TEMP) {
            throw new TooHighMemoryTemperatureException();
        }
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Pamięć RAM: " + super.toString() + ", Ilość pamięci: " + memoryAmount + " MB, Częstotliwość: " + frequency + " MHz, Temperatura: " + temperature + " \u2103";
    }
}
