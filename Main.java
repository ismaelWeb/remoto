package clasesPeliculas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		

	}
	
	public static ArrayList<Pelicula> pelis(){
		String ruta = "C:\\Users\\leam4\\OneDrive\\Escritorio\\NUEVOWORKESPEIS\\Peliculas\\peliculas.txt";
		String [] datos = new String [9];
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>(); 
		
		try {
			BufferedReader br = new BufferedReader (new FileReader(ruta));
			String linea = "";
			linea = br.readLine();
			
			while(linea != null) {
				datos=linea.split("\\;");
				Pelicula peli = new Pelicula (datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8]);
				peliculas.add(peli);
				linea = br.readLine();
			}
			br.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return peliculas;
	}
	
	
	
	
	
	

}
