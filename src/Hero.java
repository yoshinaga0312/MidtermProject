public class Hero extends Character {
    String weapon;
    public Hero(String name,int hp,String weapon){
        super(name,hp);
        this.name = name;
    }
    void attack(Character target) {
        System.out.println(name + "は" + weapon + "で攻撃!" + target.name + "に10のダメージを与えた!");
        target.hp -= 10;
    }

    void heal() {
        System.out.println(name + "は回復呪文を唱えた!HPが20回復した!");
        hp += 20;
    }
}
