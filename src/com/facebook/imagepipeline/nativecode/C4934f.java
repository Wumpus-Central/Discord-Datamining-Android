package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
import p026b6.AbstractC3388d;

/* renamed from: com.facebook.imagepipeline.nativecode.f */
/* loaded from: classes7.dex */
public final class C4934f {
    /* renamed from: a */
    public static AbstractC3388d m31250a(int i, boolean z, boolean z2) {
        try {
            Class cls = Boolean.TYPE;
            return (AbstractC3388d) NativeJpegTranscoderFactory.class.getConstructor(Integer.TYPE, cls, cls).newInstance(Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        }
    }
}
