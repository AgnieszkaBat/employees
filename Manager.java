public class Manager extends Employee {
    public int numberOfSubordinates;

    // Konstruktor
    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // Metoda zwracająca liczbę pracowników
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    // Metoda ustawiająca liczbę pracowników
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // Przesłonięta metoda toString
    @Override
    public String toString() {
        return "Manager: " + getFullName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
