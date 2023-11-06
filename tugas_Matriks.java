import java.util.Scanner;

public class tugas_Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("masukan jumlah kolom: ");
        int kolom = input.nextInt();

        int matrix[][] = new int[baris][kolom];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Masukkan Nilai baris "+i+" kolom "+j+": ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
    }

    System.out.println("Matriks: ");
    for (int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[i].length; j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
}
