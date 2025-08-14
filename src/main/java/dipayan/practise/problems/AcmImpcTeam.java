package dipayan.practise.problems;

import java.util.List;

public class AcmImpcTeam {
    public static void main(String[] args) {
        System.out.println(acmTeam(List.of("10101", "11001", "10111", "10000", "01110")));
    }

    public static List<Integer> acmTeam(List<String> topic) {
        int numTopics = topic.get(0).length();
        int numTeams = topic.size();
        int maxTopics = 0;
        int howManyTeamsKnowMaxTopic = 0;

        for (int i = 0; i < numTeams; i++) {
            String topici = topic.get(i);

            for (int j = i + 1; j < numTeams; j++) {
                int topicMatchCount = 0;
                String topicj = topic.get(j);

                for (int k = 0; k < numTopics; k++) {
                    if (topici.charAt(k) == '1' || topicj.charAt(k) == '1') {
                        topicMatchCount++;
                    }
                }

                if (topicMatchCount > maxTopics) {
                    maxTopics = topicMatchCount;
                    howManyTeamsKnowMaxTopic = 1;
                } else if (topicMatchCount == maxTopics) {
                    howManyTeamsKnowMaxTopic++;
                }
            }
        }

        return List.of(maxTopics, howManyTeamsKnowMaxTopic);
    }
}
