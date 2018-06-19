package com.company;

public class GraphicCard {

    private String graphicCardBrand;
    private String graphicCardModel;
    private Integer memory;

    public GraphicCard(String graphicCardBrand, String graphicCardModel, Integer memory) {
        this.graphicCardBrand = graphicCardBrand;
        this.graphicCardModel = graphicCardModel;
        this.memory = memory;
    }

    public String getGraphicCardBrand() {
        return graphicCardBrand;
    }

    public void setGraphicCardBrand(String graphicCardBrand) {
        this.graphicCardBrand = graphicCardBrand;
    }

    public String getGraphicCardModel() {
        return graphicCardModel;
    }

    public void setGraphicCardModel(String graphicCardModel) {
        this.graphicCardModel = graphicCardModel;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }
}
