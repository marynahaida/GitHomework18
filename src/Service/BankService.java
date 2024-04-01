package Service;

import Models.Bank;

import java.util.Random;

public class BankService {
    public  static final int MIN_PRICE =37;
    public  static final int MAX_PRICE =42;
    private final String BANK_NAMES = "ПриватБанк, Сенс Банк, Сітібанк, ІНГ Банк Україна, Ощадбанк, Укрексімбанк," +
            "УКРГАЗБАНК, Райффайзен Банк, УКРСИББАНК, ПУМБ, Креді Агріколь Банк, Південний, КРЕДОБАНК, Банк Кредит Дніпро";
    public Bank[] getBanks(){
        Random random = new Random();
        String[] names = BANK_NAMES.split(",");
        Bank[] banks = new Bank[names.length];
        for (int i = 0; i < banks.length; i++) {
            Bank bank = new Bank(names[i], random.nextDouble()*(MAX_PRICE - MIN_PRICE) + MIN_PRICE);
            banks[i] = bank;
        }
        return banks;
    }

    public void printBanks(Bank[] banks){
        for (Bank bank:
        banks) {
            System.out.println(bank);
        }
    }
    public double[] getDollarPrices(Bank[] banks){
        double[] dollarPrices = new double[banks.length];
        for (int i = 0; i < banks.length; i++) {
            dollarPrices[i] = banks[i].price;
        }
        return dollarPrices;
    }
}
