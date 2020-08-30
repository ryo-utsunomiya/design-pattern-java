package info.ryo511.designpattern.TemplateMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringDisplayTest {

  @Test
  public void display() {
    var SUT = new StringDisplay("hello");
    var expected = "+-----+\n" +
        "|hello|\n" +
        "|hello|\n" +
        "|hello|\n" +
        "|hello|\n" +
        "|hello|\n" +
        "+-----+\n";
    assertEquals(expected, SUT.display());
  }
}