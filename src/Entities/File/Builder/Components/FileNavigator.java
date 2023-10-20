package Entities.File.Builder.Components;

public class FileNavigator {
    private String filePath;

    public FileNavigator() {this.filePath = "Link .... "; }

    public FileNavigator(String manualRoute) {
        this.filePath = manualRoute;
    }

    public String getRoute() {
        return filePath;
    }
}
