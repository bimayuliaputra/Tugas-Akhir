package barupol;

/**
 * Created by Bima on 7/6/2015.
 */
public class Klub {

    private String namaKlub;
    private Divisi divisi;
    private Liga liga;


    public Klub(String namaKlub, Divisi divisi, Liga liga) {
        this.namaKlub = namaKlub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public void setNamaKlub(String namaKlub) {

        this.namaKlub = namaKlub;
    }

    public String getNamaKlub() {

        return namaKlub;
    }

    public void setDivisi(Divisi divisi) {

        this.divisi = divisi;
    }

    //4
    public void getDivisi(String Klub){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarKlub.size(); c++){
                a.daftarKlub.get(c);
                Klub i = a.daftarKlub.get(c);
                if (Klub == i.getNamaKlub()){
                    System.out.println(a.getNamaDivisi());
                }
            }
        }
    }

    public void setLiga(Liga liga) {

        this.liga = liga;
    }

    //5
    public void getLiga (String club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarKlub.size(); c++){
                a.daftarKlub.get(c);
                Klub i = a.daftarKlub.get(c);
                if (club == i.getNamaKlub()){
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }

    //toString
    @Override
    public String toString() {
        return "Nama Klub = " + namaKlub;
    }
}
