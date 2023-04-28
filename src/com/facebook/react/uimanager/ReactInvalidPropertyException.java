package com.facebook.react.uimanager;

/* loaded from: classes7.dex */
public class ReactInvalidPropertyException extends RuntimeException {
    public ReactInvalidPropertyException(String str, String str2, String str3) {
        super("Invalid React property `" + str + "` with value `" + str2 + "`, expected " + str3);
    }
}
