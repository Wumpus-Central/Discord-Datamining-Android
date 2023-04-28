package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.facebook.react.C5072R;

/* loaded from: classes7.dex */
public class DevSettingsActivity extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(C5072R.string.catalyst_settings_title));
        addPreferencesFromResource(C5072R.xml.rn_dev_preferences);
    }
}
