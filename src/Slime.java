public final class Slime extends Character{

    public Slime(String name,int hp){
        super(name,hp);
        this.name = name;
    }

    void attack(Character target){
        System.out.println( name + "で攻撃!" + target.name + "に5のダメージを与えた!" );
        target.hp -= 5;
    }
}
