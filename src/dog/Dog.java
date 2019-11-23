package dog;

public class Dog {

    //variabile ce vor defini proprietatile cainelui
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    //constructor
    //initializeaza variabile
    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    //apeleaza constructorul de mai sus(this()) cu valori cu valori default
    public Dog(String gender, String race){
        this("",0, gender,race,0);
    }

    //implementare metoda pentru setarea varstei
    public void setAge(int age){
        this.age=age;
    }

    //implementare metoda pentru setarea rasei
    public void setRace(String race){
        this.race=race;
    }

    public void setWeight(double weight){
        if (weight <= 0 ) {
            System.err.println("Valorea introdusa este invalida: "+weight+". Greutatea trebuie sa fie mai mare decat 0");
        }
        this.weight=weight;
    }

    //returneaza varsta
    public int getAge(){
        return age;
    }

    //returneaza rasa
    public String getRace(){
        return race;
    }

    //returneaza greutatea cainelui
    public double getWeight(){
        return weight;
    }
}
