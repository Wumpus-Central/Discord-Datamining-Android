package p370uf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p387vf.C13504a;
import wf.C13876a;

@Metadata(m15074d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m15073d2 = {"Luf/a;", "a", "Luf/a;", "IMPLEMENTATIONS", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: uf.b */
/* loaded from: classes8.dex */
public final class C13273b {

    /* renamed from: a */
    public static final C13272a f29800a;

    static {
        C13272a aVar;
        Object newInstance;
        try {
            newInstance = C13876a.class.newInstance();
            C9971q.m14634f(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                } catch (ClassNotFoundException unused) {
                    Object newInstance2 = C13504a.class.newInstance();
                    C9971q.m14634f(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        try {
                            if (newInstance2 != null) {
                                aVar = (C13272a) newInstance2;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                            }
                        } catch (ClassCastException e) {
                            ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                            ClassLoader classLoader2 = C13272a.class.getClassLoader();
                            if (!C9971q.m14638b(classLoader, classLoader2)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                            }
                            throw e;
                        }
                    } catch (ClassNotFoundException unused2) {
                        aVar = new C13272a();
                    }
                }
            } catch (ClassCastException e2) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = C13272a.class.getClassLoader();
                if (!C9971q.m14638b(classLoader3, classLoader4)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                }
                throw e2;
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            C9971q.m14634f(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    if (newInstance3 != null) {
                        aVar = (C13272a) newInstance3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassCastException e3) {
                    ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader6 = C13272a.class.getClassLoader();
                    if (!C9971q.m14638b(classLoader5, classLoader6)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                    throw e3;
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                C9971q.m14634f(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 != null) {
                        aVar = (C13272a) newInstance4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = C13272a.class.getClassLoader();
                    if (!C9971q.m14638b(classLoader7, classLoader8)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                    }
                    throw e4;
                }
            }
        }
        if (newInstance != null) {
            aVar = (C13272a) newInstance;
            f29800a = aVar;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
    }
}
