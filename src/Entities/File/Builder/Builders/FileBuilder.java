package Entities.File.Builder.Builders;

import Entities.File.Builder.Components.Creator;
import Entities.File.Builder.Components.FileNavigator;
import Entities.File.Builder.Components.Transmission;
import Entities.File.Builder.Components.TripComputer;
import Entities.File.Builder.File.File;
import Entities.File.Builder.File.FileCategory;
import Entities.File.Builder.File.FileMonthDate;

public class FileBuilder implements Builder{
    private FileCategory fileCategory;
    private FileMonthDate fileDate;
    private Creator creator;
    private Transmission transmission;
    private TripComputer tripComputer;
    private FileNavigator fileNavigator;

    public void setFileCategory(FileCategory fileCategory) {
        this.fileCategory = fileCategory;
    }
    public void setFileDate(FileMonthDate fileDate) {
        this.fileDate = fileDate;
    }

    @Override
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setFileNavigator(FileNavigator fileNavigator) {this.fileNavigator = fileNavigator;
    }

    public File getResult() {
        return new File(fileCategory, fileDate, creator, transmission, tripComputer, fileNavigator);
    }
}
