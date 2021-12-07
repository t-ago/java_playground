package Service;

public class GradesService {
    private Integer[] votesCount = { 0, 0, 0, 0, 0 };

    public String getAverage() {
        double total = 0.0;
        int votesRegistered = 0;

        for (int i = 0; i < votesCount.length; i++) {
            votesRegistered += votesCount[i];
            total += votesCount[i] * (i + 1);
        }

        if(total != 0){
            total /= votesRegistered;
        }

        Math.round(total);
        return String.format("%.1f", total);
    }

    public void incrementOn(Integer index) {
        votesCount[index]++;
    }

    public Integer[] getGradesList() {
        return votesCount;
    }
}
