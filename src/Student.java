public class Student extends Person {
    double gpa;
    public Student(String ten,int tuoi,String diachi,double gpa){
        super(ten,tuoi,diachi);
        this.gpa = gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void xuat(){
        System.out.println("Student\nTen = "+getTen()+"\nTuoi = "+getTuoi()+"\nDiachi = "+getDiachi()+"\nGpa = "+getGpa());
    }
}
