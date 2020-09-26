package info.ryo511.designpattern.flyweight;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigStringTest extends StandardIOTest {

    @Test
    void print() {
        var expected = "" +
                "  #  |\n" +
                "  #  |\n" +
                "  #  |\n" +
                "  #  |\n" +
                "  #  |\n" +
                "  ## |\n" +
                " #  #|\n" +
                "   # |\n" +
                "  #  |\n" +
                " ####|\n" +
                " ### |\n" +
                "    #|\n" +
                " ### |\n" +
                "    #|\n" +
                " ### |\n" +
                "  #  |\n" +
                "  #  |\n" +
                "  #  |\n" +
                "  #  |\n" +
                "  #  |\n" +
                "  ## |\n" +
                " #  #|\n" +
                "   # |\n" +
                "  #  |\n" +
                " ####|\n" +
                " ### |\n" +
                "    #|\n" +
                " ### |\n" +
                "    #|\n" +
                " ### |\n";
        new BigString("123123").print();
        assertEquals(expected, out.readAll());
    }
}