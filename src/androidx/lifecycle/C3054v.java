package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.savedstate.AbstractC3156b;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public final class C3054v extends ViewModelProvider.AbstractC3023b {

    /* renamed from: f */
    private static final Class<?>[] f4486f = {Application.class, C3052u.class};

    /* renamed from: g */
    private static final Class<?>[] f4487g = {C3052u.class};

    /* renamed from: a */
    private final Application f4488a;

    /* renamed from: b */
    private final ViewModelProvider.Factory f4489b;

    /* renamed from: c */
    private final Bundle f4490c;

    /* renamed from: d */
    private final Lifecycle f4491d;

    /* renamed from: e */
    private final SavedStateRegistry f4492e;

    @SuppressLint({"LambdaLast"})
    public C3054v(Application application, AbstractC3156b bVar, Bundle bundle) {
        ViewModelProvider.Factory factory;
        this.f4492e = bVar.getSavedStateRegistry();
        this.f4491d = bVar.getLifecycle();
        this.f4490c = bundle;
        this.f4488a = application;
        if (application != null) {
            factory = ViewModelProvider.C3022a.m35794c(application);
        } else {
            factory = ViewModelProvider.C3024c.m35793b();
        }
        this.f4489b = factory;
    }

    /* renamed from: d */
    private static <T> Constructor<T> m35741d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AbstractC3023b, androidx.lifecycle.ViewModelProvider.Factory
    /* renamed from: a */
    public <T extends AbstractC3055w> T mo35708a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo35742c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.C3025d
    /* renamed from: b */
    void mo35743b(AbstractC3055w wVar) {
        SavedStateHandleController.m35802a(wVar, this.f4492e, this.f4491d);
    }

    @Override // androidx.lifecycle.ViewModelProvider.AbstractC3023b
    /* renamed from: c */
    public <T extends AbstractC3055w> T mo35742c(String str, Class<T> cls) {
        Constructor constructor;
        T t;
        boolean isAssignableFrom = C3027a.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.f4488a == null) {
            constructor = m35741d(cls, f4487g);
        } else {
            constructor = m35741d(cls, f4486f);
        }
        if (constructor == null) {
            return (T) this.f4489b.mo35708a(cls);
        }
        SavedStateHandleController d = SavedStateHandleController.m35800d(this.f4492e, this.f4491d, str, this.f4490c);
        if (isAssignableFrom) {
            try {
                Application application = this.f4488a;
                if (application != null) {
                    t = (T) ((AbstractC3055w) constructor.newInstance(application, d.m35799e()));
                    t.m35737e("androidx.lifecycle.savedstate.vm.tag", d);
                    return t;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        }
        t = (T) ((AbstractC3055w) constructor.newInstance(d.m35799e()));
        t.m35737e("androidx.lifecycle.savedstate.vm.tag", d);
        return t;
    }
}
