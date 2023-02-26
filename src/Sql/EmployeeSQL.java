package Sql;

import java.sql.*;
import java.util.Scanner;

public class EmployeeSQL {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Employee?characterEncoding=utf8";
        String username = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement stmt = con.createStatement();
        ResultSet rs;
        PreparedStatement st;

        String qry = "";
        int id, loung, choice;
        String name, birth, sdt;

        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        while (true) {
            System.out.println("Bai tap Employee Them ,");
            System.out.println("1. Them");
            System.out.println("2. Cap Nhat");
            System.out.println("3. Xoa");
            System.out.println("4. Hien thi thong tin trong bang");
            System.out.println("5. Thoat");
            System.out.print("Chon 1-2-3-4-5: ");
            choice = in.nextInt();
            System.out.println("-----------------------------------------");
            switch (choice) {
                case 1:
                    System.out.println("1. Them thong tin moi");

                    System.out.println("Nhap ten : ");
                    name = str.nextLine();
                    System.out.println("Nhap ngay thang nam sinh : ");
                    birth = str.nextLine();
                    System.out.println("Nhap std : ");
                    sdt = str.nextLine();
                    System.out.println("Nhap so luong : ");
                    loung = in.nextInt();

                    qry = "insert into nhanvien (name,ngaysinh,dienthoai,hsluong) values(?,?,?,?)";
                    st = con.prepareStatement(qry);
                    st.setString(1, name);
                    st.setString(2, birth);
                    st.setString(3, sdt);
                    st.setInt(4, loung);

                    st.executeUpdate();
                    System.out.println("Data Insert Success");

                    break;
                case 2:
                    System.out.println("2. Updating a Data");

                    System.out.println("Nhap ma nhan vien (ID) : ");
                    id = in.nextInt();
                    System.out.println("Nhap ten: ");
                    name = str.nextLine();
                    System.out.println("Nhap ngay thang nam sinh : ");
                    birth = str.nextLine();
                    System.out.println("Nhap std : ");
                    sdt = str.nextLine();
                    System.out.println("Nhap so luong : ");
                    loung = in.nextInt();

                    qry = "update nhanvien set name=?,ngaysinh=?,dienthoai=? where manv=?";
                    st = con.prepareStatement(qry);

                    st.setString(1, name);
                    st.setString(2, birth);
                    st.setString(3, sdt);
                    st.setInt(4, loung);

                    st.executeUpdate();
                    System.out.println("Data Update Success");

                    break;
                case 3:
                    System.out.println("3. Deleting a Data");
                    System.out.println("Nhap Ma Nhan vien (ID) : ");
                    id = in.nextInt();

                    qry = "delete from nhanvien where manv=?";
                    st = con.prepareStatement(qry);
                    st.setInt(1, id);

                    st.executeUpdate();
                    System.out.println("Data Deleted Success");

                    break;
                case 4:
                    System.out.println("4. Print all Records");
                    qry = "SELECT * from nhanvien";
                    rs = stmt.executeQuery(qry);
                    while (rs.next()) {
                        id = rs.getInt("manv");
                        name = rs.getString("name");
                        birth = rs.getString("ngaysinh");
                        sdt = rs.getString("dienthoai");
                        loung = rs.getInt("hsluong");


                        System.out.print(id + " ");
                        System.out.print(name + " ");
                        System.out.print(birth + " ");
                        System.out.println(sdt + " ");
                        System.out.println(loung + " ");

                    }
                    break;
                case 5:
                    System.out.println("Thank You");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
            System.out.println("-----------------------------------------");

        }
    }
}