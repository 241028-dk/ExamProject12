public class Matango extends Monster {

    public Matango(String name,char suffix,int hp) {
        super("お化けキノコ",hp,suffix);
        //setName(name);
       //setSuffix(suffix);
        //setHp(hp);
    }
@Override
    public void attack(Creature target) {
        System.out.println("お化けキノコ" + getSuffix() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp()-6);
    }
}
