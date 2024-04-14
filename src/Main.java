public class Main {
    public static void main(String[] args) {
        Animal tuzik = new Dog();
        tuzik.voice();
        tuzik.eat("dog ");
        System.out.println();

        Animal roger = new Rabbit();
        roger.voice();
        roger.eat("llll");
        System.out.println();

        Animal suri = new Tiger();
        suri.voice();
        suri.eat("Meat");
    }
}