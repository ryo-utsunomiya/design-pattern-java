package info.ryo511.designpattern.command.drawer;

import java.awt.Point;

import info.ryo511.designpattern.command.Command;

public class DrawCommand implements Command {
    protected Drawable drawable;
    private final Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
