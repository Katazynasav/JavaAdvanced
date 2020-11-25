package SOLID.Inversion;

import java.util.List;

//High level module
public class Project {
    //low level model
    //private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    //low level model
    //private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement (){
       developers.forEach(developer -> developer.develop());
    }

}
