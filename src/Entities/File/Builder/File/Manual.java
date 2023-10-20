package Entities.File.Builder.File;

import Entities.File.Builder.Components.Creator;
import Entities.File.Builder.Components.FileNavigator;
import Entities.File.Builder.Components.Transmission;
import Entities.File.Builder.Components.TripComputer;

public class Manual {
    private final FileCategory fileCategory;
    private final Creator creator;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final FileNavigator fileNavigator;

    public Manual(FileCategory fileCategory, Creator creator, Transmission transmission,
                  TripComputer tripComputer, FileNavigator fileNavigator) {
        this.fileCategory = fileCategory;
        this.creator = creator;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.fileNavigator = fileNavigator;
    }

    public String print() {
        String info = "";
        info += "Category of file: " + fileCategory + "\n";
        info += "Creator: file size - " + creator.getSize() + "; file bytes - " + creator.getBytes() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Percentage: Functional" + "\n";
        } else {
            info += "Downloading is not started" + "\n";
        }
        if (this.fileNavigator != null) {
            info += "File Navigator: Functional" + "\n";
        } else {
            info += "The file does not exist" + "\n";
        }
        return info;
    }
}
