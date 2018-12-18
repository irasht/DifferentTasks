import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<ITools> tools = new ArrayList<>();
        System.out.println("---------------------------------");
        System.out.println("Hundred Years' War film");
        System.out.println("---------------------------------");
        System.out.println("Tools needed for historical film");
        System.out.println("---------------------------------");
        createListOfTools(tools);
        printSortedTools(findNeededTools(tools));
        System.out.println("--------------------");
        System.out.println("Sort by rent price");
        System.out.println("--------------------");
        printSortedTools(sortToolsByRentPrice(findNeededTools(tools)));
    }

    public static void createListOfTools(List<ITools> tools) {
        tools.add(new Camera(1223, ToolsType.ComedyMovie));
        tools.add(new Camera(666, ToolsType.HistoricalFilm));
        tools.add(new Decoration("grass", ToolsType.ComedyMovie));
        tools.add(new Decoration("forest", ToolsType.ComedyMovie));
        tools.add(new Decoration("battlefield", ToolsType.ComedyMovie));
        tools.add(new StageProperty("sword", ToolsType.HistoricalFilm));
        tools.add(new StageProperty("shield", ToolsType.HistoricalFilm));
        tools.add(new StageProperty("doll", ToolsType.ComedyMovie));
        tools.add(new StageProperty("light sword", ToolsType.ScienceFictionMovie));
        tools.add(new Costume("red rose soldiers", ToolsType.HistoricalFilm));
        tools.add(new Costume("white rose soldiers", ToolsType.HistoricalFilm));
        tools.add(new Soft("soft for camera", ToolsType.HistoricalFilm));
        tools.add(new Soft("soft for special effects", ToolsType.ScienceFictionMovie));
    }

    private static List<ITools> findNeededTools(List<ITools> list) {
        List<ITools> toolsForFilm = new ArrayList<>();
        for (ITools tool : list) {
            if (tool.getToolsType() == ToolsType.HistoricalFilm) {
                toolsForFilm.add(tool);
            }
        }
        return toolsForFilm;
    }

    static class PriceComparator implements Comparator<ITools> {
        @Override
        public int compare(ITools tool1, ITools tool2) {
            return tool1.getRentPrice() - tool2.getRentPrice();
        }
    }

    private static List<ITools> sortToolsByRentPrice(List<ITools> list) {
        list.sort(new PriceComparator());
        return list;
    }

    private static void printSortedTools(List<ITools> list) {
        for (ITools tool : list) {
            System.out.println(tool);
        }
    }
}