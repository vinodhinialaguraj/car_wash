import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;

public class data_of_admin {
   private static final String CSV_FILE_PATH
		= "admin_data.txt";
        Stack<String[]> data = new Stack<String[]>();
	public void writing(String name, String location, String service_1, String service_2)
	{
        
		addDataToCSV(CSV_FILE_PATH, name, location, service_1, service_2);
       
	}
    
	public void addDataToCSV(String output, String name,String location, String service_1, String service_2)
	{
		
		File file = new File(output);
		
       String fin = name+" "+location+" "+service_1+" "+service_2;
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
