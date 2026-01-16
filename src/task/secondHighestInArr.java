package task;

public class secondHighestInArr {
    static void main() {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int max = 0;
        int secondHighest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondHighest) {
                if(numbers[i] != max)
                    secondHighest = numbers[i];
            }
        }

        System.out.println(secondHighest);
    }

}
