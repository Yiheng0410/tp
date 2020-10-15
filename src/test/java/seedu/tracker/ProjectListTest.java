package seedu.tracker;

import org.junit.jupiter.api.Test;
import seedu.tracker.project.Project;
import seedu.tracker.project.ProjectList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectListTest {

    Project p1=new Project("--project --name testing project 1--description this is a testing project --involve Anna, Tim and Zak --startdate 10/10/2020 --duedate 12/12/2020 --incharge Alex");
    Project p2=new Project("--project --name testing project 2--description this is a testing project --involve Anna, Tim and Zak --startdate 10/10/2020 --duedate 12/12/2020 --incharge Alex");
    Project p3=new Project("--project --name testing project 3--description this is a testing project --involve Anna, Tim and Zak --startdate 10/10/2020 --duedate 12/12/2020 --incharge Alex");

    @Test

    public void testAddMethod(){

        ProjectList projects=new ProjectList();
        projects.add(p1);
        projects.add(p2);
        projects.add(p3);

        assertEquals(projects.get(0).getDescription(),"--project --name testing project 1--description this is a testing project --involve Anna, Tim and Zak --startdate 10/10/2020 --duedate 12/12/2020 --incharge Alex");
        assertEquals(projects.get(1).getDescription(),"--project --name testing project 2--description this is a testing project --involve Anna, Tim and Zak --startdate 10/10/2020 --duedate 12/12/2020 --incharge Alex");
        assertEquals(projects.get(2).getDescription(),"--project --name testing project 3--description this is a testing project --involve Anna, Tim and Zak --startdate 10/10/2020 --duedate 12/12/2020 --incharge Alex");

    }
}
