package bank.courseproject.classes;

public class Person extends Entity {
    private String surname;
    private String patronymic;
    public Person()    {
    }
    public Person(String surname, String name, String patronymic)    {
        super(name);
        this.surname = surname;
        this.patronymic = patronymic;
    }
    public String getSurname()    {
        return surname;
    }
    public String getFirstname()    {
        return name;
    }
    public String getPatronymic()    {
        return patronymic;
    }
    public void setSurname(String surname)    {
        this.surname = surname;
    }
    public void setFirstName(String firstName)    {
        name = firstName;
    }
    public void setPatronymic(String patronymic)    {
        this.patronymic = patronymic;
    }
}
