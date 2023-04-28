package com.facebook.react.bridge;

import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public interface NativeModule {

    /* loaded from: classes7.dex */
    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void invalidate();

    void onCatalystInstanceDestroy();
}
