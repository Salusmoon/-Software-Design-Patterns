package mditerm.pattern2;

public class Kapikulu extends Soldier {

    public Kapikulu(String name){
        this.name = name;
        attackBehaviour = new AttackKnife();
        moveBehaviour = new MoveHorseRiding();
    }
    public void display(){
        System.out.println("Kapıkulu" + " " + name);
    }
    
}
