import java.io.*;
public class FileHand{
public static void main(String [] args) 
{
	try{
	File f1=new File("C:\\Users\\FAISAL\\Desktop\\Javas\\pom.txt");
	f1.createNewFile();
	System.out.println("File Create Successfully!!!");

	//FileWritter fw =new FileWritter("pom.txt");
	//BufferedWriter bw =new BufferedWritter(fw);
	//bw.write("Hiii, Dear");
	//bw.close();

	FileReader fr=new FileReader("pom.txt");
	BufferedReader bf =new BufferedReader(fr);
	System.out.println(bf.readLine());

	}
	catch(Exception e){
	System.out.println(e);
	}
}
} 
    
