package cn.guardwhy.client;

import cn.guardwhy.domain.Landlord;
import cn.guardwhy.proxy.Proxy;

public class Client {
    public static void main(String[] args) {
        // 1.房东租房子
        Landlord landlord = new Landlord();
        // 2.代理，中介帮房东租房子
        Proxy proxy = new Proxy(landlord);
        // 3.不需要直接面对房东，直接找中介租房即可
        proxy.rent();
    }
}
