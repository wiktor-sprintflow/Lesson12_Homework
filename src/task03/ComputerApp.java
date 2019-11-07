package task03;

import task03.exceptions.*;
import task03.model.Computer;
import task03.model.HardDrive;
import task03.model.Processor;
import task03.model.RamMemory;

public class ComputerApp {
    public static void main(String[] args) {
        try {
            HardDrive hardDrive = new HardDrive("ABX123", "Seagate", "1123-1234-AA12", 2048);
            Processor processor = new Processor("ETR4433", "Intel", "88323daf", 2500, 60);
            RamMemory ramMemory = new RamMemory("QWE123", "Kingston", "AA1122BB", 16384, 1066, 40);

            Computer computer = new Computer(hardDrive, processor, ramMemory);
            System.out.println(computer);

            // Test 1
            processor.overclock(-100);
            System.out.println(computer);
            processor.overclock(400);
            System.out.println(computer);
            processor.overclock(10);

            /* Test 2
            processor.overclock(-2500);
            */

            /*Test 3
            ramMemory.overclock(-100);
            System.out.println(computer);
            ramMemory.overclock(400);
            System.out.println(computer);
            ramMemory.overclock(50);
            System.out.println(computer);
            */

            /* Test 4
            ramMemory.overclock(-1066);
            System.out.println(computer);
            */

            /* Test 5
            ramMemory.setMemoryAmount(2042);
            System.out.println(computer);
            ramMemory.setMemoryAmount(512);
            System.out.println(computer);
            */

        } catch (TooHighMemoryTemperatureException | TooLowMemoryFrequencyException | TooLowProcessorFrequencyException | TooHighProcessorTemperatureException | NoMemoryException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
