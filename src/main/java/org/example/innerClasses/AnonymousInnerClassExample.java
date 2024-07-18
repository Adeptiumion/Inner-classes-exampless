package org.example.innerClasses;

public class AnonymousInnerClassExample {
    private int real;

    public static void doAnonymous(){
        /*
        Существую только в момент создания.
        Здесь реализовываю налету поведение интерфейса SomeInterface.
         */
        SomeInterface someInterface = new SomeInterface() {
            @Override
            public void doSome() {
                System.out.println("some");
            }
        };
        someInterface.doSome();

         /*
        Существую только в момент создания.
        Здесь переопределяю налету поведение класса AnonymousInnerClassExample.
         */
        AnonymousInnerClassExample anonymousInnerClassExample = new AnonymousInnerClassExample() {
            @Override
            public int getReal() {
                return 20;
            }
        };

    }

    public int getReal() {
        return real;
    }

    public interface SomeInterface{
        void doSome();
    }
}
