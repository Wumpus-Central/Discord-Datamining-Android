package p398w7;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10492a;
import p228m7.AbstractC10515j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w7.x */
/* loaded from: classes7.dex */
public final class C13800x extends AbstractC10492a {

    /* renamed from: w7.x$b */
    /* loaded from: classes7.dex */
    private static final class C13802b implements AbstractC10492a.AbstractC10497f {

        /* renamed from: a */
        private final C7544l0 f31066a;

        /* renamed from: b */
        private final C7570y f31067b;

        /* renamed from: c */
        private AbstractC10492a.C10496e m2633c(C7570y yVar, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (yVar.m22015a() >= 4) {
                if (C13800x.m2636k(yVar.m22012d(), yVar.m22011e()) != 442) {
                    yVar.m22016Q(1);
                } else {
                    yVar.m22016Q(4);
                    long l = C13803y.m2620l(yVar);
                    if (l != -9223372036854775807L) {
                        long b = this.f31066a.m22264b(l);
                        if (b > j) {
                            if (j3 == -9223372036854775807L) {
                                return AbstractC10492a.C10496e.m13012d(b, j2);
                            }
                            return AbstractC10492a.C10496e.m13011e(j2 + i2);
                        } else if (100000 + b > j) {
                            return AbstractC10492a.C10496e.m13011e(j2 + yVar.m22011e());
                        } else {
                            i2 = yVar.m22011e();
                            j3 = b;
                        }
                    }
                    m2632d(yVar);
                    i = yVar.m22011e();
                }
            }
            if (j3 != -9223372036854775807L) {
                return AbstractC10492a.C10496e.m13010f(j3, j2 + i);
            }
            return AbstractC10492a.C10496e.f23194d;
        }

        /* renamed from: d */
        private static void m2632d(C7570y yVar) {
            int k;
            int f = yVar.m22010f();
            if (yVar.m22015a() < 10) {
                yVar.m22017P(f);
                return;
            }
            yVar.m22016Q(9);
            int D = yVar.m22029D() & 7;
            if (yVar.m22015a() < D) {
                yVar.m22017P(f);
                return;
            }
            yVar.m22016Q(D);
            if (yVar.m22015a() < 4) {
                yVar.m22017P(f);
                return;
            }
            if (C13800x.m2636k(yVar.m22012d(), yVar.m22011e()) == 443) {
                yVar.m22016Q(4);
                int J = yVar.m22023J();
                if (yVar.m22015a() < J) {
                    yVar.m22017P(f);
                    return;
                }
                yVar.m22016Q(J);
            }
            while (yVar.m22015a() >= 4 && (k = C13800x.m2636k(yVar.m22012d(), yVar.m22011e())) != 442 && k != 441 && (k >>> 8) == 1) {
                yVar.m22016Q(4);
                if (yVar.m22015a() < 2) {
                    yVar.m22017P(f);
                    return;
                }
                yVar.m22017P(Math.min(yVar.m22010f(), yVar.m22011e() + yVar.m22023J()));
            }
        }

        @Override // p228m7.AbstractC10492a.AbstractC10497f
        /* renamed from: a */
        public AbstractC10492a.C10496e mo2635a(AbstractC10515j jVar, long j) {
            long position = jVar.getPosition();
            int min = (int) Math.min(20000L, jVar.getLength() - position);
            this.f31067b.m22021L(min);
            jVar.mo12930n(this.f31067b.m22012d(), 0, min);
            return m2633c(this.f31067b, j, position);
        }

        @Override // p228m7.AbstractC10492a.AbstractC10497f
        /* renamed from: b */
        public void mo2634b() {
            this.f31067b.m22020M(C7557q0.f16373f);
        }

        private C13802b(C7544l0 l0Var) {
            this.f31066a = l0Var;
            this.f31067b = new C7570y();
        }
    }

    public C13800x(C7544l0 l0Var, long j, long j2) {
        super(new AbstractC10492a.C10493b(), new C13802b(l0Var), j, 0L, j + 1, 0L, j2, 188L, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m2636k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
