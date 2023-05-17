class Character {

    public void move(){
        System.out.println("moving");
    }
}

class Hero extends Character{
    
    @Override
    public void move (){
        System.out.println("moving.");
    }
    
    public void move (String direction){
        System.out.println("moving " + direction + ".");
    }
}

class Enemy extends Character{

    @Override
    public void move(){
        System.out.println(" moving.");
    }
    public void move (int step){
        System.out.println( "moving " + step + " steps.");
        }
    }

class Fighter extends Hero{

    
    @Override
    public void move(){
        System.out.println("moving.");
    }  
}

class Witch extends Enemy{

    @Override
    public void move(){
        System.out.println( "moving.");
    }  
}

public class App {
    public static void main(String[] args) {
        // Static polymorphism
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        hero.move("right"); 
        enemy.move(7);

        // Dynamic polymorphism - reference of Character to Hero, Enemy, Witch, and Fighter objects
        Character Spongebob = new Hero();
        Character Plankton = new Enemy();
        Character Patrick = new Witch();
        Character Sandy = new Fighter();

        Spongebob.move();
        Plankton.move();
        Patrick.move();
        Sandy.move();

        // Dynamic polymorphism - reference of Character to Witch object casted to Fighter object
        Character Author = new Witch();
        Fighter fighter = (Fighter) Author;
        fighter.move();
    }
}

