package proxy.staticProxy;

import proxy.IUserDao;

public class UserDaoProxy {
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    public void save() {
        System.out.println("begin");
        target.save();
        System.out.println("commit");
    }
}
