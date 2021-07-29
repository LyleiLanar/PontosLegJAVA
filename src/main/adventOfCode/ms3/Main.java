package main.adventOfCode.ms3;

import com.sun.jdi.VMOutOfMemoryException;
import main.adventOfCode.ms3.Exceptions.InvalidSpiralMemoryException;

public class Main {

    public static void main(String[] args) throws Exception {


        SpiralMemory memory = new SpiralMemory(3);

//        memory.setDataDefault();

        memory.data[1][1] = 1;
        memory.data[1][2] = 1;
        memory.data[0][2] = 2;
        memory.data[0][1] = 4;
        memory.data[0][0] = 0;
        memory.data[1][0] = 0;
        memory.data[2][0] = 0;
        memory.data[2][1] = 0;
        memory.data[2][2] = 0;


        memory.stepRight();

        System.out.println(memory.pointer);

        memory.getNeighboursSum();

        memory.printMemory();


//        System.out.println("53: " + memory.getKoordById(53));
//        System.out.println("80: " +memory.getKoordById(80));
//        System.out.println("1: " +memory.getKoordById(1));
//        System.out.println("325489: " +memory.getKoordById(325489));

        //System.out.println(memory.getDistanceById(325489));

        //System.out.println(Math.sqrt(325489));
    }
}
