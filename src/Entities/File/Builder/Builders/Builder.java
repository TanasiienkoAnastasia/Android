package Entities.File.Builder.Builders;

import Entities.File.Builder.Components.Creator;
import Entities.File.Builder.Components.FileNavigator;
import Entities.File.Builder.Components.Transmission;
import Entities.File.Builder.Components.TripComputer;
import Entities.File.Builder.File.FileCategory;
import Entities.File.Builder.File.FileMonthDate;

public interface Builder {
    void setFileCategory(FileCategory fileCategory);
    void setFileDate(FileMonthDate fileDate);
    void setCreator(Creator creator);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setFileNavigator(FileNavigator fileNavigator);
}
