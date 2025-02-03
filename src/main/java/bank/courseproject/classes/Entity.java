package bank.courseproject.classes;

abstract public class Entity {
    protected String name;
    public Entity()   {
    }
    public Entity(String name)   {
        this.name = name;
    }
    public String getName()   {
        return name;
    }
    public void setName(String name)   {
        this.name = name;
    }
}
