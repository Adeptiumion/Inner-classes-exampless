package org.example.innerClasses;

public class StaticNastedClassExample {
    private static int privateMainStatic;
    private int privateMainNonStatic;

    public int publicMainNonStatic;
    public static int publicMainStatic;

    public void someMethodOfMain() {
        System.out.println(StaticNastedClass.privateNastedStatic);
        System.out.println(StaticNastedClass.publicNastedStatic);
        // Дальше только через создание экземпляра внутреннего.
        System.out.println(new StaticNastedClass().privateNastedNonStatic);
        System.out.println(new StaticNastedClass().publicNastedNonStatic);
    }

    static class StaticNastedClass {
        private static int privateNastedStatic;
        private int privateNastedNonStatic;

        public int publicNastedNonStatic;
        public static int publicNastedStatic;

        public void someMethodOfNasted() {
            System.out.println(publicMainStatic);
            System.out.println(privateMainStatic);
            // Дальше только через создание экземпляра внутреннего.
            System.out.println(new StaticNastedClassExample().privateMainNonStatic);
            System.out.println(new StaticNastedClassExample().publicMainNonStatic);
        }

    }
}
