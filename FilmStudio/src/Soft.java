public class Soft implements ITools {
    private String usage;
    private ToolsType toolsType;

    public Soft(String usage, ToolsType toolsType) {
        this.usage = usage;
        this.toolsType = toolsType;
    }

    public ToolsType getToolsType() {
        return toolsType;
    }

    @Override
    public int getRentPrice() {
        return 400;
    }

    @Override
    public String toString() {
        return "This " + usage + ",rent price=" + getRentPrice();
    }
}