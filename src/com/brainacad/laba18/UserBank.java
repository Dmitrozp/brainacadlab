package com.brainacad.laba18;

public class UserBank {

    public static void main(String[] args) {

        try {
            MoneyTransactionUtil.sendMoneyTo(1212121, 12121288, -1454);
        }

        catch (MoneyValueExeption m){
            System.out.println("«Ошибка с суммой отправки.\n" +
                    "Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000 MoneyValueExeption");

        }
        catch (AccountException a){
            System.out.println("Ошибка с реквизитами банка.\n" +
                    "Возможно, номер карты отправителя и получателя совпадают. AccountException");

        }
        catch (RuntimeException e){
            System.out.println("При обработке" +
                    "транзакции банка произошла ошибка RuntimeException");
        }

        try {
            StackOverFlowTest.test();
        }
        catch (StackOverflowError e){
            System.out.println("\nПроизошла ошибка StackOverFlowTest");
        }
    }
}
