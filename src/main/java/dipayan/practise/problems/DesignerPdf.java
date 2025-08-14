package dipayan.practise.problems;

import java.util.Arrays;
import java.util.List;

public class DesignerPdf {
    public static void main(String[] args) {
        int area = designerPdfViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), "abc");
        System.out.println(area);
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        int max = 0;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            int height = h.get(index);

            if (height > max) {
                max = height;
            }
        }

        return max * word.length();
    }
}
