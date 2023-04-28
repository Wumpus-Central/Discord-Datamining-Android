package p382v7;

import java.io.IOException;
import p079e7.C6722k;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10534y;
import p228m7.C10533x;

/* renamed from: v7.a */
/* loaded from: classes7.dex */
public final class C13451a implements AbstractC10514i {

    /* renamed from: a */
    private final C6722k f30049a;

    /* renamed from: c */
    private AbstractC10500b0 f30051c;

    /* renamed from: e */
    private int f30053e;

    /* renamed from: f */
    private long f30054f;

    /* renamed from: g */
    private int f30055g;

    /* renamed from: h */
    private int f30056h;

    /* renamed from: b */
    private final C7570y f30050b = new C7570y(9);

    /* renamed from: d */
    private int f30052d = 0;

    public C13451a(C6722k kVar) {
        this.f30049a = kVar;
    }

    /* renamed from: c */
    private boolean m3651c(AbstractC10515j jVar) {
        this.f30050b.m22021L(8);
        if (!jVar.mo12935g(this.f30050b.m22012d(), 0, 8, true)) {
            return false;
        }
        if (this.f30050b.m22002n() == 1380139777) {
            this.f30053e = this.f30050b.m22029D();
            return true;
        }
        throw new IOException("Input not RawCC");
    }

    /* renamed from: f */
    private void m3650f(AbstractC10515j jVar) {
        while (this.f30055g > 0) {
            this.f30050b.m22021L(3);
            jVar.readFully(this.f30050b.m22012d(), 0, 3);
            this.f30051c.mo12386f(this.f30050b, 3);
            this.f30056h += 3;
            this.f30055g--;
        }
        int i = this.f30056h;
        if (i > 0) {
            this.f30051c.mo12382c(this.f30054f, 1, i, 0, null);
        }
    }

    /* renamed from: g */
    private boolean m3649g(AbstractC10515j jVar) {
        int i = this.f30053e;
        if (i == 0) {
            this.f30050b.m22021L(5);
            if (!jVar.mo12935g(this.f30050b.m22012d(), 0, 5, true)) {
                return false;
            }
            this.f30054f = (this.f30050b.m22027F() * 1000) / 45;
        } else if (i == 1) {
            this.f30050b.m22021L(9);
            if (!jVar.mo12935g(this.f30050b.m22012d(), 0, 9, true)) {
                return false;
            }
            this.f30054f = this.f30050b.m21993w();
        } else {
            throw new C6728o("Unsupported version number: " + this.f30053e);
        }
        this.f30055g = this.f30050b.m22029D();
        this.f30056h = 0;
        return true;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        this.f30052d = 0;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        kVar.mo7936j(new AbstractC10534y.C10536b(-9223372036854775807L));
        AbstractC10500b0 e = kVar.mo7937e(0, 3);
        this.f30051c = e;
        e.mo12388d(this.f30049a);
        kVar.mo7935s();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        this.f30050b.m22021L(8);
        jVar.mo12930n(this.f30050b.m22012d(), 0, 8);
        if (this.f30050b.m22002n() == 1380139777) {
            return true;
        }
        return false;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        C7510a.m22364h(this.f30051c);
        while (true) {
            int i = this.f30052d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m3650f(jVar);
                        this.f30052d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (m3649g(jVar)) {
                    this.f30052d = 2;
                } else {
                    this.f30052d = 0;
                    return -1;
                }
            } else if (!m3651c(jVar)) {
                return -1;
            } else {
                this.f30052d = 1;
            }
        }
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }
}
