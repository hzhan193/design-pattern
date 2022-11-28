package com.apple.hzhan.observerpattern;

public class Forecast implements Observer{
    Subject weatherData;

    public Forecast(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        System.out.println(weatherData.getData().getTemperature() + ", " + weatherData.getData().getHumidity());
    }
}
