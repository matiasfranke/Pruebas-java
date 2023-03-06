package OOP.ubicaciones;

import java.util.Map;

public class Ubicacion {
    private Level level;
    private String name;
    private String from;
    private String to;
    private Map<String,Ubicacion> children;

    public Ubicacion(Level level, String name, String from, String to, Map<String,Ubicacion> children) {
        this.level = level;
        this.name = name;
        this.from = from;
        this.to = to;
        this.children = children;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Map<String,Ubicacion> getChildren() {
        return children;
    }

    public void setChildren(Map<String,Ubicacion> children) {
        this.children = children;
    }

}
