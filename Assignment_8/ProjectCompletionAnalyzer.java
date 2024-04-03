import java.util.ArrayList;
import java.util.List;

class StudentProject {
    private String name;
    private int completionTime;

    public StudentProject(String name, int completionTime) {
        this.name = name;
        this.completionTime = completionTime;
    }

    public int getCompletionTime() {
        return completionTime;
    }
}

public class ProjectTracker {

    public static void main(String[] args) {
        List<StudentProject> projects = new ArrayList<>();
        projects.add(new StudentProject("Alice", 7));
        projects.add(new StudentProject("Bob", 5));
        projects.add(new StudentProject("Charlie", 10));
        projects.add(new StudentProject("David", 6));
        projects.add(new StudentProject("Eve", 8));

        int onTime = 0;
        int late = 0;
        int early = 0;
        int totalTime = 0;

        for (StudentProject project : projects) {
            int completionTime = project.getCompletionTime();
            totalTime += completionTime;
            if (completionTime == 7) { // Assuming 7 is on-time completion
                onTime++;
            } else if (completionTime < 7) {
                early++;
            } else {
                late++;
            }
        }

        int totalProjects = projects.size();
        double averageCompletionTime = (double) totalTime / totalProjects;

        System.out.println("Number of projects completed on time: " + onTime);
        System.out.println("Number of projects completed early: " + early);
        System.out.println("Number of projects completed late: " + late);
        System.out.println("Average time taken to complete a project: " + averageCompletionTime);
    }
}
