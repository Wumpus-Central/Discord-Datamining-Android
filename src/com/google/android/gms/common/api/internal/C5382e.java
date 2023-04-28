package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C5378d;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* loaded from: classes5.dex */
public class C5382e {
    /* renamed from: a */
    public static <L> C5378d<L> m29052a(L l, Looper looper, String str) {
        C14004p.m2050k(l, "Listener must not be null");
        C14004p.m2050k(looper, "Looper must not be null");
        C14004p.m2050k(str, "Listener type must not be null");
        return new C5378d<>(looper, l, str);
    }

    /* renamed from: b */
    public static <L> C5378d.C5379a<L> m29051b(L l, String str) {
        C14004p.m2050k(l, "Listener must not be null");
        C14004p.m2050k(str, "Listener type must not be null");
        C14004p.m2054g(str, "Listener type must not be empty");
        return new C5378d.C5379a<>(l, str);
    }
}
