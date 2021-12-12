public class Planet {

    /**
     * Выберите любой объект реального мира с тремя-четырьмя свойствами и создайте для него POJO-класс, содержащий:
     *
     * Конструктор с одним-двумя основными свойствами.
     * Методы-геттеры и методы-сеттеры для всех свойств объектов этого класса.
     */

    private String nameOfPlanet;
    private int countOfSatellites;
    private boolean existenceOfLife;
    private String typeOfAtmosphere;


    public Planet(String nameOfPlanet, int countOfSatellites) {
        this.nameOfPlanet = nameOfPlanet;
        this.countOfSatellites = countOfSatellites;
    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public void setNameOfPlanet(String nameOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
    }

    public int countOfSatellites() {
        return countOfSatellites;
    }

    public void countOfSatellites(int countOfSatellites) {
        this.countOfSatellites = countOfSatellites;
    }

    public boolean isExistenceOfLife() {
        return existenceOfLife;
    }

    public void setExistenceOfLife(boolean existenceOfLife) {
        this.existenceOfLife = existenceOfLife;
    }

    public String getTypeOfAtmosphere() {
        return typeOfAtmosphere;
    }

    public void setTypeOfAtmosphere(String typeOfAtmosphere) {
        this.typeOfAtmosphere = typeOfAtmosphere;
    }

}
