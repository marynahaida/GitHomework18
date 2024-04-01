import Service.BankService;
import Models.Bank;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        BankService service = new BankService();
        Bank[] banks = service.getBanks();
        double[] prices = service.getDollarPrices(banks);
//        service.printBanks(banks);
        
        Arrays.sort(prices);
        for (int i = 0; i < banks.length; i++) {
            for (int j = 0; j < banks.length; j++) {
                if(banks[j].price == prices[banks.length -1 -i]){
                    Bank tempBank = banks[i];
                    banks[i] = banks[j];
                    banks[j] = tempBank;
                    break;
                }
            }
        }
        service.printBanks(banks);
    }
}
