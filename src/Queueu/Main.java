package Queueu;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue listTugas = new Queue();


        listTugas.enqueue("Jurnal 05 ISD");
        listTugas.enqueue("Kuis SBD");
        listTugas.enqueue("Tugas Besar");
        System.out.print("Tugas prioritas : ");
        System.out.println(listTugas.head.key);
        listTugas.dequeue();
        System.out.println("Sisa tugas yang belum dikerjakan : ");
        System.out.println(listTugas.head.key);
        System.out.println(listTugas.tail.key);

//    int pilihan = input.nextInt();
//        do{
//            if (pilihan == 1){
//                String inputTugas = input.nextLine();
//                listTugas.enqueue(inputTugas);
//            }else if (pilihan == 2){
//                System.out.println("Tugas Prioritas : ");
//                System.out.println(listTugas.head.key);
//            }else if (pilihan == 3){
//                listTugas.dequeue();
//            }else if (pilihan == 4){
//                System.out.println(listTugas.toString());
//            }
//
//        }while (pilihan !=0);







       
    }
}
