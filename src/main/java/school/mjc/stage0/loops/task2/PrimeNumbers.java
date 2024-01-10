package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        int i = 2;


        while (num <= printToInclusive) {
            if (printToInclusive % num != 0) {
                System.out.println(num);
            }
            num++;
        }

    }
}
