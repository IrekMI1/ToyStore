package Classes;

public class CarToy extends Toy {

    public CarToy(String name, String color, int quantity, int frequency) {
        super(name, color, quantity, frequency);
    }

    @Override
    public String toString() {
        return "Машинка: %s, цвет %s, вероятность выигрыша: %s, количество: %s".formatted(
                getName(), getColor(), getFrequency(), getQuantity());
    }
}
