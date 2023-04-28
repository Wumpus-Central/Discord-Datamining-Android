package p259o7;

import java.util.Objects;
import p228m7.AbstractC10492a;
import p228m7.AbstractC10515j;
import p228m7.C10499b;
import p228m7.C10522p;
import p228m7.C10527s;

/* renamed from: o7.b */
/* loaded from: classes7.dex */
final class C11207b extends AbstractC10492a {

    /* renamed from: o7.b$b */
    /* loaded from: classes7.dex */
    private static final class C0358b implements AbstractC10492a.AbstractC10497f {

        /* renamed from: a */
        private final C10527s f24992a;

        /* renamed from: b */
        private final int f24993b;

        /* renamed from: c */
        private final C10522p.C10523a f24994c;

        /* renamed from: c */
        private long m10492c(AbstractC10515j jVar) {
            while (jVar.mo7939h() < jVar.getLength() - 6 && !C10522p.m12964h(jVar, this.f24992a, this.f24993b, this.f24994c)) {
                jVar.mo12934i(1);
            }
            if (jVar.mo7939h() < jVar.getLength() - 6) {
                return this.f24994c.f23263a;
            }
            jVar.mo12934i((int) (jVar.getLength() - jVar.mo7939h()));
            return this.f24992a.f23276j;
        }

        @Override // p228m7.AbstractC10492a.AbstractC10497f
        /* renamed from: a */
        public AbstractC10492a.C10496e mo2635a(AbstractC10515j jVar, long j) {
            long position = jVar.getPosition();
            long c = m10492c(jVar);
            long h = jVar.mo7939h();
            jVar.mo12934i(Math.max(6, this.f24992a.f23269c));
            long c2 = m10492c(jVar);
            long h2 = jVar.mo7939h();
            if (c <= j && c2 > j) {
                return AbstractC10492a.C10496e.m13011e(h);
            }
            if (c2 <= j) {
                return AbstractC10492a.C10496e.m13010f(c2, h2);
            }
            return AbstractC10492a.C10496e.m13012d(c, position);
        }

        @Override // p228m7.AbstractC10492a.AbstractC10497f
        /* renamed from: b */
        public /* synthetic */ void mo2634b() {
            C10499b.m13007a(this);
        }

        private C0358b(C10527s sVar, int i) {
            this.f24992a = sVar;
            this.f24993b = i;
            this.f24994c = new C10522p.C10523a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11207b(final C10527s sVar, int i, long j, long j2) {
        super(new AbstractC10492a.AbstractC10495d() { // from class: o7.a
            @Override // p228m7.AbstractC10492a.AbstractC10495d
            /* renamed from: a */
            public final long mo10493a(long j3) {
                return C10527s.this.m12940j(j3);
            }
        }, new C0358b(sVar, i), sVar.m12943g(), 0L, sVar.f23276j, j, j2, sVar.m12945e(), Math.max(6, sVar.f23269c));
        Objects.requireNonNull(sVar);
    }
}
