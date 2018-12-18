public class Camera implements ITools {
    private int id;
    private ToolsType toolsType;

    public Camera(int id, ToolsType toolsType) {
        this.id = id;
        this.toolsType = toolsType;
    }

    public ToolsType getToolsType() {
        return toolsType;
    }

    @Override
    public int getRentPrice() {
        return 500;
    }

    @Override
    public String toString() {
        return "Camera id:" + id + ",rent price=" + getRentPrice();
    }
}