package org.example.innerClasses;

public class LocalInnerClassExample {

    public void some(){

    }

    public void example(int z){
        /*
         * • Видны только в пределах блока, в котором объявлены;
         * • Не могут быть объявлены как private/public/protected или static;
         * • Имеют доступ к полям и методам обрамляющего класса;
         */
        class LocalInnerClass{
            private int x;
            public static int y;

            public LocalInnerClass(int x) {
                this.x = x;
            }

            public static void staticExampleMethod(){
                System.out.println("oh");
            }
            public void nonStaticExample(){
                System.out.println(z);
            }

            public int getX() {
                return x;
            }

            public static int getY() {
                return y;
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass(20);
        System.out.println(localInnerClass.getX());
        System.out.println(LocalInnerClass.y);
        LocalInnerClass.staticExampleMethod();
        localInnerClass.nonStaticExample();
    }
}
