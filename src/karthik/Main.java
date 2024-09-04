package karthik;

public class Main {

    public static void main(String[] args){
        Account KarthiksAccount = new Account("52468",0.0, "Karthik","jho@21.com", "22233");

        KarthiksAccount.DepositMoney(100);
        KarthiksAccount.DepositMoney(150);
        KarthiksAccount.WithDrawMoney(200);
    }
    }
