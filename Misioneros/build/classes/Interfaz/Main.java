package Interfaz;

import Mundo.Misioneros;
import gfutria.SearchStateSpaces;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Misioneros misioneros;
        ArrayList<String> lst;
        SearchStateSpaces sss;

        System.out.println("Misioneros...");

        // jarras = new Jarras();
        // jarras = new Jarras(3, 2);
        misioneros = new Misioneros(3, 3, 0, 0, 1);

        sss = new SearchStateSpaces("00133", misioneros, 5);
        lst = sss.solve();

        System.out.println("Número de pasos: " + lst.size());
        if (lst.size() > 0) {
            for (int i = 0; i < lst.size(); i++) {
                System.out.println(lst.get(i));
            }
        }
    /*  System.out.println(m.getEstado());
        System.out.println(m.cm());
        System.out.println(m.m());
        System.out.println(m.cc());
        System.out.println(m.c());
        System.out.println(m.mm());
        System.out.println(m.cm());
        System.out.println(m.mm());
        System.out.println(m.c());
        System.out.println(m.cc());
        System.out.println(m.m());
        System.out.println(m.cm());
        */
    }
}
