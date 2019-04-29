import java.util.ArrayList;

class FindFactors {

    public static void getFactors(Integer num) {
        for (int i = 1; i < num; i++) {
            String result = "";
            if (num % i == 0) {
                result = String.format("%s: is a factor of %s", i, num);
                System.out.println(result);
            } else {
                result = String.format("%s: is not a factor of %s", i, num);
                System.out.println(result);
            }

        }
    }

    public static void getFactors2(Integer num) {
        ArrayList<Integer> possible_factorials = buildNumArr(num);
        for (Integer i : possible_factorials) {
            String result = "";
            if (num % i == 0) {
                result = String.format("%s: is a factor of %s", i, num);
                System.out.println(result);
            } else {
                result = String.format("%s: is not a factor of %s", i, num);
                System.out.println(result);
            }
        }
    }

    public static ArrayList<Integer> buildNumArr(Integer num) {
        ArrayList<Integer> numArr = new ArrayList(0);

        for (int i = 1; i < num; i++) {
            numArr.add(i);
        }
        return numArr;
    }
}