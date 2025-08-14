package dipayan.practise.problems;

import java.util.*;

public class HackerlandRadioTransmitters {
    public static void main(String[] args) {
        System.out.println(hackerlandRadioTransmitters(new ArrayList<>(List.of(7, 2, 4, 6, 5, 9, 12, 11)), 2));
        //7 2 4 6 5 9 12 11 -> 2 4 5 6 7 9 11 12
    }

    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
        int transmitters = 0;

        x.sort(Comparator.comparingInt(c -> c));
        int size = x.size();
        int i = 0;

        while (i < size) {
            int loc = x.get(i) + k;

            while (i < size && x.get(i) <= loc) {
                i++;
            }

            int antennaPos = x.get(i - 1);
            int antennaMax = antennaPos + k;

            while (i < size && x.get(i) <= antennaMax) {
                i++;
            }

            transmitters++;
        }

        return transmitters;
    }
}
