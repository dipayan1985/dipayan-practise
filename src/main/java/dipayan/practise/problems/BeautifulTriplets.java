package dipayan.practise.problems;

import java.util.List;

public class BeautifulTriplets {
    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, List.of(1, 2, 4, 5, 7, 8, 10)));
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int triplets = 0;

        for (int i = 0; i < arr.size() - 2; i++) {
            int upper = arr.get(i);
            int count = 0;

            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) == upper) {
                    upper = arr.get(j) + d;
                    count++;

                    if (count == 3) {
                        triplets++;
                        break;
                    }
                }
            }
        }

        return triplets;
    }
}
