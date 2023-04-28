package p390w;

import android.graphics.Rect;
import androidx.camera.core.AbstractC1883m;
import androidx.camera.core.C1811g0;
import androidx.camera.core.C1829h0;
import java.util.Collections;
import java.util.List;
import p120gc.AbstractFutureC7576b;
import p431y.C14186f;

/* renamed from: w.b0 */
/* loaded from: classes.dex */
public interface AbstractC13571b0 extends AbstractC1883m {

    /* renamed from: a */
    public static final AbstractC13571b0 f30362a = new C13572a();

    /* renamed from: w.b0$a */
    /* loaded from: classes.dex */
    class C13572a implements AbstractC13571b0 {
        C13572a() {
        }

        @Override // p390w.AbstractC13571b0
        /* renamed from: a */
        public AbstractFutureC7576b<List<Void>> mo3340a(List<C13639n0> list, int i, int i2) {
            return C14186f.m1421h(Collections.emptyList());
        }

        @Override // p390w.AbstractC13571b0
        /* renamed from: b */
        public void mo3339b(AbstractC13662r0 r0Var) {
        }

        @Override // androidx.camera.core.AbstractC1883m
        /* renamed from: c */
        public AbstractFutureC7576b<Void> mo3338c(float f) {
            return C14186f.m1421h(null);
        }

        @Override // p390w.AbstractC13571b0
        /* renamed from: d */
        public Rect mo3337d() {
            return new Rect();
        }

        @Override // p390w.AbstractC13571b0
        /* renamed from: e */
        public void mo3336e(int i) {
        }

        @Override // androidx.camera.core.AbstractC1883m
        /* renamed from: f */
        public AbstractFutureC7576b<Void> mo3335f(boolean z) {
            return C14186f.m1421h(null);
        }

        @Override // p390w.AbstractC13571b0
        /* renamed from: g */
        public AbstractC13662r0 mo3334g() {
            return null;
        }

        @Override // androidx.camera.core.AbstractC1883m
        /* renamed from: h */
        public AbstractFutureC7576b<C1829h0> mo3333h(C1811g0 g0Var) {
            return C14186f.m1421h(C1829h0.m39703b());
        }

        @Override // p390w.AbstractC13571b0
        /* renamed from: i */
        public void mo3332i() {
        }
    }

    /* renamed from: w.b0$b */
    /* loaded from: classes.dex */
    public static final class C13573b extends Exception {

        /* renamed from: k */
        private C13632m f30363k;

        public C13573b(C13632m mVar) {
            this.f30363k = mVar;
        }
    }

    /* renamed from: w.b0$c */
    /* loaded from: classes.dex */
    public interface AbstractC13574c {
        /* renamed from: a */
        void mo3331a();

        /* renamed from: b */
        void mo3330b(List<C13639n0> list);
    }

    /* renamed from: a */
    AbstractFutureC7576b<List<Void>> mo3340a(List<C13639n0> list, int i, int i2);

    /* renamed from: b */
    void mo3339b(AbstractC13662r0 r0Var);

    /* renamed from: d */
    Rect mo3337d();

    /* renamed from: e */
    void mo3336e(int i);

    /* renamed from: g */
    AbstractC13662r0 mo3334g();

    /* renamed from: i */
    void mo3332i();
}
