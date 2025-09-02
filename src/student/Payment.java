package student;

abstract class Payment {
    abstract void pay();//abstract
    public void showMsg(){//concrete method
        System.out.println("The payment method is processing");
    }
}

class CreditCardPayment extends Payment {
    public void pay() {
        System.out.println("The payment method is done by credit card");
    }
}
class UpiPayment extends Payment {
    public void pay() {
        System.out.println("The payment method is done by upi");
    }
}
