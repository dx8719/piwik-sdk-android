/*
 * Android SDK for eoc
 *
 * @link https://github.com/eoc/eoc-android-sdk
 * @license https://github.com/eoc/eoc-sdk-android/blob/master/LICENSE BSD-3 Clause
 */

package org.eoc.sdk.tools;

import java.text.DecimalFormat;

public class CurrencyFormatter {
    public static String priceString(int cents) {
        DecimalFormat form = new DecimalFormat("0.00");
        return form.format(cents / 100.);
    }
}
