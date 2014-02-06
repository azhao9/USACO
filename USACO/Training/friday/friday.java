package friday;

/*
 ID: aleck.z1
 LANG: JAVA
 TASK: friday
 */

import java.io.*;

public class friday
{
	static int[] frequencies = new int[7];

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"friday.out")));

		int numberYears = Integer.parseInt(br.readLine());

		int[] daysOfRegYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] daysOfLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int dayOfWeek1 = 2;

		for (int year = 1900; year < 1900 + numberYears; year++)
		{
			if (year % 4 != 0)
			{
				for (int i = 0; i < daysOfRegYear.length; i++)
				{
					int dayOfWeek13 = (dayOfWeek1 + 12) % 7;
					frequencies[dayOfWeek13]++;
					dayOfWeek1 = (dayOfWeek1 + daysOfRegYear[i]) % 7;
				}
			}
			else
			{
				if (year % 400 == 0)
				{
					for (int i = 0; i < daysOfLeapYear.length; i++)
					{
						int dayOfWeek13 = (dayOfWeek1 + 12) % 7;
						frequencies[dayOfWeek13]++;
						dayOfWeek1 = (dayOfWeek1 + daysOfLeapYear[i]) % 7;
					}
				}
				else
				{
					for (int i = 0; i < daysOfRegYear.length; i++)
					{
						int dayOfWeek13 = (dayOfWeek1 + 12) % 7;
						frequencies[dayOfWeek13]++;
						dayOfWeek1 = (dayOfWeek1 + daysOfRegYear[i]) % 7;
					}
				}
			}
		}

		for (int i = 0; i < frequencies.length; i++)
			System.out.println(frequencies[i]);

		for (int i = 0; i < frequencies.length - 1; i++)
			out.print(frequencies[i] + " ");
		out.print(frequencies[6]+"\n");

		out.close();
		System.exit(0);
	}
}
