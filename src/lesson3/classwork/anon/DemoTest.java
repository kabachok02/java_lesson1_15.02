package lesson3.classwork.anon;

public class DemoTest {

    private static Demo demo;
    private static DemoChild demoChild;
    private static Demo demoChild2 = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("anonymous demo show");
        }
    };

    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.show();

        System.out.println(" ");

        demoChild = new DemoChild();
        demoChild.show();

        System.out.println(" ");

        demoChild2 .show();

        System.out.println(" ");

        final int showCount = 0;

        Demo demoChild3 = new Demo() {


            @Override
            public void show() {

                System.out.println(showCount);

                System.out.println("demoChild3");
            }
        };

        demoChild3.show();


    }
}
