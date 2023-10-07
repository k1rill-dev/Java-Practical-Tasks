package com.company.professions;

public abstract class Driver {
    private String _fullName;
    private int _driveStag;

    public Driver(String fullName, int driveStag) {
        _fullName = fullName;
        _driveStag = driveStag;
    }
    public String get_fullName() {
        return _fullName;
    }

    public void set_fullName(String fullName) {
        _fullName = fullName;
    }

    public int get_driveStag() {
        return _driveStag;
    }

    public void set_driveStag(int driveStag) {
        _driveStag = driveStag;
    }



}
