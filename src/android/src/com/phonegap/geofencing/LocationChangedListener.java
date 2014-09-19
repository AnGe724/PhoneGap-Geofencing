package com.phonegap.geofencing;


import android.location.Location;

/**
 * Listener to receive location updates.
 * @author AnGe724
 */
public interface LocationChangedListener {

    void onLocationChanged(Location location);
}
