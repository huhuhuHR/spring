package proxy.staticProxy;

import proxy.UserDao;

public class App {
    public static void main(String[] args) {
        UserDaoProxy proxy = new UserDaoProxy(new UserDao());
        proxy.save();
    }
}
