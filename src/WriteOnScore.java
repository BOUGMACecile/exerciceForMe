import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnScore extends FileWriter {

	// TODO Auto-generated constructor stub
	public WriteOnScore(File arg0) throws IOException {
		super(arg0);
		
	}//end constructor
	
	public static void main (String [] args) {
		
		FileWriter fichierSortie =null;
		BufferedWriter tampon=null;
		
		String [] scores = new String[3];
		scores[0] = "Dupot 240";
		scores[1] = "Maraid 221";
		scores[2] = "Marie 50";
		
		//Put data on a String table
		try {
		
			fichierSortie = new FileWriter("C:\\Users\\cecil\\scoreExerciceFichiers\\scores.txt");
		 tampon = new BufferedWriter(fichierSortie);
		 for (int i =0; i<scores.length; i++) {
			 //ecrire le tableau de chaînes dans scores.txt
			 tampon.write(scores[i]);
			 	System.out.println("Ecriture de score de " + scores[i]);
			 }//fin for
			 	System.out.println("Ecrire de fichier terminé!");
		
		}//end try
			 	catch (IOException e){
					e.printStackTrace();
					}//end catch
		
				
		finally {
			try {
				tampon.flush();
				tampon.close();
				fichierSortie.close();
			}//end try
				
			
			catch (IOException e1) {
				e1.printStackTrace();
			}//end 2nd catch
		
		}//endfinallly
		
	}//end main

	

}//end class
