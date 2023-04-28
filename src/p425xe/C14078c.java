package p425xe;

import com.otaliastudios.zoom.OverZoomRangeProvider;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import eg.C6884j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p405we.C13869b;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001IB\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010HJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\"\u0010 \u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u001fR\"\u0010*\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b$\u0010\u0011\"\u0004\b+\u0010\u001fR\"\u0010.\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00105\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010>\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u001a\u0010A\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010C\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bB\u0010@\u001a\u0004\b!\u0010\u0011¨\u0006J"}, m15073d2 = {"Lxe/c;", "Lxe/a;", "", "realZoom", "n", "(F)F", "zoom", "u", "maxZoom", "", "type", "", "p", "(FI)V", "minZoom", "q", "i", "()F", "f", "value", "", "allowOverZoom", "b", "(FZ)F", "Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "c", "F", "k", "t", "(F)V", "transformationZoom", "d", "h", "setMinZoom", "e", "I", "j", "()I", "setMinZoomMode", "(I)V", "minZoomMode", "setMaxZoom", "g", "setMaxZoomMode", "maxZoomMode", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "getOverZoomRangeProvider$library_release", "()Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "s", "(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V", "overZoomRangeProvider", "Z", "l", "()Z", "o", "(Z)V", "isEnabled", "m", "r", "isOverEnabled", "getMaxOverZoomIn$library_release$annotations", "()V", "maxOverZoomIn", "getMaxOverZoomOut$library_release$annotations", "maxOverZoomOut", "Lkotlin/Function0;", "Lwe/b;", "provider", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;Lkotlin/jvm/functions/Function0;)V", "a", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: xe.c */
/* loaded from: classes6.dex */
public final class C14078c extends AbstractC14075a {

    /* renamed from: k */
    public static final C14079a f31783k = new C14079a(null);

    /* renamed from: l */
    private static final String f31784l;

    /* renamed from: m */
    private static final ZoomLogger f31785m;

    /* renamed from: b */
    private final ZoomEngine f31786b;

    /* renamed from: c */
    private float f31787c;

    /* renamed from: e */
    private int f31789e;

    /* renamed from: g */
    private int f31791g;

    /* renamed from: d */
    private float f31788d = 0.8f;

    /* renamed from: f */
    private float f31790f = 2.5f;

    /* renamed from: h */
    private OverZoomRangeProvider f31792h = OverZoomRangeProvider.f12383b;

    /* renamed from: i */
    private boolean f31793i = true;

    /* renamed from: j */
    private boolean f31794j = true;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lxe/c$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: xe.c$a */
    /* loaded from: classes6.dex */
    public static final class C14079a {
        private C14079a() {
        }

        public /* synthetic */ C14079a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String TAG = C14078c.class.getSimpleName();
        f31784l = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f31785m = aVar.m26250a(TAG);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14078c(ZoomEngine engine, Function0<C13869b> provider) {
        super(provider);
        C9971q.m14633g(engine, "engine");
        C9971q.m14633g(provider, "provider");
        this.f31786b = engine;
    }

    /* renamed from: b */
    public final float m1736b(float f, boolean z) {
        float i;
        float i2 = m1729i();
        float f2 = m1732f();
        if (z && m1725m()) {
            i2 -= m1734d();
            f2 += m1735c();
        }
        if (f2 < i2) {
            int i3 = this.f31791g;
            if (i3 == this.f31789e) {
                throw new IllegalStateException("maxZoom is less than minZoom: " + f2 + " < " + i2);
            } else if (i3 == 0) {
                i2 = f2;
            } else {
                f2 = i2;
            }
        }
        i = C6884j.m23955i(f, i2, f2);
        return i;
    }

    /* renamed from: c */
    public final float m1735c() {
        float b;
        float a = this.f31792h.mo26351a(this.f31786b, true);
        if (a >= 0.0f) {
            return a;
        }
        f31785m.m26252g("Received negative maxOverZoomIn value, coercing to 0");
        b = C6884j.m23962b(a, 0.0f);
        return b;
    }

    /* renamed from: d */
    public final float m1734d() {
        float b;
        float a = this.f31792h.mo26351a(this.f31786b, false);
        if (a >= 0.0f) {
            return a;
        }
        f31785m.m26252g("Received negative maxOverZoomOut value, coercing to 0");
        b = C6884j.m23962b(a, 0.0f);
        return b;
    }

    /* renamed from: e */
    public final float m1733e() {
        return this.f31790f;
    }

    /* renamed from: f */
    public final float m1732f() {
        int i = this.f31791g;
        if (i == 0) {
            return m1717u(this.f31790f);
        }
        if (i == 1) {
            return this.f31790f;
        }
        throw new IllegalArgumentException(C9971q.m14624p("Unknown ZoomType ", Integer.valueOf(this.f31791g)));
    }

    /* renamed from: g */
    public final int m1731g() {
        return this.f31791g;
    }

    /* renamed from: h */
    public final float m1730h() {
        return this.f31788d;
    }

    /* renamed from: i */
    public final float m1729i() {
        int i = this.f31789e;
        if (i == 0) {
            return m1717u(this.f31788d);
        }
        if (i == 1) {
            return this.f31788d;
        }
        throw new IllegalArgumentException(C9971q.m14624p("Unknown ZoomType ", Integer.valueOf(this.f31789e)));
    }

    /* renamed from: j */
    public final int m1728j() {
        return this.f31789e;
    }

    /* renamed from: k */
    public final float m1727k() {
        return this.f31787c;
    }

    /* renamed from: l */
    public boolean m1726l() {
        return this.f31793i;
    }

    /* renamed from: m */
    public boolean m1725m() {
        return this.f31794j;
    }

    /* renamed from: n */
    public final float m1724n(float f) {
        return f / this.f31787c;
    }

    /* renamed from: o */
    public void m1723o(boolean z) {
        this.f31793i = z;
    }

    /* renamed from: p */
    public final void m1722p(float f, int i) {
        if (f >= 0.0f) {
            this.f31790f = f;
            this.f31791g = i;
            return;
        }
        throw new IllegalArgumentException("Max zoom should be >= 0.");
    }

    /* renamed from: q */
    public final void m1721q(float f, int i) {
        if (f >= 0.0f) {
            this.f31788d = f;
            this.f31789e = i;
            return;
        }
        throw new IllegalArgumentException("Min zoom should be >= 0");
    }

    /* renamed from: r */
    public void m1720r(boolean z) {
        this.f31794j = z;
    }

    /* renamed from: s */
    public final void m1719s(OverZoomRangeProvider overZoomRangeProvider) {
        C9971q.m14633g(overZoomRangeProvider, "<set-?>");
        this.f31792h = overZoomRangeProvider;
    }

    /* renamed from: t */
    public final void m1718t(float f) {
        this.f31787c = f;
    }

    /* renamed from: u */
    public final float m1717u(float f) {
        return f * this.f31787c;
    }
}
