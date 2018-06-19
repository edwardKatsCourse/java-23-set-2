package com.company;

public class Computer {

    private String brand;

    private Integer ram; //Random Access Memory

    private CPU cpu;

    private GraphicCard graphicCard;

    public Computer(String brand, Integer ram, CPU cpu, GraphicCard graphicCard) {
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.graphicCard = graphicCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }
}
