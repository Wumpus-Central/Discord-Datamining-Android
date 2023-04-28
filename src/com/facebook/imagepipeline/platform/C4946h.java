package com.facebook.imagepipeline.platform;

import android.os.Build;
import androidx.core.util.Pools$SynchronizedPool;
import p437y5.C14256y;

/* renamed from: com.facebook.imagepipeline.platform.h */
/* loaded from: classes7.dex */
public class C4946h {
    /* renamed from: a */
    public static AbstractC4945g m31227a(C14256y yVar, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            int e = yVar.m1229e();
            return new C4944f(yVar.m1232b(), e, new Pools$SynchronizedPool(e));
        }
        int e2 = yVar.m1229e();
        return new C4939a(yVar.m1232b(), e2, new Pools$SynchronizedPool(e2));
    }
}
