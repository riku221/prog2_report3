package jp.ac.uryukyu.ie.e245758;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead = false;

    public LivingThing (String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead() {
        return this.dead;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    public int getAttack() {
        return this.attack;
    }

    public void attack(LivingThing opponent) {
        if (this.isDead() != true) {
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public void deadTrue(boolean judge) {
        this.dead = true;
    }

    public void hitPointDec(int point) {
        this.hitPoint = point;
    }

    @Override
    public String toString() {
        return getClass().getName() + "name" + getName() + "hitpoit" + getHitPoint() + "attack" + getAttack();
    }
}
