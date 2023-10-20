package Entities.File.Builder.Builders;

import Entities.File.Builder.Components.Creator;
import Entities.File.Builder.Components.FileNavigator;
import Entities.File.Builder.Components.Transmission;
import Entities.File.Builder.Components.TripComputer;
import Entities.File.Builder.File.FileCategory;
import Entities.File.Builder.File.FileMonthDate;
import Entities.File.Builder.File.Manual;

public class FileManualBuilder implements Builder {
    private FileCategory fileCategory;
    private FileMonthDate fileDate;
    private Creator creator;
    private Transmission transmission;
    private TripComputer tripComputer;
    private FileNavigator fileNavigator;

    @Override
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
    public void setFileNavigator(FileNavigator gpsNavigator) {
        this.fileNavigator = fileNavigator;
    }

    public Manual getResult() {
        return new Manual(fileCategory, creator, transmission, tripComputer, fileNavigator);
    }
}
