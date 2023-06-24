package CourseOrganisation;

import java.util.ArrayList;

public final class Catalog {
    private static Catalog instance;
    private int catalogID;
    private ArrayList<Theme> themes = new ArrayList<Theme>();

    public static Catalog getInstance(){
        if (instance == null){
            instance = new Catalog();

        }
        return instance;
    }

    public void addTheme(Theme theme){
        themes.add(theme);
    }

    public Catalog() {
        this.catalogID = 0;
    }

    public ArrayList<Theme> getThemes() {
        return themes;
    }

    public int getCatalogID() {
        return catalogID;
    }
}
