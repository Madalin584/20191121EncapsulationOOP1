package pocket;

/*
Incapsulation paradigm
 */
public class Pocket {
    //valore de tip double pentru money
    private double money;

    //constructor custom
    public Pocket(double money) {
        this.money = money;
    }

    public void setMoney(double money) {
        //verificari
        //ambele verificari trebuie sa fie adevarate pentru a afisa mesajul
        if (money <= 0 && money > 3000) {
            System.out.println("I don't have enough space in my pocket for as much money !");
        }

        //apeleaza variabila money in mod explicit
        //atribuie variabilei de mai sus, variabila din parametru
        //va aduna valoare introdusa ca parametru la valoarea variabilei "money"
        this.money = this.money + money;
    }

    //va scadea din suma care exista in portofel, suma introdusa ca parametru.
    public double spendMoney(double money) {
        //verificari
        if (money <= 10 && this.money <= 10) {
            return 0;
        }
        this.money = this.money - money;
        //returneaza valoarea variabilei money
        return money;
    }

    public double getMoney() {
        if (money < 10) {
            return 0;
        }
        return money;

    }
}
