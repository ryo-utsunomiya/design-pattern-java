package info.ryo511.designpattern.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextBuilderTest {

  @Test
  void getResult() {
    var builder = new TextBuilder();
    new Director(builder).construct();
    String expected = "====================\n"
        + "『Greeting』\n"
        + "\n"
        + "■朝から昼にかけて\n"
        + "\n"
        + "- おはようございます\n"
        + "- こんにちは\n"
        + "\n";
    assertEquals(expected, builder.getResult());
  }
}