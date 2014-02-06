/*
 ID: aleck.z1
 LANG: JAVA
 TASK: gift1
 */

package gift1;

import java.io.*;
import java.util.*;

public class gift1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"gift1.out")));

		int numberOfPeople = Integer.parseInt(br.readLine());
		ArrayList<String> people = new ArrayList<String>();
		int[] balances = new int[numberOfPeople];

		for (int i = 0; i < numberOfPeople; i++)
			people.add(br.readLine());

		int counter = 0;

		while (counter < numberOfPeople)
		{
			String giver = br.readLine();
			String amounts = br.readLine();

			int totalGive = Integer.parseInt(amounts.split(" ")[0]);
			int numPeople = Integer.parseInt(amounts.split(" ")[1]);

			int amountGiven;

			if (numPeople != 0)
				amountGiven = totalGive / numPeople;
			else
				amountGiven = 0;

			for (int i = 0; i < numPeople; i++)
			{
				balances[people.indexOf(br.readLine())] += amountGiven;
				balances[people.indexOf(giver)] -= amountGiven;
			}

			counter++;
		}

		for (int i = 0; i < numberOfPeople; i++)
		{
			out.println(people.get(i) + " " + balances[i]);
		}

		out.close();
		System.exit(0);
	}
}
