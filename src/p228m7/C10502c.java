package p228m7;

import p119g9.C7558r;
import p119g9.C7570y;

/* renamed from: m7.c */
/* loaded from: classes7.dex */
public final class C10502c {
    /* renamed from: a */
    public static void m13006a(long j, C7570y yVar, AbstractC10500b0[] b0VarArr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (yVar.m22015a() > 1) {
                int c = m13004c(yVar);
                int c2 = m13004c(yVar);
                int e = yVar.m22011e() + c2;
                if (c2 == -1 || c2 > yVar.m22015a()) {
                    C7558r.m22104h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e = yVar.m22010f();
                } else if (c == 4 && c2 >= 8) {
                    int D = yVar.m22029D();
                    int J = yVar.m22023J();
                    if (J == 49) {
                        i = yVar.m22002n();
                    } else {
                        i = 0;
                    }
                    int D2 = yVar.m22029D();
                    if (J == 47) {
                        yVar.m22016Q(1);
                    }
                    if (D == 181 && ((J == 49 || J == 47) && D2 == 3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (J == 49) {
                        if (i != 1195456820) {
                            z2 = false;
                        }
                        z &= z2;
                    }
                    if (z) {
                        m13005b(j, yVar, b0VarArr);
                    }
                }
                yVar.m22017P(e);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m13005b(long j, C7570y yVar, AbstractC10500b0[] b0VarArr) {
        boolean z;
        int D = yVar.m22029D();
        if ((D & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            yVar.m22016Q(1);
            int i = (D & 31) * 3;
            int e = yVar.m22011e();
            for (AbstractC10500b0 b0Var : b0VarArr) {
                yVar.m22017P(e);
                b0Var.mo12386f(yVar, i);
                b0Var.mo12382c(j, 1, i, 0, null);
            }
        }
    }

    /* renamed from: c */
    private static int m13004c(C7570y yVar) {
        int i = 0;
        while (yVar.m22015a() != 0) {
            int D = yVar.m22029D();
            i += D;
            if (D != 255) {
                return i;
            }
        }
        return -1;
    }
}
