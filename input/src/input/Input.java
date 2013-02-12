package input;
import java.util.Scanner;
public class Input {
	
	//Private data fields for the scanner, and the message to be printed
	private Scanner sam;
	private String message;
	
	//public constructor
	public Input(Scanner s, String m){
		sam = s;
		message = m;
	}
	
	public void setScanner(Scanner s){ sam = s; }
	
	public void setMessage(String newMessage){ message = newMessage; }
	
	public String getMessage(){ return message; }
	
	public String getScanner(){ return sam.toString(); }
	
	//Parses a string for an integer, sends user a message if they enter the wrong thing
	public int checkInt(){
		int x = 0;
		String y = "";
		while(true){
			try{
				y = sam.next();
				x = Integer.parseInt(y);
				break;
			} catch (NumberFormatException e) {
				System.out.println(message);
				continue;
			}
		}
		return x;
	}
	
	//Parses a string for an double, sends user a message if they enter the wrong thing
	public double checkDouble(){
		double x = 0.0;
		String y = "";
		while(true){
			try{
				y = sam.next();
				x = Double.parseDouble(y);
				break;
			} catch (NumberFormatException e) {
				System.out.println(message);
				continue;
			}
		}
		return x;
	}
	
	//Parses a string for an float, sends user a message if they enter the wrong thing
	public float checkFloat(){
		float x = 0;
		String y = "";
		while(true){
			try{
				y = sam.next();
				x = Float.parseFloat(y);
				break;
			} catch (NumberFormatException e) {
				System.out.println(message);
				continue;
			}
		}
		return x;
	}
	
	//Parses a string for an long, sends user a message if they enter the wrong thing
	public long checkLong(){
		long x = 0;
		String y = "";
		while(true){
			try{
				y = sam.next();
				x = Long.parseLong(y);
				break;
			} catch (NumberFormatException e) {
				System.out.println(message);
				continue;
			}
		}
		return x;
	}
}	
