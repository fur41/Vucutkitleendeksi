import java.util.Scanner;
public class Vucutkitleendeksi {
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
double kg , boy , sonuç;
System.out.print("Boyunuzu metre cinsinden giriniz (Örnek=1,80):");
boy = inp.nextDouble();

System.out.print("Kilonuzu giriniz :");
kg = inp.nextDouble();
sonuç = (kg)/(boy*boy);

System.out.println("Vücut kitle endeksiniz :"+sonuç);
}   
}
