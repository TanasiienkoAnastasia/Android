package Entities.File.Builder.Components;


import Entities.File.Builder.File.File;

public class TripComputer {
    private File file;

    public void setFile(File file) {
        this.file = file;
    }

    public void showDownloadingPercentage() {
        System.out.println("Downloading percentage: " + file.getPercentage());
    }

    public void showStatus() {
        if (this.file.getCreator().isStarted()) {
            System.out.println("Downloading is started");
        } else {
            System.out.println("Downloading isn't started");
        }
    }

}
