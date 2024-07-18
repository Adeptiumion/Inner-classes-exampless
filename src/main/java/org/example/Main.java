package org.example;

import org.example.innerClasses.LocalInnerClassExample;
import org.example.record.Coordination;
import org.example.record.RecordCoordination;

public class Main {
    public static void main(String[] args) {

       /* Coordination coordination = new Coordination(12,13);
        RecordCoordination recordCoordination = new RecordCoordination(12, 13);
        System.out.println(coordination);
        System.out.println(recordCoordination);*/

        LocalInnerClassExample localInnerClassExample = new LocalInnerClassExample();
        localInnerClassExample.example(1);



    }
}