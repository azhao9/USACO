package beads;

/*
 ID: aleck.z1
 LANG: JAVA
 TASK: beads
 */

import java.io.*;

public class beads
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

		int numBeads = Integer.parseInt(br.readLine());
		String beads = br.readLine();

		int max = countTotal(beads);

		for (int i = 0; i < numBeads; i++)
			if (countTotal(beads.substring(i) + beads.substring(0, i)) > max)
				max = countTotal(beads.substring(i) + beads.substring(0, i));

		out.println(max);
		out.close();
		System.exit(0);

	}

	private static int countTotal(String str)
	{
		int count = 0;
		int indexStart = 0;
		int indexEnd = str.length() - 1;

		while (str.charAt(indexStart) == 'w' && indexStart < str.length())
		{
			count++;
			indexStart++;
		}

		if(indexStart!=str.length())
		{
			while (str.charAt(indexEnd) == 'w' && indexEnd >= 0)
			{
				count++;
				indexEnd--;
			}
		}
		
		return count + countFront(str.substring(indexStart)) + countEnd(str.substring(0, indexEnd + 1));

	}

	private static int countFront(String str)
	{
		char front = str.charAt(0);
		int index = 0;
		int count = 0;

		while (index < str.length() && (str.charAt(index) == front || str.charAt(index) == 'w'))
		{
			count++;
			index++;
		}

		return count;
	}

	private static int countEnd(String str)
	{
		char end = str.charAt(str.length() - 1);
		int index = str.length() - 1;
		int count = 0;

		while (index > 0 && (str.charAt(index) == end || str.charAt(index) == 'w'))
		{
			count++;
			index--;
		}
		
		if(index==0)
			return 0;
		else
			return count;
	}
}
