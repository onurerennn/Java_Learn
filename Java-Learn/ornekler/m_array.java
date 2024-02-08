import java.util.Scanner;

public class asa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dizinin boyutunu girin");
        int n = sc.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}