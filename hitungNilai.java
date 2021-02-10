import java.util.Scanner;

public class hitungNilai {
    public static void main(String[] args) {
        //input data
        Scanner sc = new Scanner(System.in);

        int minimal,nilaiA,nilaiB,nilaiC;
        String ulang;
        
        try {
            do {                
                System.out.println("1. Basic");
                System.out.println("2. Custom (belum)");
                System.out.print("Masukan pilihan anda: ");
                int pilih = sc.nextInt();

                switch(pilih){
                    case 1:
                        //input nilai

                        System.out.print("Nilai UTS: ");
                        int UTS = sc.nextInt();

                        System.out.print("Nilai UAS: ");
                        int UAS = sc.nextInt();

                        System.out.print("Nilai tugas: ");
                        int Tugas = sc.nextInt();

                        System.out.println("1 = A\n2 = B+\n3 = B\n4 = C+\n5 = C\n6 = tidak ada minimal");

                        System.out.print("Masukan nilai minimal (huruf): ");
                        minimal = Integer.parseInt(sc.next());

                        //hitung nilai
                        int rataTugas = (int) (Tugas * 0.4);
                        int rataUts = (int) (UTS * 0.3);
                        int rataUas = (int) (UAS * 0.3);
                        double   total = rataTugas+rataUts+rataUas;


                            switch(minimal){
                            case 1:
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
                                break;

                            case 2:
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
                                break;

                            case 3:
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
                                        System.out.println("Ulangi tahun depan yaa :))");
                                        System.out.println("----------------- ++ -----------------");
                                    }else{
                                        System.out.println("----------------- ++ -----------------");
                                        System.out.println("Nilai anda "+total);
                                        System.out.println("Poin anda: C");
                                        System.out.println("Ulangi tahun depan yaa :))");
                                        System.out.println("----------------- ++ -----------------");
                                    }
                                break;

                            case 4:
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
                                        System.out.println("Ulangi tahun depan yaa :))");
                                        System.out.println("----------------- ++ -----------------");
                                    }
                                    break;

                            case 5:
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
                                break;
                            default:
                                    if (total >= 80 && total <= 100) {
                                        System.out.println("----------------- ++ -----------------");
                                        System.out.println("Nilai anda "+total);
                                        System.out.println("Poin anda: A");
                                        System.out.println("----------------- ++ -----------------");
                                    }else if(total >= 75 && total <= 79){
                                        System.out.println("----------------- ++ -----------------");
                                        System.out.println("Nilai anda "+total);
                                        System.out.println("Poin anda: B+");
                                        System.out.println("----------------- ++ -----------------");
                                    }else if (total >= 65 && total <= 74) {
                                        System.out.println("----------------- ++ -----------------");
                                        System.out.println("Nilai anda "+total);
                                        System.out.println("Poin anda: B");
                                        System.out.println("----------------- ++ -----------------");
                                    }else if (total >= 60 && total <= 64) {
                                        System.out.println("----------------- ++ -----------------");
                                        System.out.println("Nilai anda "+total);
                                        System.out.println("Poin anda: C+");
                                        System.out.println("----------------- ++ -----------------");
                                    }else{
                                        System.out.println("----------------- ++ -----------------");
                                        System.out.println("Nilai anda "+total);
                                        System.out.println("Poin anda: C");
                                        System.out.println("----------------- ++ -----------------");
                                    }
                                break;
                            }

                        case 2:

                        break;

                }  
                System.out.println("\n\n");
                System.out.print("Ingin mengulang? (y/n)");
                ulang = sc.next();
                System.out.println("\n\n");
            } while (ulang != "y");
        } catch (Exception e) {
            System.error.print(e);
        }
    }
}
