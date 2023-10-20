package Entities.File.Iterator.FileCollection;

import Entities.File.Iterator.File.File;
import Entities.File.Iterator.File.FileCategoryEnum;
import Entities.File.Iterator.File.FileMonthDateEnum;
import Entities.File.Iterator.FileIterator.FileIterator;

public interface FileCollection {
    public void addFile(File c);

    public void removeFile(File c);

    public FileIterator iterator(FileCategoryEnum category, FileMonthDateEnum date);

    public FileIterator iteratorCategory(FileCategoryEnum category);

    public FileIterator iteratorDate( FileMonthDateEnum date);

}
