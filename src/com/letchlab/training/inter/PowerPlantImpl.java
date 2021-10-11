package com.letchlab.training.inter;

public class PowerPlantImpl implements PowerPlant{
    private String typeOfPowerPlant;
    private String powerProduce;
    @Override
    public void setTypeOfPowerPlant() {
        typeOfPowerPlant = "super critical";

    }

    @Override
    public String getTypeOfPowerPlant() {
        return typeOfPowerPlant;
    }

    @Override
    public void setPowerProduce() {
        powerProduce = "150 MW";

    }

    @Override
    public String getPowerProduce() {
        return powerProduce;
    }
}
