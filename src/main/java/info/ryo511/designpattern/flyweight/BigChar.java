package info.ryo511.designpattern.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class BigChar {
    private final String fontData;

    public BigChar(char charName) {
        var fontData = "";
        var parentPath = System.getProperty("user.dir") + "/src/main/java/info/ryo511/designpattern/flyweight";
        try (var br = new BufferedReader(new FileReader(parentPath + "/big" + charName + ".txt"))) {
            var sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            fontData = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            fontData = charName + "?";
        }
        this.fontData = fontData;
    }

    public void print() {
        System.out.print(fontData);
    }
}
