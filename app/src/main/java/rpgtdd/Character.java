package rpgtdd;



public class Character {

    protected String name = "";
    protected int life;

    public Character(int initialLife, String name){
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
