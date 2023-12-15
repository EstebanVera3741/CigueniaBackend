package LaCiguenia;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class LaCigueniaApplication {

	/**                    UNSC
	        United National the Security Code
	Instructor:
	 		Andres Mauricio Arciniegas - ADSO
	Integrantes:
	        Diego Esteban Vera Enciso     Leader Project
	        Laura Valentina Trujillo      UX Designer
	        Luis Eduardo Sanchez          Develop Frontend
	        Heiler Felipe Ozaeta          Develop Backend
	 		Yesica Paola Martinez		  QC Quality Control
	        Jesus David Rodriguez         QC Quality Control
	Contacto:
	        +57 3103302209 - +57 3226640119					**/

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LaCigueniaApplication.class, args);
	}
}