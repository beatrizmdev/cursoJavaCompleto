package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try { // aqui já pode tratar a parse exception
			
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-ou t date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			// lógica ideal
			// aqui removemos todo o código de verificação do programa principal
	
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());		
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		
		}
		// qualquer erro, cairá nos blocos catch's
		catch (ParseException error) {
			System.out.println("Invalid date format");
		}
		catch(IllegalArgumentException error) {
			System.out.println("Error in reservation: " + error.getMessage());
		}
		
		sc.close();
	}

}
