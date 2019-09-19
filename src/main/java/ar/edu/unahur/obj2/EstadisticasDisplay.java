package ar.edu.unahur.obj2;

public class EstadisticasDisplay {

    private double temperatura;
    private double presion;
    private double humedad;

    public void actualizarDatos(double temperatura, double presion, double humedad) {
        this.presion = presion;
        this.humedad = humedad;
        this.temperatura = temperatura;
        mostrar();
    }


    public void mostrar() {

        final StringBuffer sb = new StringBuffer("CondicionesActualesDisplay{");
        sb.append("temperatura=").append(temperatura);
        sb.append(", presion=").append(presion);
        sb.append(", humedad=").append(humedad);
        sb.append('}');
        System.out.println(sb.toString());

    }

}
