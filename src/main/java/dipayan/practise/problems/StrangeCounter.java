package dipayan.practise.problems;

public class StrangeCounter {
    public static void main(String[] args) {
        System.out.println(strangeCounter(24));
    }

    public static long strangeCounter(long t) {
        long startTime = 1;
        long cycleLength = 3;

        while (t >= startTime + cycleLength) {
            startTime = startTime + cycleLength;
            cycleLength *= 2;
        }

        return cycleLength - (t - startTime);
    }
}
