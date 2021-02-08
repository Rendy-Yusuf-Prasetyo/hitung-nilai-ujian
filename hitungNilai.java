import java.util.Scanner;

public class hitungNilai {
    public static void main(String[] args) {
        //input data
        Scanner sc = new Scanner(System.in);


        System.out.println("1. Basic");
        System.out.println("2. Custom (belum)");
        System.out.print("Masukan pilihan anda: ");
        int pilih = sc.nextInt();

        switch(pilih){
            case 1:
                //input nilai
                System.out.print("Nilai tugas: ");
                int Tugas = sc.nextInt();

                System.out.print("Nilai UTS: ");
                int UTS = sc.nextInt();

                System.out.print("Nilai UAS: ");
                int UAS = sc.nextInt();

                System.out.print("Masukan nilai minimal: ");
                int minimal = sc.nextInt();


                //hitung nilai
                int rataTugas = (int) (Tugas * 0.4);
                int rataUts = (int) (UTS * 0.3);
                int rataUas = (int) (UAS * 0.3);
                int total = rataTugas+rataUts+rataUas;

                if (total <minimal){
                    if (total >= 80 && total <= 100) {
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: A");
                        System.out.println("Ulangi tahun depan yaa :))");
                         System.out.println("----------------- ++ -----------------");
                    }else if(total >= 75 && total <= 79){
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: B+");
                        System.out.println("Ulangi tahun depan yaa :))");
                        System.out.println("----------------- ++ -----------------");
                    }else if (total >= 65 && total <= 74) {
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: B");
                        System.out.println("Ulangi tahun depan yaa :))");
                        System.out.println("----------------- ++ -----------------");
                    }else if (total >= 60 && total <= 64) {
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: C+");
                        System.out.println("Ulangi tahun depan yaa :))");
                        System.out.println("----------------- ++ -----------------");
                    }else{
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: C");
                        System.out.println("Ulangi tahun depan yaa :))");
                        System.out.println("----------------- ++ -----------------");
                    }
                }else{
            
                  if (total >= 80 && total <= 100) {
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: A");
                        System.out.println("Anda lulus matkul ini :))");  
                        System.out.println("----------------- ++ -----------------");
                    }else if(total >= 75 && total <= 79){
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: B+");
                        System.out.println("Anda lulus matkul ini :))");
                        System.out.println("----------------- ++ -----------------");
                    }else if (total >= 65 && total <= 74) {
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: B");
                        System.out.println("Anda lulus matkul ini :))");
                        System.out.println("----------------- ++ -----------------");
                    }else if (total >= 60 && total <= 64) {
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: C+");
                        System.out.println("Anda lulus matkul ini :))");
                        System.out.println("----------------- ++ -----------------");
                    }else{
                        System.out.println("----------------- ++ -----------------");
                        System.out.println("Nilai anda "+total);
                        System.out.println("Poin anda: C");
                        System.out.println("Anda lulus matkul ini :))");
                        System.out.println("----------------- ++ -----------------");
                    }
                }
                case 2:
                    //hitung nilai
        // System.out.println("Masukan cara penghitunga");
        }
    }
}
