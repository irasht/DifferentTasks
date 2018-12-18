public class StageProperty implements ITools {
    private String name;
    private ToolsType toolsType;

    public StageProperty(String name, ToolsType toolsType) {
        this.name = name;
        this.toolsType = toolsType;
    }

    @Override
    public ToolsType getToolsType() {
        return toolsType;
    }

    @Override
    public int getRentPrice() {
        return 250;
    }

    @Override
    public String toString() {
        return "Stage property: " + name + ",rent price=" + getRentPrice();
    }
}
