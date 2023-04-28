package org.webrtc;

import android.support.annotation.Nullable;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;

/* renamed from: org.webrtc.g */
/* loaded from: classes8.dex */
public final /* synthetic */ class C11467g {
    static {
        Object obj = EglBase.lock;
    }

    /* renamed from: a */
    public static EglBase.ConfigBuilder m9592a() {
        return new EglBase.ConfigBuilder();
    }

    /* renamed from: b */
    public static EglBase m9591b() {
        return m9589d(null, EglBase.CONFIG_PLAIN);
    }

    /* renamed from: c */
    public static EglBase m9590c(EglBase.Context context) {
        return m9589d(context, EglBase.CONFIG_PLAIN);
    }

    /* renamed from: d */
    public static EglBase m9589d(@Nullable EglBase.Context context, int[] iArr) {
        if (context == null) {
            if (EglBase14Impl.isEGL14Supported()) {
                return m9583j(iArr);
            }
            return m9586g(iArr);
        } else if (context instanceof EglBase14.Context) {
            return m9584i((EglBase14.Context) context, iArr);
        } else {
            if (context instanceof EglBase10.Context) {
                return m9587f((EglBase10.Context) context, iArr);
            }
            throw new IllegalArgumentException("Unrecognized Context");
        }
    }

    /* renamed from: e */
    public static EglBase10 m9588e(EGLContext eGLContext, int[] iArr) {
        return new EglBase10Impl(eGLContext, iArr);
    }

    /* renamed from: f */
    public static EglBase10 m9587f(EglBase10.Context context, int[] iArr) {
        EGLContext eGLContext;
        if (context == null) {
            eGLContext = null;
        } else {
            eGLContext = context.getRawContext();
        }
        return new EglBase10Impl(eGLContext, iArr);
    }

    /* renamed from: g */
    public static EglBase10 m9586g(int[] iArr) {
        return new EglBase10Impl(null, iArr);
    }

    /* renamed from: h */
    public static EglBase14 m9585h(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14Impl(eGLContext, iArr);
    }

    /* renamed from: i */
    public static EglBase14 m9584i(EglBase14.Context context, int[] iArr) {
        android.opengl.EGLContext eGLContext;
        if (context == null) {
            eGLContext = null;
        } else {
            eGLContext = context.getRawContext();
        }
        return new EglBase14Impl(eGLContext, iArr);
    }

    /* renamed from: j */
    public static EglBase14 m9583j(int[] iArr) {
        return new EglBase14Impl(null, iArr);
    }

    /* renamed from: k */
    public static int m9582k(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 == 4) {
                    return 2;
                }
                if (i2 != 64) {
                    return 1;
                }
                return 3;
            }
        }
        return 1;
    }
}
