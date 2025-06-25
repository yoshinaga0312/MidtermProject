public abstract class Character {
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

     public final boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }

    void partyMember() {
        hp -= 50;
        System.out.println("partMember経由でHPを減らした後:");
        System.out.println(name + ":HP " + hp);
    }

    void showStatus() {
        System.out.println(name + ":HP" + hp);
    }
}