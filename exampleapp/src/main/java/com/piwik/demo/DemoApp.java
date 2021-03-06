/*
 * Android SDK for Piwik
 *
 * @link https://github.com/piwik/piwik-android-sdk
 * @license https://github.com/piwik/piwik-sdk-android/blob/master/LICENSE BSD-3 Clause
 */

package com.piwik.demo;

import org.piwik.sdk.PiwikApplication;

public class DemoApp extends PiwikApplication {

    @Override
    public String getTrackerUrl() {
        return "http://beacons.testing.piwik.pro/piwik.php";
    }

    @Override
    public Integer getSiteId() {
        return 4;
    }

}
