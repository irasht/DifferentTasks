public class CarType {
    private String type;

    public CarType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toLowerCase();
    }
}
