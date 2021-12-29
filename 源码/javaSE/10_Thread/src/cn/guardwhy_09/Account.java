package cn.guardwhy_09;
/**
 * 账户对象
 */
public class Account {
    // 卡号
    private String cardId;
    // 余额
    private int money;
    // 无参构造器
    public Account() {
    }
    // 代参构造器
    public Account(String cardId, int money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     * get/set方法
     * @return
     */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 取钱方法
    public synchronized void drawMoney(int money){
        try {
            // 1.先拿到是谁来取钱:拿到当前线程的名字即可，名字是谁就是谁来取钱
            String name = Thread.currentThread().getName();
            // 2.判断余额是否足够
            if(this.money >= money){
                // 更新余额
                this.money -= money;
                System.out.println(name + "来取钱,余额足够.吐出:" + money + "元,剩余" + this.money + "元");

                this.notify(); // 钱已经取完了,暂停自己唤醒其他线程！
                // 等待自己
                this.wait();
            }else {
                this.notify();  // 没钱了.唤醒其他线程！
                // 等待自己
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 存钱方法
    public synchronized void saveMoney(int money){
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有钱
            if(this.money == 0){
                // 没钱,需要存钱
                this.money += money;
                System.out.println(name + "来存钱" + money + "元成功, 剩余" + this.money + "元");

                this.notify(); // 钱已经取完了,暂停自己,唤醒其他线程
                this.wait(); // 等待自己
            }else {
                this.notify(); // 唤醒其他线程
                this.wait(); // 等待自己
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
