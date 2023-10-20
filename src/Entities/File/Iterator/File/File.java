package Entities.File.Iterator.File;

public class File {
    private String name;
    private FileCategoryEnum category;
    private FileMonthDateEnum date;

    public File(String name, FileCategoryEnum category, FileMonthDateEnum date){
        this.name=name;
        this.category=category;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public FileCategoryEnum getCategory() {
        return category;
    }
    public FileMonthDateEnum getDate() {
        return date;
    }

    @Override
    public String toString(){
        return "Name="+this.name+", category="+this.category+", date="+this.date;
    }
}
