package com.example.anamarin.pruebatec1.util;

import com.example.anamarin.pruebatec1.models.CitasMedicas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class Data {

    public static List<CitasMedicas> data;

    public static List<CitasMedicas> getData(){
        data = new ArrayList<>();

        CitasMedicas c1 = new CitasMedicas();
        c1.setNombreP("Maria Asuncion Gualanday");
        c1.setNombreD("Yina Ceron");
        c1.setFoto("http://zaragozaciudad.net/centrodemayoreslapaz/upload/20091016221921-dioni-1.jpg");
        c1.setHistoria("El paciente ha sufrido de diabetes grado 1...");
        c1.setHoraCita("17/08/2017");
        data.add(c1);

        CitasMedicas c2 = new CitasMedicas();
        c2.setNombreP("Juan Alberto Paz");
        c2.setNombreD("Cristian Alfredo Chamorro");
        c2.setFoto("http://www.lawebdelprogramador.com/usr/149000/149029/profileImage_origin.jpg?1412666134");
        c2.setHistoria("El paciente ha sufrido de diabetes grado 1...");
        c2.setHoraCita("17/08/2017");
        data.add(c2);

        return data;
    }
}
