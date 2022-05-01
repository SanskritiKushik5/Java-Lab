import java.util.Scanner; import java.io.*;

public class JavaProgram
{
public static void main(String[] input)
{
String fname;
Scanner scan = new Scanner(System.in);

/* enter filename with extension to open and read its content */

System.out.print("Enter File Name to Open (with extension like file.txt) : "); fname = scan.nextLine();
/* this will reference only one line at a time */ String line = null;
try
{




/* FileReader reads text files in the default encoding */ FileReader fileReader = new FileReader(fname);

/* always wrap the FileReader in BufferedReader */ BufferedReader bufferedReader = new BufferedReader(fileReader);

while((line = bufferedReader.readLine()) != null)
{
System.out.println(line);
}

/* always close the file after use */ bufferedReader.close();
}
catch(IOException ex)
{
System.out.println("Error reading file named '" + fname + "'");
}
}
}