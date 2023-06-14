package ch13.bank;

import ch13.Employee;

import java.util.HashMap;

public class WooriBank implements Bank{
    private static WooriBank instance = new WooriBank();
    private int account;
    private int money;
    private static HashMap<Integer, Integer> store = new HashMap<>();
    private WooriBank(){
        rate = BankOfKorea.getInstance().getBaseRate()+2.5f;
        account = 1000;
        money = 100000000;
    }

    public static WooriBank getInstance() {
        if(instance == null){
            instance = new WooriBank();
        }
        return instance;
    }

    private static float rate;

    public static float getRate() {
        return rate;
    }

    public static void setRate(float rate) {
        WooriBank.rate = rate+2f;
    }

    @Override
    public int makeAccount() {
        return ++account;
    }

    @Override
    public void saving(int account, int money) {
        if(store.get(account) != null){
            money += store.get(money);
        }
        store.put(account, money);

    }

    @Override
    public int getAccount(int account) {
        return ;
    }

    @Override
    public int borrowMoney(Employee employee, int money) {
        return 0;
    }
}
