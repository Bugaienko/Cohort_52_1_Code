package homework_21.task2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.10.2024
 */
/*
Task 2
Компьютер и компоненты

Создайте базовый класс Component с полями brand (бренд) и model (модель).

Создайте производные классы: Processor, Memory, Storage от класса Component.

Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.

Реализуйте отношения между Computer и компонентами.
Компоненты Processor и Memory не могу существовать без компьютера.
 */

public class Computer {

    private String model;

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(String model, Storage storage) {
        this.model = model;
        this.storage = storage;
        this.processor = new Processor("AMD", "i9-13100");
        this.memory = new Memory("Crucial", "MA-247", 32);
    }

    public String toString() {
        return String.format("Computer: {model: %s, processor: %s, memory: %s, storage: %s}",
                model, processor.toString(), memory.toString(), storage.toString());
    }

    public void showProcessorModel(){
        System.out.println(processor.getModel());
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }
}
