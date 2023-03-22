package box;
import java.util.Scanner;
public class Pullinoutthecoupeatthlot { 
static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
double garums;
String izvele="";
do{
do{
System.out.println("Sveiki");
System.out.println("Labdien");
System.out.println("Ievadiet garumu centimetros");
garums = scan.nextDouble();
if(garums<=0){
 System.out.println("Jums vajag ievadît  pozitîvs skaitlis!");
}
}while(garums<=0);
System.out.println("\n'apturet'-lai apturçt programmu darbîbu\n'mm'- lai konvertçt  milimetrus\n'm'- lai konvertçt metrus\n'km'- lai konvertçt kilometrus\n'inch'-lai konvertçt collas'");
izvele = scan.next().toLowerCase();
switch(izvele) {
			case "apturet": 
				System.out.println("Programma apturçta");
				break;
			case "mm":
				System.out.println(garums+" cm = "+mm(garums)+" mm");
				break;
			case "m":
				System.out.println(garums+" cm = "+m(garums)+" m");
				break;
			case "km":
				System.out.println(garums+" cm = "+km(garums)+" km");
				break;
			case "inch":
				System.out.println(garums+" cm = "+inch(garums)+" collas");
				break;
			case "cits": break;
			default: 
				System.out.println("Tâdas iespçjas nav, izvçlieties kâdu no norâdîtajâm!");
				break;

}
}while(!izvele.equals("apturet"));
scan.close();
}
static double mm(double garums){
return garums*10;
}
static double m(double garums) {
return garums/100;
}
static double km(double garums){
return garums/100000;
}
static double inch(double garums){
return garums*0.393701;
}
}

























 