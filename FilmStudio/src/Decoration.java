public class Decoration implements ITools {
    private String name;
    private ToolsType toolsType;

    public Decoration(String name, ToolsType toolsType) {
        this.name = name;
        this.toolsType = toolsType;
    }

    public ToolsType getToolsType() {
        return toolsType;
    }

    @Override
    public int getRentPrice() {
        return 200;
    }

    @Override
    public String toString() {
        return "Decoration: " + name + ",rent price=" + getRentPrice();
    }

}