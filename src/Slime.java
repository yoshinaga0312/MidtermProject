public class Slime extends Character{
    void attack(Character target){
        System.out.println( name + "で攻撃!" + target.name + "に5のダメージを与えた!" );
        target.hp -= 5;
    }

}
