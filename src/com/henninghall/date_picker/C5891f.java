package com.henninghall.date_picker;

import ae.EnumC1368c;

/* renamed from: com.henninghall.date_picker.f */
/* loaded from: classes6.dex */
public class C5891f {

    /* renamed from: a */
    private final C5897k f11709a;

    public C5891f(C5897k kVar) {
        this.f11709a = kVar;
    }

    /* renamed from: a */
    private String m26973a(String str) {
        return " " + str + " ";
    }

    /* renamed from: c */
    private boolean m26971c(String str) {
        if (this.f11709a.m26954D() == EnumC1368c.nativeAndroid && str.length() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m26972b(String str) {
        if (!m26971c(str)) {
            return str;
        }
        return m26973a(str);
    }
}
