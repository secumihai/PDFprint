/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.util.prefs.Preferences;

public enum AppPrefs {
    FileLocation;
    private static Preferences prefs = Preferences.userRoot()
                                          .node(AppPrefs.class.getName());

    String get(String defaultValue) {
        return prefs.get(this.name(), defaultValue);
    }

    void put(String value) {
        prefs.put(this.name(), value);
    }
}