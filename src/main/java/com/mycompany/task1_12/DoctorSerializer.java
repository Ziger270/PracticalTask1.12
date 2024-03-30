/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author aleksandrbisirov
 */
public class DoctorSerializer implements Runnable {

    private Doctor doctor;
    private String path;
    
    public DoctorSerializer(Doctor doctor, String path) {
        this.doctor = doctor;
        this.path = path;
    }
    
    @Override
    public void run() {
        if (doctor != null && path != null) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream(this.path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(doctor);
                oos.close();
                System.out.println("Сериализация объекта Doctor прошла успешно.\nПуть к созданному файлу: " + path);
            }
            catch (IOException ex) {
                System.out.append("Во время сериализации произошла ошибка по пути: "+path);
            }
        }
    }
    
}
