import java.util.Scanner;

class SmartGame{
	public static void main(String[] args){
		char[][] table = new char[5][5];
		table[0][0] = 'S';
		table[0][1] = 'M';
		table[0][2] = 'A';
		table[0][3] = 'R';
		table[0][4] = 'T';
		table[1][1] = 'T';
		table[1][2] = 'S';
		table[1][3] = 'M';
		table[2][2] = 'R';
		table[2][4] = 'S';
		table[3][1] = 'S';
		table[3][2] = 'M';
		table[4][2] = 'T';
		table[4][3] = 'S';

		//declaring the rows and columns to 5
		int rows = 5;
		int columns = 5;    

		for(int k = 0; k>=0; k++){

			//print statements for the table
			System.out.println("     1   2   3   4   5 ");
			System.out.println("   +---+---+---+---+---+");
			System.out.println(" 1 | "+table[0][0]+" | "+table[0][1]+" | "+table[0][2]+" | "+table[0][3]+" | "+table[0][4]+" |");
			System.out.println("   +---+---+---+---+---+");
			System.out.println(" 2 | "+table[1][0]+" | "+table[1][1]+" | "+table[1][2]+" | "+table[1][3]+" | "+table[1][4]+" |");
			System.out.println("   +---+---+---+---+---+");
			System.out.println(" 3 | "+table[2][0]+" | "+table[2][1]+" | "+table[2][2]+" | "+table[2][3]+" | "+table[2][4]+" |");
			System.out.println("   +---+---+---+---+---+");
			System.out.println(" 4 | "+table[3][0]+" | "+table[3][1]+" | "+table[3][2]+" | "+table[3][3]+" | "+table[3][4]+" |");
			System.out.println("   +---+---+---+---+---+");
			System.out.println(" 5 | "+table[4][0]+" | "+table[4][1]+" | "+table[4][2]+" | "+table[4][3]+" | "+table[4][4]+" |");
			System.out.println("   +---+---+---+---+---+");

			System.out.println("Enter a row (1-5): ");
			Scanner scRow = new Scanner(System.in);
			int rowNumber = scRow.nextInt();

			System.out.println("Enter a column (1-5): ");
			Scanner scCol = new Scanner(System.in);
			int colNumber = scCol.nextInt();

			System.out.println("Enter a letter (S, M, A, R or T): ");
			Scanner scChar = new Scanner(System.in);
			char c = scChar.next().charAt(0);

			if (rowNumber < 1 || rowNumber > 5){
				System.out.println("Invalid: Enter a valid row. ");
			}
			else if (colNumber < 1 || colNumber > 5){
				System.out.println("Invalid: Enter a valid column. ");
			}
			else if (c != 'S' && c != 'M' && c != 'A' && c != 'R' && c != 'T'){
				System.out.println("Invalid: Enter a valid character. ");
			}
			else{
				table[(rowNumber-1)][(colNumber-1)] = c;
			}
		}

		//To include all rows
		for (int row = 0; row < 5; row++)
		{
			int total = 0;  // reset the total on each row

			// total the cells on the current row
			for (int column = 0; column < 5; column++)
			{
				total += table[row][column];
			}

			if (total == 391)
			{
				System.out.println("you won!");
				break;  // no need to continue calculating the rest of the rows
			}
		}
		//To include all columns
		for (int column = 0; column < 5; column++)
		{
			int total = 0;  // reset the total on each row

			// total the cells on the current column
			for (int row = 0; row < 5; row++)
			{
				total += table[row][column];
			}

			if (total == 391)
			{
				System.out.println("you won!");
				break;  // no need to continue calculating the rest of the rows
			}
		} 
	}
}