package info.ryo511.designpattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;

public class PageMaker {

  private PageMaker() {
  }

  public static void makeWelcomePage(String mailAddress, String fileName) {
    try {
      var mailProp = Database.getProperties("maildata");
      var userName = mailProp.getProperty(mailAddress);
      var writer = new HtmlWriter(new FileWriter(fileName));
      writer.title(String.format("Welcome to %s's page!", userName));
      writer.paragraph("I'm waiting your mail.");
      writer.mailto(mailAddress, userName);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
