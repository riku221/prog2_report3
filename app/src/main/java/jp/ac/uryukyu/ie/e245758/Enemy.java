package jp.ac.uryukyu.ie.e245758;

public class Enemy extends LivingThing{

    //基底クラスのコンストラクトを引数ありで呼び出す
    public Enemy(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        hitPointDec(getHitPoint() - damage);
        if(getHitPoint() <= 0) {
            deadTrue(true);
            System.out.printf("モンスター%sは倒れた。", getName());
        }
    }
}
