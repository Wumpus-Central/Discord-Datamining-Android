package p188k2;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p126h2.C7742c;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.a */
/* loaded from: classes.dex */
public abstract class AbstractC9721a<K, A> {

    /* renamed from: c */
    private final AbstractC9724d<K> f21608c;

    /* renamed from: e */
    protected C13180c<A> f21610e;

    /* renamed from: a */
    final List<AbstractC9722b> f21606a = new ArrayList(1);

    /* renamed from: b */
    private boolean f21607b = false;

    /* renamed from: d */
    protected float f21609d = 0.0f;

    /* renamed from: f */
    private A f21611f = null;

    /* renamed from: g */
    private float f21612g = -1.0f;

    /* renamed from: h */
    private float f21613h = -1.0f;

    /* renamed from: k2.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC9722b {
        /* renamed from: a */
        void mo9524a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k2.a$c */
    /* loaded from: classes.dex */
    public static final class C9723c<T> implements AbstractC9724d<T> {
        private C9723c() {
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: a */
        public boolean mo15501a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: b */
        public C13178a<T> mo15500b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: c */
        public boolean mo15499c(float f) {
            return false;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: d */
        public float mo15498d() {
            return 0.0f;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: e */
        public float mo15497e() {
            return 1.0f;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k2.a$d */
    /* loaded from: classes.dex */
    public interface AbstractC9724d<T> {
        /* renamed from: a */
        boolean mo15501a(float f);

        /* renamed from: b */
        C13178a<T> mo15500b();

        /* renamed from: c */
        boolean mo15499c(float f);

        /* renamed from: d */
        float mo15498d();

        /* renamed from: e */
        float mo15497e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k2.a$e */
    /* loaded from: classes.dex */
    public static final class C9725e<T> implements AbstractC9724d<T> {

        /* renamed from: a */
        private final List<? extends C13178a<T>> f21614a;

        /* renamed from: c */
        private C13178a<T> f21616c = null;

        /* renamed from: d */
        private float f21617d = -1.0f;

        /* renamed from: b */
        private C13178a<T> f21615b = m15502f(0.0f);

        C9725e(List<? extends C13178a<T>> list) {
            this.f21614a = list;
        }

        /* renamed from: f */
        private C13178a<T> m15502f(float f) {
            List<? extends C13178a<T>> list = this.f21614a;
            C13178a<T> aVar = (C13178a) list.get(list.size() - 1);
            if (f >= aVar.m4415e()) {
                return aVar;
            }
            for (int size = this.f21614a.size() - 2; size >= 1; size--) {
                C13178a<T> aVar2 = (C13178a) this.f21614a.get(size);
                if (this.f21615b != aVar2 && aVar2.m4419a(f)) {
                    return aVar2;
                }
            }
            return (C13178a) this.f21614a.get(0);
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: a */
        public boolean mo15501a(float f) {
            C13178a<T> aVar = this.f21616c;
            C13178a<T> aVar2 = this.f21615b;
            if (aVar == aVar2 && this.f21617d == f) {
                return true;
            }
            this.f21616c = aVar2;
            this.f21617d = f;
            return false;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: b */
        public C13178a<T> mo15500b() {
            return this.f21615b;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: c */
        public boolean mo15499c(float f) {
            if (this.f21615b.m4419a(f)) {
                return !this.f21615b.m4412h();
            }
            this.f21615b = m15502f(f);
            return true;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: d */
        public float mo15498d() {
            return ((C13178a) this.f21614a.get(0)).m4415e();
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: e */
        public float mo15497e() {
            List<? extends C13178a<T>> list = this.f21614a;
            return ((C13178a) list.get(list.size() - 1)).m4418b();
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k2.a$f */
    /* loaded from: classes.dex */
    public static final class C9726f<T> implements AbstractC9724d<T> {

        /* renamed from: a */
        private final C13178a<T> f21618a;

        /* renamed from: b */
        private float f21619b = -1.0f;

        C9726f(List<? extends C13178a<T>> list) {
            this.f21618a = (C13178a) list.get(0);
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: a */
        public boolean mo15501a(float f) {
            if (this.f21619b == f) {
                return true;
            }
            this.f21619b = f;
            return false;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: b */
        public C13178a<T> mo15500b() {
            return this.f21618a;
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: c */
        public boolean mo15499c(float f) {
            return !this.f21618a.m4412h();
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: d */
        public float mo15498d() {
            return this.f21618a.m4415e();
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        /* renamed from: e */
        public float mo15497e() {
            return this.f21618a.m4418b();
        }

        @Override // p188k2.AbstractC9721a.AbstractC9724d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9721a(List<? extends C13178a<K>> list) {
        this.f21608c = m15503o(list);
    }

    /* renamed from: g */
    private float m15506g() {
        if (this.f21612g == -1.0f) {
            this.f21612g = this.f21608c.mo15498d();
        }
        return this.f21612g;
    }

    /* renamed from: o */
    private static <T> AbstractC9724d<T> m15503o(List<? extends C13178a<T>> list) {
        if (list.isEmpty()) {
            return new C9723c();
        }
        if (list.size() == 1) {
            return new C9726f(list);
        }
        return new C9725e(list);
    }

    /* renamed from: a */
    public void m15511a(AbstractC9722b bVar) {
        this.f21606a.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C13178a<K> m15510b() {
        C7742c.m21543a("BaseKeyframeAnimation#getCurrentKeyframe");
        C13178a<K> b = this.f21608c.mo15500b();
        C7742c.m21542b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b;
    }

    /* renamed from: c */
    float mo15450c() {
        if (this.f21613h == -1.0f) {
            this.f21613h = this.f21608c.mo15497e();
        }
        return this.f21613h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public float m15509d() {
        C13178a<K> b = m15510b();
        if (b == null || b.m4412h()) {
            return 0.0f;
        }
        return b.f29542d.getInterpolation(m15508e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m15508e() {
        if (this.f21607b) {
            return 0.0f;
        }
        C13178a<K> b = m15510b();
        if (b.m4412h()) {
            return 0.0f;
        }
        return (this.f21609d - b.m4415e()) / (b.m4418b() - b.m4415e());
    }

    /* renamed from: f */
    public float m15507f() {
        return this.f21609d;
    }

    /* renamed from: h */
    public A mo15449h() {
        A a;
        float e = m15508e();
        if (this.f21610e == null && this.f21608c.mo15501a(e)) {
            return this.f21611f;
        }
        C13178a<K> b = m15510b();
        Interpolator interpolator = b.f29543e;
        if (interpolator == null || b.f29544f == null) {
            a = mo15448i(b, m15509d());
        } else {
            a = mo15473j(b, e, interpolator.getInterpolation(e), b.f29544f.getInterpolation(e));
        }
        this.f21611f = a;
        return a;
    }

    /* renamed from: i */
    abstract A mo15448i(C13178a<K> aVar, float f);

    /* renamed from: j */
    protected A mo15473j(C13178a<K> aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo15447k() {
        for (int i = 0; i < this.f21606a.size(); i++) {
            this.f21606a.get(i).mo9524a();
        }
    }

    /* renamed from: l */
    public void m15505l() {
        this.f21607b = true;
    }

    /* renamed from: m */
    public void mo15446m(float f) {
        if (!this.f21608c.isEmpty()) {
            if (f < m15506g()) {
                f = m15506g();
            } else if (f > mo15450c()) {
                f = mo15450c();
            }
            if (f != this.f21609d) {
                this.f21609d = f;
                if (this.f21608c.mo15499c(f)) {
                    mo15447k();
                }
            }
        }
    }

    /* renamed from: n */
    public void m15504n(C13180c<A> cVar) {
        C13180c<A> cVar2 = this.f21610e;
        if (cVar2 != null) {
            cVar2.m4401c(null);
        }
        this.f21610e = cVar;
        if (cVar != null) {
            cVar.m4401c(this);
        }
    }
}
