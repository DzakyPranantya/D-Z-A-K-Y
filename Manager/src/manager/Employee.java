/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author USER
 */
public class Employee {

    String status;
    String nama;
    int nip;
    int gaji;
    int bonus = 10000000;
    int waktukerja;
    int potongan = 100000;
    String jabatan;
    int bonuswk = 100000;

    void nama (String newnama){
        this.nama = newnama;
    }
    void nip (int nip){
        this.nip = nip;
    }
    void status (String status){
         this.status = status;
    }
    void gaji (int gaji){
        this.gaji = gaji;
    }
    void bonus (int bonus){
        this.bonus = bonus;
    }
    void waktukerja (int waktukerja){
        this.waktukerja = waktukerja;
    }
    void potongan (int potongan){
        this.potongan = potongan;
        
    }
    void jabatan (String jabatan){
        this.jabatan = jabatan;
    }
    
    
    void all (){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nama                   : "+this.nama);
        System.out.println("NIP                    : "+this.nip);
        System.out.println("Status                 : "+this.status);
        System.out.println("Waktu                  : "+this.waktukerja+" Jam");
        System.out.println("Jabatan                : "+this.jabatan);
        
        
        
        if (this.waktukerja < 8) {
            System.out.println("Potongan            : Rp "+ this.potongan);
            this.gaji -= this.potongan;
        } else {
            System.out.println("Potongan            : Rp 0");
        }
        if (this.waktukerja >= 8 ) {
            System.out.println("Bonus WaktuKerja    : Rp "+ this.bonuswk);
            this.gaji += this.bonuswk;
        }
        if ("Menikah".equalsIgnoreCase(this.status)) {
            System.out.println("Bonus               : Rp "+this.bonus);
            this.gaji += this.bonus;
        } else if ("Belum Menikah".equalsIgnoreCase(this.status)) {
            System.out.println("Bonus               : Rp 0");
            
            
        }
            System.out.println("Gaji        : Rp "+this.gaji);
            
        }
    
    
    
    
    
    
    
    
    
    
   
}
