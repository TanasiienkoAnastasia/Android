package Entities.File.Builder.Components;

public class FileNavigator {
    private String route;

    public FileNavigator() {
        this.route = "Link .... ";
    }

    public FileNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
