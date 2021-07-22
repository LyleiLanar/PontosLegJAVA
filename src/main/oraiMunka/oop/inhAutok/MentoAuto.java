package main.oraiMunka.oop.inhAutok;

public class MentoAuto extends Auto{

    public static final int TOMEG = 3000;
    public static final String TIPUS = "Volkswagen Crafter";
    public static final int MAX_SEBESSEG = 160;
    public static final int AJTOK_SZAMA = 4;
    public static final boolean MANUALIS = true;
    public static final int FOKOZATOK = 6;

    private boolean szirena;
    private boolean vanBeteg;

    public MentoAuto(int tomeg, String nev, int maxSebesseg, int ajtok, boolean manualis, int fokozatok){
        super(tomeg,nev,maxSebesseg,ajtok,manualis,fokozatok);
        System.out.println("<MENTOAUTO> készítése");
        this.szirena=false;
        this.vanBeteg=false;
    }
    public MentoAuto(){
        this(TOMEG,TIPUS,MAX_SEBESSEG,AJTOK_SZAMA,MANUALIS,FOKOZATOK);
        System.out.println("<MENTOAUTO> magyar szabvány szerint készítés");
    }
}
