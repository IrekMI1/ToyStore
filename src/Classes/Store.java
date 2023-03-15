package Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Store {
    private List<Toy> toysList;
    private Queue<Toy> giftToys;
    private final String storeName;

    public String getStoreName() {
        return storeName;
    }

    public Store(String storeName) {
        this.storeName = storeName;
        toysList = new ArrayList<>();
        giftToys = new ArrayDeque<>();
    }

    public void addToy(Toy... toys) {
        this.toysList.addAll(Arrays.asList(toys));
    }

    public void showAllToys() {
        for (Toy toy : this.toysList) {
            System.out.println(toy);
        }
    }

    public Toy getRandomToy() {
        int totalToyScore = 0;
        double currentDifference;
        Toy randomToy = null;

        for (Toy toy : this.toysList) {
            totalToyScore += toy.getQuantity() * toy.getFrequency();
        }

        double minDifference = totalToyScore;
        int randNum = new Random().nextInt(0, totalToyScore + 1);

        for (Toy toy : this.toysList) {
            currentDifference = Math.abs(randNum - toy.getQuantity() * toy.getFrequency());
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                randomToy = toy;
            }
        }
        return randomToy;
    }

    public void giveGiftToy() throws IOException {
        if (!this.giftToys.isEmpty()) {
            this.exportToCSV(this.giftToys.poll());
        }
        else {
            System.out.println("Больше подарков нет!");
        }
    }

    public void exportToCSV(Toy toy) throws IOException {
        FileWriter csvWriter = new FileWriter("GiftedToys.csv",true);
        csvWriter.append("%s,%s;%s;%s\n".formatted(toy.getID(), toy.getName(), toy.getColor(), toy.getFrequency()));
        csvWriter.flush();
        csvWriter.close();
    }

    public void toyDraw() {
        if (!this.toysList.isEmpty()) {
            Toy drawToy = this.getRandomToy();
            drawToy.setQuantity(drawToy.getQuantity() - 1);
            this.giftToys.add(drawToy);
        }
    }
}
