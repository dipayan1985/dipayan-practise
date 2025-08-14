package dipayan.practise.problems;

import java.util.HashMap;
import java.util.Map;

public class BearAndJane {
    public static void main(String[] args) {
        steadyGene("GAAATAAA");
    }

    public static int steadyGene(String gene) {
        int geneLength = gene.length();
        int[] frequencies = new int[4];
        Map<Character, Integer> nonMatching = new HashMap<>();

        for (int i = 0; i < geneLength; i++) {
            frequencies[intIndex(gene.charAt(i))]++;
        }

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 2) {
                nonMatching.put(charIndex(i), frequencies[i] - 2);
            }
        }

        int left = 0;
        int right = 1;

        while (left <= right) {
            String geneCopy = gene.substring(left, right);
            Map<Character, Integer> subGeneFreqMap = new HashMap<>();
            int i = 0;

            while (i < geneCopy.length()) {
                if (!subGeneFreqMap.containsKey(geneCopy.charAt(i))) {
                    subGeneFreqMap.put(geneCopy.charAt(i), 1);
                } else {
                    subGeneFreqMap.put(geneCopy.charAt(i), subGeneFreqMap.getOrDefault(geneCopy.charAt(i), 0) + 1);
                }

                i++;
            }

            right++;
        }

        return 0;
    }

    static int intIndex(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return 4;
        }
    }

    static char charIndex(int i) {
        switch (i) {
            case 0:
                return 'A';
            case 1:
                return 'C';
            case 2:
                return 'G';
            case 3:
                return 'T';
            default:
                return 'Z';
        }
    }
}
