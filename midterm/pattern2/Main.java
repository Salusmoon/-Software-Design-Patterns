package mditerm.pattern2;

public class Main {
    
    public static void main(String[] args) {
        
        Yeniceri yeniceri = new Yeniceri("Ahmet");
        yeniceri.display();
        yeniceri.performAttack();
        yeniceri.performMove();
        yeniceri.setAttackBehaviour(new AttackKnife());  // sword is broken
        yeniceri.performAttack();
        System.out.println("-----------------------");

        Azab azab = new Azab("Veli");
        azab.display();
        azab.performAttack();  // he shoot to sipahi
        azab.performMove();
        System.out.println("-----------------------");

        Sipahi sipahi = new Sipahi("Mehmet");
        sipahi.display();
        sipahi.performMove();
        sipahi.setMoveBehaviour(new MoveRunning());   // him horse dead and he  have to run
        sipahi.performMove();
        sipahi.performAttack();
        System.out.println("-----------------------");

        Kapikulu kapikulu = new Kapikulu("Musa");
        kapikulu.display();
        kapikulu.performMove();
        kapikulu.performAttack();
        kapikulu.setName("Mali");
        kapikulu.display();


        System.out.println("-----------------------");

        


        
    }

}
