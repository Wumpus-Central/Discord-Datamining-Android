package p108fh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fh.e */
/* loaded from: classes8.dex */
public final class C7172e {

    /* renamed from: e */
    public static final C7173a f15579e = new C7173a(null);

    /* renamed from: f */
    private static final C7172e f15580f = new C7172e(null, null, false, false, 8, null);

    /* renamed from: a */
    private final EnumC7176h f15581a;

    /* renamed from: b */
    private final EnumC7174f f15582b;

    /* renamed from: c */
    private final boolean f15583c;

    /* renamed from: d */
    private final boolean f15584d;

    /* renamed from: fh.e$a */
    /* loaded from: classes8.dex */
    public static final class C7173a {
        private C7173a() {
        }

        public /* synthetic */ C7173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7172e m23281a() {
            return C7172e.f15580f;
        }
    }

    public C7172e(EnumC7176h hVar, EnumC7174f fVar, boolean z, boolean z2) {
        this.f15581a = hVar;
        this.f15582b = fVar;
        this.f15583c = z;
        this.f15584d = z2;
    }

    /* renamed from: b */
    public final boolean m23285b() {
        return this.f15583c;
    }

    /* renamed from: c */
    public final EnumC7174f m23284c() {
        return this.f15582b;
    }

    /* renamed from: d */
    public final EnumC7176h m23283d() {
        return this.f15581a;
    }

    /* renamed from: e */
    public final boolean m23282e() {
        return this.f15584d;
    }

    public /* synthetic */ C7172e(EnumC7176h hVar, EnumC7174f fVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, fVar, z, (i & 8) != 0 ? false : z2);
    }
}
