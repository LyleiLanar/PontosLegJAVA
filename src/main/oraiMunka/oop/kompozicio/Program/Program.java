package main.oraiMunka.oop.kompozicio.Program;

import main.enums.Color;
import main.enums.EnergiaOsztaly;
import main.enums.anyagok.EpitoAnyag;
import main.enums.anyagok.NyilaszaroAnyag;
import main.oraiMunka.oop.kompozicio.*;

public class Program {

    public static void main(String[] args) {

        Huto huto = new Huto(24,false, EnergiaOsztaly.AP,150, 60, 60);

        for (int i = 0; i < 50; i++) {
            huto.hut();
        }

    }
}
