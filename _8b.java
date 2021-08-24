import java.util.ArrayList;

public class _8b {
    public static void main(String[] args) {
        ArrayList<Integer> ranks = new ArrayList<>();
        ranks.add(10);
        ranks.add(20);
        ranks.add(30);
        ranks.add(40);
        System.out.println("ArrayList is : "+ranks);
        System.out.println("Value at index 2 is : "+ranks.get(2));
        ranks.remove(0);
        System.out.println("After removing 0th index : "+ranks);
        System.out.println("Size of the ArrayList is : "+ranks.size());
    }
}