package mditerm.pattern2;

public class Yeniceri extends Soldier  {

    public Yeniceri(String name){
        this.name= name;
        attackBehaviour = new AttackSword();
        moveBehaviour = new MoveRunning();
    }
    
    public void display() {
        System.out.println("Yeniçeri" + " " + name);
    }
    
}
