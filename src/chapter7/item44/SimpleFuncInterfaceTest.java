package chapter7.item44;

public class SimpleFuncInterfaceTest {
    public static void main(String[] args) {
        doSomething(new SimpleFuncInterface() {
            @Override
            public void doWork() {
                System.out.println("test simple function interface!");
            }
        });
        doSomething(() -> System.out.println("test lambda"));

        SimpleFuncInterface sfi = () -> System.out.println("qwer");
        sfi.doWork();
    }

    public static void doSomething(SimpleFuncInterface sfi) {
        sfi.doWork();
    }
}
