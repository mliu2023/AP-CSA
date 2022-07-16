import java.util.Scanner;
import java.io.*;

public class Enigma
{
  /**
	 * Read a text file and convert the text to a list of ASCII codes
	 * @param filename The name of the file to be read
	 * @param list The resulting list containing the read text in ASCII code
   */
	public static void readFile(String filename, ArrayList<Integer> list)
	{
		list.clear();
		File file = new File(filename);
		Scanner input = null;
		try
		{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(" Cannot open " + filename );
			System.exit(1);
		}
		while(input.hasNextLine())
		{
			String s = input.nextLine();
			for(int i = 0; i < s.length(); i++)
				list.add((int)s.charAt(i));
		}
	}

	/**
	 * Writes an Array List of Integer as a text file
	 * @param filename The name of the file to be written out
	 * @param list The list to be written into the file
	 */
	public static void writeFile(String filename, ArrayList<Integer> list)
	{
		Writer writer = null;
		try
		{
			writer = new FileWriter(filename, false);
		}
		catch (IOException ex)
		{
			System.out.println(" Cannot create/open " + filename );
			System.exit(1);
		}
		PrintWriter output = new PrintWriter(writer);
		for(int i = 0; i < list.size(); i++)
			output.print((char)list.get(i).intValue());
		output.close();
	}
}
