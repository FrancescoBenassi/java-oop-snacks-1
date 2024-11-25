public class ContoBancario {
    private int numberAccount;
    private double balanceAccount;

    public ContoBancario(int numberAccount){
        this.numberAccount = numberAccount;
        this.balanceAccount = 0;
    }

    public void setAddMoney(double addMoney){
         this.balanceAccount += addMoney;
    }

    public void setTakeMoney(double takeMoney){
        if(this.balanceAccount - takeMoney >= 0){
            this.balanceAccount -= takeMoney;
        } else {
            System.out.println("Nono posso darti  soldi perchè sei povero");
        }
    }

    public double getBalance(){
        return balanceAccount;
    }

    public String getAllValues(){
        return numberAccount + " " + balanceAccount;
    }
}
