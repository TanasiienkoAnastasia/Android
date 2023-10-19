package Entities.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class File {
    private String name;
    private String category;
    private String date;
    private String link;
    private String place;

    private Map<String, List<String>> files = new HashMap<>();

    public File(String name, String... categories) {
        this.name = name;


        for (String category : categories) {
            String[] parts = category.split(":");
            String fileType = "music", fileName;
            if (parts.length == 1) {
                fileName = parts[0];
            }
            else {
                fileType = parts[0];
                fileName = parts[1];
            }
            if (!this.files.containsKey(fileType)) {
                this.files.put(fileType, new ArrayList<>());
            }
            this.files.get(fileType).add(fileName);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getCategories(String fileType) {
        if (!this.files.containsKey(fileType)) {
            this.files.put(fileType, new ArrayList<>());
        }
        return files.get(fileType);
    }
}
