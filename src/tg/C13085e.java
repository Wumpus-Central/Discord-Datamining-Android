package tg;

import kotlin.jvm.internal.C9971q;

/* renamed from: tg.e */
/* loaded from: classes8.dex */
public final class C13085e {
    /* renamed from: a */
    public static final Class<?> m4634a(ClassLoader classLoader, String fqName) {
        C9971q.m14633g(classLoader, "<this>");
        C9971q.m14633g(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
