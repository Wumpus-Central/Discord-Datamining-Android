package p399w8;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;
import p317r8.C12453b;
import p399w8.C13807c;

/* renamed from: w8.a */
/* loaded from: classes7.dex */
public final class C13805a extends AbstractC12456d {

    /* renamed from: t */
    private static final Pattern f31076t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    private final boolean f31077o;

    /* renamed from: p */
    private final C13806b f31078p;

    /* renamed from: q */
    private Map<String, C13807c> f31079q;

    /* renamed from: r */
    private float f31080r = -3.4028235E38f;

    /* renamed from: s */
    private float f31081s = -3.4028235E38f;

    public C13805a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f31077o = false;
            this.f31078p = null;
            return;
        }
        this.f31077o = true;
        String E = C7557q0.m22207E(list.get(0));
        C7510a.m22371a(E.startsWith("Format:"));
        this.f31078p = (C13806b) C7510a.m22367e(C13806b.m2606a(E));
        m2613G(new C7570y(list.get(1)));
    }

    /* renamed from: B */
    private static int m2618B(long j, List<Long> list, List<List<C12453b>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    /* renamed from: C */
    private static float m2617C(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: D */
    private static C12453b m2616D(String str, C13807c cVar, C13807c.C13809b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        C12453b.C0400b n = new C12453b.C0400b().m6682n(spannableString);
        if (cVar != null) {
            if (cVar.f31089c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f31089c.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = cVar.f31090d;
            if (!(f3 == -3.4028235E38f || f2 == -3.4028235E38f)) {
                n.m6680p(f3 / f2, 1);
            }
            boolean z = cVar.f31091e;
            if (z && cVar.f31092f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f31092f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f31104a;
        if (i == -1) {
            if (cVar != null) {
                i = cVar.f31088b;
            } else {
                i = -1;
            }
        }
        n.m6681o(m2607M(i)).m6685k(m2608L(i)).m6687i(m2609K(i));
        PointF pointF = bVar.f31105b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            n.m6686j(m2617C(n.m6692d()));
            n.m6688h(m2617C(n.m6693c()), 0);
        } else {
            n.m6686j(pointF.x / f);
            n.m6688h(bVar.f31105b.y / f2, 0);
        }
        return n.m6695a();
    }

    /* renamed from: E */
    private void m2615E(String str, C13806b bVar, List<List<C12453b>> list, List<Long> list2) {
        C13807c cVar;
        int i;
        C7510a.m22371a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f31086e);
        if (split.length != bVar.f31086e) {
            C7558r.m22104h("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long J = m2610J(split[bVar.f31082a]);
        if (J == -9223372036854775807L) {
            C7558r.m22104h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long J2 = m2610J(split[bVar.f31083b]);
        if (J2 == -9223372036854775807L) {
            C7558r.m22104h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, C13807c> map = this.f31079q;
        if (map == null || (i = bVar.f31084c) == -1) {
            cVar = null;
        } else {
            cVar = map.get(split[i].trim());
        }
        String str2 = split[bVar.f31085d];
        C12453b D = m2616D(C13807c.C13809b.m2594d(str2).replace("\\N", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\h", " "), cVar, C13807c.C13809b.m2596b(str2), this.f31080r, this.f31081s);
        int B = m2618B(J2, list2, list);
        for (int B2 = m2618B(J, list2, list); B2 < B; B2++) {
            list.get(B2).add(D);
        }
    }

    /* renamed from: F */
    private void m2614F(C7570y yVar, List<List<C12453b>> list, List<Long> list2) {
        C13806b bVar;
        if (this.f31077o) {
            bVar = this.f31078p;
        } else {
            bVar = null;
        }
        while (true) {
            String p = yVar.m22000p();
            if (p == null) {
                return;
            }
            if (p.startsWith("Format:")) {
                bVar = C13806b.m2606a(p);
            } else if (p.startsWith("Dialogue:")) {
                if (bVar == null) {
                    C7558r.m22104h("SsaDecoder", "Skipping dialogue line before complete format: " + p);
                } else {
                    m2615E(p, bVar, list, list2);
                }
            }
        }
    }

    /* renamed from: G */
    private void m2613G(C7570y yVar) {
        while (true) {
            String p = yVar.m22000p();
            if (p == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(p)) {
                m2612H(yVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(p)) {
                this.f31079q = m2611I(yVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(p)) {
                C7558r.m22106f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(p)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2612H(p119g9.C7570y r5) {
        /*
            r4 = this;
        L_0x0000:
            java.lang.String r0 = r5.m22000p()
            if (r0 == 0) goto L_0x0059
            int r1 = r5.m22015a()
            if (r1 == 0) goto L_0x0014
            int r1 = r5.m22008h()
            r2 = 91
            if (r1 == r2) goto L_0x0059
        L_0x0014:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = p119g9.C7557q0.m22174U0(r1)
            r1.hashCode()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L_0x004c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r0 = r0[r3]     // Catch: NumberFormatException -> 0x0000
            java.lang.String r0 = r0.trim()     // Catch: NumberFormatException -> 0x0000
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: NumberFormatException -> 0x0000
            r4.f31081s = r0     // Catch: NumberFormatException -> 0x0000
            goto L_0x0000
        L_0x004c:
            r0 = r0[r3]     // Catch: NumberFormatException -> 0x0000
            java.lang.String r0 = r0.trim()     // Catch: NumberFormatException -> 0x0000
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: NumberFormatException -> 0x0000
            r4.f31080r = r0     // Catch: NumberFormatException -> 0x0000
            goto L_0x0000
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p399w8.C13805a.m2612H(g9.y):void");
    }

    /* renamed from: I */
    private static Map<String, C13807c> m2611I(C7570y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C13807c.C13808a aVar = null;
        while (true) {
            String p = yVar.m22000p();
            if (p == null || (yVar.m22015a() != 0 && yVar.m22008h() == 91)) {
                break;
            } else if (p.startsWith("Format:")) {
                aVar = C13807c.C13808a.m2598a(p);
            } else if (p.startsWith("Style:")) {
                if (aVar == null) {
                    C7558r.m22104h("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + p);
                } else {
                    C13807c b = C13807c.m2604b(p, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.f31087a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: J */
    private static long m2610J(String str) {
        Matcher matcher = f31076t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) C7557q0.m22145j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C7557q0.m22145j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C7557q0.m22145j(matcher.group(3))) * 1000000) + (Long.parseLong((String) C7557q0.m22145j(matcher.group(4))) * 10000);
    }

    /* renamed from: K */
    private static int m2609K(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C7558r.m22104h("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    /* renamed from: L */
    private static int m2608L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C7558r.m22104h("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    /* renamed from: M */
    private static Layout.Alignment m2607M(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                C7558r.m22104h("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C7570y yVar = new C7570y(bArr, i);
        if (!this.f31077o) {
            m2613G(yVar);
        }
        m2614F(yVar, arrayList, arrayList2);
        return new C13810d(arrayList, arrayList2);
    }
}
