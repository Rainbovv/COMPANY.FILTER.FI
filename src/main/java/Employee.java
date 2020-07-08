public class Employee {
        private String fullName;
        private float salary;
        private float experience;


    public Employee(String fullName, float salary, float experience) {
        setFullName(fullName);
        setSalary(salary);
        setExperience(experience);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
