

public class Main {

    public static void main(String[] args) {


  /*  /////////Testing OrderGenerator class\\\\\\\\\\\\

      OrderGenerator or = new OrderGenerator();

        or.generateRandomOrders();

        System.out.println(or.itemIdList);
        System.out.println(or.itemFrequencyList);
*/


/////////Testing Order class\\\\\\\\\\\\\\\

        for(int i=1; i<40;i++) {
            Order order = new Order();

            if(!(order.uuid == null)) {
                System.out.println(order.uuid);
                System.out.println(order.itemIdList);
                System.out.println(order.itemFreqencyList);
                System.out.println(order.getOrderStatus());
                System.out.println();
            }

        }
        System.out.println(OrderList.orderUUIDList);





    }
}
