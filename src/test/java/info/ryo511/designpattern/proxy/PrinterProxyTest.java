package info.ryo511.designpattern.proxy;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterProxyTest extends StandardIOTest {

    @Test
    void print() {
        var p = new PrinterProxy("Alice");
        assertEquals("Alice", p.getPrinterName());
        p.setPrinterName("Bob");
        assertEquals("Bob", p.getPrinterName());
        p.print("Hello, world.");
        assertEquals("Creating Printer instance(Bob).....Completed.", out.readLine());
        assertEquals("=== Bob ===", out.readLine());
        assertEquals("Hello, world.", out.readLine());
    }
}