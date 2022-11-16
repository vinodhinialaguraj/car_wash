
import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;

public class area {
	private static final String CSV_FILE_PATH
		= "output.txt";
        Stack<String[]> data = new Stack<String[]>();
	public void writing(String loc, String water, String base)
	{
		addDataToCSV(CSV_FILE_PATH,loc,water,base);
       
	}
   
	public void addDataToCSV(String output, String loc, String water, String base)
	{
		
		File file = new File(output);
		
        String fin = loc+" "+water+" "+base;
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter with ';' as separator
			CSVWriter writer = new CSVWriter(outputfile, ';',
											CSVWriter.NO_QUOTE_CHARACTER,
											CSVWriter.DEFAULT_ESCAPE_CHARACTER,
											CSVWriter.DEFAULT_LINE_END);

			// create a List which contains Data
			

			
			for (int i = 0; i < 1; i++) {
				String row = fin;
				String[] rowdata = row.split(" ");
				data.add(rowdata);
			}

			writer.writeAll(data);

			// closing writer connection
			writer.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
