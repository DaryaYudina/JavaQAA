public class Country {
    /**
     * Создайте POJO-класс Country, который будет использоваться для хранения данных о странах, со следующими полями:
     *
     * Название. countryName
     * Численность населения. countryPopulation
     * Площадь в квадратных километрах. countryArea
     * Название столицы. countryCapital
     * Наличие выхода к морю.accessToSea
     * Создайте в этом классе:
     *
     * Конструктор с одним параметром — названием страны.
     * Методы-геттеры для всех полей класса.
     * Методы-сеттеры для всех полей класса.
     * Имена полей и их типы установите самостоятельно так, чтобы они были понятными и соответствовали хранящимся в них данным.
     */

    private String countryName;
    private int countryPopulation;
    private int countryArea;
    private String countryCapital;
    private boolean accessToSea;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public int getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(int countryArea) {
        this.countryArea = countryArea;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public boolean isAccessToSea() {
        return accessToSea;
    }

    public void setAccessToSea(boolean accessToSea) {
        this.accessToSea = accessToSea;
    }



}
