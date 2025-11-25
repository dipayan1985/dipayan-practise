package dipayan.practise.slidingwindowandtwopointers;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        String version1 = "1.0.1";
        String version2 = "1";

        int result = compareVersion(version1, version2);

        System.out.println("Comparison result: " + result);
    }

    public static int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int length1 = version1.length();
        int length2 = version2.length();

        while (i < length1 || j < length2) {
            String s1;
            int is1 = 0;

            if (i <= length1 - 1) {
                k = version1.indexOf('.', i);

                if (k == -1) {
                    k = length1;
                }

                s1 = version1.substring(i, k);

                if (!s1.isEmpty()) {
                    is1 = Integer.parseInt(s1);
                }
            }

            String s2;
            int is2 = 0;

            if (j <= length2 - 1) {
                l = version2.indexOf('.', j);

                if (l == -1) {
                    l = length2;
                }

                s2 = version2.substring(j, l);

                if (!s2.isEmpty()) {
                    is2 = Integer.parseInt(s2);
                }
            }


            if (is1 == is2) {
                i = k + 1;
                j = l + 1;
                continue;
            }

            if (is1 > is2) {
                return 1;
            } else {
                return -1;
            }
        }

        return 0;
    }
}
