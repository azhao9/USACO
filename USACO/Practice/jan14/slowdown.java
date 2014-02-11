package jan14;

import java.io.*;

public class slowdown
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("slowdown.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("slowdown.out")));

		int numEvents = Integer.parseInt(br.readLine());
		double slowCount = 1;
		int speed = 1;
		int time = 0;
		int distance = 0;

		for (int i = 0; i < numEvents; i++)
		{
			String[] event = br.readLine().split(" ");
			if (event[0].equals("T"))
			{
				time += Integer.parseInt(event[1]);
				distance += Integer.parseInt(event[1]) * speed;
			}
			else if (event[0].equals("D"))
			{
				time += Integer.parseInt(event[1]) / speed;
				distance += Integer.parseInt(event[1]);
			}

			slowCount++;
			speed /= slowCount;
		}
		
		double distRemaining=1000-distance;
		time+=distRemaining/speed;
		
		
	}
}
