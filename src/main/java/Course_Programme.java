import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course_Programme {
    String courseName;
    List<String> modules= new ArrayList<String>();
    List<String> students= new ArrayList<String>();
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    public Course_Programme(String courseName,ArrayList<String> modules,ArrayList<String> students,DateTime startDate,DateTime endDate)
    {
        this.courseName=courseName;
        this.modules=modules;
        this.students=students;
        this.startDate=startDate;
        this.endDate=endDate;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public List<String> getModules()
    {
        return modules;
    }
    public void setModules(ArrayList<String> modules)
    {
        this.modules=modules;
    }
    public List<String> getStudents()
    {
        return students;
    }
    public void setStudents(ArrayList<String> students)
    {
        this.students=students;
    }
    public DateTime getStartDate()
    {
        return startDate;
    }
    public void setStartDate(DateTime startDate)
    {
        this.startDate=startDate;
    }
    public DateTime getEndDate()
    {
        return endDate;
    }
    public void setEndDate(DateTime endDate)
    {
        this.endDate=endDate;
    }
}
