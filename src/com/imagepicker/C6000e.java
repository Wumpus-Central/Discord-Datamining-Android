package com.imagepicker;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;

/* renamed from: com.imagepicker.e */
/* loaded from: classes6.dex */
public class C6000e {

    /* renamed from: a */
    int f12100a;

    /* renamed from: b */
    Boolean f12101b;

    /* renamed from: c */
    Boolean f12102c;

    /* renamed from: d */
    int f12103d;

    /* renamed from: e */
    int f12104e;

    /* renamed from: f */
    int f12105f;

    /* renamed from: g */
    int f12106g;

    /* renamed from: h */
    Boolean f12107h;

    /* renamed from: i */
    int f12108i;

    /* renamed from: j */
    Boolean f12109j;

    /* renamed from: k */
    String f12110k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6000e(ReadableMap readableMap) {
        this.f12103d = 1;
        this.f12109j = Boolean.FALSE;
        this.f12110k = readableMap.getString("mediaType");
        this.f12100a = readableMap.getInt("selectionLimit");
        this.f12101b = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        this.f12102c = Boolean.valueOf(readableMap.getBoolean("includeExtra"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals("high")) {
            this.f12103d = 0;
        }
        if (readableMap.getString("cameraType").equals("front")) {
            this.f12109j = Boolean.TRUE;
        }
        this.f12104e = (int) (readableMap.getDouble("quality") * 100.0d);
        this.f12106g = readableMap.getInt(ViewProps.MAX_HEIGHT);
        this.f12105f = readableMap.getInt(ViewProps.MAX_WIDTH);
        this.f12107h = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.f12108i = readableMap.getInt("durationLimit");
    }
}
