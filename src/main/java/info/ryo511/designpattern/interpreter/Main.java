package info.ryo511.designpattern.interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var parentPath = System.getProperty("user.dir") + "/src/main/java/info/ryo511/designpattern/interpreter";
        try (var reader = new BufferedReader(new FileReader(parentPath + "/program.txt"))) {
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                var node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
