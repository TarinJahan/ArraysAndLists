import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int total = 0;
        for (int i = 0; i < aa.size(); i++) {
            total += aa.get(i);
        }
        return 0;
    }

    public int average(ArrayList<Integer> aa) {
        return sum(aa)/count(aa);
    }
}
