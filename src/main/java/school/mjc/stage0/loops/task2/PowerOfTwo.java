package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {


        if (power < 0) {
            System.out.println("too much power");
        } else {
            int a = 2;
            int currentPower = 0;
            while (currentPower <= power) {
                int result = (int) Math.pow(a, currentPower);
                System.out.println(result);
                currentPower++;
            }
        }

    }
}