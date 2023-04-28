package p460z8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p030bc.C3452d;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;
import p317r8.C12453b;
import p317r8.C12460h;

/* renamed from: z8.a */
/* loaded from: classes7.dex */
public final class C14586a extends AbstractC12456d {

    /* renamed from: o */
    private final C7570y f33054o = new C7570y();

    /* renamed from: p */
    private final boolean f33055p;

    /* renamed from: q */
    private final int f33056q;

    /* renamed from: r */
    private final int f33057r;

    /* renamed from: s */
    private final String f33058s;

    /* renamed from: t */
    private final float f33059t;

    /* renamed from: u */
    private final int f33060u;

    public C14586a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f33056q = bArr[24];
            this.f33057r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f33058s = "Serif".equals(C7557q0.m22205F(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f33060u = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.f33055p = z;
            if (z) {
                this.f33059t = C7557q0.m22131q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
            } else {
                this.f33059t = 0.85f;
            }
        } else {
            this.f33056q = 0;
            this.f33057r = -1;
            this.f33058s = str;
            this.f33055p = false;
            this.f33059t = 0.85f;
            this.f33060u = -1;
        }
    }

    /* renamed from: B */
    private void m160B(C7570y yVar, SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        if (yVar.m22015a() >= 12) {
            z = true;
        } else {
            z = false;
        }
        m159C(z);
        int J = yVar.m22023J();
        int J2 = yVar.m22023J();
        yVar.m22016Q(2);
        int D = yVar.m22029D();
        yVar.m22016Q(1);
        int n = yVar.m22002n();
        if (J2 > spannableStringBuilder.length()) {
            C7558r.m22104h("Tx3gDecoder", "Truncating styl end (" + J2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            J2 = spannableStringBuilder.length();
        }
        if (J >= J2) {
            C7558r.m22104h("Tx3gDecoder", "Ignoring styl with start (" + J + ") >= end (" + J2 + ").");
            return;
        }
        m157E(spannableStringBuilder, D, this.f33056q, J, J2, 0);
        m158D(spannableStringBuilder, n, this.f33057r, J, J2, 0);
    }

    /* renamed from: C */
    private static void m159C(boolean z) {
        if (!z) {
            throw new C12460h("Unexpected subtitle format.");
        }
    }

    /* renamed from: D */
    private static void m158D(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: E */
    private static void m157E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: F */
    private static void m156F(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* renamed from: G */
    private static String m155G(C7570y yVar) {
        boolean z;
        char g;
        if (yVar.m22015a() >= 2) {
            z = true;
        } else {
            z = false;
        }
        m159C(z);
        int J = yVar.m22023J();
        if (J == 0) {
            return "";
        }
        if (yVar.m22015a() < 2 || ((g = yVar.m22009g()) != 65279 && g != 65534)) {
            return yVar.m22031B(J, C3452d.f5595c);
        }
        return yVar.m22031B(J, C3452d.f5598f);
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        this.f33054o.m22019N(bArr, i);
        String G = m155G(this.f33054o);
        if (G.isEmpty()) {
            return C14587b.f33061l;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        m157E(spannableStringBuilder, this.f33056q, 0, 0, spannableStringBuilder.length(), 16711680);
        m158D(spannableStringBuilder, this.f33057r, -1, 0, spannableStringBuilder.length(), 16711680);
        m156F(spannableStringBuilder, this.f33058s, 0, spannableStringBuilder.length());
        float f = this.f33059t;
        while (this.f33054o.m22015a() >= 8) {
            int e = this.f33054o.m22011e();
            int n = this.f33054o.m22002n();
            int n2 = this.f33054o.m22002n();
            boolean z2 = true;
            if (n2 == 1937013100) {
                if (this.f33054o.m22015a() < 2) {
                    z2 = false;
                }
                m159C(z2);
                int J = this.f33054o.m22023J();
                for (int i2 = 0; i2 < J; i2++) {
                    m160B(this.f33054o, spannableStringBuilder);
                }
            } else if (n2 == 1952608120 && this.f33055p) {
                if (this.f33054o.m22015a() < 2) {
                    z2 = false;
                }
                m159C(z2);
                f = C7557q0.m22131q(this.f33054o.m22023J() / this.f33060u, 0.0f, 0.95f);
            }
            this.f33054o.m22017P(e + n);
        }
        return new C14587b(new C12453b.C0400b().m6682n(spannableStringBuilder).m6688h(f, 0).m6687i(0).m6695a());
    }
}
