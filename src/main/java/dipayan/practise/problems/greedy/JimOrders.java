package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JimOrders {
    public static void main(String[] args) {
        List<List<Integer>> orders = List.of(
                List.of(1, 3),  // Customer 1: order at 1, takes 3 → ready at 4
                List.of(2, 3),  // Customer 2: order at 2, takes 3 → ready at 5
                List.of(3, 3)   // Customer 3: order at 3, takes 3 → ready at 6
        );

        List<Integer> result = jimOrders(orders);
        System.out.println(result);
    }

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        List<List<Integer>> customers = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            List<Integer> order = orders.get(i);
            int orderNo = order.get(0);
            int prepTime = order.get(1);
            int deliveryTime = orderNo + prepTime;

            customers.add(List.of(i + 1, deliveryTime));
        }

        customers.sort(Comparator.comparingInt(customer -> customer.get(1)));

        return customers.stream().map(customer -> customer.get(0)).collect(Collectors.toList());
    }
}
