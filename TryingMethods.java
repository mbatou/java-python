public class TryingMethods{
    
    public static int sumLessthanOneThousand() {
        /**
            This method sums all the numbers from 1 to 1000
            and prints the sum
         */ 
        int sum = 0;
        int tracker = 1;
        while (tracker < 1000) {
            sum += tracker;
            tracker++;
        }
        return sum;
    }

    public static int sumEvenNumbers() {
        /**
            This method sums all the even numbers between 12 and 103
         */
         int sum = 0;
         for (int i = 13; i < 103; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
         }
        return sum;
    }


}
