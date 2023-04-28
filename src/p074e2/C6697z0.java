package p074e2;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: e2.z0 */
/* loaded from: classes.dex */
public class C6697z0 {

    /* renamed from: a */
    public boolean f14240a = false;

    /* renamed from: b */
    public boolean f14241b = false;

    /* renamed from: c */
    public String f14242c;

    /* renamed from: d */
    public String f14243d;

    /* renamed from: e */
    public String f14244e;

    /* renamed from: f */
    public JSONObject f14245f;

    /* renamed from: g */
    public EnumC6603b f14246g;

    /* renamed from: h */
    public EnumC6618f1 f14247h;

    /* renamed from: i */
    public C6619g f14248i;

    /* renamed from: j */
    public Long f14249j;

    /* renamed from: k */
    public Long f14250k;

    /* renamed from: l */
    public Long f14251l;

    /* renamed from: m */
    public C6607c f14252m;

    /* renamed from: n */
    public Map<String, String> f14253n;

    /* renamed from: e2.z0$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C6698a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14254a;

        static {
            int[] iArr = new int[EnumC6603b.values().length];
            f14254a = iArr;
            try {
                iArr[EnumC6603b.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14254a[EnumC6603b.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14254a[EnumC6603b.ATTRIBUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14254a[EnumC6603b.EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static C6697z0 m24619a(C6607c cVar, Map<String, String> map) {
        C6697z0 z0Var;
        EnumC6603b a = cVar.m25128a();
        int i = C6698a.f14254a[a.ordinal()];
        if (i == 1) {
            z0Var = new C6612d1(cVar);
        } else if (i == 2) {
            z0Var = new C6606b1();
        } else if (i == 3) {
            z0Var = new C6678v();
        } else if (i != 4) {
            z0Var = new C6697z0();
        } else {
            z0Var = new C6691y(cVar);
        }
        z0Var.f14246g = a;
        z0Var.f14252m = cVar;
        z0Var.f14253n = map;
        return z0Var;
    }

    public String toString() {
        return C6629i1.m24906l("message:%s timestamp:%s json:%s", this.f14243d, this.f14244e, this.f14245f);
    }
}
