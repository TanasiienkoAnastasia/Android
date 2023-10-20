package Entities.File.Builder;

import Entities.File.Builder.Builders.FileBuilder;
import Entities.File.Builder.Builders.FileManualBuilder;
import Entities.File.Builder.Director.Director;
import Entities.File.Builder.File.File;
import Entities.File.Builder.File.Manual;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        FileBuilder builder = new FileBuilder();
        director.constructVideoFile(builder);

        File file = builder.getResult();
        System.out.println("File built:\n" + file.getFileCategory());

        FileManualBuilder manualBuilder = new FileManualBuilder();
        director.constructMovieFile(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nFile manual built:\n" + carManual.print());
    }

}
