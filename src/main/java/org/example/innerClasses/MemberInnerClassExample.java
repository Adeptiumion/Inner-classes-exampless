package org.example.innerClasses;

public class MemberInnerClassExample {
    private static int privateMainStatic;
    private int privateMainNonStatic;

    public int publicMainNonStatic;
    public static int publicMainStatic;

    public void someMethodOfMain(){
        System.out.println(MemberInnerClass.privateNastedStatic);
        System.out.println(MemberInnerClass.publicNastedStatic);
        // Дальше только через создание экземпляра внутреннего.
        System.out.println(new MemberInnerClass().privateNastedNonStatic);
        System.out.println(new MemberInnerClass().publicNastedNonStatic);
    }


    public class MemberInnerClass {
        private static int privateNastedStatic;
        private int privateNastedNonStatic;

        public int publicNastedNonStatic;
        public static int publicNastedStatic;
         public void someMethodOfNasted(){
             // У меня власть которая и не снилась моему отцу! )))
             System.out.println(privateMainStatic);
             System.out.println(privateMainNonStatic);
             System.out.println(publicMainNonStatic);
             System.out.println(publicMainStatic);
         }
    }
}
