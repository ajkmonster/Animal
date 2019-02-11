public class Mouse extends Animal{
    public Mouse(){
        super();
        System.out.println("I'm a small mouse!");
    }
    @Override
    public String sleep(){
        return "a mouse is sleeping...";
    }
    @Override
    public String eat(){
        return "a mouse eats...";
    }
    public String squeak(){
        return "squeak. squeak...";
    }
}
