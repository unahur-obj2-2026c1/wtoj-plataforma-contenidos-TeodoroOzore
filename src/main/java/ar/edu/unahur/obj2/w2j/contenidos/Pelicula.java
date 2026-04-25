package ar.edu.unahur.obj2.w2j.contenidos;

public class Pelicula extends Contenido {

    public Pelicula(String titulo, Double costoBase) {
        super(costoBase, titulo);
    }

    @Override
    public Double doCosto() {
        return 0.0;
    }

}
