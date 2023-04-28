package p126h2;

import android.graphics.Rect;
import androidx.collection.C2098d;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p223m2.C10472c;
import p223m2.C10473d;
import p223m2.C10477h;
import p275p2.C11516e;
import p343t2.C12945f;
import p343t2.C12948i;

/* renamed from: h2.i */
/* loaded from: classes.dex */
public class C7762i {

    /* renamed from: c */
    private Map<String, List<C11516e>> f16860c;

    /* renamed from: d */
    private Map<String, C7753f0> f16861d;

    /* renamed from: e */
    private Map<String, C10472c> f16862e;

    /* renamed from: f */
    private List<C10477h> f16863f;

    /* renamed from: g */
    private SparseArrayCompat<C10473d> f16864g;

    /* renamed from: h */
    private C2098d<C11516e> f16865h;

    /* renamed from: i */
    private List<C11516e> f16866i;

    /* renamed from: j */
    private Rect f16867j;

    /* renamed from: k */
    private float f16868k;

    /* renamed from: l */
    private float f16869l;

    /* renamed from: m */
    private float f16870m;

    /* renamed from: n */
    private boolean f16871n;

    /* renamed from: a */
    private final C7774n0 f16858a = new C7774n0();

    /* renamed from: b */
    private final HashSet<String> f16859b = new HashSet<>();

    /* renamed from: o */
    private int f16872o = 0;

    /* renamed from: a */
    public void m21403a(String str) {
        C12945f.m5009c(str);
        this.f16859b.add(str);
    }

    /* renamed from: b */
    public Rect m21402b() {
        return this.f16867j;
    }

    /* renamed from: c */
    public SparseArrayCompat<C10473d> m21401c() {
        return this.f16864g;
    }

    /* renamed from: d */
    public float m21400d() {
        return (m21399e() / this.f16870m) * 1000.0f;
    }

    /* renamed from: e */
    public float m21399e() {
        return this.f16869l - this.f16868k;
    }

    /* renamed from: f */
    public float m21398f() {
        return this.f16869l;
    }

    /* renamed from: g */
    public Map<String, C10472c> m21397g() {
        return this.f16862e;
    }

    /* renamed from: h */
    public float m21396h(float f) {
        return C12948i.m4974i(this.f16868k, this.f16869l, f);
    }

    /* renamed from: i */
    public float m21395i() {
        return this.f16870m;
    }

    /* renamed from: j */
    public Map<String, C7753f0> m21394j() {
        return this.f16861d;
    }

    /* renamed from: k */
    public List<C11516e> m21393k() {
        return this.f16866i;
    }

    /* renamed from: l */
    public C10477h m21392l(String str) {
        int size = this.f16863f.size();
        for (int i = 0; i < size; i++) {
            C10477h hVar = this.f16863f.get(i);
            if (hVar.m13084a(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int m21391m() {
        return this.f16872o;
    }

    /* renamed from: n */
    public C7774n0 m21390n() {
        return this.f16858a;
    }

    /* renamed from: o */
    public List<C11516e> m21389o(String str) {
        return this.f16860c.get(str);
    }

    /* renamed from: p */
    public float m21388p() {
        return this.f16868k;
    }

    /* renamed from: q */
    public boolean m21387q() {
        return this.f16871n;
    }

    /* renamed from: r */
    public void m21386r(int i) {
        this.f16872o += i;
    }

    /* renamed from: s */
    public void m21385s(Rect rect, float f, float f2, float f3, List<C11516e> list, C2098d<C11516e> dVar, Map<String, List<C11516e>> map, Map<String, C7753f0> map2, SparseArrayCompat<C10473d> sparseArrayCompat, Map<String, C10472c> map3, List<C10477h> list2) {
        this.f16867j = rect;
        this.f16868k = f;
        this.f16869l = f2;
        this.f16870m = f3;
        this.f16866i = list;
        this.f16865h = dVar;
        this.f16860c = map;
        this.f16861d = map2;
        this.f16864g = sparseArrayCompat;
        this.f16862e = map3;
        this.f16863f = list2;
    }

    /* renamed from: t */
    public C11516e m21384t(long j) {
        return this.f16865h.m39015h(j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (C11516e eVar : this.f16866i) {
            sb2.append(eVar.m9477y("\t"));
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public void m21383u(boolean z) {
        this.f16871n = z;
    }

    /* renamed from: v */
    public void m21382v(boolean z) {
        this.f16858a.m21366b(z);
    }
}
