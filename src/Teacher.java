public class Teacher extends Person {
    int salary;
    public Teacher(String ten,int tuoi,String diachi,int salary){
        super(ten,tuoi,diachi);
        this.salary = salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void xuat(){
        System.out.println("Teacher\nTen = "+getTen()+"\nTuoi = "+getTuoi()+"\nDiachi = "+getDiachi()+"\nSalary = "+getSalary());
    }
}
