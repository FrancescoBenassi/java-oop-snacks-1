public class ContoBancario {
    private int numberAccount;
    private int balanceAccount;

    public ContoBancario(int numberAccount){
        this.numberAccount = numberAccount;
        this.balanceAccount = 0;
    }

    public int addMoney(int addMoney){
        return this.balanceAccount += addMoney;
    }

    public int takeMoney(int takeMoney){
        return this.balanceAccount -= takeMoney;
    }

    public int getBalance(){
        return balanceAccount;
    }

    public String getAllValues(){
        return numberAccount + " " + balanceAccount;
    }
}
