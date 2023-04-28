package sd;

import androidx.recyclerview.widget.ItemTouchHelper;
import p066dd.C6437f;
import p137hd.C7996a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.s */
/* loaded from: classes3.dex */
public final class C12881s {

    /* renamed from: a */
    private final C7996a f28955a;

    /* renamed from: b */
    private final C12874m f28956b = new C12874m();

    /* renamed from: c */
    private final StringBuilder f28957c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12881s(C7996a aVar) {
        this.f28955a = aVar;
    }

    /* renamed from: b */
    private C12876n m5210b(int i) {
        char c;
        int f = m5206f(i, 5);
        if (f == 15) {
            return new C12876n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C12876n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = m5206f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C12876n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f2)));
        }
        return new C12876n(i + 6, c);
    }

    /* renamed from: d */
    private C12876n m5208d(int i) {
        char c;
        int f = m5206f(i, 5);
        if (f == 15) {
            return new C12876n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C12876n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = m5206f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C12876n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C12876n(i + 7, (char) (f2 + 7));
        }
        switch (m5206f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C6437f.m25561a();
        }
        return new C12876n(i + 8, c);
    }

    /* renamed from: e */
    private C12878p m5207e(int i) {
        int i2 = i + 7;
        if (i2 > this.f28955a.m20932j()) {
            int f = m5206f(i, 4);
            if (f == 0) {
                return new C12878p(this.f28955a.m20932j(), 10, 10);
            }
            return new C12878p(this.f28955a.m20932j(), f - 1, 10);
        }
        int f2 = m5206f(i, 7) - 8;
        return new C12878p(i2, f2 / 11, f2 % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m5205g(C7996a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.m20936d(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m5204h(int i) {
        int i2 = i + 3;
        if (i2 > this.f28955a.m20932j()) {
            return false;
        }
        while (i < i2) {
            if (this.f28955a.m20936d(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m5203i(int i) {
        int i2;
        if (i + 1 > this.f28955a.m20932j()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f28955a.m20932j(); i3++) {
            if (i3 == 2) {
                if (!this.f28955a.m20936d(i + 2)) {
                    return false;
                }
            } else if (this.f28955a.m20936d(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m5202j(int i) {
        int i2;
        if (i + 1 > this.f28955a.m20932j()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f28955a.m20932j(); i3++) {
            if (this.f28955a.m20936d(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m5201k(int i) {
        int f;
        if (i + 5 > this.f28955a.m20932j()) {
            return false;
        }
        int f2 = m5206f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 6 <= this.f28955a.m20932j() && (f = m5206f(i, 6)) >= 16 && f < 63) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m5200l(int i) {
        int f;
        if (i + 5 > this.f28955a.m20932j()) {
            return false;
        }
        int f2 = m5206f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.f28955a.m20932j()) {
            return false;
        }
        int f3 = m5206f(i, 7);
        if (f3 >= 64 && f3 < 116) {
            return true;
        }
        if (i + 8 <= this.f28955a.m20932j() && (f = m5206f(i, 8)) >= 232 && f < 253) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m5199m(int i) {
        if (i + 7 <= this.f28955a.m20932j()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.f28955a.m20936d(i3);
                }
                if (this.f28955a.m20936d(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.f28955a.m20932j()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    private C12873l m5198n() {
        while (m5201k(this.f28956b.m5232a())) {
            C12876n b = m5210b(this.f28956b.m5232a());
            this.f28956b.m5225h(b.m5215a());
            if (b.m5223c()) {
                return new C12873l(new C12877o(this.f28956b.m5232a(), this.f28957c.toString()), true);
            }
            this.f28957c.append(b.m5224b());
        }
        if (m5204h(this.f28956b.m5232a())) {
            this.f28956b.m5231b(3);
            this.f28956b.m5226g();
        } else if (m5203i(this.f28956b.m5232a())) {
            if (this.f28956b.m5232a() + 5 < this.f28955a.m20932j()) {
                this.f28956b.m5231b(5);
            } else {
                this.f28956b.m5225h(this.f28955a.m20932j());
            }
            this.f28956b.m5227f();
        }
        return new C12873l(false);
    }

    /* renamed from: o */
    private C12877o m5197o() {
        boolean z;
        C12873l lVar;
        boolean z2;
        do {
            int a = this.f28956b.m5232a();
            if (this.f28956b.m5230c()) {
                lVar = m5198n();
                z = lVar.m5233b();
            } else if (this.f28956b.m5229d()) {
                lVar = m5196p();
                z = lVar.m5233b();
            } else {
                lVar = m5195q();
                z = lVar.m5233b();
            }
            if (a != this.f28956b.m5232a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !z) {
                break;
            }
        } while (!z);
        return lVar.m5234a();
    }

    /* renamed from: p */
    private C12873l m5196p() {
        while (m5200l(this.f28956b.m5232a())) {
            C12876n d = m5208d(this.f28956b.m5232a());
            this.f28956b.m5225h(d.m5215a());
            if (d.m5223c()) {
                return new C12873l(new C12877o(this.f28956b.m5232a(), this.f28957c.toString()), true);
            }
            this.f28957c.append(d.m5224b());
        }
        if (m5204h(this.f28956b.m5232a())) {
            this.f28956b.m5231b(3);
            this.f28956b.m5226g();
        } else if (m5203i(this.f28956b.m5232a())) {
            if (this.f28956b.m5232a() + 5 < this.f28955a.m20932j()) {
                this.f28956b.m5231b(5);
            } else {
                this.f28956b.m5225h(this.f28955a.m20932j());
            }
            this.f28956b.m5228e();
        }
        return new C12873l(false);
    }

    /* renamed from: q */
    private C12873l m5195q() {
        C12877o oVar;
        while (m5199m(this.f28956b.m5232a())) {
            C12878p e = m5207e(this.f28956b.m5232a());
            this.f28956b.m5225h(e.m5215a());
            if (e.m5217d()) {
                if (e.m5216e()) {
                    oVar = new C12877o(this.f28956b.m5232a(), this.f28957c.toString());
                } else {
                    oVar = new C12877o(this.f28956b.m5232a(), this.f28957c.toString(), e.m5218c());
                }
                return new C12873l(oVar, true);
            }
            this.f28957c.append(e.m5219b());
            if (e.m5216e()) {
                return new C12873l(new C12877o(this.f28956b.m5232a(), this.f28957c.toString()), true);
            }
            this.f28957c.append(e.m5218c());
        }
        if (m5202j(this.f28956b.m5232a())) {
            this.f28956b.m5228e();
            this.f28956b.m5231b(4);
        }
        return new C12873l(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m5211a(StringBuilder sb2, int i) {
        String str;
        String str2 = null;
        while (true) {
            C12877o c = m5209c(i, str2);
            String a = C12880r.m5214a(c.m5222b());
            if (a != null) {
                sb2.append(a);
            }
            if (c.m5220d()) {
                str = String.valueOf(c.m5221c());
            } else {
                str = null;
            }
            if (i == c.m5215a()) {
                return sb2.toString();
            }
            i = c.m5215a();
            str2 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C12877o m5209c(int i, String str) {
        this.f28957c.setLength(0);
        if (str != null) {
            this.f28957c.append(str);
        }
        this.f28956b.m5225h(i);
        C12877o o = m5197o();
        if (o == null || !o.m5220d()) {
            return new C12877o(this.f28956b.m5232a(), this.f28957c.toString());
        }
        return new C12877o(this.f28956b.m5232a(), this.f28957c.toString(), o.m5221c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m5206f(int i, int i2) {
        return m5205g(this.f28955a, i, i2);
    }
}
