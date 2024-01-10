package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int num = 0;

        if (multiplyByAndToInclusive > 0) {
            while (num <= multiplyByAndToInclusive) {
                System.out.println(num * multiplyByAndToInclusive);
                num++;
            }

        } else  {
            while (num > multiplyByAndToInclusive) {
                System.out.println(num * multiplyByAndToInclusive);
                num++;

            }

        }
    }
}