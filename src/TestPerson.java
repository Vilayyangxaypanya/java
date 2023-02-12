public class TestPerson {
    public static void main(String[] args){
        Person s1 = new Student("xaypanya",23,"laos",2);
        Person t1 = new Teacher("adam",32,"my",6000000);
        Person[] list = {s1,t1};
        for(Person p: list){
            p.xuat();
        }
    }
}
