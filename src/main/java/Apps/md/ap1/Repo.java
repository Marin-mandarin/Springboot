package Apps.md.ap1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Repo {
    String name = "vasea pupkin";
    String description  = " spring boot app";

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name='" + name +
                "\ndescription='" + description + "'"
                ;
    }
}
