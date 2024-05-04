
// Klasa Worker
class Worker {
    private String fullName;
    private double salary;
    private String position;
    private int numberOfSubordinates;

    // Konstruktor
    public Worker(String fullName, double salary, String position) {
        this.fullName = fullName;
        this.salary = salary;
        this.position = position;
    }

    // Metoda getter dla pełnego imienia
    public String getFullName() {
        return fullName;
    }

    // Metoda getter dla pensji
    public double getSalary() {
        return salary;
    }

    // Metoda getter dla pozycji
    public String getPosition() {
        return position;
    }

    // Metoda setter dla pozycji
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    // Metoda getter dla liczby podwładnych
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    // Metoda setter dla liczby podwładnych
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // Metoda toString
    public String toString() {
        return "Worker: " + getFullName() + ", Salary: " + getSalary() + ", Position: " + getPosition() + ", Number of Subordinates: " + getNumberOfSubordinates();
    }
}

// Klasa Main
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów pracowników
        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        // Ustawianie liczby podwładnych dla wybranych pracowników
        
        for: worker1.setNumberOfSubordinates(5);
        for: worker3.setNumberOfSubordinates(3);

        // Wyświetlanie danych dla wszystkich pracowników
        System.out.println("worker1");
        System.out.println("worker2");
        System.out.println("worker3");
    }
}
