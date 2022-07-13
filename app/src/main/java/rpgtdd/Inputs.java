package rpgtdd;

import java.util.Scanner;

public class Inputs {
    protected Scanner scanner;
    protected Character character;

    public Inputs(Scanner scanner, Character character){
        this.scanner = scanner;
        this.character = character;
    }

    public void processNextInput() {
        String choix = this.scanner.next();
        if(choix.equals("1")){
            this.character.hit(2);
        }else if(choix.equals("2")){
            this.character.isAlive();
        }
    }
}
