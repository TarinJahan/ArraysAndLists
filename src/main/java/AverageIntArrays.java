public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int total = 0;
        for (int i = 0; i < aa.length; i++) {
            total += aa[i];
        }
        return total;
    }

    public int average(int[] aa) {

        return sum(aa)/count(aa);
    }

}
