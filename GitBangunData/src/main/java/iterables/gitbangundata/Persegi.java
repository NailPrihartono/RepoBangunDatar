/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterables.gitbangundata;

/**
 *
 * @author nailg
 */
public class Persegi extends BangunDatar {
    
    private double sisi;

    public Persegi() {
    }

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungluas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
    
    
    
    
}
