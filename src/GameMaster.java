public class GameMaster {
    public static void main(String[] args) {
        Hero abel = new Hero();
        abel.name = "アベル";
        abel.hp = 100;
        abel.weapon = "銅の剣";

        Slime s = new Slime();
        s.name = "スライムA";
        s.hp = 30;

        System.out.println("冒険が始まる...!");
        abel.showStatus();
        s.showStatus();
        System.out.println("戦闘開始!");
        abel.attack(s);
        s.showStatus();
        s.attack(abel);
        abel.showStatus();
        abel.heal();
        abel.showStatus();
        abel.attack(s);
        abel.attack(s);
        abel.attack(s);
        System.out.println("---戦闘終了---");
        abel.showStatus();
        s.showStatus();
        abel.isAlive();
        s.isAlive();
        System.out.println("---参照の確認---");
        abel.partyMember();
    }
}
