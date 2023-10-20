package Entities.File.Builder.Director;

import Entities.File.Builder.Builders.Builder;
import Entities.File.Builder.Components.Creator;
import Entities.File.Builder.Components.FileNavigator;
import Entities.File.Builder.Components.Transmission;
import Entities.File.Builder.Components.TripComputer;
import Entities.File.Builder.File.FileCategory;
import Entities.File.Builder.File.FileMonthDate;

public class Director {
    public void constructAudioFile(Builder builder) {
        builder.setFileCategory(FileCategory.AUDIO);
        builder.setFileDate(FileMonthDate.APRIL);
        builder.setCreator(new Creator(3.0, 0));
        builder.setTransmission(Transmission.SLOW_SPEED);
        builder.setTripComputer(new TripComputer());
        builder.setFileNavigator(new FileNavigator());
    }

    public void constructMovieFile(Builder builder) {
        builder.setFileCategory(FileCategory.MOVIE);
        builder.setFileDate(FileMonthDate.JANUARY);
        builder.setCreator(new Creator(1.2, 0));
        builder.setTransmission(Transmission.MEDIUM_SPEED);
        builder.setTripComputer(new TripComputer());
        builder.setFileNavigator(new FileNavigator());
    }

    public void constructVideoFile(Builder builder) {
        builder.setFileCategory(FileCategory.VIDEO);
        builder.setFileDate(FileMonthDate.FEBRUARY);
        builder.setCreator(new Creator(2.5, 0));
        builder.setTransmission(Transmission.FAST_SPEED);
        builder.setFileNavigator(new FileNavigator());
    }
}
