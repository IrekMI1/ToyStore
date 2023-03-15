package Classes;

public class Doll extends Toy {

    public Doll(String name, String color, int quantity, int frequency) {
        super(name, color, quantity, frequency);
    }

    @Override
    public String toString() {
        return "Кукла: %s, цвет %s, вероятность выигрыша: %s, количество: %s".formatted(
                getName(), getColor(), getFrequency(), getQuantity());
    }
}
