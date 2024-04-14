public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик шыпит");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")){
            System.out.println("Я люблю кушать травку");
        } else {
            System.out.println("Я не ем это!!");
        }
    }
}
