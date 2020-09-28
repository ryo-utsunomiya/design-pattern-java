package info.ryo511.designpattern.proxy;

public interface Printable {
    void setPrinterName(String name);

    String getPrinterName();

    void print(String string);
}
