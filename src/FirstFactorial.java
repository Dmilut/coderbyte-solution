/*First Factorial
        Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
        For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range
        will be between 1 and 18 and the input will always be an integer.*/
public class FirstFactorial {

    public static void main(String[] args) {
        System.out.println(firstFactorial(8));
    }

    public static int firstFactorial(int num) {
        int result = 1;
        while (num > 1) {
            result = result*num;
            num--;
        }

        return result;
    }
}
