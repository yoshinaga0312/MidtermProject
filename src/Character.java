public abstract class Character {
    String name;
    int hp;
    boolean isAlive;
    int partyMember;

    void isAlive() {
        if (hp <= 0) {
            isAlive = false;
        } else {
            isAlive = true;
        }
        System.out.println(name + "は生きている:" + isAlive);
    }

    void partyMember() {
        hp -= 50;
        System.out.println("partMember経由でHPを減らした後:");
        System.out.println(name + ":HP " + hp);
    }

    public void showStatus() {
        System.out.println(name + ":HP" + hp);
    }
}