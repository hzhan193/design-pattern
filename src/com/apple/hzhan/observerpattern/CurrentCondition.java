package com.apple.hzhan.observerpattern;

public class CurrentCondition implements Observer {
    Subject weatherData;

    public CurrentCondition(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(weatherData.getData());
    }
}
