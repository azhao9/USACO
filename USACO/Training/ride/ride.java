package ride;

/*
 ID: aleck.z1
 LANG: JAVA
 TASK: ride
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ride
{
	static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"ride.out")));

		String comet = br.readLine();
		String group = br.readLine();
		
		if (isRide(comet, group))
			out.println("GO");
		else
			out.println("STAY");

		out.close();
		System.exit(0);
	}

	private static int convert(String str)
	{
		int product = 1;

		for (int i = 0; i < str.length(); i++)
		{
			int factor = letters.indexOf(str.charAt(i)) + 1;
			product *= factor;
		}

		return product;
	}

	private static boolean isRide(String comet, String group)
	{
		return convert(comet) % 47 == convert(group) % 47;
	}
}
