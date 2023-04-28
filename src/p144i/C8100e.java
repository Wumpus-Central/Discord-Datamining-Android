package p144i;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC2681o2;
import androidx.core.view.C2674n2;
import androidx.core.view.C2686p2;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: i.e */
/* loaded from: classes.dex */
public class C8100e {

    /* renamed from: c */
    private Interpolator f17524c;

    /* renamed from: d */
    AbstractC2681o2 f17525d;

    /* renamed from: e */
    private boolean f17526e;

    /* renamed from: b */
    private long f17523b = -1;

    /* renamed from: f */
    private final C2686p2 f17527f = new C8101a();

    /* renamed from: a */
    final ArrayList<C2674n2> f17522a = new ArrayList<>();

    /* renamed from: i.e$a */
    /* loaded from: classes.dex */
    class C8101a extends C2686p2 {

        /* renamed from: a */
        private boolean f17528a = false;

        /* renamed from: b */
        private int f17529b = 0;

        C8101a() {
        }

        @Override // androidx.core.view.AbstractC2681o2
        /* renamed from: b */
        public void mo20596b(View view) {
            int i = this.f17529b + 1;
            this.f17529b = i;
            if (i == C8100e.this.f17522a.size()) {
                AbstractC2681o2 o2Var = C8100e.this.f17525d;
                if (o2Var != null) {
                    o2Var.mo20596b(null);
                }
                m20594d();
            }
        }

        @Override // androidx.core.view.C2686p2, androidx.core.view.AbstractC2681o2
        /* renamed from: c */
        public void mo20595c(View view) {
            if (!this.f17528a) {
                this.f17528a = true;
                AbstractC2681o2 o2Var = C8100e.this.f17525d;
                if (o2Var != null) {
                    o2Var.mo20595c(null);
                }
            }
        }

        /* renamed from: d */
        void m20594d() {
            this.f17529b = 0;
            this.f17528a = false;
            C8100e.this.m20603b();
        }
    }

    /* renamed from: a */
    public void m20604a() {
        if (this.f17526e) {
            Iterator<C2674n2> it = this.f17522a.iterator();
            while (it.hasNext()) {
                it.next().m37171c();
            }
            this.f17526e = false;
        }
    }

    /* renamed from: b */
    void m20603b() {
        this.f17526e = false;
    }

    /* renamed from: c */
    public C8100e m20602c(C2674n2 n2Var) {
        if (!this.f17526e) {
            this.f17522a.add(n2Var);
        }
        return this;
    }

    /* renamed from: d */
    public C8100e m20601d(C2674n2 n2Var, C2674n2 n2Var2) {
        this.f17522a.add(n2Var);
        n2Var2.m37164j(n2Var.m37170d());
        this.f17522a.add(n2Var2);
        return this;
    }

    /* renamed from: e */
    public C8100e m20600e(long j) {
        if (!this.f17526e) {
            this.f17523b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C8100e m20599f(Interpolator interpolator) {
        if (!this.f17526e) {
            this.f17524c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C8100e m20598g(AbstractC2681o2 o2Var) {
        if (!this.f17526e) {
            this.f17525d = o2Var;
        }
        return this;
    }

    /* renamed from: h */
    public void m20597h() {
        if (!this.f17526e) {
            Iterator<C2674n2> it = this.f17522a.iterator();
            while (it.hasNext()) {
                C2674n2 next = it.next();
                long j = this.f17523b;
                if (j >= 0) {
                    next.m37168f(j);
                }
                Interpolator interpolator = this.f17524c;
                if (interpolator != null) {
                    next.m37167g(interpolator);
                }
                if (this.f17525d != null) {
                    next.m37166h(this.f17527f);
                }
                next.m37162l();
            }
            this.f17526e = true;
        }
    }
}
