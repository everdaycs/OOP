public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e) {
            e.printStackTrace(); // 可以帮助打印 栈上的异常信息
            System.out.println("捕获到算术异常");
        }catch (NullPointerException e) { // 子类
            System.out.println("fjewiofj");
        }catch (Exception e) { // 父类
            e.printStackTrace();
            System.out.println("捕获到了异常");
        }

        System.out.println("其他业务代码");

    }
}
