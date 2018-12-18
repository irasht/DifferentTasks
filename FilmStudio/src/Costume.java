public class Costume implements ITools {
    private String costumeType;
    private ToolsType toolsType;

    public Costume(String costumeType, ToolsType toolsType) {
        this.costumeType = costumeType;
        this.toolsType = toolsType;
    }

    public ToolsType getToolsType() {
        return toolsType;
    }

    @Override
    public int getRentPrice() {
        return 300;
    }

    @Override
    public String toString() {
        return "Costume for" + costumeType + ",rent price=" + getRentPrice();
    }
}