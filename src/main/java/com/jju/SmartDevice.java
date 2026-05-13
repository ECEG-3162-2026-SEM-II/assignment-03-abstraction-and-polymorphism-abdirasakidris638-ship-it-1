package com.jju;

public abstract class SmartDevice {
    private final String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    // This is the "Contract" - Every device MUST have an activate method
    public abstract void activate();
}
