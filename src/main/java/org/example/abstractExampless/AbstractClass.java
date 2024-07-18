package org.example.abstractExampless;

/**
 * Не может иметь экземпляр и может иметь абстрактные методы.
 * Если класс-наследник не реализует абстрактное поведение, то он тоже должен быть aбстрактным!
 */
public abstract class AbstractClass {

    public abstract int some();

    public int some(int a){
        return a;
    }

    abstract class InnerAbstractClass extends AbstractClass{

    }

    class InnerClassOfAbstractClass extends AbstractClass{

        @Override
        public int some() {
            return 0;
        }
    }

}
