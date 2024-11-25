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

    public int getBalance(){
        return balanceAccount;
    }
}
