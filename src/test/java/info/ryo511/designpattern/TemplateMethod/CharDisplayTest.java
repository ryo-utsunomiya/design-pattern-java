package info.ryo511.designpattern.TemplateMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharDisplayTest {
  @Test
  public void display() {
    var SUT = new CharDisplay('H');
    assertEquals("<<HHHHH>>", SUT.display());
  }
}