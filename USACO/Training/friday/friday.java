package friday;

import java.io.*;

public class friday
{
	static int[] frequencies = new int[7];

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("friday.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		
		int numberYears=Integer.parseInt(br.readLine());
		
		int[][] regularYear = new int[12][31];
		int[][] leapYear = new int[12][31];

		int[] daysOfRegYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] daysOfLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int month = 0; month < 12; month++)
		{
			for (int day = 0; day < daysOfRegYear[month]; day++)
				regularYear[month][day] = day + 1;
		}
		
		for (int month = 0; month < 12; month++)
		{
			for (int day = 0; day < daysOfLeapYear[month]; day++)
				leapYear[month][day] = day + 1;
		}
		
		int dayOfWeekOfFirst=1;
		
		for(int year=0;year<numberYears;year++)
		{
			
		}
		
		
	}

//	private void increments(int year)
//	{
//		if(year%100!=0 && year%4==0)
//			
//	}
}
