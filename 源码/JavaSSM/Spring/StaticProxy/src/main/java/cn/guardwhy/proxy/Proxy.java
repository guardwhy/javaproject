package cn.guardwhy.proxy;

import cn.guardwhy.domain.Landlord;
import cn.guardwhy.domain.Rent;

public class Proxy implements Rent {
    private Landlord landlord;

    public Proxy() {

    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    // 租房
    public void rent() {
        // 调用方法
        seeHouse();
        landlord.rent();
        agreement();
        fare();
    }

    // 看房
    public void seeHouse(){
        System.out.println("带房客看房!!!");
    }
    // 合同
    public void agreement(){
        System.out.println("签租赁合同...");
    }
    // 收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
