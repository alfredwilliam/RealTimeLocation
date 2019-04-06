package com.example.alfred.realtimelocation.Model;

public class MyLocation {
    private int accuracy,altitude,bearing,bearingAccuracyDegrees,speed,
    speedAccuracyMetersPerSeconds,VerticalAccuracyMeters;
    private boolean complete,fromMockProvider;
    private String providers;
    private long time,elapsedRealtimeNanos;
    private double latitude,longitude;

    public MyLocation() {
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getBearing() {
        return bearing;
    }

    public void setBearing(int bearing) {
        this.bearing = bearing;
    }

    public int getBearingAccuracyDegrees() {
        return bearingAccuracyDegrees;
    }

    public void setBearingAccuracyDegrees(int bearingAccuracyDegrees) {
        this.bearingAccuracyDegrees = bearingAccuracyDegrees;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedAccuracyMetersPerSeconds() {
        return speedAccuracyMetersPerSeconds;
    }

    public void setSpeedAccuracyMetersPerSeconds(int speedAccuracyMetersPerSeconds) {
        this.speedAccuracyMetersPerSeconds = speedAccuracyMetersPerSeconds;
    }

    public int getVerticalAccuracyMeters() {
        return VerticalAccuracyMeters;
    }

    public void setVerticalAccuracyMeters(int verticalAccuracyMeters) {
        VerticalAccuracyMeters = verticalAccuracyMeters;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public boolean isFromMockProvider() {
        return fromMockProvider;
    }

    public void setFromMockProvider(boolean fromMockProvider) {
        this.fromMockProvider = fromMockProvider;
    }

    public String getProviders() {
        return providers;
    }

    public void setProviders(String providers) {
        this.providers = providers;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getElapsedRealtimeNanos() {
        return elapsedRealtimeNanos;
    }

    public void setElapsedRealtimeNanos(long elapsedRealtimeNanos) {
        this.elapsedRealtimeNanos = elapsedRealtimeNanos;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
