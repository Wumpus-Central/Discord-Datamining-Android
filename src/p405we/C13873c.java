package p405we;

import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0003\tBa\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b \u0010\"R\u001a\u0010%\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0017\u0010\fR\u001a\u0010&\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0014\u0010'\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\f¨\u0006*"}, m15073d2 = {"Lwe/c;", "", "", "a", "F", "j", "()F", "zoom", "", "b", "Z", "l", "()Z", "isZoomRelative", "c", "canOverZoom", "Lcom/otaliastudios/zoom/AbsolutePoint;", "d", "Lcom/otaliastudios/zoom/AbsolutePoint;", "f", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "Lcom/otaliastudios/zoom/ScaledPoint;", "e", "Lcom/otaliastudios/zoom/ScaledPoint;", "i", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "k", "isPanRelative", "g", "canOverPan", "h", "Ljava/lang/Float;", "()Ljava/lang/Float;", "pivotX", "pivotY", "notify", "hasPan", "hasZoom", "<init>", "(FZZLcom/otaliastudios/zoom/AbsolutePoint;Lcom/otaliastudios/zoom/ScaledPoint;ZZLjava/lang/Float;Ljava/lang/Float;Z)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: we.c */
/* loaded from: classes6.dex */
public final class C13873c {

    /* renamed from: l */
    public static final C13875b f31251l = new C13875b(null);

    /* renamed from: m */
    private static final String f31252m;

    /* renamed from: n */
    private static final ZoomLogger f31253n;

    /* renamed from: a */
    private final float f31254a;

    /* renamed from: b */
    private final boolean f31255b;

    /* renamed from: c */
    private final boolean f31256c;

    /* renamed from: d */
    private final AbsolutePoint f31257d;

    /* renamed from: e */
    private final ScaledPoint f31258e;

    /* renamed from: f */
    private final boolean f31259f;

    /* renamed from: g */
    private final boolean f31260g;

    /* renamed from: h */
    private final Float f31261h;

    /* renamed from: i */
    private final Float f31262i;

    /* renamed from: j */
    private final boolean f31263j;

    /* renamed from: k */
    private final boolean f31264k;

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u0010#J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0011\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001cR(\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\"\u0010.\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001f\"\u0004\b(\u0010!¨\u00060"}, m15073d2 = {"Lwe/c$a;", "", "", "zoom", "", "overZoom", "", "i", "(FZ)V", "Lcom/otaliastudios/zoom/AbsolutePoint;", "delta", "overPan", "b", "(Lcom/otaliastudios/zoom/AbsolutePoint;Z)V", "pan", "d", "Lcom/otaliastudios/zoom/ScaledPoint;", "c", "(Lcom/otaliastudios/zoom/ScaledPoint;Z)V", "e", "pivotX", "pivotY", "f", "(Ljava/lang/Float;Ljava/lang/Float;)V", "Lwe/c;", "a", "()Lwe/c;", "F", "Z", "zoomRelative", "getOverZoom$library_release", "()Z", "setOverZoom$library_release", "(Z)V", "getOverZoom$library_release$annotations", "()V", "Lcom/otaliastudios/zoom/AbsolutePoint;", "Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "panRelative", "g", "getOverPan$library_release", "h", "Ljava/lang/Float;", "j", "getNotify$library_release", "notify", "<init>", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: we.c$a */
    /* loaded from: classes6.dex */
    public static final class C13874a {

        /* renamed from: b */
        private boolean f31266b;

        /* renamed from: c */
        private boolean f31267c;

        /* renamed from: d */
        private AbsolutePoint f31268d;

        /* renamed from: e */
        private ScaledPoint f31269e;

        /* renamed from: f */
        private boolean f31270f;

        /* renamed from: g */
        private boolean f31271g;

        /* renamed from: h */
        private Float f31272h;

        /* renamed from: i */
        private Float f31273i;

        /* renamed from: a */
        private float f31265a = Float.NaN;

        /* renamed from: j */
        private boolean f31274j = true;

        /* renamed from: a */
        public final C13873c m2424a() {
            return new C13873c(this.f31265a, this.f31266b, this.f31267c, this.f31268d, this.f31269e, this.f31270f, this.f31271g, this.f31272h, this.f31273i, this.f31274j, null);
        }

        /* renamed from: b */
        public final void m2423b(AbsolutePoint absolutePoint, boolean z) {
            this.f31269e = null;
            this.f31268d = absolutePoint;
            this.f31270f = true;
            this.f31271g = z;
        }

        /* renamed from: c */
        public final void m2422c(ScaledPoint scaledPoint, boolean z) {
            this.f31269e = scaledPoint;
            this.f31268d = null;
            this.f31270f = true;
            this.f31271g = z;
        }

        /* renamed from: d */
        public final void m2421d(AbsolutePoint absolutePoint, boolean z) {
            this.f31269e = null;
            this.f31268d = absolutePoint;
            this.f31270f = false;
            this.f31271g = z;
        }

        /* renamed from: e */
        public final void m2420e(ScaledPoint scaledPoint, boolean z) {
            this.f31269e = scaledPoint;
            this.f31268d = null;
            this.f31270f = false;
            this.f31271g = z;
        }

        /* renamed from: f */
        public final void m2419f(Float f, Float f2) {
            this.f31272h = f;
            this.f31273i = f2;
        }

        /* renamed from: g */
        public final void m2418g(boolean z) {
            this.f31274j = z;
        }

        /* renamed from: h */
        public final void m2417h(boolean z) {
            this.f31271g = z;
        }

        /* renamed from: i */
        public final void m2416i(float f, boolean z) {
            this.f31265a = f;
            this.f31266b = false;
            this.f31267c = z;
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\rJ#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m15073d2 = {"Lwe/c$b;", "", "Lkotlin/Function1;", "Lwe/c$a;", "", "builder", "Lwe/c;", "a", "(Lkotlin/jvm/functions/Function1;)Lwe/c;", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "getLOG$annotations", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: we.c$b */
    /* loaded from: classes6.dex */
    public static final class C13875b {
        private C13875b() {
        }

        public /* synthetic */ C13875b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13873c m2415a(Function1<? super C13874a, Unit> builder) {
            C9971q.m14633g(builder, "builder");
            C13874a aVar = new C13874a();
            builder.invoke(aVar);
            return aVar.m2424a();
        }
    }

    static {
        String TAG = C13873c.class.getSimpleName();
        f31252m = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f31253n = aVar.m26250a(TAG);
    }

    private C13873c(float f, boolean z, boolean z2, AbsolutePoint absolutePoint, ScaledPoint scaledPoint, boolean z3, boolean z4, Float f2, Float f3, boolean z5) {
        this.f31254a = f;
        this.f31255b = z;
        this.f31256c = z2;
        this.f31257d = absolutePoint;
        this.f31258e = scaledPoint;
        this.f31259f = z3;
        this.f31260g = z4;
        this.f31261h = f2;
        this.f31262i = f3;
        this.f31263j = z5;
        if (absolutePoint == null || scaledPoint == null) {
            this.f31264k = (absolutePoint == null && scaledPoint == null) ? false : true;
            return;
        }
        throw new IllegalStateException("Can only use either pan or scaledPan");
    }

    public /* synthetic */ C13873c(float f, boolean z, boolean z2, AbsolutePoint absolutePoint, ScaledPoint scaledPoint, boolean z3, boolean z4, Float f2, Float f3, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z, z2, absolutePoint, scaledPoint, z3, z4, f2, f3, z5);
    }

    /* renamed from: a */
    public final boolean m2436a() {
        return this.f31260g;
    }

    /* renamed from: b */
    public final boolean m2435b() {
        return this.f31256c;
    }

    /* renamed from: c */
    public final boolean m2434c() {
        return this.f31264k;
    }

    /* renamed from: d */
    public final boolean m2433d() {
        return !Float.isNaN(this.f31254a);
    }

    /* renamed from: e */
    public final boolean m2432e() {
        return this.f31263j;
    }

    /* renamed from: f */
    public final AbsolutePoint m2431f() {
        return this.f31257d;
    }

    /* renamed from: g */
    public final Float m2430g() {
        return this.f31261h;
    }

    /* renamed from: h */
    public final Float m2429h() {
        return this.f31262i;
    }

    /* renamed from: i */
    public final ScaledPoint m2428i() {
        return this.f31258e;
    }

    /* renamed from: j */
    public final float m2427j() {
        return this.f31254a;
    }

    /* renamed from: k */
    public final boolean m2426k() {
        return this.f31259f;
    }

    /* renamed from: l */
    public final boolean m2425l() {
        return this.f31255b;
    }
}
