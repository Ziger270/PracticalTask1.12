package com.mycompany.task1_12;

import java.util.Scanner;

/**
 *
 * @author aleksandrbisirov
 */
public class Task1_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Бисиров Александр Васильевич. Вариант 3");
        System.out.print("Введите имя врача: ");
        String firstname = scan.next();
        System.out.print("Введите отчество врача: ");
        String middlename = scan.next();
        System.out.print("Введите фамилию врача: ");
        String lastname = scan.next();
        System.out.print("Введите специальность врача: ");
        String specialization = scan.next();
        int kab;
        do {
            System.out.print("Введите номер кабинета врача: ");
            kab = scan.nextInt();
            if (kab < 1) System.out.println("Неверный номер кабинета");
        } while (kab < 1);
        Doctor doc = new Doctor(firstname, middlename, lastname, specialization, kab);
        DoctorSerializer serializer = new DoctorSerializer(doc, "C:\\DoctorData.bin");
        Thread th = new Thread(serializer);
        th.start();
        
    }
}
