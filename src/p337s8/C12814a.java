package p337s8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p317r8.AbstractC12458f;
import p317r8.AbstractC12464k;
import p317r8.C12453b;
import p317r8.C12463j;

/* renamed from: s8.a */
/* loaded from: classes7.dex */
public final class C12814a extends AbstractC12820e {

    /* renamed from: h */
    private final int f28779h;

    /* renamed from: i */
    private final int f28780i;

    /* renamed from: j */
    private final int f28781j;

    /* renamed from: k */
    private final long f28782k;

    /* renamed from: n */
    private List<C12453b> f28785n;

    /* renamed from: o */
    private List<C12453b> f28786o;

    /* renamed from: p */
    private int f28787p;

    /* renamed from: q */
    private int f28788q;

    /* renamed from: r */
    private boolean f28789r;

    /* renamed from: s */
    private boolean f28790s;

    /* renamed from: t */
    private byte f28791t;

    /* renamed from: u */
    private byte f28792u;

    /* renamed from: w */
    private boolean f28794w;

    /* renamed from: x */
    private long f28795x;

    /* renamed from: y */
    private static final int[] f28776y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    private static final int[] f28777z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    private static final int[] f39343A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    private static final int[] f39344B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    private static final int[] f39345C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    private static final int[] f39346D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    private static final int[] f39347E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    private static final boolean[] f39348F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    private final C7570y f28778g = new C7570y();

    /* renamed from: l */
    private final ArrayList<C0411a> f28783l = new ArrayList<>();

    /* renamed from: m */
    private C0411a f28784m = new C0411a(0, 4);

    /* renamed from: v */
    private int f28793v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.a$a */
    /* loaded from: classes7.dex */
    public static final class C0411a {

        /* renamed from: a */
        private final List<C0412a> f28796a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f28797b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f28798c = new StringBuilder();

        /* renamed from: d */
        private int f28799d;

        /* renamed from: e */
        private int f28800e;

        /* renamed from: f */
        private int f28801f;

        /* renamed from: g */
        private int f28802g;

        /* renamed from: h */
        private int f28803h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s8.a$a$a */
        /* loaded from: classes7.dex */
        public static class C0412a {

            /* renamed from: a */
            public final int f28804a;

            /* renamed from: b */
            public final boolean f28805b;

            /* renamed from: c */
            public int f28806c;

            public C0412a(int i, boolean z, int i2) {
                this.f28804a = i;
                this.f28805b = z;
                this.f28806c = i2;
            }
        }

        public C0411a(int i, int i2) {
            m5381j(i);
            this.f28803h = i2;
        }

        /* renamed from: h */
        private SpannableString m5383h() {
            int i;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28798c);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            while (i6 < this.f28796a.size()) {
                C0412a aVar = this.f28796a.get(i6);
                boolean z3 = aVar.f28805b;
                int i8 = aVar.f28804a;
                if (i8 != 8) {
                    if (i8 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i8 != 7) {
                        i5 = C12814a.f39343A[i8];
                    }
                    z2 = z;
                }
                int i9 = aVar.f28806c;
                i6++;
                if (i6 < this.f28796a.size()) {
                    i = this.f28796a.get(i6).f28806c;
                } else {
                    i = length;
                }
                if (i9 != i) {
                    if (i2 != -1 && !z3) {
                        m5374q(spannableStringBuilder, i2, i9);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i9;
                    }
                    if (i3 != -1 && !z2) {
                        m5376o(spannableStringBuilder, i3, i9);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i5 != i4) {
                        m5377n(spannableStringBuilder, i7, i9, i4);
                        i4 = i5;
                        i7 = i9;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                m5374q(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                m5376o(spannableStringBuilder, i3, length);
            }
            if (i7 != length) {
                m5377n(spannableStringBuilder, i7, length, i4);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: n */
        private static void m5377n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        /* renamed from: o */
        private static void m5376o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: q */
        private static void m5374q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: e */
        public void m5386e(char c) {
            if (this.f28798c.length() < 32) {
                this.f28798c.append(c);
            }
        }

        /* renamed from: f */
        public void m5385f() {
            int length = this.f28798c.length();
            if (length > 0) {
                this.f28798c.delete(length - 1, length);
                for (int size = this.f28796a.size() - 1; size >= 0; size--) {
                    C0412a aVar = this.f28796a.get(size);
                    int i = aVar.f28806c;
                    if (i == length) {
                        aVar.f28806c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: g */
        public C12453b m5384g(int i) {
            float f;
            int i2 = this.f28800e + this.f28801f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f28797b.size(); i4++) {
                spannableStringBuilder.append(C7557q0.m22168X0(this.f28797b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(C7557q0.m22168X0(m5383h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f28802g == 2 && (Math.abs(i5) < 3 || length < 0)) {
                    i = 1;
                } else if (this.f28802g != 2 || i5 <= 0) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.f28799d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f28802g == 1) {
                i6 -= this.f28803h - 1;
            }
            return new C12453b.C0400b().m6682n(spannableStringBuilder).m6681o(Layout.Alignment.ALIGN_NORMAL).m6688h(i6, 1).m6686j(f).m6685k(i).m6695a();
        }

        /* renamed from: i */
        public boolean m5382i() {
            if (!this.f28796a.isEmpty() || !this.f28797b.isEmpty() || this.f28798c.length() != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public void m5381j(int i) {
            this.f28802g = i;
            this.f28796a.clear();
            this.f28797b.clear();
            this.f28798c.setLength(0);
            this.f28799d = 15;
            this.f28800e = 0;
            this.f28801f = 0;
        }

        /* renamed from: k */
        public void m5380k() {
            this.f28797b.add(m5383h());
            this.f28798c.setLength(0);
            this.f28796a.clear();
            int min = Math.min(this.f28803h, this.f28799d);
            while (this.f28797b.size() >= min) {
                this.f28797b.remove(0);
            }
        }

        /* renamed from: l */
        public void m5379l(int i) {
            this.f28802g = i;
        }

        /* renamed from: m */
        public void m5378m(int i) {
            this.f28803h = i;
        }

        /* renamed from: p */
        public void m5375p(int i, boolean z) {
            this.f28796a.add(new C0412a(i, z, this.f28798c.length()));
        }
    }

    public C12814a(String str, int i, long j) {
        long j2;
        int i2;
        if (j > 0) {
            j2 = j * 1000;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f28782k = j2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f28779h = i2;
        if (i == 1) {
            this.f28781j = 0;
            this.f28780i = 0;
        } else if (i == 2) {
            this.f28781j = 1;
            this.f28780i = 0;
        } else if (i == 3) {
            this.f28781j = 0;
            this.f28780i = 1;
        } else if (i != 4) {
            C7558r.m22104h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f28781j = 0;
            this.f28780i = 0;
        } else {
            this.f28781j = 1;
            this.f28780i = 1;
        }
        m5406M(0);
        m5407L();
        this.f28794w = true;
        this.f28795x = -9223372036854775807L;
    }

    /* renamed from: A */
    private static boolean m5418A(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: B */
    private static boolean m5417B(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: C */
    private static boolean m5416C(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: D */
    private static boolean m5415D(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: E */
    private static boolean m5414E(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: F */
    private boolean m5413F(boolean z, byte b, byte b2) {
        if (!z || !m5414E(b)) {
            this.f28790s = false;
        } else if (this.f28790s && this.f28791t == b && this.f28792u == b2) {
            this.f28790s = false;
            return true;
        } else {
            this.f28790s = true;
            this.f28791t = b;
            this.f28792u = b2;
        }
        return false;
    }

    /* renamed from: G */
    private static boolean m5412G(byte b) {
        return (b & 247) == 20;
    }

    /* renamed from: H */
    private static boolean m5411H(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: I */
    private static boolean m5410I(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: J */
    private static boolean m5409J(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: K */
    private void m5408K(byte b, byte b2) {
        if (m5409J(b)) {
            this.f28794w = false;
        } else if (m5412G(b)) {
            if (!(b2 == 32 || b2 == 47)) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f28794w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f28794w = true;
        }
    }

    /* renamed from: L */
    private void m5407L() {
        this.f28784m.m5381j(this.f28787p);
        this.f28783l.clear();
        this.f28783l.add(this.f28784m);
    }

    /* renamed from: M */
    private void m5406M(int i) {
        int i2 = this.f28787p;
        if (i2 != i) {
            this.f28787p = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f28783l.size(); i3++) {
                    this.f28783l.get(i3).m5379l(i);
                }
                return;
            }
            m5407L();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f28785n = Collections.emptyList();
            }
        }
    }

    /* renamed from: N */
    private void m5405N(int i) {
        this.f28788q = i;
        this.f28784m.m5378m(i);
    }

    /* renamed from: O */
    private boolean m5404O() {
        if (this.f28782k == -9223372036854775807L || this.f28795x == -9223372036854775807L || m5326j() - this.f28795x < this.f28782k) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    private boolean m5403P(byte b) {
        if (m5391z(b)) {
            this.f28793v = m5400q(b);
        }
        if (this.f28793v == this.f28781j) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private static char m5401p(byte b) {
        return (char) f39344B[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: q */
    private static int m5400q(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: r */
    private List<C12453b> m5399r() {
        int size = this.f28783l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C12453b g = this.f28783l.get(i2).m5384g(Integer.MIN_VALUE);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.f28086h);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C12453b bVar = (C12453b) arrayList.get(i3);
            if (bVar != null) {
                if (bVar.f28086h != i) {
                    bVar = (C12453b) C7510a.m22367e(this.f28783l.get(i3).m5384g(i));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: s */
    private static char m5398s(byte b) {
        return (char) f39346D[b & 31];
    }

    /* renamed from: t */
    private static char m5397t(byte b) {
        return (char) f39347E[b & 31];
    }

    /* renamed from: u */
    private static char m5396u(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m5398s(b2);
        }
        return m5397t(b2);
    }

    /* renamed from: v */
    private static char m5395v(byte b) {
        return (char) f39345C[b & 15];
    }

    /* renamed from: w */
    private void m5394w(byte b) {
        boolean z;
        this.f28784m.m5386e(' ');
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f28784m.m5375p((b >> 1) & 7, z);
    }

    /* renamed from: x */
    private void m5393x(byte b) {
        if (b == 32) {
            m5406M(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m5406M(1);
                    m5405N(2);
                    return;
                case 38:
                    m5406M(1);
                    m5405N(3);
                    return;
                case 39:
                    m5406M(1);
                    m5405N(4);
                    return;
                default:
                    int i = this.f28787p;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f28785n = Collections.emptyList();
                                    int i2 = this.f28787p;
                                    if (i2 == 1 || i2 == 3) {
                                        m5407L();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i == 1 && !this.f28784m.m5382i()) {
                                        this.f28784m.m5380k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    m5407L();
                                    return;
                                case 47:
                                    this.f28785n = m5399r();
                                    m5407L();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f28784m.m5385f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            m5406M(3);
        }
    }

    /* renamed from: y */
    private void m5392y(byte b, byte b2) {
        boolean z;
        boolean z2;
        int i;
        int i2 = f28776y[b & 7];
        boolean z3 = false;
        if ((b2 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2++;
        }
        if (i2 != this.f28784m.f28799d) {
            if (this.f28787p != 1 && !this.f28784m.m5382i()) {
                C0411a aVar = new C0411a(this.f28787p, this.f28788q);
                this.f28784m = aVar;
                this.f28783l.add(aVar);
            }
            this.f28784m.f28799d = i2;
        }
        if ((b2 & 16) == 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b2 & 1) == 1) {
            z3 = true;
        }
        int i3 = (b2 >> 1) & 7;
        C0411a aVar2 = this.f28784m;
        if (z2) {
            i = 8;
        } else {
            i = i3;
        }
        aVar2.m5375p(i, z3);
        if (z2) {
            this.f28784m.f28800e = f28777z[i3];
        }
    }

    /* renamed from: z */
    private static boolean m5391z(byte b) {
        return (b & 224) == 0;
    }

    @Override // p337s8.AbstractC12820e, p317r8.AbstractC12459g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo5335a(long j) {
        super.mo5335a(j);
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: e */
    protected AbstractC12458f mo5331e() {
        List<C12453b> list = this.f28785n;
        this.f28786o = list;
        return new C12824f((List) C7510a.m22367e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0017 A[SYNTHETIC] */
    @Override // p337s8.AbstractC12820e
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo5330f(p317r8.C12463j r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337s8.C12814a.mo5330f(r8.j):void");
    }

    @Override // p337s8.AbstractC12820e, p152i7.AbstractC8220e
    public void flush() {
        super.flush();
        this.f28785n = null;
        this.f28786o = null;
        m5406M(0);
        m5405N(4);
        m5407L();
        this.f28789r = false;
        this.f28790s = false;
        this.f28791t = (byte) 0;
        this.f28792u = (byte) 0;
        this.f28793v = 0;
        this.f28794w = true;
        this.f28795x = -9223372036854775807L;
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C12463j mo5329g() {
        return super.mo5332d();
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: h */
    public AbstractC12464k mo5334b() {
        AbstractC12464k i;
        AbstractC12464k h = super.mo5334b();
        if (h != null) {
            return h;
        }
        if (!m5404O() || (i = m5327i()) == null) {
            return null;
        }
        this.f28785n = Collections.emptyList();
        this.f28795x = -9223372036854775807L;
        i.m6666o(m5326j(), mo5331e(), Long.MAX_VALUE);
        return i;
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: k */
    protected boolean mo5325k() {
        return this.f28785n != this.f28786o;
    }

    @Override // p337s8.AbstractC12820e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo5324l(C12463j jVar) {
        super.mo5333c(jVar);
    }

    @Override // p337s8.AbstractC12820e, p152i7.AbstractC8220e
    public void release() {
    }
}
