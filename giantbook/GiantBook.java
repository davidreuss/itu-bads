public class GiantBook {

    private WeightedQuickUnionUF wqf;
    private static boolean reachedGiantStatus = false;

    private static int generateRandomNumber(int hi, int low) {
        int random = StdRandom.uniform(hi, low);		
        // StdOut.println("Generated random number: " + random);
        return random;
    }

    public static void main(String[] args) {
        int count = StdIn.readInt();
        WeightedQuickUnionUF wqf = new WeightedQuickUnionUF(count);

        while (wqf.count() != 1) {
            wqf.union(
                generateRandomNumber(0, count),
                generateRandomNumber(0, count)
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