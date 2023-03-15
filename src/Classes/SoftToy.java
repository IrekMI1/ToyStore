package Classes;

public class SoftToy extends Toy {

    public SoftToy(String name, String color, int quantity, int frequency) {
        super(name, color, quantity, frequency);
    }

    @Override
    public String toString() {
        return "Мягкая игрушка: %s, цвет %s, вероятность выигрыша: %s, количество: %s".formatted(
                getName(), getColor(), getFrequency(), getQuantity());
    }
}