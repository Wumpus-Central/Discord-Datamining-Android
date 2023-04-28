package p141hh;

import eg.C6884j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9897e;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C10612e;
import p267of.C11288u;

/* renamed from: hh.a */
/* loaded from: classes8.dex */
public final class C8019a {

    /* renamed from: a */
    private final EnumC0249a f17286a;

    /* renamed from: b */
    private final C10612e f17287b;

    /* renamed from: c */
    private final String[] f17288c;

    /* renamed from: d */
    private final String[] f17289d;

    /* renamed from: e */
    private final String[] f17290e;

    /* renamed from: f */
    private final String f17291f;

    /* renamed from: g */
    private final int f17292g;

    /* renamed from: h */
    private final String f17293h;

    /* renamed from: i */
    private final byte[] f17294i;

    /* renamed from: hh.a$a */
    /* loaded from: classes8.dex */
    public enum EnumC0249a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: l */
        public static final C0250a f17295l = new C0250a(null);

        /* renamed from: m */
        private static final Map<Integer, EnumC0249a> f17296m;

        /* renamed from: k */
        private final int f17304k;

        /* renamed from: hh.a$a$a */
        /* loaded from: classes8.dex */
        public static final class C0250a {
            private C0250a() {
            }

            public /* synthetic */ C0250a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final EnumC0249a m20830a(int i) {
                EnumC0249a aVar = (EnumC0249a) EnumC0249a.f17296m.get(Integer.valueOf(i));
                return aVar == null ? EnumC0249a.UNKNOWN : aVar;
            }
        }

        static {
            int d;
            int c;
            EnumC0249a[] values = values();
            d = C11288u.m10255d(values.length);
            c = C6884j.m23961c(d, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(c);
            for (EnumC0249a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f17304k), aVar);
            }
            f17296m = linkedHashMap;
        }

        EnumC0249a(int i) {
            this.f17304k = i;
        }

        /* renamed from: c */
        public static final EnumC0249a m20831c(int i) {
            return f17295l.m20830a(i);
        }
    }

    public C8019a(EnumC0249a kind, C10612e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        this.f17286a = kind;
        this.f17287b = metadataVersion;
        this.f17288c = strArr;
        this.f17289d = strArr2;
        this.f17290e = strArr3;
        this.f17291f = str;
        this.f17292g = i;
        this.f17293h = str2;
        this.f17294i = bArr;
    }

    /* renamed from: h */
    private final boolean m20837h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public final String[] m20844a() {
        return this.f17288c;
    }

    /* renamed from: b */
    public final String[] m20843b() {
        return this.f17289d;
    }

    /* renamed from: c */
    public final EnumC0249a m20842c() {
        return this.f17286a;
    }

    /* renamed from: d */
    public final C10612e m20841d() {
        return this.f17287b;
    }

    /* renamed from: e */
    public final String m20840e() {
        String str = this.f17291f;
        if (this.f17286a == EnumC0249a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final List<String> m20839f() {
        List<String> i;
        String[] strArr = this.f17288c;
        List<String> list = null;
        if (!(this.f17286a == EnumC0249a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        if (strArr != null) {
            list = C9897e.m14991d(strArr);
        }
        if (list != null) {
            return list;
        }
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: g */
    public final String[] m20838g() {
        return this.f17290e;
    }

    /* renamed from: i */
    public final boolean m20836i() {
        return m20837h(this.f17292g, 2);
    }

    /* renamed from: j */
    public final boolean m20835j() {
        return m20837h(this.f17292g, 64) && !m20837h(this.f17292g, 32);
    }

    /* renamed from: k */
    public final boolean m20834k() {
        return m20837h(this.f17292g, 16) && !m20837h(this.f17292g, 32);
    }

    public String toString() {
        return this.f17286a + " version=" + this.f17287b;
    }
}
