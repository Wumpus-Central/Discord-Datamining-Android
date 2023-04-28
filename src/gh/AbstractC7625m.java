package gh;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p407wh.EnumC13886e;

/* renamed from: gh.m */
/* loaded from: classes8.dex */
public abstract class AbstractC7625m {

    /* renamed from: a */
    public static final C7627b f16630a = new C7627b(null);

    /* renamed from: b */
    private static final C7629d f16631b = new C7629d(EnumC13886e.BOOLEAN);

    /* renamed from: c */
    private static final C7629d f16632c = new C7629d(EnumC13886e.CHAR);

    /* renamed from: d */
    private static final C7629d f16633d = new C7629d(EnumC13886e.BYTE);

    /* renamed from: e */
    private static final C7629d f16634e = new C7629d(EnumC13886e.SHORT);

    /* renamed from: f */
    private static final C7629d f16635f = new C7629d(EnumC13886e.INT);

    /* renamed from: g */
    private static final C7629d f16636g = new C7629d(EnumC13886e.FLOAT);

    /* renamed from: h */
    private static final C7629d f16637h = new C7629d(EnumC13886e.LONG);

    /* renamed from: i */
    private static final C7629d f16638i = new C7629d(EnumC13886e.DOUBLE);

    /* renamed from: gh.m$a */
    /* loaded from: classes8.dex */
    public static final class C7626a extends AbstractC7625m {

        /* renamed from: j */
        private final AbstractC7625m f16639j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7626a(AbstractC7625m elementType) {
            super(null);
            C9971q.m14633g(elementType, "elementType");
            this.f16639j = elementType;
        }

        /* renamed from: i */
        public final AbstractC7625m m21845i() {
            return this.f16639j;
        }
    }

    /* renamed from: gh.m$b */
    /* loaded from: classes8.dex */
    public static final class C7627b {
        private C7627b() {
        }

        public /* synthetic */ C7627b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7629d m21844a() {
            return AbstractC7625m.f16631b;
        }

        /* renamed from: b */
        public final C7629d m21843b() {
            return AbstractC7625m.f16633d;
        }

        /* renamed from: c */
        public final C7629d m21842c() {
            return AbstractC7625m.f16632c;
        }

        /* renamed from: d */
        public final C7629d m21841d() {
            return AbstractC7625m.f16638i;
        }

        /* renamed from: e */
        public final C7629d m21840e() {
            return AbstractC7625m.f16636g;
        }

        /* renamed from: f */
        public final C7629d m21839f() {
            return AbstractC7625m.f16635f;
        }

        /* renamed from: g */
        public final C7629d m21838g() {
            return AbstractC7625m.f16637h;
        }

        /* renamed from: h */
        public final C7629d m21837h() {
            return AbstractC7625m.f16634e;
        }
    }

    /* renamed from: gh.m$c */
    /* loaded from: classes8.dex */
    public static final class C7628c extends AbstractC7625m {

        /* renamed from: j */
        private final String f16640j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7628c(String internalName) {
            super(null);
            C9971q.m14633g(internalName, "internalName");
            this.f16640j = internalName;
        }

        /* renamed from: i */
        public final String m21836i() {
            return this.f16640j;
        }
    }

    /* renamed from: gh.m$d */
    /* loaded from: classes8.dex */
    public static final class C7629d extends AbstractC7625m {

        /* renamed from: j */
        private final EnumC13886e f16641j;

        public C7629d(EnumC13886e eVar) {
            super(null);
            this.f16641j = eVar;
        }

        /* renamed from: i */
        public final EnumC13886e m21835i() {
            return this.f16641j;
        }
    }

    private AbstractC7625m() {
    }

    public /* synthetic */ AbstractC7625m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return C7631o.f16642a.mo21831d(this);
    }
}
