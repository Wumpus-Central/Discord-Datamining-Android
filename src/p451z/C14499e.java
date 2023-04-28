package p451z;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC1874k;
import androidx.camera.core.AbstractC1883m;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1795c3;
import androidx.camera.core.C1813g1;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1936v2;
import androidx.core.util.AbstractC2511b;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p390w.AbstractC13571b0;
import p390w.AbstractC13579c0;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13662r0;
import p390w.AbstractC13688w;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13565a0;
import p410x.C13905a;

/* renamed from: z.e */
/* loaded from: classes.dex */
public final class C14499e implements AbstractC1874k {

    /* renamed from: k */
    private AbstractC13597g0 f32883k;

    /* renamed from: l */
    private final LinkedHashSet<AbstractC13597g0> f32884l;

    /* renamed from: m */
    private final AbstractC13579c0 f32885m;

    /* renamed from: n */
    private final AbstractC13702y2 f32886n;

    /* renamed from: o */
    private final C14501b f32887o;

    /* renamed from: q */
    private C1795c3 f32889q;

    /* renamed from: p */
    private final List<AbstractC1948w2> f32888p = new ArrayList();

    /* renamed from: r */
    private AbstractC13688w f32890r = C13565a0.m3342a();

    /* renamed from: s */
    private final Object f32891s = new Object();

    /* renamed from: t */
    private boolean f32892t = true;

    /* renamed from: u */
    private AbstractC13662r0 f32893u = null;

    /* renamed from: v */
    private List<AbstractC1948w2> f32894v = new ArrayList();

    /* renamed from: z.e$a */
    /* loaded from: classes.dex */
    public static final class C14500a extends Exception {
        public C14500a(String str) {
            super(str);
        }
    }

    /* renamed from: z.e$b */
    /* loaded from: classes.dex */
    public static final class C14501b {

        /* renamed from: a */
        private final List<String> f32895a = new ArrayList();

        C14501b(LinkedHashSet<AbstractC13597g0> linkedHashSet) {
            Iterator<AbstractC13597g0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f32895a.add(it.next().mo3265j().mo3297b());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C14501b) {
                return this.f32895a.equals(((C14501b) obj).f32895a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32895a.hashCode() * 53;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z.e$c */
    /* loaded from: classes.dex */
    public static class C14502c {

        /* renamed from: a */
        AbstractC13697x2<?> f32896a;

        /* renamed from: b */
        AbstractC13697x2<?> f32897b;

        C14502c(AbstractC13697x2<?> x2Var, AbstractC13697x2<?> x2Var2) {
            this.f32896a = x2Var;
            this.f32897b = x2Var2;
        }
    }

    public C14499e(LinkedHashSet<AbstractC13597g0> linkedHashSet, AbstractC13579c0 c0Var, AbstractC13702y2 y2Var) {
        this.f32883k = linkedHashSet.iterator().next();
        LinkedHashSet<AbstractC13597g0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f32884l = linkedHashSet2;
        this.f32887o = new C14501b(linkedHashSet2);
        this.f32885m = c0Var;
        this.f32886n = y2Var;
    }

    /* renamed from: A */
    private boolean m340A(List<AbstractC1948w2> list) {
        boolean z = false;
        boolean z2 = false;
        for (AbstractC1948w2 w2Var : list) {
            if (m337D(w2Var)) {
                z = true;
            } else if (m338C(w2Var)) {
                z2 = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private boolean m339B(List<AbstractC1948w2> list) {
        boolean z = false;
        boolean z2 = false;
        for (AbstractC1948w2 w2Var : list) {
            if (m337D(w2Var)) {
                z2 = true;
            } else if (m338C(w2Var)) {
                z = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private boolean m338C(AbstractC1948w2 w2Var) {
        return w2Var instanceof C1813g1;
    }

    /* renamed from: D */
    private boolean m337D(AbstractC1948w2 w2Var) {
        return w2Var instanceof C1770a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ void m336E(Surface surface, SurfaceTexture surfaceTexture, C1936v2.AbstractC1942f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ void m335F(C1936v2 v2Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(v2Var.m39470l().getWidth(), v2Var.m39470l().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        v2Var.m39460v(surface, C13905a.m2339a(), new AbstractC2511b() { // from class: z.d
            @Override // androidx.core.util.AbstractC2511b
            public final void accept(Object obj) {
                C14499e.m336E(surface, surfaceTexture, (C1936v2.AbstractC1942f) obj);
            }
        });
    }

    /* renamed from: H */
    private void m333H() {
        synchronized (this.f32891s) {
            if (this.f32893u != null) {
                this.f32883k.mo3269f().mo3339b(this.f32893u);
            }
        }
    }

    /* renamed from: J */
    private void m331J(Map<AbstractC1948w2, Size> map, Collection<AbstractC1948w2> collection) {
        boolean z;
        synchronized (this.f32891s) {
            if (this.f32889q != null) {
                if (this.f32883k.mo3265j().mo3296c().intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Map<AbstractC1948w2, Rect> a = C14511n.m299a(this.f32883k.mo3269f().mo3337d(), z, this.f32889q.m39808a(), this.f32883k.mo3265j().mo8419g(this.f32889q.m39806c()), this.f32889q.m39805d(), this.f32889q.m39807b(), map);
                for (AbstractC1948w2 w2Var : collection) {
                    w2Var.mo20566H((Rect) C2517g.m37588g(a.get(w2Var)));
                    w2Var.mo39442F(m320p(this.f32883k.mo3269f().mo3337d(), map.get(w2Var)));
                }
            }
        }
    }

    /* renamed from: n */
    private void m322n() {
        synchronized (this.f32891s) {
            AbstractC13571b0 f = this.f32883k.mo3269f();
            this.f32893u = f.mo3334g();
            f.mo3332i();
        }
    }

    /* renamed from: o */
    private List<AbstractC1948w2> m321o(List<AbstractC1948w2> list, List<AbstractC1948w2> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean B = m339B(list);
        boolean A = m340A(list);
        AbstractC1948w2 w2Var = null;
        AbstractC1948w2 w2Var2 = null;
        for (AbstractC1948w2 w2Var3 : list2) {
            if (m337D(w2Var3)) {
                w2Var = w2Var3;
            } else if (m338C(w2Var3)) {
                w2Var2 = w2Var3;
            }
        }
        if (B && w2Var == null) {
            arrayList.add(m317s());
        } else if (!B && w2Var != null) {
            arrayList.remove(w2Var);
        }
        if (A && w2Var2 == null) {
            arrayList.add(m318r());
        } else if (!A && w2Var2 != null) {
            arrayList.remove(w2Var2);
        }
        return arrayList;
    }

    /* renamed from: p */
    private static Matrix m320p(Rect rect, Size size) {
        boolean z;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        C2517g.m37593b(z, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: q */
    private Map<AbstractC1948w2, Size> m319q(AbstractC13589e0 e0Var, List<AbstractC1948w2> list, List<AbstractC1948w2> list2, Map<AbstractC1948w2, C14502c> map) {
        ArrayList arrayList = new ArrayList();
        String b = e0Var.mo3297b();
        HashMap hashMap = new HashMap();
        for (AbstractC1948w2 w2Var : list2) {
            arrayList.add(this.f32885m.mo3317a(b, w2Var.m39432h(), w2Var.m39437b()));
            hashMap.put(w2Var, w2Var.m39437b());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (AbstractC1948w2 w2Var2 : list) {
                C14502c cVar = map.get(w2Var2);
                hashMap2.put(w2Var2.m39425p(e0Var, cVar.f32896a, cVar.f32897b), w2Var2);
            }
            Map<AbstractC13697x2<?>, Size> b2 = this.f32885m.mo3316b(b, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((AbstractC1948w2) entry.getValue(), b2.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    /* renamed from: r */
    private C1813g1 m318r() {
        return new C1813g1.C1818e().m39728p("ImageCapture-Extra").m39739e();
    }

    /* renamed from: s */
    private C1770a2 m317s() {
        C1770a2 e = new C1770a2.C1772b().m39863n("Preview-Extra").m39872e();
        e.m39876T(new C1770a2.AbstractC1774d() { // from class: z.c
            @Override // androidx.camera.core.C1770a2.AbstractC1774d
            /* renamed from: a */
            public final void mo341a(C1936v2 v2Var) {
                C14499e.m335F(v2Var);
            }
        });
        return e;
    }

    /* renamed from: t */
    private void m316t(List<AbstractC1948w2> list) {
        synchronized (this.f32891s) {
            if (!list.isEmpty()) {
                this.f32883k.mo3266i(list);
                for (AbstractC1948w2 w2Var : list) {
                    if (this.f32888p.contains(w2Var)) {
                        w2Var.m39417y(this.f32883k);
                    } else {
                        C1915r1.m39525c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + w2Var);
                    }
                }
                this.f32888p.removeAll(list);
            }
        }
    }

    /* renamed from: v */
    public static C14501b m314v(LinkedHashSet<AbstractC13597g0> linkedHashSet) {
        return new C14501b(linkedHashSet);
    }

    /* renamed from: x */
    private Map<AbstractC1948w2, C14502c> m312x(List<AbstractC1948w2> list, AbstractC13702y2 y2Var, AbstractC13702y2 y2Var2) {
        HashMap hashMap = new HashMap();
        for (AbstractC1948w2 w2Var : list) {
            hashMap.put(w2Var, new C14502c(w2Var.mo20549g(false, y2Var), w2Var.mo20549g(true, y2Var2)));
        }
        return hashMap;
    }

    /* renamed from: z */
    private boolean m310z() {
        boolean z;
        synchronized (this.f32891s) {
            z = true;
            if (this.f32890r.mo3028n() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: G */
    public void m334G(Collection<AbstractC1948w2> collection) {
        synchronized (this.f32891s) {
            m316t(new ArrayList(collection));
            if (m310z()) {
                this.f32894v.removeAll(collection);
                try {
                    m324k(Collections.emptyList());
                } catch (C14500a unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    /* renamed from: I */
    public void m332I(C1795c3 c3Var) {
        synchronized (this.f32891s) {
            this.f32889q = c3Var;
        }
    }

    @Override // androidx.camera.core.AbstractC1874k
    /* renamed from: a */
    public AbstractC1911r mo330a() {
        return this.f32883k.mo3265j();
    }

    @Override // androidx.camera.core.AbstractC1874k
    /* renamed from: b */
    public AbstractC1883m mo329b() {
        return this.f32883k.mo3269f();
    }

    /* renamed from: d */
    public void m327d(AbstractC13688w wVar) {
        synchronized (this.f32891s) {
            if (wVar == null) {
                wVar = C13565a0.m3342a();
            }
            if (!this.f32888p.isEmpty() && !this.f32890r.mo3026z().equals(wVar.mo3026z())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f32890r = wVar;
            this.f32883k.mo3270d(wVar);
        }
    }

    /* renamed from: g */
    public void m325g(boolean z) {
        this.f32883k.mo3268g(z);
    }

    /* renamed from: k */
    public void m324k(Collection<AbstractC1948w2> collection) {
        synchronized (this.f32891s) {
            ArrayList<AbstractC1948w2> arrayList = new ArrayList();
            for (AbstractC1948w2 w2Var : collection) {
                if (this.f32888p.contains(w2Var)) {
                    C1915r1.m39527a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(w2Var);
                }
            }
            List<AbstractC1948w2> arrayList2 = new ArrayList<>(this.f32888p);
            List<AbstractC1948w2> emptyList = Collections.emptyList();
            List<AbstractC1948w2> emptyList2 = Collections.emptyList();
            if (m310z()) {
                arrayList2.removeAll(this.f32894v);
                arrayList2.addAll(arrayList);
                emptyList = m321o(arrayList2, new ArrayList<>(this.f32894v));
                ArrayList arrayList3 = new ArrayList(emptyList);
                arrayList3.removeAll(this.f32894v);
                arrayList.addAll(arrayList3);
                emptyList2 = new ArrayList<>(this.f32894v);
                emptyList2.removeAll(emptyList);
            }
            Map<AbstractC1948w2, C14502c> x = m312x(arrayList, this.f32890r.mo3029g(), this.f32886n);
            try {
                List<AbstractC1948w2> arrayList4 = new ArrayList<>(this.f32888p);
                arrayList4.removeAll(emptyList2);
                Map<AbstractC1948w2, Size> q = m319q(this.f32883k.mo3265j(), arrayList, arrayList4, x);
                m331J(q, collection);
                this.f32894v = emptyList;
                m316t(emptyList2);
                for (AbstractC1948w2 w2Var2 : arrayList) {
                    C14502c cVar = x.get(w2Var2);
                    w2Var2.m39419v(this.f32883k, cVar.f32896a, cVar.f32897b);
                    w2Var2.m39439J((Size) C2517g.m37588g(q.get(w2Var2)));
                }
                this.f32888p.addAll(arrayList);
                if (this.f32892t) {
                    this.f32883k.mo3267h(arrayList);
                }
                for (AbstractC1948w2 w2Var3 : arrayList) {
                    w2Var3.m39421t();
                }
            } catch (IllegalArgumentException e) {
                throw new C14500a(e.getMessage());
            }
        }
    }

    /* renamed from: m */
    public void m323m() {
        synchronized (this.f32891s) {
            if (!this.f32892t) {
                this.f32883k.mo3267h(this.f32888p);
                m333H();
                for (AbstractC1948w2 w2Var : this.f32888p) {
                    w2Var.m39421t();
                }
                this.f32892t = true;
            }
        }
    }

    /* renamed from: u */
    public void m315u() {
        synchronized (this.f32891s) {
            if (this.f32892t) {
                this.f32883k.mo3266i(new ArrayList(this.f32888p));
                m322n();
                this.f32892t = false;
            }
        }
    }

    /* renamed from: w */
    public C14501b m313w() {
        return this.f32887o;
    }

    /* renamed from: y */
    public List<AbstractC1948w2> m311y() {
        ArrayList arrayList;
        synchronized (this.f32891s) {
            arrayList = new ArrayList(this.f32888p);
        }
        return arrayList;
    }
}
