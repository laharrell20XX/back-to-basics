import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Bill bill1 = new Bill(new Double[]{9.5, 11.75, 18.5, 3.0, 3.0});
        Bill bill2 = new Bill(new Double[]{1.0});
        Bill bill3 = new Bill(new Double[]{1.0});
        Bill bill4 = new Bill(new Double[]{3.0, 4.0});
        Bill bill5 = new Bill(new Double[]{3.0, 4.0});

        BillSplitter test1 = new BillSplitter(bill1, 0, 30);
        BillSplitter test2 = new BillSplitter(bill2, 0, 1);
        BillSplitter test3 = new BillSplitter(bill3, 1, 4);
        BillSplitter test4 = new BillSplitter(bill4, 0, 4);
        BillSplitter test5 = new BillSplitter(bill5, 1, 4);

        BillSplitterTest testResult1 = new BillSplitterTest(test1);
        BillSplitterTest testResult2 = new BillSplitterTest(test2);
        BillSplitterTest testResult3 = new BillSplitterTest(test3);
        BillSplitterTest testResult4 = new BillSplitterTest(test4);
        BillSplitterTest testResult5 = new BillSplitterTest(test5);

        System.out.println(0.00 + " " + testResult1.getTest().splitBill());
        System.out.println(0.00 + " " + testResult2.getTest().splitBill());
        System.out.println(0.00 + " " + testResult3.getTest().splitBill());
        System.out.println(0.00 + " " + testResult4.getTest().splitBill());
        System.out.println(0.00 + " " + testResult5.getTest().splitBill());

    }
}
