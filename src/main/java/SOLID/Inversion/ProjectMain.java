package SOLID.Inversion;

import java.util.ArrayList;
import java.util.List;

public class ProjectMain {
    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>();
        developers.add(new BackEndDeveloper());
        developers.add(new FrontEndDeveloper());
        developers.add(new CIDeveloper());
        Project project = new Project(developers);
        project.implement();
    }
}
