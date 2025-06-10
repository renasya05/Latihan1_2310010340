package hitung;

public class MatematikaBeraksi {
     public static void main(String[] args){
        //membuat objek 
        Matematika aca = new Matematika(5,0);
        
        System.out.println("Hasil Penjumlahan : "+aca.setPenjumlahan());
        System.out.println("Hasil Penjumlahan : "+aca.setPengurangan());
        System.out.println("Hasil Penjumlahan : "+aca.setPerkalian());
        System.out.println("Hasil Penjumlahan : "+aca.setPembagian());
    }
}
