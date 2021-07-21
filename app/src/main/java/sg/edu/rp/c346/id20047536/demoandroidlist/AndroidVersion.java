package sg.edu.rp.c346.id20047536.demoandroidlist;

import androidx.annotation.NonNull;

public class AndroidVersion {

    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @NonNull
    @Override
    public String toString() {
        return name + ": " +  version;
    }
}