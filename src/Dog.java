public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Now I'm a Dog!");
    }
    @Override
    public String sleep(){
        return "a dog sleeps peacefully...";
    }
    @Override
    public String eat(){
        return "a dog eats...";
    }
    public String bark(){
        return "woof. woof...";
    }
}
