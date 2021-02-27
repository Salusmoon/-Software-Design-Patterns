package mditerm.pattern2;

public class Sipahi extends Soldier {

    public Sipahi(String name){
        this.name= name;
        attackBehaviour = new AttackSword();
        moveBehaviour = new MoveHorseRiding();
    }


    public void display(){
        System.out.println("Sıpahi" + " " + name);
    }
    
}
