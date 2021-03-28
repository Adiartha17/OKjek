// mengimpor Scanner ke program
import java.util.Scanner;

class OKjek {

    public static void main(String[] args) {
        // deklarasi variabel
        String username="adi";
        int pass = 54321;

        // membuat Scanner baru
        Scanner input = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("=====");
        System.out.println("OKjek");
        System.out.println("=====");
        System.out.println("LOGIN");
        System.out.print("Masukkan user : ");
        String user=input.nextLine();
        // menggunakan scanner dan menyimpan input di variabel username
        System.out.print("Masukkan pass : ");
        int password=input.nextInt();
        // menggunakan scanner dan menyimpan input di variabel pass

        //jika user dan pass sesuai dengan apa yang sudah disimpan di variabel username dan pass
        if(username.equals(user)&&password==pass){

            // Tampilkan output ke user
            System.out.println("Silahkan pilih menu :");
            System.out.println("1.OKride");
            System.out.println("2.OKfood");
            System.out.println("3.OKsend");
            System.out.println("4.Exit OKjek");
            System.out.print("Masukkan pilihan : ");
            int pilih = input.nextInt();
            switch(pilih){
                case 1:
                    // Tampilkan output ke user jika memilih menu 1.OKride
                    System.out.println("Anda memilih menu OKride");
                    System.out.println("1.UNUD - Tabanan");
                    System.out.println("2.UNUD - Denpasar");
                    System.out.println("3.UNUD - Uluwatu");
                    System.out.print("Masukkan pilihan : ");
                    int pilih1=input.nextInt();
                    switch(pilih1){
                        case 1:
                            // Jika user memilih menu 1.UNUD - Tabanan
                            OKride a =new OKride("UNUD","Tabanan",2500,20);
                            a.tampilOKride();
                            break;
                        case 2:
                            // Jika user memilih menu 2.UNUD - Denpasar
                            OKride b =new OKride("UNUD","Denpasar",2500,10);
                            b.tampilOKride();
                            break;
                        case 3:
                            // Jika user memilih menu 3.UNUD - Uluwatu
                            OKride c =new OKride("UNUD","Uluwatu",2500,5);
                            c.tampilOKride();
                            break;
                        default:
                            // Jika user memilih selain menu 1, 2, 3
                            System.out.println("angka yang anda masukkan tidak valid");
                            break;
                    }
                    break;
                case 2:
                    // Tampilkan output ke user jika memilih menu 2.OKfood
                    System.out.println("Anda memilih menu OKfood");
                    System.out.println("1.Babi guling");
                    System.out.println("2.Lawar kuwir");
                    System.out.println("3.Ayam betutu");
                    System.out.print("Masukkan pilihan : ");
                    int pilih2=input.nextInt();
                    switch(pilih2){
                        case 1:
                            //Jika user memilih menu 1.Babi guling
                            OKfood a =new OKfood("Babi guling",30000);
                            a.tampilOKfood();
                            break;
                        case 2:
                            //Jika user memilih menu 2.Lawar kuwir
                            OKfood b =new OKfood("Lawar kuwir",25000);
                            b.tampilOKfood();
                            break;
                        case 3:
                            //Jika user memilih menu 3.Ayam betutu
                            OKfood c =new OKfood("Ayam betutu",20000);
                            c.tampilOKfood();
                            break;
                        default:
                            //Jika user memilih selain menu 1, 2, 3
                            System.out.println("angka yang anda masukkan tidak valid");
                            break;
                    }
                    break;
                case 3:
                    // Tampilkan output ke user jika memilih menu 3.OKsend
                    System.out.println("Anda memilih menu OKsend");
                    System.out.println("1.Barang kecil");
                    System.out.println("2.Barang sedang");
                    System.out.println("3.Barang besar");
                    System.out.print("Masukkan pilihan : ");
                    int pilih3=input.nextInt();
                    switch(pilih3){
                        case 1:
                            //Jika user memilih menu 1.Barang kecil
                            OKsend a =new OKsend("Barang kecil",7.5,0.5);
                            a.tampilOKsend();
                            break;
                        case 2:
                            //Jika user memilih menu 2.Barang sedang
                            OKsend b =new OKsend("Barang sedang",7.5,2);
                            b.tampilOKsend();
                            break;
                        case 3:
                            //Jika user memilih menu 3.Barang besar
                            OKsend c =new OKsend("Barang besar",7.5,4.5);
                            c.tampilOKsend();
                            break;
                        default:
                            //Jika user memilih selain menu 1, 2, 3
                            System.out.println("angka yang anda masukkan tidak valid");
                            break;
                    }
                    break;
                case 4:
                    //Jika user memilih menu 4.Exit OKjek
                    System.exit(0);
            }
        }
        //jika user dan pass tidak sesuai dengan apa yang sudah disimpan di variabel username dan pass
        else {
            System.out.println("User atau Pass yang anda masukkan salah");
        }
    }

}

class OKride {
    // deklarasi variabel
    String lokasi;
    String tujuan;
    int biaya;
    int total,jarak;
    int ongkir=5000;
    public OKride (String lokasi,String tujuan,int biaya,int jarak){
        /*
        this digunakan untuk menunjukan atribut
        sekarang yang digunakan pada class
        */
        this.lokasi = lokasi;
        this.tujuan = tujuan;
        this.biaya = biaya;
        this.jarak =jarak;
        //Deklarasi rumus untuk menghitung total
        total = (biaya*jarak)+ongkir;
    }
    void tampilOKride(){
        /*
        tampilkan output ke user yang sudah secara otomatis
        terisi input dari data yang sudah disimpan
        */
        System.out.println("Lokasi anda    :"+lokasi);
        System.out.println("Lokasi tujuan  :"+tujuan);
        System.out.println("Biaya order    :"+total);
    }

}

class OKfood {
    // deklarasi variabel
    String nama;
    int harga,total;
    int ongkir = 5000;

    public OKfood(String nama,int harga){
        this.nama =nama;
        this.harga=harga;
        //Deklarasi rumus untuk menghitung total
        total=harga+ongkir;
    }

    void tampilOKfood(){
        System.out.println("Anda memilih "+nama);
        System.out.println("Total order  : "+total);
    }
}

class OKsend {
    // deklarasi variabel
    String nama;
    double jarak,berat,total;
    public OKsend (String nama,double jarak,double berat){
        this.nama = nama;
        this.jarak = jarak;
        this.berat= berat;
        //Deklarasi rumus untuk menghitung total
        total=(berat*5000)+(jarak*1000)+5000;
    }
    void tampilOKsend (){
        System.out.println("Nama barang   : "+nama);
        System.out.println("Berat barang  : "+berat+" kg");
        System.out.println("Jarak kirim   : "+jarak+" km");
        System.out.println("Biaya order   : "+total);
    }
}

