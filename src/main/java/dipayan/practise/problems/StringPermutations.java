package dipayan.practise.problems;

public class StringPermutations {
    public static void main(String[] args) {
        permutation("amim"); // ab, abc, bc // 0-2, 0-3, 1-3 i=0; j=i+2
    }

    private static void permutation(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
}
