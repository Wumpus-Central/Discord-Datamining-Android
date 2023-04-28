package com.facebook.react.bridge;

import java.lang.reflect.Method;
import p078e6.AbstractC6709a;
import p414x3.C13925a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @AbstractC6709a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e) {
                C13925a.m2287k("ReactCxxErrorHandler", "Failed to invole error hanlder function", e);
            }
        }
    }

    @AbstractC6709a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
