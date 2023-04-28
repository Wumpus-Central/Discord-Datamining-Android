package p398w7;

import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10492a;
import p228m7.AbstractC10515j;

/* renamed from: w7.e0 */
/* loaded from: classes7.dex */
final class C13761e0 extends AbstractC10492a {

    /* renamed from: w7.e0$a */
    /* loaded from: classes7.dex */
    private static final class C13762a implements AbstractC10492a.AbstractC10497f {

        /* renamed from: a */
        private final C7544l0 f30762a;

        /* renamed from: b */
        private final C7570y f30763b = new C7570y();

        /* renamed from: c */
        private final int f30764c;

        /* renamed from: d */
        private final int f30765d;

        public C13762a(int i, C7544l0 l0Var, int i2) {
            this.f30764c = i;
            this.f30762a = l0Var;
            this.f30765d = i2;
        }

        /* renamed from: c */
        private AbstractC10492a.C10496e m2792c(C7570y yVar, long j, long j2) {
            int a;
            int a2;
            int f = yVar.m22010f();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (yVar.m22015a() >= 188 && (a2 = (a = C13778j0.m2721a(yVar.m22012d(), yVar.m22011e(), f)) + 188) <= f) {
                long b = C13778j0.m2720b(yVar, a, this.f30764c);
                if (b != -9223372036854775807L) {
                    long b2 = this.f30762a.m22264b(b);
                    if (b2 > j) {
                        if (j5 == -9223372036854775807L) {
                            return AbstractC10492a.C10496e.m13012d(b2, j2);
                        }
                        return AbstractC10492a.C10496e.m13011e(j2 + j4);
                    } else if (100000 + b2 > j) {
                        return AbstractC10492a.C10496e.m13011e(j2 + a);
                    } else {
                        j4 = a;
                        j5 = b2;
                    }
                }
                yVar.m22017P(a2);
                j3 = a2;
            }
            if (j5 != -9223372036854775807L) {
                return AbstractC10492a.C10496e.m13010f(j5, j2 + j3);
            }
            return AbstractC10492a.C10496e.f23194d;
        }

        @Override // p228m7.AbstractC10492a.AbstractC10497f
        /* renamed from: a */
        public AbstractC10492a.C10496e mo2635a(AbstractC10515j jVar, long j) {
            long position = jVar.getPosition();
            int min = (int) Math.min(this.f30765d, jVar.getLength() - position);
            this.f30763b.m22021L(min);
            jVar.mo12930n(this.f30763b.m22012d(), 0, min);
            return m2792c(this.f30763b, j, position);
        }

        @Override // p228m7.AbstractC10492a.AbstractC10497f
        /* renamed from: b */
        public void mo2634b() {
            this.f30763b.m22020M(C7557q0.f16373f);
        }
    }

    public C13761e0(C7544l0 l0Var, long j, long j2, int i, int i2) {
        super(new AbstractC10492a.C10493b(), new C13762a(i, l0Var, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
