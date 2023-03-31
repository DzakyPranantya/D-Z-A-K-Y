/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        boss poke1 = new boss ();
        Manager poke2 = new Manager();
        cs poke3 = new cs();
        
        poke1.nama ("yuha");
        poke1.nip(3124);
        poke1.status ("Menikah");
        poke1.gaji (3000000);
        poke1.waktukerja (10);
        poke1.jabatan ("Boss");
        poke1.all();
        
        poke2.nama ("wyffee");
        poke2.nip(4921);
        poke2.status ("Belum Menikah");
        poke2.gaji (3000000);
        poke2.waktukerja (10);
        poke2.jabatan ("Manager");
        poke2.all();
        
        poke3.nama ("wav");
        poke3.nip(4120);
        poke3.status ("Belum Menikah");
        poke3.gaji (2000000);
        poke3.waktukerja (6);
        poke3.jabatan ("Cleaning Service");
        poke3.all();
    }
    
}
