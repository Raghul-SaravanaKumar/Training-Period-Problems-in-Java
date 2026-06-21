import java.util.*;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {

            int weight = sc.nextInt();
            int value = sc.nextInt();

            items[i] = new Item(weight, value);
        }

        int capacity = sc.nextInt();

        Arrays.sort(items, (a, b) ->
                Double.compare(
                        (double)b.value / b.weight,
                        (double)a.value / a.weight));

        double maxProfit = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {

                maxProfit += item.value;
                capacity -= item.weight;

            } else {

                maxProfit += ((double)item.value / item.weight) * capacity;
                break;
            }
        }

        System.out.printf("%.2f", maxProfit);
    }
}
