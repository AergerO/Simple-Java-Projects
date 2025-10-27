package Projects1;

public class IsItdivisible {
    public static void main(String[] args) {
        float x = 15;
        float y = 22;

        if (y == 0) {
            System.out.println("You can't divide by 0!");
        } else {
            float solution = x / y;
            System.out.println("Solution: " + solution);
        }
    }
}
