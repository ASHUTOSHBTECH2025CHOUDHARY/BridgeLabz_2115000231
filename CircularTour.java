class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int total = 0, sur = 0, start = 0;

        for (int i = 0; i < n; i++) {
            int netFuel = petrol[i] - distance[i];
            total += netFuel;
            sur += netFuel;

            // If surplus goes negative, reset start point
            if (sur < 0) {
                start = i + 1;
                sur = 0; // Reset surplus
            }
        }

        return (total >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPoint(petrol, distance);
        if (start != -1)
            System.out.println("Start at petrol pump index: " + start);
        else
            System.out.println("Circular tour is not possible.");
    }
}

