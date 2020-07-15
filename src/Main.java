

public class Main {

    public static void main(String[] args) {


        OrderGenerator or = new OrderGenerator();

        or.generateRandomOrders();

        System.out.println(or.itemIdList);
        System.out.println(or.itemFrequencyList);





    }
}
