public class GiantBook {

    private WeightedQuickUnionUF wqf;
    private static boolean reachedGiantStatus = false;

    public static void main(String[] args) {
        int count = StdIn.readInt();
        WeightedQuickUnionUF wqf = new WeightedQuickUnionUF(count);

        while (wqf.count() != 1) {
            wqf.union(
                StdRandom.uniform(count),
                StdRandom.uniform(count)
            );

            StdOut.print(".");

            if (!reachedGiantStatus && wqf.isGiantComponentReached()) {
                reachedGiantStatus = true;
                StdOut.print("G");
            }
        }

        StdOut.print("C\n");
    }

}