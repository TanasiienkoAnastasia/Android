package Entities.File.Iterator.FileIterator;

import Entities.File.Iterator.File.File;

public interface FileIterator {
    public boolean hasNext();
    public File next();
}
