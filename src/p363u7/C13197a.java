package p363u7;

import java.io.EOFException;
import java.io.IOException;
import p119g9.C7510a;
import p119g9.C7557q0;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10534y;
import p228m7.C10537z;

/* renamed from: u7.a */
/* loaded from: classes7.dex */
final class C13197a implements AbstractC13205g {

    /* renamed from: a */
    private final C13204f f29594a;

    /* renamed from: b */
    private final long f29595b;

    /* renamed from: c */
    private final long f29596c;

    /* renamed from: d */
    private final AbstractC13207i f29597d;

    /* renamed from: e */
    private int f29598e;

    /* renamed from: f */
    private long f29599f;

    /* renamed from: g */
    private long f29600g;

    /* renamed from: h */
    private long f29601h;

    /* renamed from: i */
    private long f29602i;

    /* renamed from: j */
    private long f29603j;

    /* renamed from: k */
    private long f29604k;

    /* renamed from: l */
    private long f29605l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u7.a$b */
    /* loaded from: classes7.dex */
    public final class C13198b implements AbstractC10534y {
        private C13198b() {
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: f */
        public AbstractC10534y.C10535a mo2208f(long j) {
            return new AbstractC10534y.C10535a(new C10537z(j, C7557q0.m22127s((C13197a.this.f29595b + ((C13197a.this.f29597d.m4328c(j) * (C13197a.this.f29596c - C13197a.this.f29595b)) / C13197a.this.f29599f)) - 30000, C13197a.this.f29595b, C13197a.this.f29596c - 1)));
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: h */
        public boolean mo2207h() {
            return true;
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: i */
        public long mo2206i() {
            return C13197a.this.f29597d.m4329b(C13197a.this.f29599f);
        }
    }

    public C13197a(AbstractC13207i iVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j < 0 || j2 <= j) {
            z2 = false;
        } else {
            z2 = true;
        }
        C7510a.m22371a(z2);
        this.f29597d = iVar;
        this.f29595b = j;
        this.f29596c = j2;
        if (j3 == j2 - j || z) {
            this.f29599f = j4;
            this.f29598e = 4;
        } else {
            this.f29598e = 0;
        }
        this.f29594a = new C13204f();
    }

    /* renamed from: i */
    private long m4354i(AbstractC10515j jVar) {
        long j;
        if (this.f29602i == this.f29603j) {
            return -1L;
        }
        long position = jVar.getPosition();
        if (!this.f29594a.m4333e(jVar, this.f29603j)) {
            long j2 = this.f29602i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f29594a.m4336b(jVar, false);
        jVar.mo12936f();
        long j3 = this.f29601h;
        C13204f fVar = this.f29594a;
        long j4 = fVar.f29624c;
        long j5 = j3 - j4;
        int i = fVar.f29629h + fVar.f29630i;
        if (0 <= j5 && j5 < 72000) {
            return -1L;
        }
        int i2 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
        if (i2 < 0) {
            this.f29603j = position;
            this.f29605l = j4;
        } else {
            this.f29602i = jVar.getPosition() + i;
            this.f29604k = this.f29594a.f29624c;
        }
        long j6 = this.f29603j;
        long j7 = this.f29602i;
        if (j6 - j7 < 100000) {
            this.f29603j = j7;
            return j7;
        }
        long j8 = i;
        if (i2 <= 0) {
            j = 2;
        } else {
            j = 1;
        }
        long position2 = jVar.getPosition() - (j8 * j);
        long j9 = this.f29603j;
        long j10 = this.f29602i;
        return C7557q0.m22127s(position2 + ((j5 * (j9 - j10)) / (this.f29605l - this.f29604k)), j10, j9 - 1);
    }

    /* renamed from: k */
    private void m4352k(AbstractC10515j jVar) {
        while (true) {
            this.f29594a.m4334d(jVar);
            this.f29594a.m4336b(jVar, false);
            C13204f fVar = this.f29594a;
            if (fVar.f29624c > this.f29601h) {
                jVar.mo12936f();
                return;
            }
            jVar.mo12932k(fVar.f29629h + fVar.f29630i);
            this.f29602i = jVar.getPosition();
            this.f29604k = this.f29594a.f29624c;
        }
    }

    @Override // p363u7.AbstractC13205g
    /* renamed from: a */
    public long mo4321a(AbstractC10515j jVar) {
        int i = this.f29598e;
        if (i == 0) {
            long position = jVar.getPosition();
            this.f29600g = position;
            this.f29598e = 1;
            long j = this.f29596c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = m4354i(jVar);
                if (i2 != -1) {
                    return i2;
                }
                this.f29598e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m4352k(jVar);
            this.f29598e = 4;
            return -(this.f29604k + 2);
        }
        this.f29599f = m4353j(jVar);
        this.f29598e = 4;
        return this.f29600g;
    }

    @Override // p363u7.AbstractC13205g
    /* renamed from: c */
    public void mo4319c(long j) {
        this.f29601h = C7557q0.m22127s(j, 0L, this.f29599f - 1);
        this.f29598e = 2;
        this.f29602i = this.f29595b;
        this.f29603j = this.f29596c;
        this.f29604k = 0L;
        this.f29605l = this.f29599f;
    }

    /* renamed from: h */
    public C13198b mo4320b() {
        if (this.f29599f != 0) {
            return new C13198b();
        }
        return null;
    }

    /* renamed from: j */
    long m4353j(AbstractC10515j jVar) {
        this.f29594a.m4335c();
        if (this.f29594a.m4334d(jVar)) {
            do {
                this.f29594a.m4336b(jVar, false);
                C13204f fVar = this.f29594a;
                jVar.mo12932k(fVar.f29629h + fVar.f29630i);
                C13204f fVar2 = this.f29594a;
                if ((fVar2.f29623b & 4) == 4 || !fVar2.m4334d(jVar)) {
                    break;
                }
            } while (jVar.getPosition() < this.f29596c);
            return this.f29594a.f29624c;
        }
        throw new EOFException();
    }
}
