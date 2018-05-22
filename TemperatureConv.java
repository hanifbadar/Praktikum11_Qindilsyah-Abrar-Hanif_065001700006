/**
 * Qindilsyah Abrar Hanif
 * 065001700006
 * Program Konversi Temperatur
 */
 
import java.util.Scanner;

public class TemperatureConv{
	private static double f=0, c=0, r=0;
	
public static void main (String[]args)
{
  int option;
  
  Scanner opt = new Scanner (System.in);
  System.out.println("Tekan 1 untuk C->R || 2 untuk C->F || 3 untuk R->C || 4 untuk R->F || 5 untuk F->C || 6 untuk F->R");
  
  option = opt.nextInt();
  
  if (option==1){
	convertCtoR();
  }else if (option==2){
	convertCtoF();
  }else if (option==3){
    convertRtoC();
  }else if (option==4){ 
	convertRtoF();
  }else if (option==5){
	convertFtoC();
  }else if (option==6){
	 convertFtoR();
  }else{
	 System.out.println("END");
	  }
	}
	
public static void convertCtoR()
{

	Scanner scan = new Scanner (System.in);
    System.out.print("Masukkan suhu dalam C= ");
    c = scan.nextDouble();
    r = c*0.8;
    System.out.println(c + " derajat C setara" + r + " derajat R");
}
	
public static void convertCtoF()
{
	Scanner scan = new Scanner (System.in);
    System.out.print("Masukkan suhu dalam C= ");
    c = scan.nextDouble();
    f = c*1.8+32;
    System.out.println(c + " derajat C setara" + f + " derajat F");
}	

public static void convertRtoC()
{
	Scanner scan = new Scanner (System.in);
	System.out.print("Masukkan suhu dalam R= ");
	r = scan.nextDouble();
	c = r*1.25;
	System.out.println(r + " derajat R setara" + c + " derajat C");
}

public static void convertRtoF()
{
	Scanner scan = new Scanner (System.in);
	System.out.print("Masukkan suhu dalam R= ");
	r = scan.nextDouble();
	f = r*2.25+32;
	System.out.println(r + " derajat R setara" + f + " derajat F");
}
	
public static void convertFtoC()
{
    Scanner scan = new Scanner (System.in);
    System.out.print("Masukkan suhu dalam F= ");
    f = scan.nextDouble();
    c = (f-32)/1.8;
    System.out.println(f + " derajat F setara " + c + " derajat C");
}	
	
public static void convertFtoR()
{
	Scanner scan = new Scanner (System.in);
    System.out.print("Masukkan suhu dalam F= ");
    f = scan.nextDouble();
    r = (f-32)/2.25;
    System.out.println(f + " derajat F setara " + r + " derajat R");
	}
	
}