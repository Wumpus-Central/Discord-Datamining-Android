package p223m2;

/* renamed from: m2.b */
/* loaded from: classes.dex */
public class C10470b {

    /* renamed from: a */
    public String f23106a;

    /* renamed from: b */
    public String f23107b;

    /* renamed from: c */
    public float f23108c;

    /* renamed from: d */
    public EnumC10471a f23109d;

    /* renamed from: e */
    public int f23110e;

    /* renamed from: f */
    public float f23111f;

    /* renamed from: g */
    public float f23112g;

    /* renamed from: h */
    public int f23113h;

    /* renamed from: i */
    public int f23114i;

    /* renamed from: j */
    public float f23115j;

    /* renamed from: k */
    public boolean f23116k;

    /* renamed from: m2.b$a */
    /* loaded from: classes.dex */
    public enum EnumC10471a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C10470b(String str, String str2, float f, EnumC10471a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        m13104a(str, str2, f, aVar, i, f2, f3, i2, i3, f4, z);
    }

    /* renamed from: a */
    public void m13104a(String str, String str2, float f, EnumC10471a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f23106a = str;
        this.f23107b = str2;
        this.f23108c = f;
        this.f23109d = aVar;
        this.f23110e = i;
        this.f23111f = f2;
        this.f23112g = f3;
        this.f23113h = i2;
        this.f23114i = i3;
        this.f23115j = f4;
        this.f23116k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f23106a.hashCode() * 31) + this.f23107b.hashCode()) * 31) + this.f23108c)) * 31) + this.f23109d.ordinal()) * 31) + this.f23110e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f23111f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f23113h;
    }

    public C10470b() {
    }
}
