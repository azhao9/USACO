package feb14;

import java.io.*;

public class mirror
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("mirror.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mirror.out")));

		String[] dimensions = br.readLine().split(" ");
		int n = Integer.parseInt(dimensions[0]);
		int m = Integer.parseInt(dimensions[1]);

		char[][] field = new char[n][m];

		for (int row = 0; row < n; row++)
		{
			String r = br.readLine();
			for (int col = 0; col < m; col++)
			{
				field[row][col] = r.charAt(col);
			}
		}

	}

	private int countBounce(int direction, int row, int col, char[][] field)
	{
		int count = 0;
		int rPos = row;
		int cPos = col;
		int dir = direction;
		int height = field[0].length;
		int width = field.length;

		while (rPos >= 0 && rPos < height && cPos >= 0 && cPos < width)
		{
			if(field[row][col]=='/')
			{
				dir=(dir-90)%360;
				
			}
		}
		
		return -1;
	}
}
