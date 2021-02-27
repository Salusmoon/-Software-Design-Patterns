package mditerm.pattern2;

public class Soldier {
    protected String name;

    protected AttackBehaviour  attackBehaviour;
    protected MoveBehaviour moveBehaviour;


    public void display(){

    }

    public void performAttack(){
        this.attackBehaviour.attack();
    }

    public void performMove(){
        this.moveBehaviour.move();
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAttackBehaviour(AttackBehaviour attackBehaviour) {
        this.attackBehaviour = attackBehaviour;
    }

    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }



}
