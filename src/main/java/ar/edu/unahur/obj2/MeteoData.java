package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MeteoData{
    //Sujeto
    private final EstacionMeteorologica estacionMeteorologica;
    private final List<Display> displays = new ArrayList<>();


    public MeteoData(EstacionMeteorologica estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public void agregarDisplay(Display display) {
        displays.add(display);
    }

    public void eliminarDisplay(Display display) {
        displays.remove(display);
    }

    public double getHumedad() {
        return new Random().nextDouble();
    }

    public double getTemperatura() {
        return new Random().nextDouble();
    }

    public double getPresion() {
        return new Random().nextDouble();
    }


    public void  informaciónActualizada(){
        displays.stream().forEach(d -> d.actualizarDatos(getTemperatura(), getPresion(), getHumedad()));

    };
}
