package barupol;

/**
 * Created by Bima on 7/6/2015.
 */

public class Main {

    public static void main(String[] args) {

        //Liga
        Liga italy = new Liga("Italy");
        Liga inggris = new Liga("Inggris");

        //Divisi
        Divisi serieA = new Divisi("Serie A",italy);
        Divisi serieB = new Divisi("Serie B",italy);
        Divisi bpl1 = new Divisi("Barclays Premier League",inggris);
        Divisi bpl2 = new Divisi("Barclays Premier League 2",inggris);

        //Klub
        Klub juventus = new Klub("Juventus",serieA,italy);
        Klub asroma = new Klub("AS Roma",serieA,italy);
        Klub inter = new Klub("Inter Milan",serieB,italy);
        Klub lazio = new Klub("Lazio",serieB,italy);
        Klub united = new Klub("Manchester United",bpl1,inggris);
        Klub city = new Klub("Manchester City",bpl1,inggris);
        Klub chelsea = new Klub("Chelsea",bpl2,inggris);
        Klub arsenal = new Klub("Arsenal",bpl2,inggris);

        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);
        inggris.setDaftarDivisi(bpl1);
        inggris.setDaftarDivisi(bpl2);

        serieA.setDaftarKlub(juventus);
        serieA.setDaftarKlub(asroma);
        serieB.setDaftarKlub(inter);
        serieB.setDaftarKlub(lazio);
        bpl1.setDaftarKlub(united);
        bpl1.setDaftarKlub(city);
        bpl2.setDaftarKlub(chelsea);
        bpl2.setDaftarKlub(arsenal);

        //1. Get daftar divisi by nama liga
        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Italy : ");
        italy.getDaftarDivisi("Italy");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Italy : ");
        serieA.getDaftarKlubLiga("Italy");
        System.out.println("Liga Inggris : ");
        bpl1.getDaftarKlubLiga("Inggris");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        juventus.getDivisi("Juventus");
        chelsea.getDivisi("Chelsea");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        asroma.getLiga("AS Roma");
    }
}