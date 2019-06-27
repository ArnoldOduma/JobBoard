package models;

import java.util.ArrayList;
import java.util.Collection;

public class Job {

    private String title;
    private String description;
    private int  tel;
    private static ArrayList<Job> jobs = new ArrayList<>();



    public Job( String title, String description, int tel){

        this.title=title;
        this.description=description;
        this.tel=tel;
        this.jobs.add(this);
    }

    public static ArrayList<Job> getAll() {
        return jobs;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getTel() {
        return tel;
    }
}
