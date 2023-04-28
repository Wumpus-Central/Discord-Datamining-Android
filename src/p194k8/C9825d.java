package p194k8;

import android.util.SparseArray;
import p079e7.C6722k;
import p081e9.AbstractC6774h;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7570y;
import p194k8.AbstractC9828f;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10534y;
import p228m7.C10498a0;
import p228m7.C10504d;
import p228m7.C10513h;
import p228m7.C10533x;

/* renamed from: k8.d */
/* loaded from: classes7.dex */
public final class C9825d implements AbstractC10516k, AbstractC9828f {

    /* renamed from: t */
    private static final C10533x f21870t = new C10533x();

    /* renamed from: k */
    private final AbstractC10514i f21871k;

    /* renamed from: l */
    private final int f21872l;

    /* renamed from: m */
    private final C6722k f21873m;

    /* renamed from: n */
    private final SparseArray<C9826a> f21874n = new SparseArray<>();

    /* renamed from: o */
    private boolean f21875o;

    /* renamed from: p */
    private AbstractC9828f.AbstractC9829a f21876p;

    /* renamed from: q */
    private long f21877q;

    /* renamed from: r */
    private AbstractC10534y f21878r;

    /* renamed from: s */
    private C6722k[] f21879s;

    /* renamed from: k8.d$a */
    /* loaded from: classes7.dex */
    private static final class C9826a implements AbstractC10500b0 {

        /* renamed from: a */
        private final int f21880a;

        /* renamed from: b */
        private final int f21881b;

        /* renamed from: c */
        private final C6722k f21882c;

        /* renamed from: d */
        private final C10513h f21883d = new C10513h();

        /* renamed from: e */
        public C6722k f21884e;

        /* renamed from: f */
        private AbstractC10500b0 f21885f;

        /* renamed from: g */
        private long f21886g;

        public C9826a(int i, int i2, C6722k kVar) {
            this.f21880a = i;
            this.f21881b = i2;
            this.f21882c = kVar;
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: a */
        public int mo12390a(AbstractC6774h hVar, int i, boolean z, int i2) {
            return ((AbstractC10500b0) C7557q0.m22145j(this.f21885f)).mo12387e(hVar, i, z);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: b */
        public void mo12389b(C7570y yVar, int i, int i2) {
            ((AbstractC10500b0) C7557q0.m22145j(this.f21885f)).mo12386f(yVar, i);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: c */
        public void mo12382c(long j, int i, int i2, int i3, AbstractC10500b0.C10501a aVar) {
            long j2 = this.f21886g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f21885f = this.f21883d;
            }
            ((AbstractC10500b0) C7557q0.m22145j(this.f21885f)).mo12382c(j, i, i2, i3, aVar);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: d */
        public void mo12388d(C6722k kVar) {
            C6722k kVar2 = this.f21882c;
            if (kVar2 != null) {
                kVar = kVar.m24526j(kVar2);
            }
            this.f21884e = kVar;
            ((AbstractC10500b0) C7557q0.m22145j(this.f21885f)).mo12388d(this.f21884e);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: e */
        public /* synthetic */ int mo12387e(AbstractC6774h hVar, int i, boolean z) {
            return C10498a0.m13009a(this, hVar, i, z);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: f */
        public /* synthetic */ void mo12386f(C7570y yVar, int i) {
            C10498a0.m13008b(this, yVar, i);
        }

        /* renamed from: g */
        public void m15257g(AbstractC9828f.AbstractC9829a aVar, long j) {
            if (aVar == null) {
                this.f21885f = this.f21883d;
                return;
            }
            this.f21886g = j;
            AbstractC10500b0 e = aVar.mo15248e(this.f21880a, this.f21881b);
            this.f21885f = e;
            C6722k kVar = this.f21884e;
            if (kVar != null) {
                e.mo12388d(kVar);
            }
        }
    }

    public C9825d(AbstractC10514i iVar, int i, C6722k kVar) {
        this.f21871k = iVar;
        this.f21872l = i;
        this.f21873m = kVar;
    }

    @Override // p194k8.AbstractC9828f
    /* renamed from: a */
    public boolean mo15252a(AbstractC10515j jVar) {
        boolean z;
        int e = this.f21871k.mo2224e(jVar, f21870t);
        if (e != 1) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (e == 0) {
            return true;
        }
        return false;
    }

    @Override // p194k8.AbstractC9828f
    /* renamed from: b */
    public void mo15251b(AbstractC9828f.AbstractC9829a aVar, long j, long j2) {
        this.f21876p = aVar;
        this.f21877q = j2;
        if (!this.f21875o) {
            this.f21871k.mo2227b(this);
            if (j != -9223372036854775807L) {
                this.f21871k.mo2228a(0L, j);
            }
            this.f21875o = true;
            return;
        }
        AbstractC10514i iVar = this.f21871k;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        iVar.mo2228a(0L, j);
        for (int i = 0; i < this.f21874n.size(); i++) {
            this.f21874n.valueAt(i).m15257g(aVar, j2);
        }
    }

    @Override // p194k8.AbstractC9828f
    /* renamed from: c */
    public C10504d mo15250c() {
        AbstractC10534y yVar = this.f21878r;
        if (yVar instanceof C10504d) {
            return (C10504d) yVar;
        }
        return null;
    }

    @Override // p194k8.AbstractC9828f
    /* renamed from: d */
    public C6722k[] mo15249d() {
        return this.f21879s;
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: e */
    public AbstractC10500b0 mo7937e(int i, int i2) {
        boolean z;
        C6722k kVar;
        C9826a aVar = this.f21874n.get(i);
        if (aVar == null) {
            if (this.f21879s == null) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            if (i2 == this.f21872l) {
                kVar = this.f21873m;
            } else {
                kVar = null;
            }
            aVar = new C9826a(i, i2, kVar);
            aVar.m15257g(this.f21876p, this.f21877q);
            this.f21874n.put(i, aVar);
        }
        return aVar;
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: j */
    public void mo7936j(AbstractC10534y yVar) {
        this.f21878r = yVar;
    }

    @Override // p194k8.AbstractC9828f
    public void release() {
        this.f21871k.release();
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: s */
    public void mo7935s() {
        C6722k[] kVarArr = new C6722k[this.f21874n.size()];
        for (int i = 0; i < this.f21874n.size(); i++) {
            kVarArr[i] = (C6722k) C7510a.m22364h(this.f21874n.valueAt(i).f21884e);
        }
        this.f21879s = kVarArr;
    }
}
