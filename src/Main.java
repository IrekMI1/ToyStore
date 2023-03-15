
import Classes.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Toy car = new CarToy("MQueen", "red", 50, 20);
        Toy car2 = new CarToy("Rush", "yellow", 80, 10);
        Toy barby = new Doll("KateDoll", "white", 60, 5);
        Toy teddy = new SoftToy("Плюшевый мишка", "коричневый", 100, 25);

        Store toyStore = new Store("DreamStore");
        toyStore.addToy(car, car2, barby, teddy);
        toyStore.toyDraw();
        toyStore.toyDraw();
        toyStore.giveGiftToy();
        toyStore.giveGiftToy();
        toyStore.giveGiftToy();
    }
}