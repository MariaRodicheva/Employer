package BD;

public class FullName {
    private static String lastName;
    private static String firstName;
    private static String fatherName;

    public FullName(String firstName, String lastName, String fatherName) {
        String expression = "^[a-zA-Z\\s]+";
        if (firstName.matches(expression) == false) {
            System.out.println("Ошибка введенного имени ");
            this.firstName=null;
        }
        else this.firstName = firstName;

        if (lastName.matches(expression) == false) {
            System.out.println("Ошибка введенной фамилии ");
            this.lastName=null;
        }
        else this.lastName = lastName;

        if (fatherName.matches(expression) == false) {
            System.out.println("Ошибка введенного отчества ");
            this.fatherName=null;
        }
        else this.fatherName = fatherName;
    }

    public static String getFullName() {
        return FullName.lastName + " " + FullName.firstName + " " + FullName.fatherName;
    }

    public static String getLastName() {
        return FullName.lastName;
    }
    public String getFirstName() {
        return FullName.firstName;
    }
    public static String getFatherName() { return FullName.fatherName; }


}