package dog;

public class Main {
    public static void main(String[] args) {
        //creare instanta a clasei Dog
        //creare obiect al clasei Dog
        Dog husky = new Dog("Azorel", 2, "Male", "Husky", 2.300);

        //apelare metode pentru returnarea varstei si a rasei, apoi afisare valorilor
        //din metode
        System.out.println("Apelare metode getAge() si getRace() cu valori default: ");
        System.out.println("Varsta: " + husky.getAge() + " ani.");
        System.out.println("Rasa: " + husky.getRace());

        //schimbarea valorilor introduse default din constructor
        husky.setAge(3);
        husky.setRace("Husky siberian");

        //apelare metode getAge(), getRase() si afisare
        System.out.println("Apelare metode getAge() si getRace() dupa ce au fost modificate valorile celor 2 variabile : ");
        System.out.println("Varsta: " + husky.getAge() + " ani.");
        System.out.println("Rasa: " + husky.getRace());

        //apelare metoda setWeight() cu verificare
        System.out.println("Setare valoare pentru metoda setWeight() cu verficare.");
        husky.setWeight(1.584);
        System.out.print("Afisare metoda setWeight() cu verficare: ");
        System.out.println(husky.getWeight());

    }
}
