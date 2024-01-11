package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        if (multiplyByAndToInclusive > 0) {
            int a = 0;
            while (a <= multiplyByAndToInclusive) {
                int result = a * multiplyByAndToInclusive;
                System.out.println(result);
                a++;
            }
        } else if (multiplyByAndToInclusive < 0){
            
             int b = 0;
               while (b >= multiplyByAndToInclusive) {
                   int result = -b * multiplyByAndToInclusive;
                   System.out.println(result);
                   b--;
               }
        }


    }
}