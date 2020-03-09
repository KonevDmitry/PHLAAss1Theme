package colors.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Theme {

    private static final AtomicInteger count = new AtomicInteger(0);

    private final long id;

    public long getId() {
        return this.id;
    }

    private final String fontColor;

    public String getFontColor() {
        return this.fontColor;
    }

    private final String backgroundColor;

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public Theme(String fontColor, String backgroundColor) {
        this.id = count.incrementAndGet();
        this.fontColor = fontColor;
        this.backgroundColor = backgroundColor;
    }
}