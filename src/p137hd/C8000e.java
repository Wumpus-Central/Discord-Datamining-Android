package p137hd;

import java.util.List;

/* renamed from: hd.e */
/* loaded from: classes3.dex */
public final class C8000e {

    /* renamed from: a */
    private final byte[] f17251a;

    /* renamed from: b */
    private int f17252b;

    /* renamed from: c */
    private final String f17253c;

    /* renamed from: d */
    private final List<byte[]> f17254d;

    /* renamed from: e */
    private final String f17255e;

    /* renamed from: f */
    private Integer f17256f;

    /* renamed from: g */
    private Integer f17257g;

    /* renamed from: h */
    private Object f17258h;

    /* renamed from: i */
    private final int f17259i;

    /* renamed from: j */
    private final int f17260j;

    public C8000e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List<byte[]> m20906a() {
        return this.f17254d;
    }

    /* renamed from: b */
    public String m20905b() {
        return this.f17255e;
    }

    /* renamed from: c */
    public int m20904c() {
        return this.f17252b;
    }

    /* renamed from: d */
    public Object m20903d() {
        return this.f17258h;
    }

    /* renamed from: e */
    public byte[] m20902e() {
        return this.f17251a;
    }

    /* renamed from: f */
    public int m20901f() {
        return this.f17259i;
    }

    /* renamed from: g */
    public int m20900g() {
        return this.f17260j;
    }

    /* renamed from: h */
    public String m20899h() {
        return this.f17253c;
    }

    /* renamed from: i */
    public boolean m20898i() {
        return this.f17259i >= 0 && this.f17260j >= 0;
    }

    /* renamed from: j */
    public void m20897j(Integer num) {
        this.f17257g = num;
    }

    /* renamed from: k */
    public void m20896k(Integer num) {
        this.f17256f = num;
    }

    /* renamed from: l */
    public void m20895l(int i) {
        this.f17252b = i;
    }

    /* renamed from: m */
    public void m20894m(Object obj) {
        this.f17258h = obj;
    }

    public C8000e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f17251a = bArr;
        this.f17252b = bArr == null ? 0 : bArr.length * 8;
        this.f17253c = str;
        this.f17254d = list;
        this.f17255e = str2;
        this.f17259i = i2;
        this.f17260j = i;
    }
}
