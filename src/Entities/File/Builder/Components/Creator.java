package Entities.File.Builder.Components;

public class Creator {
    private final double size;
    private double bytes;
    private boolean started;

    public Creator(double size, double bytes) {
        this.size = size;
        this.bytes = bytes;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double bytes) {
        if (started) {
            this.bytes += bytes;
        } else {
            System.err.println("Cannot go(), you must start downloading first!");
        }
    }

    public double getSize() {
        return size;
    }

    public double getBytes() {
        return bytes;
    }
}
