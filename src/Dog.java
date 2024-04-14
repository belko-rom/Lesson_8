public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака издает лай");
    }

    @Override
    public void eat(String food) {
        if (food.equals("dog food")){
            System.out.println("я люблю кушать корм");
        } else {
            System.out.println("Это не моя еда, она для котов!!");
        }
    }
}
