package foo.fileHandling;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	private Formatter output;
	
	public void openFile(){
		try{
			output=new Formatter("clients.txt");//open the file
		}
		catch (SecurityException securityException){
			System.err.println("You don't have write access to this file");
			System.exit(1);
		}//end catch
		
		catch ( FileNotFoundException fileNotFoundException ){
			System.err.println( "Error opening or creating file." );
			System.exit( 1 ); // terminate the program
		}//end catch
	}//end openFile
	
	public void addRecord(){
		AccountRecord record=new AccountRecord();
		Scanner input=new Scanner(System.in);
		
		System.out.printf("%s\n%s\n%s\n%s\n\n","To terminate input,type the end-of-file indicator",
				"When you are promoted to enter input.",
				"On unix/ linux /macOS x type <ctrl> d then press enter",
				"On windows type <ctrl> z then press enter");
		
		System.out.printf("%s\n%s","Enter account number(>0),first name, last name and balance.","?");
		
		while(input.hasNext())//loop until end of file indicator
			{
			try{
				record.setAccount(input.nextInt());
				record.setFirstName(input.next());
				record.setLastName(input.next());
				record.setBalance(input.nextDouble());
				
				if(record.getAccount()>0){
					output.format("%d %s %s %.2f\n\n",record.getAccount(),
							record.getFirstName(),record.getLastName(),record.getBalance());
				}//end if
				else
				{
					System.out.println("Account number must be greater than 0");
				}//end else
			}//end try
			catch(FormatterClosedException formatterClosedException){
				System.err.println("Error writing to file. ");
				return;
			}//end catch
			
			catch (NoSuchElementException elementException){
				System.err.println("Invalid input. Please try again.");
				input.nextLine();
			}//end catch
			
			System.out.printf("%s %s\n %s","Enter account number (>0),","first name, last name and balance.","? ");
		}//end while		
		
	}//end addRecord
	
	public void closeFile(){
		if(output!=null)
			output.close();
	}//end closeFile
}//end CreateTextFile
