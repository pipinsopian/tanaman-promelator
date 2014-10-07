import java.util.Scanner;
public class atmsimple {
public static void main(String[] args) {
int pilih, saldo = 10000000, tabung, tarik, temp;
while (true) {

Scanner sc = new Scanner(System.in);
System.out.println();
System.out.println("1.Cek Saldo");
System.out.println("2.Penyetoran Tunai");
System.out.println("3.Penarikan Tunai");
System.out.println("4.Selesai");
System.out.print("\nPilihan Menu : ");
pilih = sc.nextInt();
switch (pilih) {

case 1:
System.out.println("Saldo Anda saat ini adalah Rp. " + saldo);
break;

case 2:
System.out.print("Masukkan Jumlah Uang untuk Penyetoran Tunai Rp.");
tabung = sc.nextInt();
saldo += tabung;
System.out.println("Saldo Anda saat ini adalah Rp. " + saldo);
break;

case 3:
System.out.print("Masukkan Jumlah Uang untuk Penarikan Tunai Rp.");
tarik = sc.nextInt();
temp = saldo; //temp diisi saldo
temp -= tarik;
if (temp <= 50000) {
System.out.println("Saldo Minimum setelah Penarikan Tunai ialah Rp.50000");
} else {
saldo -= tarik;
System.out.println("Saldo Anda saat ini adalah Rp. " + saldo);
}
break;

case 4:
System.exit(0);
break;
default:
System.exit(0);
break;
}
}
}
}
