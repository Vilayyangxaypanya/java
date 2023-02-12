public class Person {
        String ten;
        int tuoi;
        String diachi;
        public Person(String ten,int tuoi,String diachi){
            this.ten = ten;
            this.tuoi = tuoi;
            this.diachi = diachi;
        }
        public String getTen(){
            return ten;
        }
        public int getTuoi(){
            return tuoi;
        }
        public String getDiachi(){
            return diachi;
        }
        public void setTen(String ten){
            this.ten = ten;
        }
        public void setTuoi(int tuoi){
            this.tuoi = tuoi;
        }
        public void setDiachi(String diachi){
            this.diachi = diachi;
        }
        public void xuat(){
            System.out.print("Ten = "+getTen()+"\nTuoi = "+getTuoi()+"\nDiachi = "+getDiachi());
        }

}
