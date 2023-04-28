package p337s8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p119g9.C7510a;
import p119g9.C7518d;
import p119g9.C7558r;
import p119g9.C7569x;
import p119g9.C7570y;
import p317r8.AbstractC12458f;
import p317r8.AbstractC12464k;
import p317r8.C12453b;
import p317r8.C12463j;
import p337s8.C12816c;

/* renamed from: s8.c */
/* loaded from: classes7.dex */
public final class C12816c extends AbstractC12820e {

    /* renamed from: g */
    private final C7570y f28807g = new C7570y();

    /* renamed from: h */
    private final C7569x f28808h = new C7569x();

    /* renamed from: i */
    private int f28809i = -1;

    /* renamed from: j */
    private final boolean f28810j;

    /* renamed from: k */
    private final int f28811k;

    /* renamed from: l */
    private final C12818b[] f28812l;

    /* renamed from: m */
    private C12818b f28813m;

    /* renamed from: n */
    private List<C12453b> f28814n;

    /* renamed from: o */
    private List<C12453b> f28815o;

    /* renamed from: p */
    private C0413c f28816p;

    /* renamed from: q */
    private int f28817q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.c$a */
    /* loaded from: classes7.dex */
    public static final class C12817a {

        /* renamed from: c */
        private static final Comparator<C12817a> f28818c = new Comparator() { // from class: s8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c;
                c = C12816c.C12817a.m5354c((C12816c.C12817a) obj, (C12816c.C12817a) obj2);
                return c;
            }
        };

        /* renamed from: a */
        public final C12453b f28819a;

        /* renamed from: b */
        public final int f28820b;

        public C12817a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C12453b.C0400b m = new C12453b.C0400b().m6682n(charSequence).m6681o(alignment).m6688h(f, i).m6687i(i2).m6686j(f2).m6685k(i3).m6683m(f3);
            if (z) {
                m.m6678r(i4);
            }
            this.f28819a = m.m6695a();
            this.f28820b = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ int m5354c(C12817a aVar, C12817a aVar2) {
            return Integer.compare(aVar2.f28820b, aVar.f28820b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.c$b */
    /* loaded from: classes7.dex */
    public static final class C12818b {

        /* renamed from: D */
        private static final int[] f39352D;

        /* renamed from: G */
        private static final int[] f39355G;

        /* renamed from: x */
        public static final int f28822x;

        /* renamed from: y */
        public static final int f28823y;

        /* renamed from: a */
        private final List<SpannableString> f28825a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f28826b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f28827c;

        /* renamed from: d */
        private boolean f28828d;

        /* renamed from: e */
        private int f28829e;

        /* renamed from: f */
        private boolean f28830f;

        /* renamed from: g */
        private int f28831g;

        /* renamed from: h */
        private int f28832h;

        /* renamed from: i */
        private int f28833i;

        /* renamed from: j */
        private int f28834j;

        /* renamed from: k */
        private boolean f28835k;

        /* renamed from: l */
        private int f28836l;

        /* renamed from: m */
        private int f28837m;

        /* renamed from: n */
        private int f28838n;

        /* renamed from: o */
        private int f28839o;

        /* renamed from: p */
        private int f28840p;

        /* renamed from: q */
        private int f28841q;

        /* renamed from: r */
        private int f28842r;

        /* renamed from: s */
        private int f28843s;

        /* renamed from: t */
        private int f28844t;

        /* renamed from: u */
        private int f28845u;

        /* renamed from: v */
        private int f28846v;

        /* renamed from: w */
        public static final int f28821w = m5346h(2, 2, 2, 0);

        /* renamed from: z */
        private static final int[] f28824z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: A */
        private static final int[] f39349A = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: B */
        private static final int[] f39350B = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: C */
        private static final boolean[] f39351C = {false, false, false, true, true, true, false};

        /* renamed from: E */
        private static final int[] f39353E = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: F */
        private static final int[] f39354F = {0, 0, 0, 0, 0, 3, 3};

        static {
            int h = m5346h(0, 0, 0, 0);
            f28822x = h;
            int h2 = m5346h(0, 0, 0, 3);
            f28823y = h2;
            f39352D = new int[]{h, h2, h, h, h2, h, h};
            f39355G = new int[]{h, h, h, h, h, h2, h2};
        }

        public C12818b() {
            m5342l();
        }

        /* renamed from: g */
        public static int m5347g(int i, int i2, int i3) {
            return m5346h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m5346h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p119g9.C7510a.m22369c(r4, r0, r1)
                p119g9.C7510a.m22369c(r5, r0, r1)
                p119g9.C7510a.m22369c(r6, r0, r1)
                p119g9.C7510a.m22369c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = r0
                goto L_0x0022
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0022
            L_0x0021:
                r7 = r2
            L_0x0022:
                if (r4 <= r1) goto L_0x0026
                r4 = r2
                goto L_0x0027
            L_0x0026:
                r4 = r0
            L_0x0027:
                if (r5 <= r1) goto L_0x002b
                r5 = r2
                goto L_0x002c
            L_0x002b:
                r5 = r0
            L_0x002c:
                if (r6 <= r1) goto L_0x002f
                r0 = r2
            L_0x002f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p337s8.C12816c.C12818b.m5346h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m5353a(char c) {
            if (c == '\n') {
                this.f28825a.add(m5350d());
                this.f28826b.clear();
                if (this.f28840p != -1) {
                    this.f28840p = 0;
                }
                if (this.f28841q != -1) {
                    this.f28841q = 0;
                }
                if (this.f28842r != -1) {
                    this.f28842r = 0;
                }
                if (this.f28844t != -1) {
                    this.f28844t = 0;
                }
                while (true) {
                    if ((this.f28835k && this.f28825a.size() >= this.f28834j) || this.f28825a.size() >= 15) {
                        this.f28825a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f28826b.append(c);
            }
        }

        /* renamed from: b */
        public void m5352b() {
            int length = this.f28826b.length();
            if (length > 0) {
                this.f28826b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p337s8.C12816c.C12817a m5351c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p337s8.C12816c.C12818b.m5351c():s8.c$a");
        }

        /* renamed from: d */
        public SpannableString m5350d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28826b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f28840p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f28840p, length, 33);
                }
                if (this.f28841q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f28841q, length, 33);
                }
                if (this.f28842r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f28843s), this.f28842r, length, 33);
                }
                if (this.f28844t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f28845u), this.f28844t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m5349e() {
            this.f28825a.clear();
            this.f28826b.clear();
            this.f28840p = -1;
            this.f28841q = -1;
            this.f28842r = -1;
            this.f28844t = -1;
            this.f28846v = 0;
        }

        /* renamed from: f */
        public void m5348f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f28827c = true;
            this.f28828d = z;
            this.f28835k = z2;
            this.f28829e = i;
            this.f28830f = z4;
            this.f28831g = i2;
            this.f28832h = i3;
            this.f28833i = i6;
            int i9 = i4 + 1;
            if (this.f28834j != i9) {
                this.f28834j = i9;
                while (true) {
                    if ((!z2 || this.f28825a.size() < this.f28834j) && this.f28825a.size() < 15) {
                        break;
                    }
                    this.f28825a.remove(0);
                }
            }
            if (!(i7 == 0 || this.f28837m == i7)) {
                this.f28837m = i7;
                int i10 = i7 - 1;
                m5337q(f39352D[i10], f28823y, f39351C[i10], 0, f39349A[i10], f39350B[i10], f28824z[i10]);
            }
            if (i8 != 0 && this.f28838n != i8) {
                this.f28838n = i8;
                int i11 = i8 - 1;
                m5341m(0, 1, 1, false, false, f39354F[i11], f39353E[i11]);
                m5340n(f28821w, f39355G[i11], f28822x);
            }
        }

        /* renamed from: i */
        public boolean m5345i() {
            return this.f28827c;
        }

        /* renamed from: j */
        public boolean m5344j() {
            return !m5345i() || (this.f28825a.isEmpty() && this.f28826b.length() == 0);
        }

        /* renamed from: k */
        public boolean m5343k() {
            return this.f28828d;
        }

        /* renamed from: l */
        public void m5342l() {
            m5349e();
            this.f28827c = false;
            this.f28828d = false;
            this.f28829e = 4;
            this.f28830f = false;
            this.f28831g = 0;
            this.f28832h = 0;
            this.f28833i = 0;
            this.f28834j = 15;
            this.f28835k = true;
            this.f28836l = 0;
            this.f28837m = 0;
            this.f28838n = 0;
            int i = f28822x;
            this.f28839o = i;
            this.f28843s = f28821w;
            this.f28845u = i;
        }

        /* renamed from: m */
        public void m5341m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f28840p != -1) {
                if (!z) {
                    this.f28826b.setSpan(new StyleSpan(2), this.f28840p, this.f28826b.length(), 33);
                    this.f28840p = -1;
                }
            } else if (z) {
                this.f28840p = this.f28826b.length();
            }
            if (this.f28841q != -1) {
                if (!z2) {
                    this.f28826b.setSpan(new UnderlineSpan(), this.f28841q, this.f28826b.length(), 33);
                    this.f28841q = -1;
                }
            } else if (z2) {
                this.f28841q = this.f28826b.length();
            }
        }

        /* renamed from: n */
        public void m5340n(int i, int i2, int i3) {
            if (!(this.f28842r == -1 || this.f28843s == i)) {
                this.f28826b.setSpan(new ForegroundColorSpan(this.f28843s), this.f28842r, this.f28826b.length(), 33);
            }
            if (i != f28821w) {
                this.f28842r = this.f28826b.length();
                this.f28843s = i;
            }
            if (!(this.f28844t == -1 || this.f28845u == i2)) {
                this.f28826b.setSpan(new BackgroundColorSpan(this.f28845u), this.f28844t, this.f28826b.length(), 33);
            }
            if (i2 != f28822x) {
                this.f28844t = this.f28826b.length();
                this.f28845u = i2;
            }
        }

        /* renamed from: o */
        public void m5339o(int i, int i2) {
            if (this.f28846v != i) {
                m5353a('\n');
            }
            this.f28846v = i;
        }

        /* renamed from: p */
        public void m5338p(boolean z) {
            this.f28828d = z;
        }

        /* renamed from: q */
        public void m5337q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f28839o = i;
            this.f28836l = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.c$c */
    /* loaded from: classes7.dex */
    public static final class C0413c {

        /* renamed from: a */
        public final int f28847a;

        /* renamed from: b */
        public final int f28848b;

        /* renamed from: c */
        public final byte[] f28849c;

        /* renamed from: d */
        int f28850d = 0;

        public C0413c(int i, int i2) {
            this.f28847a = i;
            this.f28848b = i2;
            this.f28849c = new byte[(i2 * 2) - 1];
        }
    }

    public C12816c(int i, List<byte[]> list) {
        boolean z = true;
        this.f28811k = i == -1 ? 1 : i;
        this.f28810j = (list == null || !C7518d.m22343h(list)) ? false : z;
        this.f28812l = new C12818b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f28812l[i2] = new C12818b();
        }
        this.f28813m = this.f28812l[0];
    }

    /* renamed from: A */
    private void m5373A() {
        int h = C12818b.m5346h(this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2));
        int h2 = C12818b.m5346h(this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2));
        this.f28808h.m22034r(2);
        this.f28813m.m5340n(h, h2, C12818b.m5347g(this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2)));
    }

    /* renamed from: B */
    private void m5372B() {
        this.f28808h.m22034r(4);
        int h = this.f28808h.m22044h(4);
        this.f28808h.m22034r(2);
        this.f28813m.m5339o(h, this.f28808h.m22044h(6));
    }

    /* renamed from: C */
    private void m5371C() {
        int h = C12818b.m5346h(this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2));
        int h2 = this.f28808h.m22044h(2);
        int g = C12818b.m5347g(this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22044h(2));
        if (this.f28808h.m22045g()) {
            h2 |= 4;
        }
        boolean g2 = this.f28808h.m22045g();
        int h3 = this.f28808h.m22044h(2);
        int h4 = this.f28808h.m22044h(2);
        int h5 = this.f28808h.m22044h(2);
        this.f28808h.m22034r(8);
        this.f28813m.m5337q(h, g, g2, h2, h3, h4, h5);
    }

    /* renamed from: D */
    private void m5370D() {
        C0413c cVar = this.f28816p;
        if (cVar.f28850d != (cVar.f28848b * 2) - 1) {
            C7558r.m22110b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f28816p.f28848b * 2) - 1) + ", but current index is " + this.f28816p.f28850d + " (sequence number " + this.f28816p.f28847a + ");");
        }
        C7569x xVar = this.f28808h;
        C0413c cVar2 = this.f28816p;
        xVar.m22037o(cVar2.f28849c, cVar2.f28850d);
        int h = this.f28808h.m22044h(3);
        int h2 = this.f28808h.m22044h(5);
        if (h == 7) {
            this.f28808h.m22034r(2);
            h = this.f28808h.m22044h(6);
            if (h < 7) {
                C7558r.m22104h("Cea708Decoder", "Invalid extended service number: " + h);
            }
        }
        if (h2 == 0) {
            if (h != 0) {
                C7558r.m22104h("Cea708Decoder", "serviceNumber is non-zero (" + h + ") when blockSize is 0");
            }
        } else if (h == this.f28811k) {
            boolean z = false;
            while (this.f28808h.m22050b() > 0) {
                int h3 = this.f28808h.m22044h(8);
                if (h3 == 16) {
                    int h4 = this.f28808h.m22044h(8);
                    if (h4 <= 31) {
                        m5364s(h4);
                    } else {
                        if (h4 <= 127) {
                            m5359x(h4);
                        } else if (h4 <= 159) {
                            m5363t(h4);
                        } else if (h4 <= 255) {
                            m5358y(h4);
                        } else {
                            C7558r.m22104h("Cea708Decoder", "Invalid extended command: " + h4);
                        }
                        z = true;
                    }
                } else if (h3 <= 31) {
                    m5366q(h3);
                } else {
                    if (h3 <= 127) {
                        m5361v(h3);
                    } else if (h3 <= 159) {
                        m5365r(h3);
                    } else if (h3 <= 255) {
                        m5360w(h3);
                    } else {
                        C7558r.m22104h("Cea708Decoder", "Invalid base command: " + h3);
                    }
                    z = true;
                }
            }
            if (z) {
                this.f28814n = m5367p();
            }
        }
    }

    /* renamed from: E */
    private void m5369E() {
        for (int i = 0; i < 8; i++) {
            this.f28812l[i].m5342l();
        }
    }

    /* renamed from: o */
    private void m5368o() {
        if (this.f28816p != null) {
            m5370D();
            this.f28816p = null;
        }
    }

    /* renamed from: p */
    private List<C12453b> m5367p() {
        C12817a c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f28812l[i].m5344j() && this.f28812l[i].m5343k() && (c = this.f28812l[i].m5351c()) != null) {
                arrayList.add(c);
            }
        }
        Collections.sort(arrayList, C12817a.f28818c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C12817a) arrayList.get(i2)).f28819a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: q */
    private void m5366q(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f28814n = m5367p();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m5369E();
                    return;
                case 13:
                    this.f28813m.m5353a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        C7558r.m22104h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f28808h.m22034r(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        C7558r.m22104h("Cea708Decoder", "Invalid C0 command: " + i);
                        return;
                    } else {
                        C7558r.m22104h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f28808h.m22034r(16);
                        return;
                    }
            }
        } else {
            this.f28813m.m5352b();
        }
    }

    /* renamed from: r */
    private void m5365r(int i) {
        C12818b bVar;
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.f28817q != i3) {
                    this.f28817q = i3;
                    this.f28813m = this.f28812l[i3];
                    return;
                }
                return;
            case 136:
                while (i2 <= 8) {
                    if (this.f28808h.m22045g()) {
                        this.f28812l[8 - i2].m5349e();
                    }
                    i2++;
                }
                return;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f28808h.m22045g()) {
                        this.f28812l[8 - i4].m5338p(true);
                    }
                }
                return;
            case 138:
                while (i2 <= 8) {
                    if (this.f28808h.m22045g()) {
                        this.f28812l[8 - i2].m5338p(false);
                    }
                    i2++;
                }
                return;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f28808h.m22045g()) {
                        this.f28812l[8 - i5].m5338p(!bVar.m5343k());
                    }
                }
                return;
            case 140:
                while (i2 <= 8) {
                    if (this.f28808h.m22045g()) {
                        this.f28812l[8 - i2].m5342l();
                    }
                    i2++;
                }
                return;
            case 141:
                this.f28808h.m22034r(8);
                return;
            case 142:
                return;
            case 143:
                m5369E();
                return;
            case 144:
                if (!this.f28813m.m5345i()) {
                    this.f28808h.m22034r(16);
                    return;
                } else {
                    m5357z();
                    return;
                }
            case 145:
                if (!this.f28813m.m5345i()) {
                    this.f28808h.m22034r(24);
                    return;
                } else {
                    m5373A();
                    return;
                }
            case 146:
                if (!this.f28813m.m5345i()) {
                    this.f28808h.m22034r(16);
                    return;
                } else {
                    m5372B();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                C7558r.m22104h("Cea708Decoder", "Invalid C1 command: " + i);
                return;
            case 151:
                if (!this.f28813m.m5345i()) {
                    this.f28808h.m22034r(32);
                    return;
                } else {
                    m5371C();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                m5362u(i6);
                if (this.f28817q != i6) {
                    this.f28817q = i6;
                    this.f28813m = this.f28812l[i6];
                    return;
                }
                return;
        }
    }

    /* renamed from: s */
    private void m5364s(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f28808h.m22034r(8);
            } else if (i <= 23) {
                this.f28808h.m22034r(16);
            } else if (i <= 31) {
                this.f28808h.m22034r(24);
            }
        }
    }

    /* renamed from: t */
    private void m5363t(int i) {
        if (i <= 135) {
            this.f28808h.m22034r(32);
        } else if (i <= 143) {
            this.f28808h.m22034r(40);
        } else if (i <= 159) {
            this.f28808h.m22034r(2);
            this.f28808h.m22034r(this.f28808h.m22044h(6) * 8);
        }
    }

    /* renamed from: u */
    private void m5362u(int i) {
        C12818b bVar = this.f28812l[i];
        this.f28808h.m22034r(2);
        boolean g = this.f28808h.m22045g();
        boolean g2 = this.f28808h.m22045g();
        boolean g3 = this.f28808h.m22045g();
        int h = this.f28808h.m22044h(3);
        boolean g4 = this.f28808h.m22045g();
        int h2 = this.f28808h.m22044h(7);
        int h3 = this.f28808h.m22044h(8);
        int h4 = this.f28808h.m22044h(4);
        int h5 = this.f28808h.m22044h(4);
        this.f28808h.m22034r(2);
        int h6 = this.f28808h.m22044h(6);
        this.f28808h.m22034r(2);
        bVar.m5348f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f28808h.m22044h(3), this.f28808h.m22044h(3));
    }

    /* renamed from: v */
    private void m5361v(int i) {
        if (i == 127) {
            this.f28813m.m5353a((char) 9835);
        } else {
            this.f28813m.m5353a((char) (i & 255));
        }
    }

    /* renamed from: w */
    private void m5360w(int i) {
        this.f28813m.m5353a((char) (i & 255));
    }

    /* renamed from: x */
    private void m5359x(int i) {
        if (i == 32) {
            this.f28813m.m5353a(' ');
        } else if (i == 33) {
            this.f28813m.m5353a((char) 160);
        } else if (i == 37) {
            this.f28813m.m5353a((char) 8230);
        } else if (i == 42) {
            this.f28813m.m5353a((char) 352);
        } else if (i == 44) {
            this.f28813m.m5353a((char) 338);
        } else if (i == 63) {
            this.f28813m.m5353a((char) 376);
        } else if (i == 57) {
            this.f28813m.m5353a((char) 8482);
        } else if (i == 58) {
            this.f28813m.m5353a((char) 353);
        } else if (i == 60) {
            this.f28813m.m5353a((char) 339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f28813m.m5353a((char) 9608);
                    return;
                case 49:
                    this.f28813m.m5353a((char) 8216);
                    return;
                case 50:
                    this.f28813m.m5353a((char) 8217);
                    return;
                case 51:
                    this.f28813m.m5353a((char) 8220);
                    return;
                case 52:
                    this.f28813m.m5353a((char) 8221);
                    return;
                case 53:
                    this.f28813m.m5353a((char) 8226);
                    return;
                default:
                    switch (i) {
                        case 118:
                            this.f28813m.m5353a((char) 8539);
                            return;
                        case 119:
                            this.f28813m.m5353a((char) 8540);
                            return;
                        case 120:
                            this.f28813m.m5353a((char) 8541);
                            return;
                        case 121:
                            this.f28813m.m5353a((char) 8542);
                            return;
                        case 122:
                            this.f28813m.m5353a((char) 9474);
                            return;
                        case 123:
                            this.f28813m.m5353a((char) 9488);
                            return;
                        case 124:
                            this.f28813m.m5353a((char) 9492);
                            return;
                        case 125:
                            this.f28813m.m5353a((char) 9472);
                            return;
                        case 126:
                            this.f28813m.m5353a((char) 9496);
                            return;
                        case 127:
                            this.f28813m.m5353a((char) 9484);
                            return;
                        default:
                            C7558r.m22104h("Cea708Decoder", "Invalid G2 character: " + i);
                            return;
                    }
            }
        } else {
            this.f28813m.m5353a((char) 8480);
        }
    }

    /* renamed from: y */
    private void m5358y(int i) {
        if (i == 160) {
            this.f28813m.m5353a((char) 13252);
            return;
        }
        C7558r.m22104h("Cea708Decoder", "Invalid G3 character: " + i);
        this.f28813m.m5353a('_');
    }

    /* renamed from: z */
    private void m5357z() {
        this.f28813m.m5341m(this.f28808h.m22044h(4), this.f28808h.m22044h(2), this.f28808h.m22044h(2), this.f28808h.m22045g(), this.f28808h.m22045g(), this.f28808h.m22044h(3), this.f28808h.m22044h(3));
    }

    @Override // p337s8.AbstractC12820e, p317r8.AbstractC12459g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo5335a(long j) {
        super.mo5335a(j);
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: e */
    protected AbstractC12458f mo5331e() {
        List<C12453b> list = this.f28814n;
        this.f28815o = list;
        return new C12824f((List) C7510a.m22367e(list));
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: f */
    protected void mo5330f(C12463j jVar) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C7510a.m22367e(jVar.f17798m);
        this.f28807g.m22019N(byteBuffer.array(), byteBuffer.limit());
        while (this.f28807g.m22015a() >= 3) {
            int D = this.f28807g.m22029D() & 7;
            int i = D & 3;
            boolean z2 = false;
            if ((D & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte D2 = (byte) this.f28807g.m22029D();
            byte D3 = (byte) this.f28807g.m22029D();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m5368o();
                        int i2 = (D2 & 192) >> 6;
                        int i3 = this.f28809i;
                        if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                            m5369E();
                            C7558r.m22104h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f28809i + " current=" + i2);
                        }
                        this.f28809i = i2;
                        int i4 = D2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C0413c cVar = new C0413c(i2, i4);
                        this.f28816p = cVar;
                        byte[] bArr = cVar.f28849c;
                        int i5 = cVar.f28850d;
                        cVar.f28850d = i5 + 1;
                        bArr[i5] = D3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        C7510a.m22371a(z2);
                        C0413c cVar2 = this.f28816p;
                        if (cVar2 == null) {
                            C7558r.m22109c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f28849c;
                            int i6 = cVar2.f28850d;
                            int i7 = i6 + 1;
                            bArr2[i6] = D2;
                            cVar2.f28850d = i7 + 1;
                            bArr2[i7] = D3;
                        }
                    }
                    C0413c cVar3 = this.f28816p;
                    if (cVar3.f28850d == (cVar3.f28848b * 2) - 1) {
                        m5368o();
                    }
                }
            }
        }
    }

    @Override // p337s8.AbstractC12820e, p152i7.AbstractC8220e
    public void flush() {
        super.flush();
        this.f28814n = null;
        this.f28815o = null;
        this.f28817q = 0;
        this.f28813m = this.f28812l[0];
        m5369E();
        this.f28816p = null;
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C12463j mo5329g() {
        return super.mo5332d();
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ AbstractC12464k mo5328h() {
        return super.mo5334b();
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: k */
    protected boolean mo5325k() {
        return this.f28814n != this.f28815o;
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo5324l(C12463j jVar) {
        super.mo5333c(jVar);
    }

    @Override // p337s8.AbstractC12820e, p152i7.AbstractC8220e
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
