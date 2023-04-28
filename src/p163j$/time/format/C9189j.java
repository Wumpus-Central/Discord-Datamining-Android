package p163j$.time.format;

import p163j$.time.C9167b;
import p163j$.time.temporal.AbstractC9224l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.j */
/* loaded from: classes2.dex */
public final class C9189j implements AbstractC9186g {

    /* renamed from: f */
    static final long[] f20166f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final AbstractC9224l f20167a;

    /* renamed from: b */
    final int f20168b;

    /* renamed from: c */
    final int f20169c;

    /* renamed from: d */
    private final EnumC9201v f20170d;

    /* renamed from: e */
    final int f20171e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9189j(AbstractC9224l lVar, int i, int i2, EnumC9201v vVar) {
        this.f20167a = lVar;
        this.f20168b = i;
        this.f20169c = i2;
        this.f20170d = vVar;
        this.f20171e = 0;
    }

    protected C9189j(AbstractC9224l lVar, int i, int i2, EnumC9201v vVar, int i3) {
        this.f20167a = lVar;
        this.f20168b = i;
        this.f20169c = i2;
        this.f20170d = vVar;
        this.f20171e = i3;
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        AbstractC9224l lVar = this.f20167a;
        Long e = rVar.m16688e(lVar);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        C9199t b = rVar.m16691b();
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i = this.f20169c;
        if (length <= i) {
            b.getClass();
            int i2 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
            int i3 = this.f20168b;
            EnumC9201v vVar = this.f20170d;
            if (i2 >= 0) {
                int i4 = AbstractC9183d.f20158a[vVar.ordinal()];
                if (i4 == 1 ? !(i3 >= 19 || longValue < f20166f[i3]) : i4 == 2) {
                    sb2.append('+');
                }
            } else {
                int i5 = AbstractC9183d.f20158a[vVar.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    sb2.append('-');
                } else if (i5 == 4) {
                    throw new C9167b("Field " + lVar + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
                }
            }
            for (int i6 = 0; i6 < i3 - l.length(); i6++) {
                sb2.append('0');
            }
            sb2.append(l);
            return true;
        }
        throw new C9167b("Field " + lVar + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C9189j m16714c() {
        return this.f20171e == -1 ? this : new C9189j(this.f20167a, this.f20168b, this.f20169c, this.f20170d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C9189j m16713d(int i) {
        return new C9189j(this.f20167a, this.f20168b, this.f20169c, this.f20170d, this.f20171e + i);
    }

    public final String toString() {
        EnumC9201v vVar = this.f20170d;
        AbstractC9224l lVar = this.f20167a;
        int i = this.f20169c;
        int i2 = this.f20168b;
        if (i2 == 1 && i == 19 && vVar == EnumC9201v.NORMAL) {
            return "Value(" + lVar + ")";
        } else if (i2 == i && vVar == EnumC9201v.NOT_NEGATIVE) {
            return "Value(" + lVar + "," + i2 + ")";
        } else {
            return "Value(" + lVar + "," + i2 + "," + i + "," + vVar + ")";
        }
    }
}
