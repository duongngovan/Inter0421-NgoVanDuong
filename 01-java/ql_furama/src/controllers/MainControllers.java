package controllers;

import models.*;

import java.util.*;

public class MainControllers {

    List<Villa> lsVilla = new ArrayList<>();
    List<House> lsHouse = new ArrayList<>();
    List<Room> lsRoom = new ArrayList<>();
    ArrayList<Customer> lsCustommer = new ArrayList<>();


    TreeSet<House> tree_house = new TreeSet<>();
    TreeSet<Room> tree_room = new TreeSet<>();
    TreeSet<Villa> tree_vila = new TreeSet<>();
    Stack<TuHoSo> tuHoSoStack = new Stack<>();

    public Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }


    public void displayMainMenu() {


        while (true) {
            System.out.println("Vui lòng chọn !");
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Show Information of Employee");
            System.out.println("7. Exit");

            System.out.println("Vui lòng nhập vào");
            int sc_number = input().nextInt();


            switch (sc_number) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustommer();
                    break;
                case 5:
                    addNewBoking();
                    break;
                case 6:
                    showEmployee();
                    break;


            }
        }

    }


    public void addVilla() {
        Villa villa = new Villa();
        System.out.println("Nhập id");
        villa.setId(input().nextLine());
        System.out.println("Nhập tên");
        villa.setName(input().nextLine());
        System.out.println("Nhập diện tích");
        villa.setDienTich(input().nextInt());
        System.out.println("Nhập số tầng");
        villa.setSoTang(input().nextInt());
        System.out.println("Nhập số người tối đa");
        villa.setSoNguoiToiDa(input().nextInt());
        System.out.println("Nhập chi phí thuê");
        villa.setChiPhiThue(input().nextDouble());
        System.out.println("Nhập trạng thái");
        villa.setTrangThai(input().nextLine());
        System.out.println("Nhập mô tả tiện nghi");
        villa.setMoTaTienNghi(input().nextLine());
        System.out.println("Nhập tiêu chuẩn phòng");
        villa.setTieuChuanPhong(input().nextLine());
        System.out.println("Nhập diện tích hồ bơi");
        villa.setDienTichHoBoi(input().nextInt());

        lsVilla.add(villa);
    }

    public void showVilla() {
        for (Villa villa : lsVilla) {
            System.out.println(villa.showInfor());
        }
    }

    public void addHouse() {
        House house = new House();
        System.out.println("Nhập id");
        house.setId(input().nextLine());
        System.out.println("Nhập tên");
        house.setName(input().nextLine());
        System.out.println("Nhập diện tích");
        house.setDienTich(input().nextInt());
        System.out.println("Nhập số tầng");
        house.setSoTang(input().nextInt());
        System.out.println("Nhập số người tối đa");
        house.setSoNguoiToiDa(input().nextInt());
        System.out.println("Nhập chi phí thuê");
        house.setChiPhiThue(input().nextDouble());
        System.out.println("Nhập trạng thái");

        house.setTrangThai(input().nextLine());
        System.out.println("Nhập mô tả tiện nghi");
        house.setMoTaTienNghi(input().nextLine());
        System.out.println("Nhập tiêu chuẩn phòng");
        house.setTieuChuanPhong(input().nextLine());
        lsHouse.add(house);
    }

    public void showHouse() {
        for (House house : lsHouse) {
            System.out.println(house.showInfor());
        }
    }

    public void addRoom() {
        Room room = new Room();
        System.out.println("Nhập id");
        room.setId(input().nextLine());
        System.out.println("Nhập tên");
        room.setName(input().nextLine());
        System.out.println("Nhập diện tích");
        room.setDienTich(input().nextInt());

        System.out.println("Nhập số người tối đa");
        room.setSoNguoiToiDa(input().nextInt());
        System.out.println("Nhập chi phí thuê");
        room.setChiPhiThue(input().nextDouble());
        System.out.println("Nhập trạng thái");

        room.setTrangThai(input().nextLine());
        System.out.println("Nhập dịch vụ miễn phí");
        room.setDichVuMienPhi(input().nextLine());
        lsRoom.add(room);

    }

    public void showRoom() {
        for (Room room : lsRoom) {
            System.out.println(room.showInfor());
        }
    }

    public void addNewServices() {

        boolean conti = true;

        while (conti) {
            System.out.println("Vui lòng chọn !");
            System.out.println("1.Add New Villa");
            System.out.println("2.Add New House");
            System.out.println("3.Add New Room");
            System.out.println("4.Back to menu");
            System.out.println("5.Exit");
            System.out.println("Vui lòng nhập vào");

            int sc_one = input().nextInt();
            String choice;
            switch (sc_one) {
                case 1:
                    do {
                        addVilla();
                        System.out.println("Bạn Có Muốn Tiếp Tục Nhập Không");
                        choice = input().nextLine();

                    } while (choice.equalsIgnoreCase("y"));
                    break;
                case 2:
                    do {
                        addHouse();
                        System.out.println("Bạn Có Muốn Tiếp Tục Nhập Không");
                        choice = input().nextLine();

                    } while (choice.equalsIgnoreCase("y"));
                    break;
                case 3:
                    do {
                        addRoom();
                        System.out.println("Bạn Có Muốn Tiếp Tục Nhập Không");
                        choice = input().nextLine();

                    } while (choice.equalsIgnoreCase("y"));
                    break;
                case 4:
                    conti = false;
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Bạn chọn sai chức năng ! ");
                    System.out.println("Vui lòng thử lại (--)");
                    break;
            }


        }

    }

    public void showServices() {
        boolean conti = true;
        while (conti = true) {
            System.out.println("Vui lòng chọn !");
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show All Name Villa Not Duplicate");
            System.out.println("5. Show All Name House Not Duplicate");
            System.out.println("6. Show All Name Name Not Duplicate");
            System.out.println("7. Back to menu");
            System.out.println("8. Exit");
            switch (input().nextInt()) {
                case 1:
                    showVilla();
                    break;
                case 2:
                    showHouse();
                    break;
                case 3:
                    showRoom();
                    break;
                case 4:
                    showVillaNotDuplicate();
                    break;
                case 5:
                    showHouseNotDuplicate();
                    break;
                case 6:
                    showRoomNotDuplicate();
                    break;
                case 7:
                    conti = false;
                case 8:
                    System.exit(0);


            }
        }
    }

    public void showVillaNotDuplicate() {
        tree_vila.addAll(lsVilla);
        for (Villa villa : tree_vila) {
            System.out.println(villa.showInfor());
        }
    }

    public void showHouseNotDuplicate() {
        tree_house.addAll(lsHouse);
        for (House house : tree_house) {
            System.out.println(house.showInfor());
        }
    }

    public void showRoomNotDuplicate() {
        tree_room.addAll(lsRoom);
        for (Room room : tree_room) {
            System.out.println(room.showInfor());
        }
    }

    public void addNewCustomer() {
        Customer customer = new Customer();
        System.out.println("Vui lòng nhập !");

        System.out.println("Vui lòng nhập stt");
        customer.setStt(input().nextInt());
        System.out.println("Vui lòng nhập tên");
        do {
            customer.setName(input().nextLine());
                if (!customer.getName().matches("^[A-Z][a-z]+([ '_][A-Z][a-z]+)*$")){
                    System.out.println("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
                }
        }while (customer.getName() == null || "".equalsIgnoreCase(customer.getName().trim()) || ! customer.getName().matches("^[A-Z][a-z]+([ '_][A-Z][a-z]+)*$"));

        System.out.println("Vui lòng nhập ngày sinh");
        do {
            customer.setNgaySinh(input().nextLine());
            if (!customer.getNgaySinh().matches("\\d{2}+[-|/]+\\d{2}+[-|/]+\\d{4}") ){
                System.out.println(" Bạn phải nhập lớn hơn năm 1900 và nhỏ hơn năm hiện tại 18 năm VD 20/11/1991!");
            }
        }while (customer.getNgaySinh() == null || "".equalsIgnoreCase(customer.getNgaySinh().trim()) || !customer.getNgaySinh().matches("\\d{2}+[-|/]+\\d{2}+[-|/]+\\d{4}"));

        System.out.println("Nhập giới tính ");
        do {
            customer.setGioiTinh(input().nextLine());
            if (!customer.getGioiTinh().trim().equalsIgnoreCase("Male") && !customer.getGioiTinh().equalsIgnoreCase("female") && !customer.getGioiTinh().equalsIgnoreCase("unknow")) {
                System.out.println("Bạn nhập sai định dạng , vui lại nhập lại VD: Male, Female, Unknow");
            }
        } while (!customer.getGioiTinh().trim().equalsIgnoreCase("male") || customer.getGioiTinh() == null || "".equalsIgnoreCase(customer.getGioiTinh().trim())  && !customer.getGioiTinh().equalsIgnoreCase("female") && !customer.getGioiTinh().equalsIgnoreCase("unknow"));

        System.out.println("Nhập chúng minh nhân dân");
        customer.setcMND(input().nextLine());
        System.out.println("Nhập số điện thoại");
        customer.setSoDienThoai(input().nextLine());
        System.out.println("Nhập email");

        do {
            customer.setEmail(input().nextLine());
            if (!customer.getEmail().matches("\\w+@\\w+(\\.\\w{2,5})")) {
                System.out.println("Bạn nhập sai định dạng email , vui lòng nhập lại VD (abc@abc.com)");
            }
        } while (!customer.getEmail().matches("\\w+@\\w+(\\.\\w{2,5})"));

        System.out.println("Nhập loại khách");
        customer.setLoaiKhach(input().nextLine());
        System.out.println("Nhập địa chỉ");
        customer.setDiaChi(input().nextLine());
        lsCustommer.add(customer);
    }

    public void showInformationCustommer() {
        for (Customer customer : lsCustommer) {
            System.out.println(customer.showInfor());
        }
    }
    public void showInformationCustommers() {
        for (Customer customer : lsCustommer) {
            System.out.println(customer.showInfors());
        }
    }
    public void  editSplit(String inputText ){
        String textLow = inputText.toLowerCase();
        List lsTextSplit  = new ArrayList();
        lsTextSplit.add(textLow.split(" "));
        for (int i = 0; i < lsTextSplit.size(); i++){
             lsTextSplit.set(i,lsTextSplit.get(i).toString().toUpperCase().charAt(0));
        }

    }
    public  String edit(String a){
        char tem = a.toUpperCase().charAt(0);
        a = tem + String.valueOf(a).substring(1);
        return a;
    }



    public void sortShowInformation(){

        Collections.sort(lsCustommer);
        for (Customer customer : lsCustommer) {
            System.out.println(customer.showInfor());
        }

    }

    public void addNewBoking(){
        System.out.println("Vui lòng chọn");
        System.out.println("1.Booking Villa");
        System.out.println("2.Booking House");
        System.out.println("3.Booking Room");
        int a = 0;
        int b = 0;
        System.out.println("Vui lòng chọn customer!");
        showInformationCustommer();
        do {
            System.out.println("Vui lòng nhập!");
            a = input().nextInt();
        }while (a > lsCustommer.size());
        System.out.println("Vui lòng chon booking");
        switch (input().nextInt()){
            case 1:
                showVilla();
                System.out.println("Vui lòng booking sản phẩm của quý khách!");
                b = input().nextInt();

//                lsCustommer.set(a,lsCustommer.get(a).setServices(lsVilla.get(b)));
                lsCustommer.get(a-1).setServices(lsVilla.get(b-1));
                break;
            case 2:
                showHouse();
                System.out.println("Vui lòng booking sản phẩm của quý khách!");
                b = input().nextInt();
                lsCustommer.get(a-1).setServices(lsHouse.get(b-1));
                break;
            case 3:
                showRoom();
                System.out.println("Vui lòng booking sản phẩm của quý khách");
                b = input().nextInt();
                lsCustommer.get(a-1).setServices(lsRoom.get(b-1));
                break;
        }
    }
    public void showEmployee(){
        Employee employee = new Employee("A",20,"Đà Nẵng");
        Employee employee1 = new Employee("B",21,"Đà Nẵng");
        Employee employee2= new Employee("C",22,"Đà Nẵng");
        Employee employee3 = new Employee("D",23,"Đà Nẵng");
        Employee employee4 = new Employee("E",24,"Đà Nẵng");
        Employee employee5 = new Employee("F",25,"Đà Nẵng");
        Employee employee6 = new Employee("G",26,"Đà Nẵng");
        Map<Integer,Employee> mapEmployee = new HashMap<>();
        mapEmployee.put(001,employee);
        mapEmployee.put(002,employee1);
        mapEmployee.put(003,employee2);
        mapEmployee.put(004,employee3);
        mapEmployee.put(005,employee4);
        mapEmployee.put(006,employee5);
        mapEmployee.put(007,employee6);

        Set<Integer> set = mapEmployee.keySet();
        for (Integer key: set){
            System.out.println(mapEmployee.get(key).toString());
        }
    }
    public void useQueue(){
        Customer customer = new Customer("Duong","20/07/1999","Nam","12312","324324","ngovan@gmail.com","Vip","Đà nẵng");
        Queue<Customer> customerQueue = new LinkedList<>();
        customerQueue.offer(customer);
        while (true){
            Customer customer1 = customerQueue.poll();
            if (customer1 == null){
                break;
            }
            System.out.println(customer.showInfor());
        }
    }
    public void useStack(){
        Employee employee = new Employee("A",20,"Đà Nẵng");
        TuHoSo tuHoSo = new TuHoSo("01","Nhan Vien",employee);
        tuHoSoStack.push(tuHoSo);
    }

    public String timKiem(Employee employee){
        if (tuHoSoStack.isEmpty()){
            throw  new IndexOutOfBoundsException("Stack is empty");
        }
        for (int i = 0; i < tuHoSoStack.size(); i++){
            if (tuHoSoStack.get(i).equals(employee)){
                return employee.toString();
            }
        }
        return "Không tồn tại";
    }







}
