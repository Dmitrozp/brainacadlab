package com.brainacad.laba18;

public class MoneyTransactionUtil {


    public MoneyTransactionUtil(){}

    public void test(){}



    public static void sendMoneyTo(int sendNumberCard, int recipientNumberCard, double amountOfTransfer) throws RuntimeException{

        if (sendNumberCard == recipientNumberCard){
            System.out.println("Номера карт одинаковые");
            throw new AccountException();
            //throw new RuntimeException();
        }

        if (amountOfTransfer < 0 || amountOfTransfer > 100_000 ){
            System.out.println("Cумма пеервода не ликвидна");
            throw new MoneyValueExeption();
            //throw new RuntimeException();
        }

        System.out.println("Сумма s, со счета n" +
                            "успешно переведена на счет m");



    }
}
