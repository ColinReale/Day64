package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
//this ensures that the name is not null/empty nor too long, and that the age is within the given parameters or 0-120. And if not,
//        an exception is thrown.
        if ((name != null && name.length() <= 40) && (age >= 0 && age <= 120) && (!name.equals(""))) {
            this.name = name;

        } else {
            throw new IllegalArgumentException("The entered information was incorrect");
        }

        this.age = age;
    }
}