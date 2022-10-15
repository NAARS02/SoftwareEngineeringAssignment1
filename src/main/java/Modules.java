import java.util.ArrayList;
import java.util.List;

public class Modules {
    String moduleName;
    String id;
    List<String> students= new ArrayList<String>();
    List<String> courses= new ArrayList<String>();
    String lecturer;
    public Modules(String moduleName,String id,ArrayList<String> students, ArrayList<String> courses,String lecturer)
    {
        this.moduleName=moduleName;
        this.id=id;
        this.students=students;
        this.courses=courses;
        this.lecturer=lecturer;
    }
    public String getModuleName()
    {
        return moduleName;
    }
    public void setModuleName(String moduleName)
    {
        this.moduleName=moduleName;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public List<String> getStudents()
    {
        return students;
    }
    public void setStudents(ArrayList<String> students)
    {
        this.students=students;
    }
    public List<String> getCourses()
    {
        return courses;
    }
    public void setCourses(ArrayList<String> courses)
    {
        this.courses=courses;
    }
    public String getLecturer()
    {
        return lecturer;
    }
    public void setLecturer(String lecturer)
    {
        this.lecturer=lecturer;
    }

}
