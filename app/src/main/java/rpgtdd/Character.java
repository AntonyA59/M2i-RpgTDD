package rpgtdd;



public class Character {
    private int life;

    public Character(int initialLife){
        this.life = initialLife;
    }

    public boolean isAlive(){
        if(this.life > 0)
        return true;
        else
        return false;
    }

    public void hit(int damage){
        this.life -= damage;
    }
}
