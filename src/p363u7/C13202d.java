package p363u7;

import android.net.Uri;
import java.util.Map;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.C10520n;
import p228m7.C10533x;

/* renamed from: u7.d */
/* loaded from: classes7.dex */
public class C13202d implements AbstractC10514i {

    /* renamed from: d */
    public static final AbstractC10521o f29613d = new AbstractC10521o() { // from class: u7.c
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] f;
            f = C13202d.m4346f();
            return f;
        }
    };

    /* renamed from: a */
    private AbstractC10516k f29614a;

    /* renamed from: b */
    private AbstractC13207i f29615b;

    /* renamed from: c */
    private boolean f29616c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ AbstractC10514i[] m4346f() {
        return new AbstractC10514i[]{new C13202d()};
    }

    /* renamed from: g */
    private static C7570y m4345g(C7570y yVar) {
        yVar.m22017P(0);
        return yVar;
    }

    /* renamed from: h */
    private boolean m4344h(AbstractC10515j jVar) {
        C13204f fVar = new C13204f();
        if (fVar.m4336b(jVar, true) && (fVar.f29623b & 2) == 2) {
            int min = Math.min(fVar.f29630i, 8);
            C7570y yVar = new C7570y(min);
            jVar.mo12930n(yVar.m22012d(), 0, min);
            if (C13199b.m4349p(m4345g(yVar))) {
                this.f29615b = new C13199b();
            } else if (C13211j.m4310r(m4345g(yVar))) {
                this.f29615b = new C13211j();
            } else if (C13206h.m4331o(m4345g(yVar))) {
                this.f29615b = new C13206h();
            }
            return true;
        }
        return false;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        AbstractC13207i iVar = this.f29615b;
        if (iVar != null) {
            iVar.m4322m(j, j2);
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f29614a = kVar;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        try {
            return m4344h(jVar);
        } catch (C6728o unused) {
            return false;
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        C7510a.m22364h(this.f29614a);
        if (this.f29615b == null) {
            if (m4344h(jVar)) {
                jVar.mo12936f();
            } else {
                throw new C6728o("Failed to determine bitstream type");
            }
        }
        if (!this.f29616c) {
            AbstractC10500b0 e = this.f29614a.mo7937e(0, 1);
            this.f29614a.mo7935s();
            this.f29615b.m4327d(this.f29614a, e);
            this.f29616c = true;
        }
        return this.f29615b.m4326g(jVar, xVar);
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }
}
