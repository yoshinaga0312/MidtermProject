public abstract class Character {
    String name;
    int hp;
    boolean isAlive;

    public void isAlive() {
        System.out.println(isAlive);
    }

    public void showStatus() {
        System.out.println(name + ":HP" + hp);
    }

    public abstract void attack(Character target);
}
