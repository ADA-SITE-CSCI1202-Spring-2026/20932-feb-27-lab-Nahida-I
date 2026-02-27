public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Gender: " + gender;
    }

    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }

        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName) &&
               this.gender.equals(p.gender);
    }

    public static void main(String[] args) {

        // 🔹 Test Person
        Person p1 = new Person("Nahida", "Aydinli", "Female");
        Person p2 = new Person("Nahida", "Aydinli", "Female");

        System.out.println("---- PERSON TEST ----");
        System.out.println(p1.toString());
        System.out.println("Are p1 and p2 equal? " + p1.equals(p2));

        System.out.println();


        // 🔹 Test Teacher
        String[] courses1 = {"OOP", "Data Structures"};
        String[] courses2 = {"OOP", "Data Structures"};

        Teacher t1 = new Teacher("Ali", "Mammadov", "Male",
                                 "Computer Science", courses1);

        Teacher t2 = new Teacher("Ali", "Mammadov", "Male",
                                 "Computer Science", courses2);

        System.out.println("---- TEACHER TEST ----");
        System.out.println(t1.toString());
        System.out.println("Are t1 and t2 equal? " + t1.equals(t2));
    }

}

