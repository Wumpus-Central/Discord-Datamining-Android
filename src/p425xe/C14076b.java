package p425xe;

import android.annotation.SuppressLint;
import com.otaliastudios.zoom.C6106a;
import com.otaliastudios.zoom.OverPanRangeProvider;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import eg.C6884j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p405we.C13869b;

@Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0002G\u0010B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bE\u0010FJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010!\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\"\u0010%\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\"\u0010*\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010&\u001a\u0004\b\u001e\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00106\u001a\u0002028@X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\"\u00105R\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0017R\u0014\u0010:\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0017R\u001a\u0010>\u001a\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b3\u0010;R\u001a\u0010A\u001a\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010;¨\u0006H"}, m15073d2 = {"Lxe/b;", "Lxe/a;", "", "horizontal", "Lxe/b$b;", "output", "", "d", "(ZLxe/b$b;)V", "allowOverScroll", "", "c", "(ZZ)F", "", "gravity", "extraSpace", "b", "(IFZ)F", "Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "Z", "g", "()Z", "p", "(Z)V", "horizontalOverPanEnabled", "k", "s", "verticalOverPanEnabled", "e", "h", "q", "horizontalPanEnabled", "f", "l", "t", "verticalPanEnabled", "I", "()I", "o", "(I)V", "alignment", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "getOverPanRangeProvider$library_release", "()Lcom/otaliastudios/zoom/OverPanRangeProvider;", "r", "(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V", "overPanRangeProvider", "Lcom/otaliastudios/zoom/ScaledPoint;", "i", "Lcom/otaliastudios/zoom/ScaledPoint;", "()Lcom/otaliastudios/zoom/ScaledPoint;", "correction", "n", "isOverEnabled", "m", "isEnabled", "()F", "getMaxHorizontalOverPan$library_release$annotations", "()V", "maxHorizontalOverPan", "j", "getMaxVerticalOverPan$library_release$annotations", "maxVerticalOverPan", "Lkotlin/Function0;", "Lwe/b;", "provider", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;Lkotlin/jvm/functions/Function0;)V", "a", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: xe.b */
/* loaded from: classes6.dex */
public final class C14076b extends AbstractC14075a {

    /* renamed from: j */
    public static final C14077a f31768j = new C14077a(null);

    /* renamed from: k */
    private static final String f31769k;

    /* renamed from: l */
    private static final ZoomLogger f31770l;

    /* renamed from: b */
    private final ZoomEngine f31771b;

    /* renamed from: c */
    private boolean f31772c = true;

    /* renamed from: d */
    private boolean f31773d = true;

    /* renamed from: e */
    private boolean f31774e = true;

    /* renamed from: f */
    private boolean f31775f = true;

    /* renamed from: g */
    private int f31776g = 51;

    /* renamed from: h */
    private OverPanRangeProvider f31777h = OverPanRangeProvider.f12379b;

    /* renamed from: i */
    private final ScaledPoint f31778i = new ScaledPoint(0.0f, 0.0f, 3, null);

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lxe/b$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: xe.b$a */
    /* loaded from: classes6.dex */
    public static final class C14077a {
        private C14077a() {
        }

        public /* synthetic */ C14077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\nR(\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\r\u0010\bR(\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m15073d2 = {"Lxe/b$b;", "", "", "a", "I", "c", "()I", "h", "(I)V", "getMinValue$library_release$annotations", "()V", "minValue", "b", "e", "getCurrentValue$library_release$annotations", "currentValue", "g", "getMaxValue$library_release$annotations", "maxValue", "", "d", "Z", "()Z", "f", "(Z)V", "isInOverPan", "<init>", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: xe.b$b */
    /* loaded from: classes6.dex */
    public static final class C0455b {

        /* renamed from: a */
        private int f31779a;

        /* renamed from: b */
        private int f31780b;

        /* renamed from: c */
        private int f31781c;

        /* renamed from: d */
        private boolean f31782d;

        /* renamed from: a */
        public final int m1744a() {
            return this.f31780b;
        }

        /* renamed from: b */
        public final int m1743b() {
            return this.f31781c;
        }

        /* renamed from: c */
        public final int m1742c() {
            return this.f31779a;
        }

        /* renamed from: d */
        public final boolean m1741d() {
            return this.f31782d;
        }

        /* renamed from: e */
        public final void m1740e(int i) {
            this.f31780b = i;
        }

        /* renamed from: f */
        public final void m1739f(boolean z) {
            this.f31782d = z;
        }

        /* renamed from: g */
        public final void m1738g(int i) {
            this.f31781c = i;
        }

        /* renamed from: h */
        public final void m1737h(int i) {
            this.f31779a = i;
        }
    }

    static {
        String TAG = C14076b.class.getSimpleName();
        f31769k = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f31770l = aVar.m26250a(TAG);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14076b(ZoomEngine engine, Function0<C13869b> provider) {
        super(provider);
        C9971q.m14633g(engine, "engine");
        C9971q.m14633g(provider, "provider");
        this.f31771b = engine;
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: b */
    public final float m1763b(int i, float f, boolean z) {
        int i2 = z ? i & 7 : i & 112;
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 5) {
                    return f;
                }
                if (i2 != 16) {
                    if (i2 != 48 && i2 == 80) {
                        return f;
                    }
                }
            }
            return 0.0f;
        }
        return f * 0.5f;
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: c */
    public final float m1762c(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        boolean z3;
        float f4;
        int i;
        float f5;
        float i2;
        C13869b a = m1764a();
        if (z) {
            f = a.m2446w();
        } else {
            f = a.m2445x();
        }
        C13869b a2 = m1764a();
        if (z) {
            f2 = a2.m2456m();
        } else {
            f2 = a2.m2457l();
        }
        C13869b a3 = m1764a();
        if (z) {
            f3 = a3.m2453p();
        } else {
            f3 = a3.m2454o();
        }
        if (z) {
            z3 = this.f31772c;
        } else {
            z3 = this.f31773d;
        }
        float f6 = 0.0f;
        if (!z3 || !z2) {
            f4 = 0.0f;
        } else if (z) {
            f4 = m1756i();
        } else {
            f4 = m1755j();
        }
        if (z) {
            i = C6106a.f12421a.m26246d(this.f31776g, 0);
        } else {
            i = C6106a.f12421a.m26245e(this.f31776g, 0);
        }
        if (f3 <= f2) {
            f5 = f2 - f3;
            if (i != 0) {
                f6 = m1763b(i, f5, z);
                f5 = f6;
            }
        } else {
            f6 = f2 - f3;
            f5 = 0.0f;
        }
        i2 = C6884j.m23955i(f, f6 - f4, f5 + f4);
        return i2 - f;
    }

    /* renamed from: d */
    public final void m1761d(boolean z, C0455b output) {
        float f;
        float f2;
        float f3;
        int i;
        C9971q.m14633g(output, "output");
        C13869b a = m1764a();
        if (z) {
            f = a.m2446w();
        } else {
            f = a.m2445x();
        }
        int i2 = (int) f;
        C13869b a2 = m1764a();
        if (z) {
            f2 = a2.m2456m();
        } else {
            f2 = a2.m2457l();
        }
        int i3 = (int) f2;
        C13869b a3 = m1764a();
        if (z) {
            f3 = a3.m2453p();
        } else {
            f3 = a3.m2454o();
        }
        int i4 = (int) f3;
        boolean z2 = false;
        int c = (int) m1762c(z, false);
        if (z) {
            i = C6106a.f12421a.m26249a(this.f31776g);
        } else {
            i = C6106a.f12421a.m26248b(this.f31776g);
        }
        if (i4 > i3) {
            output.m1737h(-(i4 - i3));
            output.m1738g(0);
        } else if (C6106a.f12421a.m26247c(i)) {
            output.m1737h(0);
            output.m1738g(i3 - i4);
        } else {
            int i5 = i2 + c;
            output.m1737h(i5);
            output.m1738g(i5);
        }
        output.m1740e(i2);
        if (c != 0) {
            z2 = true;
        }
        output.m1739f(z2);
    }

    /* renamed from: e */
    public final int m1760e() {
        return this.f31776g;
    }

    /* renamed from: f */
    public final ScaledPoint m1759f() {
        this.f31778i.m26344g(Float.valueOf(m1762c(true, false)), Float.valueOf(m1762c(false, false)));
        return this.f31778i;
    }

    /* renamed from: g */
    public final boolean m1758g() {
        return this.f31772c;
    }

    /* renamed from: h */
    public final boolean m1757h() {
        return this.f31774e;
    }

    /* renamed from: i */
    public final float m1756i() {
        float b;
        float a = this.f31777h.mo26352a(this.f31771b, true);
        if (a >= 0.0f) {
            return a;
        }
        f31770l.m26252g("Received negative maxHorizontalOverPan value, coercing to 0");
        b = C6884j.m23962b(a, 0.0f);
        return b;
    }

    /* renamed from: j */
    public final float m1755j() {
        float b;
        float a = this.f31777h.mo26352a(this.f31771b, false);
        if (a >= 0.0f) {
            return a;
        }
        f31770l.m26252g("Received negative maxVerticalOverPan value, coercing to 0");
        b = C6884j.m23962b(a, 0.0f);
        return b;
    }

    /* renamed from: k */
    public final boolean m1754k() {
        return this.f31773d;
    }

    /* renamed from: l */
    public final boolean m1753l() {
        return this.f31775f;
    }

    /* renamed from: m */
    public boolean m1752m() {
        return this.f31774e || this.f31775f;
    }

    /* renamed from: n */
    public boolean m1751n() {
        return this.f31772c || this.f31773d;
    }

    /* renamed from: o */
    public final void m1750o(int i) {
        this.f31776g = i;
    }

    /* renamed from: p */
    public final void m1749p(boolean z) {
        this.f31772c = z;
    }

    /* renamed from: q */
    public final void m1748q(boolean z) {
        this.f31774e = z;
    }

    /* renamed from: r */
    public final void m1747r(OverPanRangeProvider overPanRangeProvider) {
        C9971q.m14633g(overPanRangeProvider, "<set-?>");
        this.f31777h = overPanRangeProvider;
    }

    /* renamed from: s */
    public final void m1746s(boolean z) {
        this.f31773d = z;
    }

    /* renamed from: t */
    public final void m1745t(boolean z) {
        this.f31775f = z;
    }
}
