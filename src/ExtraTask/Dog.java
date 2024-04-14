package ExtraTask;

public class Dog {
    public void voice() {
        System.out.println("Собака издает лай");
    }

    public void eat() {
        System.out.println("Люблю кушать корм");
    }

    private Dog() {
    }
    //Создал статический метод для создания обькта
    public static Dog createDog() {
            return new Dog();
    }

}
