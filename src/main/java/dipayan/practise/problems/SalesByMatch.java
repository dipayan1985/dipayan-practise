package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        int pairs = sockMerchant(2, new ArrayList<>(List.of(1, 2, 1, 2, 1, 3, 2)));

        System.out.println(pairs);
    }

    public static int sockMerchant(int n, List<Integer> socks) {
        Map<Integer, Integer> sockCountMap = new HashMap<>();

        for (int sock : socks) {
            sockCountMap.put(sock, sockCountMap.getOrDefault(sock, 0) + 1);
        }

        return sockCountMap
                .values()
                .stream()
                .mapToInt(sockCount -> sockCount / 2)
                .sum();
    }
}
