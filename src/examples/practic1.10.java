package examples;

class Commentary {
        public static int maxOOD = 23;

        public static void writeOdds() {
                // print each odd number
                for (int count = 1; count <= (maxOOD - 2); count++) {
                        System.out.print(count + " ");
                        count = count + 1;
                }
                        // print the last odd number
                        System.out.println();
        }
        public static void main(String[] args) {
                // write all odds up to 21
                        writeOdds();
                        // now, write all odds up to 11
                        maxOOD = 13;
                        writeOdds();
        }
}
