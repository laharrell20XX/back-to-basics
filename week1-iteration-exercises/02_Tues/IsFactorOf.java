import java.util.Scanner;

class IsFactorOf {
    static Scanner reader = new Scanner(System.in);

    public static Integer getNum() {
        System.out.println("Enter a positive integer: ");
        int num = reader.nextInt();
        reader.close();
        return num;
    }

    public static void main(String[] args) {
        FindFactors.getFactors2(getNum());
        // FindFactors.getFactors(getNum());
    }
}