/*
 * Author - Debag101
 * Desc - SuperB programs
 *Date - 15 5 2023
*/

//Importing necessary packages and their classes
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

//Creating class
public class AhavingStr
{
	//Main method starts
	public static void main(String[] args)throws IOException {
		
		//Defining bufferedReader to read data of all sorts
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		//Integer var to store number of datas
		int totalStrings;
		//Creating list that will store the 'a' containing strings
		ArrayList<String> Acontainer = new ArrayList<>();
		//Asking for number of datas
		System.out.println(">> How many datas do you want in your code ? : ");
		try{
			//Try catch to avoid NumberFormatException
			totalStrings = Integer.parseInt(rd.readLine());//getting the total datas required

			for(int i=0; i < totalStrings; i++)
			{
			//Looping to get the datas one by one
				System.out.println(">> Enter the string at index " + i);
				//Asking for string input
				String str = rd.readLine();
				//Checking if string contains 'a'
				if(str.contains("a"))
					//if str contains a we add it to the array list
					Acontainer.add(str);
			}
	
	//Code ends
			System.out.println(">> A containing strings are : " + Acontainer);
		}catch(Exception NumberFormatException)//Catching some exception
		{
			System.out.println(">> Please enter an integer !");
		}
	}
}