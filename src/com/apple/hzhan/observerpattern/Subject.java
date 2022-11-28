package com.apple.hzhan.observerpattern;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();
    public void notifyObserver(Observer observer);
    public WeatherData getData();
}
