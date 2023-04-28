package p171j6;

import p210l6.C10348a;
import p210l6.C10349b;
import p227m6.C10491a;

/* renamed from: j6.a */
/* loaded from: classes7.dex */
public class C9494a extends AbstractC9499f {

    /* renamed from: s */
    protected static final int f21030s = EnumC0282a.m16132a();

    /* renamed from: t */
    protected static final int f21031t = EnumC9496c.m16126a();

    /* renamed from: u */
    protected static final int f21032u = EnumC9495b.m16129a();

    /* renamed from: v */
    public static final AbstractC9498e f21033v = C10491a.f23174k;

    /* renamed from: k */
    protected final transient C10349b f21034k;

    /* renamed from: l */
    protected final transient C10348a f21035l;

    /* renamed from: m */
    protected int f21036m;

    /* renamed from: n */
    protected int f21037n;

    /* renamed from: o */
    protected int f21038o;

    /* renamed from: p */
    protected AbstractC9497d f21039p;

    /* renamed from: q */
    protected AbstractC9498e f21040q;

    /* renamed from: r */
    protected final char f21041r;

    /* renamed from: j6.a$a */
    /* loaded from: classes7.dex */
    public enum EnumC0282a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        

        /* renamed from: k */
        private final boolean f21047k;

        EnumC0282a(boolean z) {
            this.f21047k = z;
        }

        /* renamed from: a */
        public static int m16132a() {
            EnumC0282a[] values;
            int i = 0;
            for (EnumC0282a aVar : values()) {
                if (aVar.m16131b()) {
                    i |= aVar.m16130c();
                }
            }
            return i;
        }

        /* renamed from: b */
        public boolean m16131b() {
            return this.f21047k;
        }

        /* renamed from: c */
        public int m16130c() {
            return 1 << ordinal();
        }
    }

    public C9494a() {
        this(null);
    }

    public C9494a(AbstractC9497d dVar) {
        this.f21034k = C10349b.m13555a();
        this.f21035l = C10348a.m13563c();
        this.f21036m = f21030s;
        this.f21037n = f21031t;
        this.f21038o = f21032u;
        this.f21040q = f21033v;
        this.f21039p = dVar;
        this.f21041r = '\"';
    }
}
