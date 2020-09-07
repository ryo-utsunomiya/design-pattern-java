package info.ryo511.designpattern.abstractfactory.listfactory;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.abstractfactory.factory.*;
import org.junit.jupiter.api.Test;

class ListFactoryTest {

  @Test
  void createPage() {
    Factory SUT = Factory
        .getFactory("info.ryo511.designpattern.abstractfactory.listfactory.ListFactory");
    assertNotNull(SUT);

    Tray search = SUT.createTray("search");
    search.add(SUT.createLink("Google", "https://www.google.com/"));

    Tray portal = SUT.createTray("portal");
    portal.add(SUT.createLink("Yahoo!Japan", "https://www.yahoo.co.jp/"));

    Page page = SUT.createPage("LinkPage", "結城 浩");
    page.add(search);
    page.add(portal);
    assertEquals(
        "<html><head><meta charset=\"utf-8\" /><title>LinkPage</title></head><body><h1>LinkPage</h1><ul><li>search<ul><li><a href=\"https://www.google.com/\">Google</a></li></ul></li><li>portal<ul><li><a href=\"https://www.yahoo.co.jp/\">Yahoo!Japan</a></li></ul></li></ul><hr><address>結城 浩</address></body></html>",
        page.makeHTML());
  }
}