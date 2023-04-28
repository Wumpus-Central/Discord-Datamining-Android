package com.facebook.react.bridge;

import android.content.res.AssetManager;

/* loaded from: classes7.dex */
public interface JSBundleLoaderDelegate {
    void loadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    void loadScriptFromFile(String str, String str2, boolean z);

    void loadSplitBundleFromFile(String str, String str2);

    void setSourceURLs(String str, String str2);
}
