public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Тигр громко рычит");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")){
            System.out.println("Я очень люблю кушать мясо");
        } else {
            System.out.println("Фу,я это не ем!!");
        }
    }
}
