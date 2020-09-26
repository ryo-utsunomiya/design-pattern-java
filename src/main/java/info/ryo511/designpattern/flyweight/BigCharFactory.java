package info.ryo511.designpattern.flyweight;

import java.util.HashMap;

public enum BigCharFactory {
    INSTANCE;

    private final HashMap<Character, BigChar> pool = new HashMap<>();

    public synchronized BigChar getBigChar(char charName) {
        var bc = pool.get(charName);
        if (bc == null) {
            bc = new BigChar(charName);
            pool.put(charName, bc);
        }
        return bc;
    }
}
