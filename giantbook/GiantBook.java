public class GiantBook {

    private WeightedQuickUnionUF wqf;

    private static boolean reachedGiantStatus = false;
    private static boolean reachedNonIsolated = false;
    private static boolean reachedConnected = false;

    public static void main(String[] args) {
        int count = StdIn.readInt();
        WeightedQuickUnionUF wqf = new WeightedQuickUnionUF(count);

        int rounds = 0;

        while (!reachedGiantStatus || !reachedNonIsolated || !reachedConnected) {

            wqf.union(
                StdRandom.uniform(count),
                StdRandom.uniform(count)
            );

            if (!reachedGiantStatus && wqf.isGiantComponent()) {
                reachedGiantStatus = true;
                StdOut.println("GIANTCOMPONENT ("+rounds+")");
            }

            if (!reachedNonIsolated && wqf.isNonIsolated()) {
                reachedNonIsolated = true;
                StdOut.println("NONISOLATED ("+rounds+")");
            }

            if (!reachedConnected && wqf.isConnected()) {
                reachedConnected = true;
                StdOut.println("CONNECTED ("+rounds+")");
            }

            rounds++;
        }

        StdOut.println("DONE.");
    }

}