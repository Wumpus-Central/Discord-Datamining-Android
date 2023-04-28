package p163j$.time;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.Serializable;
import p163j$.time.temporal.AbstractC9222j;
import p163j$.time.temporal.AbstractC9223k;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.AbstractC9226n;
import p163j$.time.temporal.C9228p;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;
import p163j$.time.temporal.EnumC9214b;

/* renamed from: j$.time.i */
/* loaded from: classes2.dex */
public final class C9205i implements AbstractC9223k, Comparable, Serializable {

    /* renamed from: e */
    public static final C9205i f20209e;

    /* renamed from: f */
    public static final C9205i f20210f;

    /* renamed from: g */
    private static final C9205i[] f20211g = new C9205i[24];

    /* renamed from: a */
    private final byte f20212a;

    /* renamed from: b */
    private final byte f20213b;

    /* renamed from: c */
    private final byte f20214c;

    /* renamed from: d */
    private final int f20215d;

    static {
        int i = 0;
        while (true) {
            C9205i[] iVarArr = f20211g;
            if (i < iVarArr.length) {
                iVarArr[i] = new C9205i(i, 0, 0, 0);
                i++;
            } else {
                C9205i iVar = iVarArr[0];
                C9205i iVar2 = iVarArr[12];
                f20209e = iVar;
                f20210f = new C9205i(23, 59, 59, 999999999);
                return;
            }
        }
    }

    private C9205i(int i, int i2, int i3, int i4) {
        this.f20212a = (byte) i;
        this.f20213b = (byte) i2;
        this.f20214c = (byte) i3;
        this.f20215d = i4;
    }

    /* renamed from: g */
    private int m16670g(AbstractC9224l lVar) {
        int i = AbstractC9204h.f20207a[((EnumC9213a) lVar).ordinal()];
        byte b = this.f20213b;
        int i2 = this.f20215d;
        byte b2 = this.f20212a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new C9228p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            case 4:
                throw new C9228p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (m16666k() / 1000000);
            case 7:
                return this.f20214c;
            case 8:
                return m16665l();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new C9228p("Unsupported field: " + lVar);
        }
    }

    /* renamed from: j */
    public static C9205i m16667j(long j) {
        EnumC9213a.NANO_OF_DAY.m16653h(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        int i4 = (int) (j3 - (i3 * 1000000000));
        return ((i2 | i3) | i4) == 0 ? f20211g[i] : new C9205i(i, i2, i3, i4);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: a */
    public final C9229q mo16635a(AbstractC9224l lVar) {
        return AbstractC9222j.m16643c(this, lVar);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: b */
    public final boolean mo16634b(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar.mo16626e() : lVar != null && lVar.mo16630a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: c */
    public final long mo16633c(AbstractC9224l lVar) {
        return lVar instanceof EnumC9213a ? lVar == EnumC9213a.NANO_OF_DAY ? m16666k() : lVar == EnumC9213a.MICRO_OF_DAY ? m16666k() / 1000 : m16670g(lVar) : lVar.mo16625f(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: d */
    public final Object mo16632d(AbstractC9226n nVar) {
        if (nVar == AbstractC9222j.m16642d() || nVar == AbstractC9222j.m16636j() || nVar == AbstractC9222j.m16637i() || nVar == AbstractC9222j.m16639g()) {
            return null;
        }
        if (nVar == AbstractC9222j.m16640f()) {
            return this;
        }
        if (nVar == AbstractC9222j.m16641e()) {
            return null;
        }
        return nVar == AbstractC9222j.m16638h() ? EnumC9214b.NANOS : nVar.mo16624a(this);
    }

    @Override // p163j$.time.temporal.AbstractC9223k
    /* renamed from: e */
    public final int mo16631e(EnumC9213a aVar) {
        return aVar instanceof EnumC9213a ? m16670g(aVar) : AbstractC9222j.m16645a(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9205i)) {
            return false;
        }
        C9205i iVar = (C9205i) obj;
        return this.f20212a == iVar.f20212a && this.f20213b == iVar.f20213b && this.f20214c == iVar.f20214c && this.f20215d == iVar.f20215d;
    }

    /* renamed from: f */
    public final int compareTo(C9205i iVar) {
        int compare = Integer.compare(this.f20212a, iVar.f20212a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f20213b, iVar.f20213b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f20214c, iVar.f20214c);
        return compare3 == 0 ? Integer.compare(this.f20215d, iVar.f20215d) : compare3;
    }

    /* renamed from: h */
    public final int m16669h() {
        return this.f20215d;
    }

    public final int hashCode() {
        long k = m16666k();
        return (int) (k ^ (k >>> 32));
    }

    /* renamed from: i */
    public final int m16668i() {
        return this.f20214c;
    }

    /* renamed from: k */
    public final long m16666k() {
        return (this.f20214c * 1000000000) + (this.f20213b * 60000000000L) + (this.f20212a * 3600000000000L) + this.f20215d;
    }

    /* renamed from: l */
    public final int m16665l() {
        return (this.f20213b * 60) + (this.f20212a * 3600) + this.f20214c;
    }

    public final String toString() {
        int i;
        StringBuilder sb2 = new StringBuilder(18);
        byte b = this.f20212a;
        sb2.append(b < 10 ? "0" : "");
        sb2.append((int) b);
        String str = ":0";
        byte b2 = this.f20213b;
        sb2.append(b2 < 10 ? str : ":");
        sb2.append((int) b2);
        byte b3 = this.f20214c;
        int i2 = this.f20215d;
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb2.append(str);
            sb2.append((int) b3);
            if (i2 > 0) {
                sb2.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                } else {
                    if (i2 % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                        i2 /= RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb2.append(Integer.toString(i).substring(1));
            }
        }
        return sb2.toString();
    }
}
