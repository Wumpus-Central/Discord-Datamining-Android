package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.j */
/* loaded from: classes7.dex */
public class C4938j {

    /* renamed from: a */
    private static AbstractC4937i f8353a = null;

    /* renamed from: b */
    public static boolean f8354b = false;

    static {
        try {
            f8353a = (AbstractC4937i) WebpTranscoderImpl.class.newInstance();
            f8354b = true;
        } catch (Throwable unused) {
            f8354b = false;
        }
    }

    /* renamed from: a */
    public static AbstractC4937i m31244a() {
        return f8353a;
    }
}
