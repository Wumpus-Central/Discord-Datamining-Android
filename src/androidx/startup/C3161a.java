package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p342t1.AbstractC12937a;
import p342t1.C12938b;
import p342t1.C12939c;
import p376v1.C13389b;

/* renamed from: androidx.startup.a */
/* loaded from: classes.dex */
public final class C3161a {

    /* renamed from: d */
    private static volatile C3161a f4911d;

    /* renamed from: e */
    private static final Object f4912e = new Object();

    /* renamed from: c */
    final Context f4915c;

    /* renamed from: b */
    final Set<Class<? extends AbstractC12937a<?>>> f4914b = new HashSet();

    /* renamed from: a */
    final Map<Class<?>, Object> f4913a = new HashMap();

    C3161a(Context context) {
        this.f4915c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C3161a m35034c(Context context) {
        if (f4911d == null) {
            synchronized (f4912e) {
                if (f4911d == null) {
                    f4911d = new C3161a(context);
                }
            }
        }
        return f4911d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m35036a() {
        try {
            try {
                C13389b.m3774a("Startup");
                Bundle bundle = this.f4915c.getPackageManager().getProviderInfo(new ComponentName(this.f4915c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f4915c.getString(C12938b.f29023a);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (AbstractC12937a.class.isAssignableFrom(cls)) {
                                this.f4914b.add(cls);
                                m35035b(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                C13389b.m3773b();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
            throw new C12939c(e);
        }
    }

    /* renamed from: b */
    <T> T m35035b(Class<? extends AbstractC12937a<?>> cls, Set<Class<?>> set) {
        T t;
        synchronized (f4912e) {
            if (C13389b.m3771d()) {
                C13389b.m3774a(cls.getSimpleName());
            }
            if (!set.contains(cls)) {
                if (!this.f4913a.containsKey(cls)) {
                    set.add(cls);
                    try {
                        AbstractC12937a aVar = (AbstractC12937a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends AbstractC12937a<?>>> a = aVar.mo5027a();
                        if (!a.isEmpty()) {
                            for (Class<? extends AbstractC12937a<?>> cls2 : a) {
                                if (!this.f4913a.containsKey(cls2)) {
                                    m35035b(cls2, set);
                                }
                            }
                        }
                        t = (T) aVar.mo5026b(this.f4915c);
                        set.remove(cls);
                        this.f4913a.put(cls, t);
                    } catch (Throwable th2) {
                        throw new C12939c(th2);
                    }
                } else {
                    t = (T) this.f4913a.get(cls);
                }
                C13389b.m3773b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
        return t;
    }

    /* renamed from: d */
    public <T> T m35033d(Class<? extends AbstractC12937a<T>> cls) {
        return (T) m35035b(cls, new HashSet());
    }
}
