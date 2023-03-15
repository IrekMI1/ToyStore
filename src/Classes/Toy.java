package Classes;

public abstract class Toy {
    private static int count = 1;
    private int ID;
    private String name;
    private String color;
    private int frequency;
    private int quantity;

    public Toy(String name, String color, int quantity, int frequency) {
        this.name = name;
        this.color = color;
        this.frequency = frequency;
        this.quantity = quantity;
        this.ID = count;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
