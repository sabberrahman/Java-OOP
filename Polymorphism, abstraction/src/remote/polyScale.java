package remote;

import java.util.Scanner;

interface PaymentMethods {

    boolean isAuthWithAmount(double amount);

    String getTransactionID();
}

class Bkash implements PaymentMethods {

    double bkashNumber;
    String TransID;

    public Bkash(double bkashNum) {
        this.bkashNumber = bkashNum;
    }

    // amount add korle authentized by default 
    @Override
    public boolean isAuthWithAmount(double amount) {
        System.out.println(
                "Payment method : Bkash, Amount : " + (int) amount + "Bdt " + ", Phone number used: " + "+880" + (int) bkashNumber);
        this.TransID = "CTX invoice: " + System.currentTimeMillis();
        return true;
    }

    @Override
    public String getTransactionID() {
        return TransID;
    }

}

public class polyScale {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which payment method: ");
        System.out.println("1. PAY with Bkash ");
        System.out.println("2. Pay with Debit/credit Card");
        System.out.print("enter choice : ");
        int picked = input.nextInt();
        System.out.print("enter Bkash number : ");
        double num = input.nextDouble();
        System.out.print("enter Amount BDT : ");
        double amountBDT = input.nextDouble();
        PaymentMethods methods = new Bkash(num);
        PaymentProcessor(methods, amountBDT);
    }

    public static void PaymentProcessor(PaymentMethods method, double amount) {
        if (method.isAuthWithAmount(amount)) {
            System.out.println(method.getTransactionID());
        }
    }
}
