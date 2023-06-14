package ch13.bank;

import ch13.Employee;

import java.util.HashMap;

public class KakaoBank implements Bank{

    private static KakaoBank instance = new KakaoBank();
    private static int money;
    private static int account;
    private static HashMap<Integer, Integer> store = new HashMap<>();

    private KakaoBank(){
        rate = BankOfKorea.getInstance().getBaseRate() + 2.5f;
        account = 2000;
        money = 100000000;
    }

    public static KakaoBank getInstance() {
        if(instance == null){
            instance = new KakaoBank();
        }
        return instance;
    }

    private static float rate;

    public static float getRate() {
        return rate;
    }

    public static void setRate(float rate) {
        KakaoBank.rate = rate+2.5f;
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
        return 0;
    }

    @Override
    public int borrowMoney(Employee employee, int money) {
        return 0;
    }
}
