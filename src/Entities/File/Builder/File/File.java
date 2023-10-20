package Entities.File.Builder.File;

import Entities.File.Builder.Components.Creator;
import Entities.File.Builder.Components.FileNavigator;
import Entities.File.Builder.Components.Transmission;
import Entities.File.Builder.Components.TripComputer;

public class File {
    private final FileCategory fileCategory;
    private final FileMonthDate fileDate;
    private final Creator creator;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final FileNavigator fileNavigator;

    private double percentage = 0;

    public File(FileCategory fileCategory, FileMonthDate fileDate, Creator creator, Transmission transmission,
                TripComputer tripComputer, FileNavigator fileNavigator) {
        this.fileCategory = fileCategory;
        this.fileDate = fileDate;
        this.creator = creator;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setFile(this);
        }
        this.fileNavigator = fileNavigator;
    }

    public FileCategory getFileCategory() {
        return fileCategory;
    }
    public FileMonthDate getFileDate() {
        return fileDate;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double fuel) {
        this.percentage = percentage;
    }



    public Creator getCreator() {
        return creator;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public FileNavigator getFileNavigator() { return fileNavigator; }
}
