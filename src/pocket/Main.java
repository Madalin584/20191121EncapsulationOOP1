package pocket;

public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(0);
        double pocketMoney=pocket.getMoney();
        //System.out.println(pocketMoney);
        pocket.setMoney(0);
        double newPocketMoney=pocket.getMoney();
        System.out.println(newPocketMoney);
    }
}
