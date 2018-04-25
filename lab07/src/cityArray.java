import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class cityArray{

  public String[] toArray() throws IOException{
    String city = "";
    Scanner FILE = new Scanner(new File("airlineRouteData"));

    List<String> cityList = new ArrayList<String>();

    while (FILE.hasNext()) {
      city = FILE.nextLine();
      cityList.add(city);
    }
    FILE.close();
    String[] tempsArray = cityList.toArray(new String[0]);

    return tempsArray;
  }
}
