package info.ryo511.designpattern.command.drawer;

import info.ryo511.designpattern.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private final Color color = Color.RED;
    private final MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }

    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        var g = getGraphics();
        g.setColor(color);
        int radius = 6;
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
