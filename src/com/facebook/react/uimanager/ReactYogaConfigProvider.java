package com.facebook.react.uimanager;

import com.facebook.yoga.AbstractC5123a;
import com.facebook.yoga.YogaConfig;

/* loaded from: classes7.dex */
public class ReactYogaConfigProvider {
    private static YogaConfig YOGA_CONFIG;

    public static YogaConfig get() {
        if (YOGA_CONFIG == null) {
            YogaConfig a = AbstractC5123a.m30600a();
            YOGA_CONFIG = a;
            a.mo30599a(0.0f);
            YOGA_CONFIG.mo30598b(true);
        }
        return YOGA_CONFIG;
    }
}
