class Character {

    public void move(){
        System.out.println(" is moving");
    }
}

class Hero extends Character{
    
    @Override
    public void move (){
        System.out.println(" is moving.");
    }
    
    public void move (String direction){
        System.out.println("is moving " + direction + ".");
    }
}

class Enemy extends Character{

    @Override
    public void move(){
        System.out.println(" is moving.");
    }
    public void move (int step){
        if (step <2 ){
        System.out.println( " is moving " + step + "step.");
        }else {
            System.out.println( " is moving " + step + " steps.");
        }
    }
}

class Fighter extends Hero{

    
    @Override
    public void move(){
        System.out.println(" is moving.");
    }  
}

class Witch extends Enemy{

    @Override
    public void move(){
        System.out.println( " is moving.");
    }  
}

public class App {
    public static void main(String[] args) {
        // Static polymorphism
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        hero.move("left"); 
        enemy.move(7);

        // Dynamic polymorphism - reference of Character to Hero, Enemy, Witch, and Fighter objects
        Character harryPotter = new Hero();
        Character voldemort = new Enemy();
        Character dracoMalfoy = new Witch();
        Character HermioneGranger = new Fighter();

        harryPotter.move();
        harryPotter.move();
        voldemort.move();
        dracoMalfoy.move();
        HermioneGranger.move();

        // Dynamic polymorphism - reference of Character to Witch object casted to Fighter object
        Character Author = new Witch();
        Fighter fighter = (Fighter) Author;
        fighter.move();
    }
}

