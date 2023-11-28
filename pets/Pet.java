package pets;

public class Pet {
    private String _name;
    private int _age;

    public Pet(String name, int age) {
        _name = name;
        _age = age;
    }

    public String geName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getAge() {
        return _age;
    }

    public void set_age(int age) {
        _age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Имя: = " + _name  +
                ", возраст: " + _age +
                '}';
    }
}
