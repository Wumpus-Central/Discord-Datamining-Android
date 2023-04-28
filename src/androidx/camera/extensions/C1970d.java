package androidx.camera.extensions;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.AbstractC1906q;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1917s;
import androidx.camera.core.C1921t;
import androidx.camera.extensions.C1967b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p072e0.AbstractC6537j;
import p072e0.AbstractC6547n;
import p072e0.AbstractC6548o;
import p072e0.C6530e;
import p072e0.C6532g;
import p072e0.C6540k;
import p110g0.C7388a;
import p390w.AbstractC13586d1;
import p390w.AbstractC13630l2;
import p390w.AbstractC13688w;
import p390w.AbstractC13706z;
import p390w.C13581c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.extensions.d */
/* loaded from: classes.dex */
public final class C1970d {

    /* renamed from: b */
    private static final C7388a f2093b = new C7388a();

    /* renamed from: a */
    private final AbstractC1917s f2094a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.extensions.d$a */
    /* loaded from: classes.dex */
    public static class C1971a implements AbstractC6547n {
        C1971a() {
        }

        @Override // p072e0.AbstractC6547n
        /* renamed from: a */
        public List<Pair<Integer, Size[]>> mo25339a() {
            return Collections.emptyList();
        }

        @Override // p072e0.AbstractC6547n
        /* renamed from: b */
        public List<Pair<Integer, Size[]>> mo25338b() {
            return Collections.emptyList();
        }

        @Override // p072e0.AbstractC6547n
        /* renamed from: c */
        public AbstractC13630l2 mo25337c(Context context) {
            return null;
        }

        @Override // p072e0.AbstractC6547n
        /* renamed from: d */
        public boolean mo25336d(String str, Map<String, CameraCharacteristics> map) {
            return false;
        }

        @Override // p072e0.AbstractC6547n
        /* renamed from: e */
        public void mo25335e(AbstractC1911r rVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1970d(AbstractC1917s sVar) {
        this.f2094a = sVar;
    }

    /* renamed from: b */
    private static String m39386b(int i) {
        if (i == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    /* renamed from: d */
    private static AbstractC1906q m39384d(int i) {
        return new C1966a(m39386b(i), m39383e(i));
    }

    /* renamed from: e */
    private static AbstractC6547n m39383e(int i) {
        boolean g = m39381g();
        if (g) {
            return new C1971a();
        }
        if (f2093b.m22759a(g)) {
            return new C1971a();
        }
        if (g) {
            return new C6530e(i);
        }
        return new C6532g(i);
    }

    /* renamed from: f */
    private static void m39382f(final int i) {
        final AbstractC13586d1 a = AbstractC13586d1.m3304a(m39386b(i));
        if (C13581c1.m3313b(a) == AbstractC13706z.f30602a) {
            C13581c1.m3314a(a, new AbstractC13706z() { // from class: androidx.camera.extensions.c
                @Override // p390w.AbstractC13706z
                /* renamed from: a */
                public final AbstractC13688w mo2992a(AbstractC1911r rVar, Context context) {
                    AbstractC13688w i2;
                    i2 = C1970d.m39379i(i, a, rVar, context);
                    return i2;
                }
            });
        }
    }

    /* renamed from: g */
    private static boolean m39381g() {
        if (AbstractC6537j.m25351b().compareTo(AbstractC6548o.f13721m) < 0) {
            return false;
        }
        return AbstractC6537j.m25350d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ AbstractC13688w m39379i(int i, AbstractC13586d1 d1Var, AbstractC1911r rVar, Context context) {
        AbstractC6547n e = m39383e(i);
        e.mo25335e(rVar);
        C1967b.C1968a e2 = new C1967b.C1968a().m39391c(i).m39388f(new C6540k(i, e, context)).m39392b(d1Var).m39389e(1);
        AbstractC13630l2 c = e.mo25337c(context);
        if (c != null) {
            e2.m39390d(c);
        }
        return e2.m39393a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C1921t m39385c(C1921t tVar, int i) {
        if (m39380h(tVar, i)) {
            Iterator<AbstractC1906q> it = tVar.m39513c().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C1966a) {
                    throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
                }
            }
            m39382f(i);
            C1921t.C1922a c = C1921t.C1922a.m39508c(tVar);
            c.m39510a(m39384d(i));
            return c.m39509b();
        }
        throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m39380h(C1921t tVar, int i) {
        C1921t.C1922a c = C1921t.C1922a.m39508c(tVar);
        c.m39510a(m39384d(i));
        return !c.m39509b().m39514b(this.f2094a.mo39352a()).isEmpty();
    }
}
