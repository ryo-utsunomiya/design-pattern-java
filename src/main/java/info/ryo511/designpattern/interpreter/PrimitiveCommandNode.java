package info.ryo511.designpattern.interpreter;

import java.util.Arrays;

public class PrimitiveCommandNode extends Node {
    private String name;

    private static final String[] names = {"go", "right", "left"};

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (Arrays.stream(names).noneMatch(c -> c.equals(name))) {
            throw new ParseException("name " + name + " is undefined");
        }
    }

    public String toString() {
        return name;
    }
}
