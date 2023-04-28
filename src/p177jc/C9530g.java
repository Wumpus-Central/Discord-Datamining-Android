package p177jc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tc.AbstractC13053b;

/* renamed from: jc.g */
/* loaded from: classes3.dex */
public final class C9530g<T> {

    /* renamed from: a */
    private final T f21132a;

    /* renamed from: b */
    private final AbstractC9533c<T> f21133b;

    /* renamed from: jc.g$b */
    /* loaded from: classes3.dex */
    private static class C9532b implements AbstractC9533c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f21134a;

        /* renamed from: b */
        private Bundle m16065b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f21134a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f21134a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo16063a(Context context) {
            Bundle b = m16065b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private C9532b(Class<? extends Service> cls) {
            this.f21134a = cls;
        }
    }

    /* renamed from: jc.g$c */
    /* loaded from: classes3.dex */
    interface AbstractC9533c<T> {
        /* renamed from: a */
        List<String> mo16063a(T t);
    }

    C9530g(T t, AbstractC9533c<T> cVar) {
        this.f21132a = t;
        this.f21133b = cVar;
    }

    /* renamed from: c */
    public static C9530g<Context> m16068c(Context context, Class<? extends Service> cls) {
        return new C9530g<>(context, new C9532b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static AbstractC9535i m16067d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (AbstractC9535i.class.isAssignableFrom(cls)) {
                return (AbstractC9535i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C9553v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new C9553v(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new C9553v(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new C9553v(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new C9553v(String.format("Could not instantiate %s", str), e4);
        }
    }

    /* renamed from: b */
    public List<AbstractC13053b<AbstractC9535i>> m16069b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f21133b.mo16063a(this.f21132a)) {
            arrayList.add(new AbstractC13053b() { // from class: jc.f
                @Override // tc.AbstractC13053b
                public final Object get() {
                    AbstractC9535i d;
                    d = C9530g.m16067d(str);
                    return d;
                }
            });
        }
        return arrayList;
    }
}
