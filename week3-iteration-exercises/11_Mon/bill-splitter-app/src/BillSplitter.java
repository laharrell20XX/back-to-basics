import java.lang.reflect.Array;
import java.util.ArrayList;

public class BillSplitter {
    public Bill bill;
    public int alergyIndex;
    public int moneyGiven;

    public BillSplitter(Bill bill, int alergyIndex, int moneyGiven){
        this.bill = bill;
        this.alergyIndex = alergyIndex;
        this.moneyGiven = moneyGiven;
    }

    public Bill getBill() {
        return bill;
    }

    public int getAlergyIndex() {
        return alergyIndex;
    }

    public int getMoneyGiven() {
        return moneyGiven;
    }

    public Double splitBill() {
        var sharedTotal = 0.00;
        var moneyOtherPays = 0.00;
        var billToSplit = bill.getBill();

        for (int i = 0; i < billToSplit.length; i++) {
            if (i == alergyIndex) {
                continue;
            }
            sharedTotal += billToSplit[i];
        }
        moneyOtherPays = sharedTotal / 2;
        var changeToGive = moneyGiven - moneyOtherPays;
        return changeToGive;
    }
}
