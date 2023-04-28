package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ViewModelProvider {

    /* renamed from: a */
    private final Factory f4454a;

    /* renamed from: b */
    private final ViewModelStore f4455b;

    /* loaded from: classes.dex */
    public interface Factory {
        /* renamed from: a */
        <T extends AbstractC3055w> T mo35708a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.ViewModelProvider$a */
    /* loaded from: classes.dex */
    public static class C3022a extends C3024c {

        /* renamed from: c */
        private static C3022a f4456c;

        /* renamed from: b */
        private Application f4457b;

        public C3022a(Application application) {
            this.f4457b = application;
        }

        /* renamed from: c */
        public static C3022a m35794c(Application application) {
            if (f4456c == null) {
                f4456c = new C3022a(application);
            }
            return f4456c;
        }

        @Override // androidx.lifecycle.ViewModelProvider.C3024c, androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: a */
        public <T extends AbstractC3055w> T mo35708a(Class<T> cls) {
            if (!C3027a.class.isAssignableFrom(cls)) {
                return (T) super.mo35708a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f4457b);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ViewModelProvider$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3023b extends C3025d implements Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: a */
        public <T extends AbstractC3055w> T mo35708a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends AbstractC3055w> T mo35742c(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.ViewModelProvider$c */
    /* loaded from: classes.dex */
    public static class C3024c implements Factory {

        /* renamed from: a */
        private static C3024c f4458a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public static C3024c m35793b() {
            if (f4458a == null) {
                f4458a = new C3024c();
            }
            return f4458a;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: a */
        public <T extends AbstractC3055w> T mo35708a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ViewModelProvider$d */
    /* loaded from: classes.dex */
    public static class C3025d {
        C3025d() {
        }

        /* renamed from: b */
        void mo35743b(AbstractC3055w wVar) {
        }
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this.f4454a = factory;
        this.f4455b = viewModelStore;
    }

    /* renamed from: a */
    public <T extends AbstractC3055w> T m35796a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m35795b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC3055w> T m35795b(String str, Class<T> cls) {
        T t;
        T t2 = (T) this.f4455b.m35791b(str);
        if (cls.isInstance(t2)) {
            Factory factory = this.f4454a;
            if (factory instanceof C3025d) {
                ((C3025d) factory).mo35743b(t2);
            }
            return t2;
        }
        Factory factory2 = this.f4454a;
        if (factory2 instanceof AbstractC3023b) {
            t = (T) ((AbstractC3023b) factory2).mo35742c(str, cls);
        } else {
            t = (T) factory2.mo35708a(cls);
        }
        this.f4455b.m35789d(str, t);
        return t;
    }
}
