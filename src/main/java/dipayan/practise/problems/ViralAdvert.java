package dipayan.practise.problems;

public class ViralAdvert {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

    public static int viralAdvertising(int n) {
        int start = 5;
        int eachShare = 3;
        int likes = Math.floorDiv(start, 2);
        int totalLikes = likes;

        for (int i = 2; i <= n; i++) {
            int adReceive = likes * eachShare;
            likes = Math.floorDiv(adReceive, 2);
            totalLikes = totalLikes + likes;
        }

        return totalLikes;
    }
}
