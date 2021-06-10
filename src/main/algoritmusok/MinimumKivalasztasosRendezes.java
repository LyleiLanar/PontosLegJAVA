package main.algoritmusok;

public class MinimumKivalasztasosRendezes {

    public static void main(String[] args) {
        /*
        MINIMUMKIVÁLASZTÁSOS RENDEZÉS
     -----------------------------------
        algoritmus MinimumKiválszatásosRendezés
            ciklus J:=1..N-1 ismétlés
                MinIndex := J
                ciklus I:=J+1..N ismétel
                    ha A[I]<A[MinIndex] akkor
                        MinIndex = I
                    hvége
                cvége
                Csere:=A[MinIndex]
                A[MinIndex]:=A[J]
                A[J]:=Csere
            cvége
     -----------------------------------
        */


        int[] szamok = {65, 4, 33, 22, 8, 75, 77, 2};

        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }

        for (int j = 0; j < szamok.length - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < szamok.length; i++) {
                if (szamok[i] < szamok[minIndex]) {
                    minIndex = i;
                }
            }
            int csere = szamok[minIndex];
            szamok[minIndex] = szamok[j];
            szamok[j] = csere;
        }


        System.out.println();
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }

    }
}
