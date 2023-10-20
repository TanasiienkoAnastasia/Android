package Entities.File.Iterator;

import Entities.File.Builder.File.FileMonthDate;
import Entities.File.Iterator.File.File;
import Entities.File.Iterator.File.FileCategoryEnum;
import Entities.File.Iterator.File.FileMonthDateEnum;
import Entities.File.Iterator.FileCollection.FileCollection;
import Entities.File.Iterator.FileCollectionImplementation.FileCollectionImpl;
import Entities.File.Iterator.FileIterator.FileIterator;

public class IteratorPatternForFileCollectionTest {
    public static void main(String[] args) {
        FileCollection files = populateChannels();
        FileIterator baseIterator = files.iterator(FileCategoryEnum.ALL, FileMonthDateEnum.ALL);
        while (baseIterator.hasNext()) {
            File c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // File Category and type Iterator
        FileIterator videoAprilIterator = files.iterator(FileCategoryEnum.VIDEO, FileMonthDateEnum.APRIL);
        while (videoAprilIterator.hasNext()) {
            File c = videoAprilIterator.next();
            System.out.println(c.toString());
        }



        System.out.println("Statistics presentation category:");
        // File Category

        FileIterator videoIterator = files.iteratorCategory(FileCategoryEnum.VIDEO);
        while (videoIterator.hasNext()) {
            File c = videoIterator.next();
            System.out.println(c.toString());
        }

        FileIterator movieIterator = files.iteratorCategory(FileCategoryEnum.MOVIE);
        while (movieIterator.hasNext()) {
            File c = movieIterator.next();
            System.out.println(c.toString());
        }

        FileIterator cartoonIterator = files.iteratorCategory(FileCategoryEnum.CARTOON);
        while (cartoonIterator.hasNext()) {
            File c = cartoonIterator.next();
            System.out.println(c.toString());
        }

        FileIterator programIterator = files.iteratorCategory(FileCategoryEnum.PROGRAMS);
        while (programIterator.hasNext()) {
            File c = programIterator.next();
            System.out.println(c.toString());
        }

        FileIterator archivesIterator = files.iteratorCategory(FileCategoryEnum.ARCHIVES);
        while (archivesIterator.hasNext()) {
            File c = archivesIterator.next();
            System.out.println(c.toString());
        }



        System.out.println("Statistics presentation month date:");
        FileIterator januaryIterator = files.iteratorDate(FileMonthDateEnum.JANUARY);
        while (januaryIterator.hasNext()) {
            File c = januaryIterator.next();
            System.out.println(c.toString());
        }

        FileIterator februaryIterator = files.iteratorDate(FileMonthDateEnum.FEBRUARY);
        while (februaryIterator.hasNext()) {
            File c = februaryIterator.next();
            System.out.println(c.toString());
        }

        FileIterator marchIterator = files.iteratorDate(FileMonthDateEnum.MARCH);
        while (marchIterator.hasNext()) {
            File c = marchIterator.next();
            System.out.println(c.toString());
        }

        FileIterator aprilIterator = files.iteratorDate(FileMonthDateEnum.APRIL);
        while (aprilIterator.hasNext()) {
            File c = aprilIterator.next();
            System.out.println(c.toString());
        }

        FileIterator mayIterator = files.iteratorDate(FileMonthDateEnum.MAY);
        while (mayIterator.hasNext()) {
            File c = mayIterator.next();
            System.out.println(c.toString());
        }

        FileIterator juneIterator = files.iteratorDate(FileMonthDateEnum.JUNE);
        while (juneIterator.hasNext()) {
            File c = juneIterator.next();
            System.out.println(c.toString());
        }

        FileIterator julyIterator = files.iteratorDate(FileMonthDateEnum.JULY);
        while (julyIterator.hasNext()) {
            File c = julyIterator.next();
            System.out.println(c.toString());
        }

        FileIterator augustIterator = files.iteratorDate(FileMonthDateEnum.AUGUST);
        while (augustIterator.hasNext()) {
            File c = augustIterator.next();
            System.out.println(c.toString());
        }

        FileIterator septemberIterator = files.iteratorDate(FileMonthDateEnum.SEPTEMBER);
        while (septemberIterator.hasNext()) {
            File c = septemberIterator.next();
            System.out.println(c.toString());
        }

        FileIterator octoberIterator = files.iteratorDate(FileMonthDateEnum.OCTOBER);
        while (octoberIterator.hasNext()) {
            File c = octoberIterator.next();
            System.out.println(c.toString());
        }

        FileIterator novemberIterator = files.iteratorDate(FileMonthDateEnum.NOVEMBER);
        while (novemberIterator.hasNext()) {
            File c = novemberIterator.next();
            System.out.println(c.toString());
        }

        FileIterator decemberIterator = files.iteratorDate(FileMonthDateEnum.DECEMBER);
        while (decemberIterator.hasNext()) {
            File c = decemberIterator.next();
            System.out.println(c.toString());
        }
    }

    private static FileCollection populateChannels() {
        FileCollection files = new FileCollectionImpl();
        files.addFile(new File("Video about cats", FileCategoryEnum.VIDEO, FileMonthDateEnum.APRIL));
        files.addFile(new File("Charlie and chocolate fabric", FileCategoryEnum.MOVIE, FileMonthDateEnum.AUGUST));
        files.addFile(new File("Notebook", FileCategoryEnum.PROGRAMS, FileMonthDateEnum.JULY));
        files.addFile(new File("Photos", FileCategoryEnum.ARCHIVES, FileMonthDateEnum.NOVEMBER));
        files.addFile(new File("Sherlock Holmes", FileCategoryEnum.MOVIE, FileMonthDateEnum.JULY));
        files.addFile(new File("Zhadan i Sobaky - Malvi", FileCategoryEnum.AUDIO, FileMonthDateEnum.MARCH));
        files.addFile(new File("Spotify", FileCategoryEnum.PROGRAMS, FileMonthDateEnum.APRIL));
        files.addFile(new File("Messenger", FileCategoryEnum.PROGRAMS, FileMonthDateEnum.NOVEMBER));
        files.addFile(new File("Video about cute dogs", FileCategoryEnum.VIDEO, FileMonthDateEnum.FEBRUARY));
        return files;
    }
}
