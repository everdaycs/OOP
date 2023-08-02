public class Password {
    String user = "cyc";
    String password = "shuai";

    public static void loginInfo(String user, String password) throws UserNameException, PassWordException {
        if (!user.equals(user)) {
            throw new UserNameException("用户名错误");
        }
        if (!password.equals(password)) {
            throw new PassWordException("密码错误");
        }
        System.out.println("登录成功");
    }

    public static void main(String[] args) {
        try{
            loginInfo("cyc","shuai");
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PassWordException e) {
            e.printStackTrace();
        }
    }
}
