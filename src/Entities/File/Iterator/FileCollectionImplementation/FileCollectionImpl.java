package Entities.File.Iterator.FileCollectionImplementation;
import Entities.File.Iterator.File.File;
import Entities.File.Iterator.File.FileCategoryEnum;
import Entities.File.Iterator.File.FileMonthDateEnum;
import Entities.File.Iterator.FileCollection.FileCollection;
import Entities.File.Iterator.FileIterator.FileIterator;

import java.util.ArrayList;
import java.util.List;

public class FileCollectionImpl implements FileCollection {
    private List<File> channelsList;

    public FileCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addFile(File c) {
        this.channelsList.add(c);
    }

    public void removeFile(File c) {
        this.channelsList.remove(c);
    }


    @Override
    public FileIterator iterator(FileCategoryEnum category, FileMonthDateEnum date) {
        return new FileIteratorImpl(category, date, this.channelsList);
    }

    public FileIterator iteratorCategory(FileCategoryEnum category) {
        return new FileCategoryIteratorImpl(category, this.channelsList);
    }

    public FileIterator iteratorDate(FileMonthDateEnum date) {
        return new FileDateIteratorImpl(date, this.channelsList);
    }



    private class FileIteratorImpl implements FileIterator {

        private FileCategoryEnum category;
        private FileMonthDateEnum date;
        private List<File> channels;
        private int position;

        public FileIteratorImpl(FileCategoryEnum category,
                                   FileMonthDateEnum date,
                                   List<File> channelsList) {
            this.category = category;
            this.date = date;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                File c = channels.get(position);
                if ((c.getCategory().equals(category) || category.equals(FileCategoryEnum.ALL))
                && (c.getDate().equals(date) || date.equals(FileMonthDateEnum.ALL))) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public File next() {
            File c = channels.get(position);
            position++;
            return c;
        }

    }



    private class FileCategoryIteratorImpl implements FileIterator {

        private FileCategoryEnum category;
        private List<File> channels;
        private int position;

        public FileCategoryIteratorImpl(FileCategoryEnum category,
                                         List<File> channelsList) {
            this.category = category;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                File c = channels.get(position);
                if ((c.getCategory().equals(category) || category.equals(FileCategoryEnum.ALL))) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public File next() {
            File c = channels.get(position);
            position++;
            return c;
        }
    }

    private class FileDateIteratorImpl implements FileIterator {
        private FileMonthDateEnum date;
        private List<File> channels;
        private int position;

        public FileDateIteratorImpl(FileMonthDateEnum date,
                                List<File> channelsList) {
            this.date = date;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                File c = channels.get(position);
                if (c.getDate().equals(date) || date.equals(FileMonthDateEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public File next() {
            File c = channels.get(position);
            position++;
            return c;
        }

    }
}
