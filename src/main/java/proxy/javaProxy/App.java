package proxy.javaProxy;

import proxy.IUserDao;
import proxy.UserDao;

public class App {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println(target.getClass());
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy);
        proxy.save();
    }
}
