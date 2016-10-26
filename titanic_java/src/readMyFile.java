import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

/**
 * Created by matthewtduffin on 30/06/2016.
 */
public class readMyFile {
  public static void main(String[] args) throws FileNotFoundException {

    Object[] linesOfFile=getArrayLineForm("titanic.csv");
    System.out.println(linesOfFile[1]);
    String line1=(String)linesOfFile[1];
    System.out.println(line1);

/*print all lines
    for (int i=0;i<linesOfFile.length;i++) {
      String[] currentLine = (String[]) linesOfFile[i].toString().split(",");
      for (int j=0; j<currentLine.length;j++) {
        System.out.print(currentLine[j]+ " ");
      }
      System.out.println();
    }
*/

//print how many total passengers
    //System.out.println("\nHow many people are listed? " + (linesOfFile.length - 1) + "\n");

//create a HashMap that maps the titles to their index

    String[] firstLine = (String[]) linesOfFile[0].toString().split(",");
    HashMap<String, Integer> titlesToInt = new HashMap<>();
    for (int i = 1; i < 11; i++) {
      titlesToInt.put(firstLine[i-1], i);
    }
//set an integer for which column is titled "Sex"
    int indexOfSex=titlesToInt.get("Sex");

    int numOfMen=0;
    int numOfWomen=0;

    for (int i=1;i<linesOfFile.length;i++) {
      String[] line=(String[]) linesOfFile[i].toString().split(",");
      if (line[indexOfSex].equalsIgnoreCase("male")) {
        numOfMen+=1;
      } else {
        numOfWomen+=1;
      }
    }
    //System.out.println("Total number of men: "+numOfMen+"\nTotal number of women: "+numOfWomen+"\n");

    int indexOfAge=titlesToInt.get("Age");

    int totalChildren=0;
    //int deadChildren=0;

    for (int i=1;i<linesOfFile.length;i++) {
      String[] line=(String[]) linesOfFile[i].toString().split(",");
      if (Integer.parseInt(line[indexOfAge])<16) {
        totalChildren+=1;
        if (line[2].equalsIgnoreCase("1")) {
          //deadChildren+=1;
        }
      }
    }

    System.out.println(totalChildren);
    //System.out.println(deadChildren);


  }

  public static Object[] getArrayLineForm(String filename) throws FileNotFoundException{
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    System.out.println("*****We have made a file reader!*****\n");

    Object[] linesOfFile = reader.lines().toArray();
    return linesOfFile;
  }

  public static String[] elementOfLine(int i,Object[] fileAsLines) {
    Str
    return parts;
  }



}
