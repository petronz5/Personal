import java.util.Random;
import java.util.Scanner;

public class Pokemon {
    Random random = new Random();
    Scanner in = new Scanner(System.in);

    private String name;
    private int health;
    private int speed;
    private Moves mossa1;
    private Moves mossa2;

    public Pokemon(String name ,int health, int speed ,Moves mossa1 , Moves mossa2){
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.mossa1 = mossa1;
        this.mossa2 = mossa2;
    }

    /**
     * 
     * Metodi get e set
     */
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getSpeed(){return speed;}

    public void setName(String name){
        this.name = name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String toString(){
        return "\n\nnome: "+name+ "   salute: "+health + "\n"+mossa1.toString() +"\n"+ mossa2.toString();
    }

    public void attacca(Pokemon p2){
    int prima = 0;
    if(this.speed > p2.speed)
        prima = 1;
    else
        prima = 2;    
        
        switch(prima){
        case 1:
            while(this.getHealth() > 0 && p2.getHealth() > 0){
                int number = random.nextInt(7);
                String risposta = "";
                System.out.println("è il tuo turno scegli che mossa usare: ");
                risposta = in.nextLine();
                
                if(risposta.equalsIgnoreCase(this.mossa1.getNameMoves())){
                    System.out.println("\n"+this.name + "  usa "+this.mossa1.getNameMoves());
                    p2.health = p2.health - this.mossa1.getDamage();
                    if(number == 0 || number == 1 || number == 2){
                        this.health = this.health - p2.mossa1.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa1.getNameMoves() + "\n\n");
                    }
                    else if(number == 3 || number == 4 || number == 5){
                        this.health = this.health - p2.mossa2.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa2.getNameMoves() + "\n\n");
                    }

                    else
                        System.out.println(p2.getName() + "fallisce");
                        
                    System.out.println("Salute del pokemon avversario è: "+p2.health);
                    System.out.println("\nSalute del tuo pokemon: "+this.health);

                }


                else if(risposta.equalsIgnoreCase(this.mossa2.getNameMoves())){
                    System.out.println("\n" + this.name + "  usa "+this.mossa2.getNameMoves());
                    p2.health = p2.health - this.mossa2.getDamage();

                    if(number == 0 || number == 1 || number == 2){
                        this.health = this.health - p2.mossa1.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa1.getNameMoves() + "\n\n");
                    }
                    
                    else if(number == 3 || number == 4 || number == 5){
                        this.health = this.health - p2.mossa2.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa2.getNameMoves() + "\n\n");
                    }

                    else
                        System.out.println(p2.getName() + "fallisce");


                    System.out.println("Salute del pokemon avversario è: "+p2.health);
                    System.out.println("Salute del tuo pokemon è: "+this.health);
                }


                else
                {
                    System.out.println(this.getName() + "fallisce ");

                    if(number == 0 || number == 1 || number == 2)
                        this.health = this.health - p2.mossa1.getDamage();
                    
                    else if(number == 3 || number == 4 || number == 5)
                        this.health = this.health - p2.mossa2.getDamage();

                    else
                        System.out.println(p2.getName() + "fallisce");

                    System.out.println("Salute del tuo pokemon è: "+this.health);
                }


            }
            break;

        case 2:
            while(this.getHealth() > 0 && p2.getHealth() > 0){
                int number = random.nextInt(7);
                String risposta = "";
                System.out.println("è il tuo turno scegli che mossa usare: ");
                risposta = in.nextLine();
                
                //pikachu sceglie fulmine
                if(risposta.equalsIgnoreCase(this.mossa1.getNameMoves())){

                    if(number == 0 || number == 1 || number == 2){
                        this.health = this.health - p2.mossa1.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa1.getNameMoves() + "\n\n");
                    }
                    else if(number == 3 || number == 4 || number == 5){
                        this.health = this.health - p2.mossa2.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa2.getNameMoves());
                    }

                    else
                        System.out.println(p2.getName()+" fallisce ");

                    System.out.println("\n"+this.name + "  usa "+this.mossa1.getNameMoves());
                    p2.health = p2.health - this.mossa1.getDamage();
                        
                    System.out.println("\n\nSalute del pokemon avversario è: "+p2.health);
                    System.out.println("Salute del tuo pokemon: "+this.health);

                }


                //pikachu usa codacciaio
                else if(risposta.equalsIgnoreCase(this.mossa2.getNameMoves())){
                    
                    if(number == 0 || number == 1 || number == 2){
                        this.health = this.health - p2.mossa1.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa1.getNameMoves());
                    }
                    
                    else if(number == 3 || number == 4 || number == 5){
                        this.health = this.health - p2.mossa2.getDamage();
                        System.out.println(p2.name + " usa " + p2.mossa2.getNameMoves());
                    }

                    else
                        System.out.println(p2.getName()+" fallisce ");

                    System.out.println("\n" + this.name + "  usa "+this.mossa2.getNameMoves());
                    p2.health = p2.health - this.mossa2.getDamage();


                    System.out.println("\n\nSalute del pokemon avversario è: "+p2.health);
                    System.out.println("Salute del tuo pokemon è: "+this.health);
                }


                else
                {
                    System.out.println(this.getName() + " fallisce");

                    if(number == 0 || number == 1 || number == 2)
                        this.health = this.health - p2.mossa1.getDamage();
                    
                    else if(number == 3 || number == 4 || number == 5)
                        this.health = this.health - p2.mossa2.getDamage();

                    else
                        System.out.println(p2.getName() + " fallisce ");

                    System.out.println("\nSalute del tuo pokemon è: "+this.health);
                }


            }
        
        System.out.println("HAI VINTO!!!");
        }
    
    }
}
