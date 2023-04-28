package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.CloseGuard;
import androidx.core.util.C2517g;

/* renamed from: androidx.camera.core.impl.utils.f */
/* loaded from: classes.dex */
public final class C1842f {

    /* renamed from: a */
    private final AbstractC1844b f1790a;

    /* renamed from: androidx.camera.core.impl.utils.f$a */
    /* loaded from: classes.dex */
    static final class C1843a implements AbstractC1844b {

        /* renamed from: a */
        private final CloseGuard f1791a = new CloseGuard();

        C1843a() {
        }

        @Override // androidx.camera.core.impl.utils.C1842f.AbstractC1844b
        /* renamed from: a */
        public void mo39683a(String str) {
            this.f1791a.open(str);
        }

        @Override // androidx.camera.core.impl.utils.C1842f.AbstractC1844b
        /* renamed from: b */
        public void mo39682b() {
            this.f1791a.warnIfOpen();
        }

        @Override // androidx.camera.core.impl.utils.C1842f.AbstractC1844b
        public void close() {
            this.f1791a.close();
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.f$b */
    /* loaded from: classes.dex */
    private interface AbstractC1844b {
        /* renamed from: a */
        void mo39683a(String str);

        /* renamed from: b */
        void mo39682b();

        void close();
    }

    /* renamed from: androidx.camera.core.impl.utils.f$c */
    /* loaded from: classes.dex */
    static final class C1845c implements AbstractC1844b {
        C1845c() {
        }

        @Override // androidx.camera.core.impl.utils.C1842f.AbstractC1844b
        /* renamed from: a */
        public void mo39683a(String str) {
            C2517g.m37587h(str, "CloseMethodName must not be null.");
        }

        @Override // androidx.camera.core.impl.utils.C1842f.AbstractC1844b
        /* renamed from: b */
        public void mo39682b() {
        }

        @Override // androidx.camera.core.impl.utils.C1842f.AbstractC1844b
        public void close() {
        }
    }

    private C1842f(AbstractC1844b bVar) {
        this.f1790a = bVar;
    }

    /* renamed from: b */
    public static C1842f m39686b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new C1842f(new C1843a());
        }
        return new C1842f(new C1845c());
    }

    /* renamed from: a */
    public void m39687a() {
        this.f1790a.close();
    }

    /* renamed from: c */
    public void m39685c(String str) {
        this.f1790a.mo39683a(str);
    }

    /* renamed from: d */
    public void m39684d() {
        this.f1790a.mo39682b();
    }
}
