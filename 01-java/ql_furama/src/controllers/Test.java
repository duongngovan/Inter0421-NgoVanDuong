package controllers;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import models.Employee;
import models.TuHoSo;
import sun.rmi.runtime.Log;

import java.util.*;

public class Test {
    static Stack<TuHoSo> tuHoSoStack = new Stack<>();
    public static void main(String[] args) {
//        MainControllers mainControllers = new MainControllers();
//        mainControllers.displayMainMenu();
//        String a = "male";
//        do {
//            if (!a.trim().equalsIgnoreCase("male") || !a.trim().equalsIgnoreCase("female")){
//                System.out.println("Sai");
//            }
//        }while (!a.trim().equalsIgnoreCase("male") && !a.trim().equalsIgnoreCase("female"));
        Employee employee = new Employee("A",20,"Đà Nẵng");
        TuHoSo tuHoSo = new TuHoSo("01","Nhan Vien",employee);
        tuHoSoStack.push(tuHoSo);
        System.out.println(timKiem(employee));


    }
    public static void useStack(){
        Employee employee = new Employee("A",20,"Đà Nẵng");
        TuHoSo tuHoSo = new TuHoSo("01","Nhan Vien",employee);
        tuHoSoStack.push(tuHoSo);
    }

    public  static String timKiem(Employee employee){
        if (tuHoSoStack.isEmpty()){
            throw  new IndexOutOfBoundsException("Stack is empty");
        }
        for (int i = 0; i < tuHoSoStack.size(); i++){
            if (tuHoSoStack.get(i).equals(employee.getName())){
                return employee.toString();
            }
        }
        return "Không tồn tại";
    }



    public static void  editSplit(String inputText ){
        String textLow = inputText.toLowerCase();
        System.out.println(textLow);
        String [] words = textLow.split(" ");
        List list = new ArrayList();
        for (String s: words){
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++){
            list.set(i,list.get(i).toString());
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


//        for (int i = 0; i < lsTextSplit.size(); i++){
//            lsTextSplit.set(i,lsTextSplit.get(i).toString().toUpperCase().charAt(0));
//        }
//        for (int i = 0; i < lsTextSplit.size(); i++){
//            System.out.println(lsTextSplit.get(i));
//        }


//        for (int i = 0; i < words.length; i++){
//           words[i].toUpperCase().charAt(0);
//        }
//        for (String s : words){
//            System.out.println(s);
//        }


    }
    public static String edit(String a){
        char tem = a.toUpperCase().charAt(0);
        a = tem + String.valueOf(a).substring(1);
        return a;
    }

    public static boolean abc(String a){
        return a.matches("\\d{2}+[-|/]+\\d{2}+[-|/]+\\d{4}");
    }

    public static  boolean aBoolean(String a){
        return a.equalsIgnoreCase("male");
    }

}
