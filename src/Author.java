public class Author {
    private String name;
    private String surname;

    // конструктор
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //геттер имя
    public String getName() {
        return name;
    }

    //геттер фамилия
    public String getSurname() {
        return surname;
    }
}
