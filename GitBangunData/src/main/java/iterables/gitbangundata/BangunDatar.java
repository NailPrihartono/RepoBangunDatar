/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iterables.gitbangundata;

/**
 *
 * @author nailg
 */
public abstract class BangunDatar {
    
    private String nama;
    private int jumlahsudut;

    public BangunDatar() {
    }

    public BangunDatar(String nama, int jumlahsudut) {
        this.nama = nama;
        this.jumlahsudut = jumlahsudut;
    }
    
    public abstract double hitungluas();
    
    public abstract double hitungKeliling();

}
