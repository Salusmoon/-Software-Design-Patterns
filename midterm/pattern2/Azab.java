package mditerm.pattern2;

public class Azab extends Soldier{
    
    public Azab(String name){
        this.name =name;
        attackBehaviour = new AttackSword();
        moveBehaviour = new MoveWalking();
    }


    public void display(){
        System.out.println("Azab"+ " " + name);
    }

}
