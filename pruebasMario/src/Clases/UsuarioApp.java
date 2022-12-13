package Clases;

public class UsuarioApp {
    private String nombre;
    private int numParticipacionesTorneo;
    private int numParticipacionesSorteo;
    private int numVictoriasTorneo;
    private int numVictoriasSorteo;

    public UsuarioApp(String nombre) {
        this.nombre = nombre;
        this.numParticipacionesTorneo = 0;
        this.numParticipacionesSorteo = 0;
        this.numVictoriasTorneo = 0;
        this.numVictoriasSorteo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumParticipacionesTorneo() {
        return numParticipacionesTorneo;
    }

    public void setNumParticipacionesTorneo(int numParticipacionesTorneo) {
        this.numParticipacionesTorneo = numParticipacionesTorneo;
    }

    public int getNumParticipacionesSorteo() {
        return numParticipacionesSorteo;
    }

    public void setNumParticipacionesSorteo(int numParticipacionesSorteo) {
        this.numParticipacionesSorteo = numParticipacionesSorteo;
    }

    public int getNumVictoriasTorneo() {
        return numVictoriasTorneo;
    }

    public void setNumVictoriasTorneo(int numVictoriasTorneo) {
        this.numVictoriasTorneo = numVictoriasTorneo;
    }

    public int getNumVictoriasSorteo() {
        return numVictoriasSorteo;
    }

    public void setNumVictoriasSorteo(int numVictoriasSorteo) {
        this.numVictoriasSorteo = numVictoriasSorteo;
    }

    public void ganarSorteo() {
        this.numVictoriasSorteo++;
    }

    public void ganarTorneo() {
        this.numVictoriasTorneo++;
    }

    public void participarSorteo() {
        this.numParticipacionesSorteo++;
    }

    public void participarTorneo() {
        this.numParticipacionesTorneo++;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}