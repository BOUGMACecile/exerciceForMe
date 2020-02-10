import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureScore {

	public LectureScore() {}	// TODO Auto-generated constructor stub
	
	public static void main (String [] args) {
		/**
		To read a .txt file data
		*/
		FileReader monFichier= null;
		BufferedReader buffet = null;
		
		try {
			
				monFichier = new FileReader("C:\\Users\\cecil\\scoreExerciceFichiers\\scores.txt");
				buffet = new BufferedReader(monFichier);
				
				while (true) {
					//read one line of 
					String line = buffet.readLine();
					
					//Verify the end of file
					if (line ==null) {
						break;
					
					}//end if
					else {
						System.out.println(line);
					}
					
				
			}//end while
		}//end first try
			catch (IOException e){
				e.printStackTrace();
				}
			
			finally {
				try {
					buffet.close();
					monFichier.close();
				}//end 2nd try
					catch (IOException e1) {
						e1.printStackTrace();
					}//end 2nd catch
						
				System.out.println("Lecture du fichier terminé");	
				
			}//end finally
			
	}//fin main
	
}//end LectureScore


