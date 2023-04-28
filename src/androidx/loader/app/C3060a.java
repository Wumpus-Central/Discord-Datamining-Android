package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.C2512c;
import androidx.lifecycle.AbstractC3055w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p290q1.C11962b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.loader.app.a */
/* loaded from: classes.dex */
public class C3060a extends LoaderManager {

    /* renamed from: c */
    static boolean f4495c = false;

    /* renamed from: a */
    private final LifecycleOwner f4496a;

    /* renamed from: b */
    private final C3062c f4497b;

    /* renamed from: androidx.loader.app.a$a */
    /* loaded from: classes.dex */
    public static class C0060a<D> extends MutableLiveData<D> implements C11962b.AbstractC11963a<D> {

        /* renamed from: l */
        private final int f4498l;

        /* renamed from: m */
        private final Bundle f4499m;

        /* renamed from: n */
        private final C11962b<D> f4500n;

        /* renamed from: o */
        private LifecycleOwner f4501o;

        /* renamed from: p */
        private C3061b<D> f4502p;

        /* renamed from: q */
        private C11962b<D> f4503q;

        C0060a(int i, Bundle bundle, C11962b<D> bVar, C11962b<D> bVar2) {
            this.f4498l = i;
            this.f4499m = bundle;
            this.f4500n = bVar;
            this.f4503q = bVar2;
            bVar.m8114q(i, this);
        }

        @Override // p290q1.C11962b.AbstractC11963a
        /* renamed from: a */
        public void mo8108a(C11962b<D> bVar, D d) {
            if (C3060a.f4495c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo35726o(d);
                return;
            }
            if (C3060a.f4495c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo35815m(d);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: k */
        protected void mo35729k() {
            if (C3060a.f4495c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4500n.m8111t();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: l */
        protected void mo35728l() {
            if (C3060a.f4495c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4500n.m8110u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: n */
        public void mo35727n(Observer<? super D> observer) {
            super.mo35727n(observer);
            this.f4501o = null;
            this.f4502p = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        /* renamed from: o */
        public void mo35726o(D d) {
            super.mo35726o(d);
            C11962b<D> bVar = this.f4503q;
            if (bVar != null) {
                bVar.m8113r();
                this.f4503q = null;
            }
        }

        /* renamed from: p */
        C11962b<D> m35725p(boolean z) {
            if (C3060a.f4495c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4500n.m8128b();
            this.f4500n.m8129a();
            C3061b<D> bVar = this.f4502p;
            if (bVar != null) {
                mo35727n(bVar);
                if (z) {
                    bVar.m35718d();
                }
            }
            this.f4500n.m8109v(this);
            if ((bVar == null || bVar.m35719c()) && !z) {
                return this.f4500n;
            }
            this.f4500n.m8113r();
            return this.f4503q;
        }

        /* renamed from: q */
        public void m35724q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4498l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4499m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4500n);
            C11962b<D> bVar = this.f4500n;
            bVar.mo8123g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4502p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4502p);
                C3061b<D> bVar2 = this.f4502p;
                bVar2.m35720b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m35723r().m8126d(mo8408f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m35822h());
        }

        /* renamed from: r */
        C11962b<D> m35723r() {
            return this.f4500n;
        }

        /* renamed from: s */
        void m35722s() {
            LifecycleOwner lifecycleOwner = this.f4501o;
            C3061b<D> bVar = this.f4502p;
            if (lifecycleOwner != null && bVar != null) {
                super.mo35727n(bVar);
                m35821i(lifecycleOwner, bVar);
            }
        }

        /* renamed from: t */
        C11962b<D> m35721t(LifecycleOwner lifecycleOwner, LoaderManager.AbstractC3059a<D> aVar) {
            C3061b<D> bVar = new C3061b<>(this.f4500n, aVar);
            m35821i(lifecycleOwner, bVar);
            C3061b<D> bVar2 = this.f4502p;
            if (bVar2 != null) {
                mo35727n(bVar2);
            }
            this.f4501o = lifecycleOwner;
            this.f4502p = bVar;
            return this.f4500n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4498l);
            sb2.append(" : ");
            C2512c.m37602a(this.f4500n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.a$b */
    /* loaded from: classes.dex */
    public static class C3061b<D> implements Observer<D> {

        /* renamed from: a */
        private final C11962b<D> f4504a;

        /* renamed from: b */
        private final LoaderManager.AbstractC3059a<D> f4505b;

        /* renamed from: c */
        private boolean f4506c = false;

        C3061b(C11962b<D> bVar, LoaderManager.AbstractC3059a<D> aVar) {
            this.f4504a = bVar;
            this.f4505b = aVar;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void mo3067a(D d) {
            if (C3060a.f4495c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4504a + ": " + this.f4504a.m8126d(d));
            }
            this.f4505b.mo29121a(this.f4504a, d);
            this.f4506c = true;
        }

        /* renamed from: b */
        public void m35720b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4506c);
        }

        /* renamed from: c */
        boolean m35719c() {
            return this.f4506c;
        }

        /* renamed from: d */
        void m35718d() {
            if (this.f4506c) {
                if (C3060a.f4495c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4504a);
                }
                this.f4505b.mo29120b(this.f4504a);
            }
        }

        public String toString() {
            return this.f4505b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.a$c */
    /* loaded from: classes.dex */
    public static class C3062c extends AbstractC3055w {

        /* renamed from: e */
        private static final ViewModelProvider.Factory f4507e = new C0061a();

        /* renamed from: c */
        private SparseArrayCompat<C0060a> f4508c = new SparseArrayCompat<>();

        /* renamed from: d */
        private boolean f4509d = false;

        /* renamed from: androidx.loader.app.a$c$a */
        /* loaded from: classes.dex */
        static class C0061a implements ViewModelProvider.Factory {
            C0061a() {
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            /* renamed from: a */
            public <T extends AbstractC3055w> T mo35708a(Class<T> cls) {
                return new C3062c();
            }
        }

        C3062c() {
        }

        /* renamed from: h */
        static C3062c m35714h(ViewModelStore viewModelStore) {
            return (C3062c) new ViewModelProvider(viewModelStore, f4507e).m35796a(C3062c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC3055w
        /* renamed from: d */
        public void mo35717d() {
            super.mo35717d();
            int m = this.f4508c.m39038m();
            for (int i = 0; i < m; i++) {
                this.f4508c.m39037n(i).m35725p(true);
            }
            this.f4508c.m39046c();
        }

        /* renamed from: f */
        public void m35716f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4508c.m39038m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f4508c.m39038m(); i++) {
                    C0060a n = this.f4508c.m39037n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4508c.m39040k(i));
                    printWriter.print(": ");
                    printWriter.println(n.toString());
                    n.m35724q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        void m35715g() {
            this.f4509d = false;
        }

        /* renamed from: i */
        <D> C0060a<D> m35713i(int i) {
            return this.f4508c.m39043f(i);
        }

        /* renamed from: j */
        boolean m35712j() {
            return this.f4509d;
        }

        /* renamed from: k */
        void m35711k() {
            int m = this.f4508c.m39038m();
            for (int i = 0; i < m; i++) {
                this.f4508c.m39037n(i).m35722s();
            }
        }

        /* renamed from: l */
        void m35710l(int i, C0060a aVar) {
            this.f4508c.m39039l(i, aVar);
        }

        /* renamed from: m */
        void m35709m() {
            this.f4509d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3060a(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f4496a = lifecycleOwner;
        this.f4497b = C3062c.m35714h(viewModelStore);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: e */
    private <D> C11962b<D> m35730e(int i, Bundle bundle, LoaderManager.AbstractC3059a<D> aVar, C11962b<D> bVar) {
        try {
            this.f4497b.m35709m();
            C11962b<D> c = aVar.mo29119c(i, bundle);
            if (c != null) {
                if (c.getClass().isMemberClass() && !Modifier.isStatic(c.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c);
                }
                C0060a aVar2 = new C0060a(i, bundle, c, bVar);
                if (f4495c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f4497b.m35710l(i, aVar2);
                this.f4497b.m35715g();
                return aVar2.m35721t(this.f4496a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f4497b.m35715g();
            throw th2;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    /* renamed from: a */
    public void mo35733a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4497b.m35716f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    /* renamed from: c */
    public <D> C11962b<D> mo35732c(int i, Bundle bundle, LoaderManager.AbstractC3059a<D> aVar) {
        if (this.f4497b.m35712j()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C0060a<D> i2 = this.f4497b.m35713i(i);
            if (f4495c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (i2 == null) {
                return m35730e(i, bundle, aVar, null);
            }
            if (f4495c) {
                Log.v("LoaderManager", "  Re-using existing loader " + i2);
            }
            return i2.m35721t(this.f4496a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    @Override // androidx.loader.app.LoaderManager
    /* renamed from: d */
    public void mo35731d() {
        this.f4497b.m35711k();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C2512c.m37602a(this.f4496a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
