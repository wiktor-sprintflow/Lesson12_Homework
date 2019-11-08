package task03.model;

import task03.exceptions.TooHighProcessorTemperatureException;
import task03.exceptions.TooLowProcessorFrequencyException;

public class Processor extends ComputerPart implements FrequencyChangeable {
    private double frequency;
    private double temperature;
    private static final double MAX_PROCESSOR_SECURE_TEMP = 90.0;
    private static final double TEMP_TO_FREQUENCY_FACTOR = 0.1;


    public Processor(String modelName, String producer, String serialNumber, double frequency, double temperature) {
        super(modelName, producer, serialNumber);
        setTemperature(temperature);
        setFrequency(frequency);
    }

    @Override
    public void overclock(double additionalFrequency) {
        double newTemperature = temperature + additionalFrequency * TEMP_TO_FREQUENCY_FACTOR;

        if (newTemperature > MAX_PROCESSOR_SECURE_TEMP) {
            throw new TooHighProcessorTemperatureException();
        }
        setFrequency(frequency + additionalFrequency);
        temperature = newTemperature;
    }

    public double getFrequency() {
        return frequency;
    }

    private void setFrequency(double frequency) {
        if (frequency <= 0) {
            throw new TooLowProcessorFrequencyException();
        }
        this.frequency = frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature > MAX_PROCESSOR_SECURE_TEMP) {
            throw new TooHighProcessorTemperatureException();
        }
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Procesor: " + super.toString() + ", Częstotliwość: " + frequency + " MHz, Temperatura: " + temperature + " \u2103";
    }
}
