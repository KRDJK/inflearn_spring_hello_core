package hello.core.singleton;

public class StatefulService {

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; // 여기가 문제가 된다.
    }

    public int getPrice() {
        return price;
    }
}
