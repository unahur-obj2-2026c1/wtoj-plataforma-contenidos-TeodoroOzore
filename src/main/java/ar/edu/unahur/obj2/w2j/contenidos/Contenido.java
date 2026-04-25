package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido {
    private String titulo;
    private Double costoBase;

    public Contenido(Double costoBase, String titulo) {
        this.costoBase = costoBase;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    // Template method

    public Double costo() {
        return costoBase + this.doCosto();
    }
    // method abstracto
    public abstract Double doCosto();
}
