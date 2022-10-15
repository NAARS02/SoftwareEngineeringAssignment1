public class Student {
    String name;
    int age;
    String dob;
    long id;
    String username;
    String courses;
    String modules;
    public Student(String name,int age,String dob,long id,String courses,String modules){
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.id=id;
        username=" ";
        this.courses=courses;
        this.modules=modules;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getDob()
    {
        return dob;
    }
    public void setDob(String dob)
    {
       this.dob=dob;
    }
    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id=id;
    }
    public String getCourses()
    {
        return courses;
    }
    public void setCourses(String courses)
    {
        this.courses=courses;
    }
    public String getModules()
    {
        return modules;
    }
    public void setModules(String modules)
    {
        this.modules=modules;
    }
    public String getUsername()
    {
        username=name+age;
        return username;
    }
}
