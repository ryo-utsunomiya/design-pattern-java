package info.ryo511.designpattern.flyweight;

public class BigString {
    private final BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = BigCharFactory.INSTANCE.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (var bigChar : bigChars) {
            bigChar.print();
        }
    }
}
