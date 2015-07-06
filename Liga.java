package barupol;

/**
 * Created by Bima on 7/6/2015.
 */
import java.util.ArrayList;

public class Liga {

    private String namaLiga;

    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {

        this.namaLiga = namaLiga;
    }


    public void setNamaLiga(String namaLiga) {

        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {

        return namaLiga;
    }

    public void setDaftarDivisi(Divisi divisi)
    {

        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Divisi> getDaftarDivisi() {

        return daftarDivisi;
    }

    //1
    public void getDaftarDivisi(String liga)
    {
        if (liga == getNamaLiga())
        {
            for (int a = 0; a <daftarDivisi.size() ; a++)
            {
                System.out.println(daftarDivisi.get(a));
            }
        }
        else
        {
            System.out.println("Tidak Ada Divisi");
        }

    }

    //toString
    @Override
    public String toString() {
        return "Nama Liga = " + namaLiga +
                "\nDaftar Divisi = " + daftarDivisi ;
    }
}
