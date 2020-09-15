package info.ryo511.designpattern.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

  private Database() {
  }

  public static Properties getProperties(String dbname) {
    var fileName = dbname + ".txt";
    var prop = new Properties();

    try {
      prop.load(new FileInputStream(fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }

    return prop;
  }
}
