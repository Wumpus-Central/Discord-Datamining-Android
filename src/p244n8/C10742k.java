package p244n8;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p029b9.AbstractC3415h;
import p079e7.C6722k;
import p079e7.C6736w;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p103fc.C7115d;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7562u;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8252h;
import p153i8.AbstractC8278o0;
import p153i8.AbstractC8282p0;
import p153i8.AbstractC8287r;
import p153i8.C8302u0;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p193k7.C9798l;
import p244n8.C10748q;
import p260o8.AbstractC11232k;
import p260o8.C11217f;
import p459z7.C14576a;

/* renamed from: n8.k */
/* loaded from: classes7.dex */
public final class C10742k implements AbstractC8287r, C10748q.AbstractC10750b, AbstractC11232k.AbstractC11234b {

    /* renamed from: A */
    private int f38838A;

    /* renamed from: B */
    private TrackGroupArray f38839B;

    /* renamed from: F */
    private int f38843F;

    /* renamed from: G */
    private AbstractC8282p0 f38844G;

    /* renamed from: k */
    private final AbstractC10739h f23845k;

    /* renamed from: l */
    private final AbstractC11232k f23846l;

    /* renamed from: m */
    private final AbstractC10738g f23847m;

    /* renamed from: n */
    private final AbstractC6795x f23848n;

    /* renamed from: o */
    private final AbstractC9818x f23849o;

    /* renamed from: p */
    private final AbstractC9815v.C9816a f23850p;

    /* renamed from: q */
    private final AbstractC5318g f23851q;

    /* renamed from: r */
    private final AbstractC8233b0.C8234a f23852r;

    /* renamed from: s */
    private final AbstractC6765b f23853s;

    /* renamed from: v */
    private final AbstractC8252h f23856v;

    /* renamed from: w */
    private final boolean f23857w;

    /* renamed from: x */
    private final int f23858x;

    /* renamed from: y */
    private final boolean f23859y;

    /* renamed from: z */
    private AbstractC8287r.AbstractC8288a f23860z;

    /* renamed from: t */
    private final IdentityHashMap<AbstractC8278o0, Integer> f23854t = new IdentityHashMap<>();

    /* renamed from: u */
    private final C10758t f23855u = new C10758t();

    /* renamed from: C */
    private C10748q[] f38840C = new C10748q[0];

    /* renamed from: D */
    private C10748q[] f38841D = new C10748q[0];

    /* renamed from: E */
    private int[][] f38842E = new int[0];

    public C10742k(AbstractC10739h hVar, AbstractC11232k kVar, AbstractC10738g gVar, AbstractC6795x xVar, AbstractC9818x xVar2, AbstractC9815v.C9816a aVar, AbstractC5318g gVar2, AbstractC8233b0.C8234a aVar2, AbstractC6765b bVar, AbstractC8252h hVar2, boolean z, int i, boolean z2) {
        this.f23845k = hVar;
        this.f23846l = kVar;
        this.f23847m = gVar;
        this.f23848n = xVar;
        this.f23849o = xVar2;
        this.f23850p = aVar;
        this.f23851q = gVar2;
        this.f23852r = aVar2;
        this.f23853s = bVar;
        this.f23856v = hVar2;
        this.f23857w = z;
        this.f23858x = i;
        this.f23859y = z2;
        this.f38844G = hVar2.mo20192a(new AbstractC8282p0[0]);
    }

    /* renamed from: p */
    private void m12467p(long j, List<C11217f.C11218a> list, List<C10748q> list2, List<int[]> list3, Map<String, C9798l> map) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).f25055d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z2 = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (C7557q0.m22159c(str, list.get(i2).f25055d)) {
                        C11217f.C11218a aVar = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.f25052a);
                        arrayList2.add(aVar.f25053b);
                        if (C7557q0.m22197J(aVar.f25053b.f14326s, 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                }
                C10748q w = m12460w(1, (Uri[]) arrayList.toArray((Uri[]) C7557q0.m22143k(new Uri[0])), (C6722k[]) arrayList2.toArray(new C6722k[0]), null, Collections.emptyList(), map, j);
                list3.add(C7115d.m23358j(arrayList3));
                list2.add(w);
                if (this.f23857w && z2) {
                    w.m12418c0(new C8302u0[]{new C8302u0((C6722k[]) arrayList2.toArray(new C6722k[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* renamed from: s */
    private void m12464s(C11217f fVar, long j, List<C10748q> list, List<int[]> list2, Map<String, C9798l> map) {
        boolean z;
        boolean z2;
        boolean z3;
        int size = fVar.f25043e.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < fVar.f25043e.size(); i3++) {
            C6722k kVar = fVar.f25043e.get(i3).f25057b;
            if (kVar.f37962B > 0 || C7557q0.m22195K(kVar.f14326s, 2) != null) {
                iArr[i3] = 2;
                i++;
            } else if (C7557q0.m22195K(kVar.f14326s, 1) != null) {
                iArr[i3] = 1;
                i2++;
            } else {
                iArr[i3] = -1;
            }
        }
        if (i > 0) {
            size = i;
            z2 = true;
            z = false;
        } else if (i2 < size) {
            size -= i2;
            z2 = false;
            z = true;
        } else {
            z2 = false;
            z = false;
        }
        Uri[] uriArr = new Uri[size];
        C6722k[] kVarArr = new C6722k[size];
        int[] iArr2 = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < fVar.f25043e.size(); i5++) {
            if ((!z2 || iArr[i5] == 2) && (!z || iArr[i5] != 1)) {
                C11217f.C11219b bVar = fVar.f25043e.get(i5);
                uriArr[i4] = bVar.f25056a;
                kVarArr[i4] = bVar.f25057b;
                iArr2[i4] = i5;
                i4++;
            }
        }
        String str = kVarArr[0].f14326s;
        int J = C7557q0.m22197J(str, 2);
        int J2 = C7557q0.m22197J(str, 1);
        if (J2 > 1 || J > 1 || J2 + J <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        C10748q w = m12460w(0, uriArr, kVarArr, fVar.f25048j, fVar.f25049k, map, j);
        list.add(w);
        list2.add(iArr2);
        if (this.f23857w && z3) {
            ArrayList arrayList = new ArrayList();
            if (J > 0) {
                C6722k[] kVarArr2 = new C6722k[size];
                for (int i6 = 0; i6 < size; i6++) {
                    kVarArr2[i6] = m12457z(kVarArr[i6]);
                }
                arrayList.add(new C8302u0(kVarArr2));
                if (J2 > 0 && (fVar.f25048j != null || fVar.f25045g.isEmpty())) {
                    arrayList.add(new C8302u0(m12459x(kVarArr[0], fVar.f25048j, false)));
                }
                List<C6722k> list3 = fVar.f25049k;
                if (list3 != null) {
                    for (int i7 = 0; i7 < list3.size(); i7++) {
                        arrayList.add(new C8302u0(list3.get(i7)));
                    }
                }
            } else {
                C6722k[] kVarArr3 = new C6722k[size];
                for (int i8 = 0; i8 < size; i8++) {
                    kVarArr3[i8] = m12459x(kVarArr[i8], fVar.f25048j, true);
                }
                arrayList.add(new C8302u0(kVarArr3));
            }
            C8302u0 u0Var = new C8302u0(new C6722k.C6724b().m24505S("ID3").m24488e0("application/id3").m24519E());
            arrayList.add(u0Var);
            w.m12418c0((C8302u0[]) arrayList.toArray(new C8302u0[0]), 0, arrayList.indexOf(u0Var));
        }
    }

    /* renamed from: v */
    private void m12461v(long j) {
        Map<String, C9798l> map;
        C11217f fVar = (C11217f) C7510a.m22367e(this.f23846l.mo10383d());
        if (this.f23859y) {
            map = m12458y(fVar.f25051m);
        } else {
            map = Collections.emptyMap();
        }
        boolean z = !fVar.f25043e.isEmpty();
        List<C11217f.C11218a> list = fVar.f25045g;
        List<C11217f.C11218a> list2 = fVar.f25046h;
        this.f38838A = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            m12464s(fVar, j, arrayList, arrayList2, map);
        }
        m12467p(j, list, arrayList, arrayList2, map);
        this.f38843F = arrayList.size();
        for (int i = 0; i < list2.size(); i++) {
            C11217f.C11218a aVar = list2.get(i);
            C10748q w = m12460w(3, new Uri[]{aVar.f25052a}, new C6722k[]{aVar.f25053b}, null, Collections.emptyList(), map, j);
            arrayList2.add(new int[]{i});
            arrayList.add(w);
            w.m12418c0(new C8302u0[]{new C8302u0(aVar.f25053b)}, 0, new int[0]);
        }
        this.f38840C = (C10748q[]) arrayList.toArray(new C10748q[0]);
        this.f38842E = (int[][]) arrayList2.toArray(new int[0]);
        C10748q[] qVarArr = this.f38840C;
        this.f38838A = qVarArr.length;
        qVarArr[0].m12406l0(true);
        for (C10748q qVar : this.f38840C) {
            qVar.m12448B();
        }
        this.f38841D = this.f38840C;
    }

    /* renamed from: w */
    private C10748q m12460w(int i, Uri[] uriArr, C6722k[] kVarArr, C6722k kVar, List<C6722k> list, Map<String, C9798l> map, long j) {
        return new C10748q(i, this, new C10732f(this.f23845k, this.f23846l, uriArr, kVarArr, this.f23847m, this.f23848n, this.f23855u, list), map, this.f23853s, j, kVar, this.f23849o, this.f23850p, this.f23851q, this.f23852r, this.f23858x);
    }

    /* renamed from: x */
    private static C6722k m12459x(C6722k kVar, C6722k kVar2, boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        C14576a aVar;
        String str3;
        int i4;
        int i5 = -1;
        if (kVar2 != null) {
            str3 = kVar2.f14326s;
            aVar = kVar2.f14327t;
            i3 = kVar2.f37969I;
            i2 = kVar2.f14321n;
            i = kVar2.f14322o;
            str2 = kVar2.f14320m;
            str = kVar2.f14319l;
        } else {
            str3 = C7557q0.m22195K(kVar.f14326s, 1);
            aVar = kVar.f14327t;
            if (z) {
                i3 = kVar.f37969I;
                i2 = kVar.f14321n;
                i = kVar.f14322o;
                str2 = kVar.f14320m;
                str = kVar.f14319l;
            } else {
                i2 = 0;
                str2 = null;
                i3 = -1;
                i = 0;
                str = null;
            }
        }
        String g = C7562u.m22081g(str3);
        if (z) {
            i4 = kVar.f14323p;
        } else {
            i4 = -1;
        }
        if (z) {
            i5 = kVar.f14324q;
        }
        return new C6722k.C6724b().m24505S(kVar.f14318k).m24503U(str).m24513K(kVar.f14328u).m24488e0(g).m24515I(str3).m24500X(aVar).m24517G(i4).m24498Z(i5).m24516H(i3).m24484g0(i2).m24492c0(i).m24502V(str2).m24519E();
    }

    /* renamed from: y */
    private static Map<String, C9798l> m12458y(List<C9798l> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            C9798l lVar = list.get(i);
            String str = lVar.f21833m;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                C9798l lVar2 = (C9798l) arrayList.get(i2);
                if (TextUtils.equals(lVar2.f21833m, str)) {
                    lVar = lVar.m15328P(lVar2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, lVar);
        }
        return hashMap;
    }

    /* renamed from: z */
    private static C6722k m12457z(C6722k kVar) {
        String K = C7557q0.m22195K(kVar.f14326s, 2);
        return new C6722k.C6724b().m24505S(kVar.f14318k).m24503U(kVar.f14319l).m24513K(kVar.f14328u).m24488e0(C7562u.m22081g(K)).m24515I(K).m24500X(kVar.f14327t).m24517G(kVar.f14323p).m24498Z(kVar.f14324q).m24478j0(kVar.f37961A).m24507Q(kVar.f37962B).m24508P(kVar.f37963C).m24484g0(kVar.f14321n).m24492c0(kVar.f14322o).m24519E();
    }

    /* renamed from: A */
    public void mo12471i(C10748q qVar) {
        this.f23860z.mo12471i(this);
    }

    /* renamed from: B */
    public void m12473B() {
        this.f23846l.mo10380g(this);
        for (C10748q qVar : this.f38840C) {
            qVar.m12416e0();
        }
        this.f23860z = null;
    }

    @Override // p244n8.C10748q.AbstractC10750b
    /* renamed from: a */
    public void mo12392a() {
        C10748q[] qVarArr;
        int i = this.f38838A - 1;
        this.f38838A = i;
        if (i <= 0) {
            int i2 = 0;
            for (C10748q qVar : this.f38840C) {
                i2 += qVar.m12399t().f9362k;
            }
            C8302u0[] u0VarArr = new C8302u0[i2];
            int i3 = 0;
            for (C10748q qVar2 : this.f38840C) {
                int i4 = qVar2.m12399t().f9362k;
                int i5 = 0;
                while (i5 < i4) {
                    u0VarArr[i3] = qVar2.m12399t().m29997a(i5);
                    i5++;
                    i3++;
                }
            }
            this.f38839B = new TrackGroupArray(u0VarArr);
            this.f23860z.mo20028j(this);
        }
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        return this.f38844G.mo12421b();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f38844G.mo12419c();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        return j;
    }

    @Override // p260o8.AbstractC11232k.AbstractC11234b
    /* renamed from: e */
    public void mo10374e() {
        for (C10748q qVar : this.f38840C) {
            qVar.m12422a0();
        }
        this.f23860z.mo12471i(this);
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        if (this.f38839B != null) {
            return this.f38844G.mo12415f(j);
        }
        for (C10748q qVar : this.f38840C) {
            qVar.m12448B();
        }
        return false;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        return this.f38844G.mo12413g();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        this.f38844G.mo12411h(j);
    }

    @Override // p260o8.AbstractC11232k.AbstractC11234b
    /* renamed from: k */
    public boolean mo10373k(Uri uri, long j) {
        boolean z = true;
        for (C10748q qVar : this.f38840C) {
            z &= qVar.m12424Z(uri, j);
        }
        this.f23860z.mo12471i(this);
        return z;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    public long mo12470l(long j) {
        C10748q[] qVarArr = this.f38841D;
        if (qVarArr.length > 0) {
            boolean h0 = qVarArr[0].m12410h0(j, false);
            int i = 1;
            while (true) {
                C10748q[] qVarArr2 = this.f38841D;
                if (i >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i].m12410h0(j, h0);
                i++;
            }
            if (h0) {
                this.f23855u.m12372b();
            }
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        this.f23860z = aVar;
        this.f23846l.mo10386a(this);
        m12461v(j);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        return -9223372036854775807L;
    }

    @Override // p244n8.C10748q.AbstractC10750b
    /* renamed from: o */
    public void mo12391o(Uri uri) {
        this.f23846l.mo10382e(uri);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
        boolean z;
        AbstractC8278o0 o0Var;
        int i;
        AbstractC8278o0[] o0VarArr2 = o0VarArr;
        int[] iArr = new int[hVarArr.length];
        int[] iArr2 = new int[hVarArr.length];
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            AbstractC8278o0 o0Var2 = o0VarArr2[i2];
            if (o0Var2 == null) {
                i = -1;
            } else {
                i = this.f23854t.get(o0Var2).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            AbstractC3415h hVar = hVarArr[i2];
            if (hVar != null) {
                C8302u0 k = hVar.mo34411k();
                int i3 = 0;
                while (true) {
                    C10748q[] qVarArr = this.f38840C;
                    if (i3 >= qVarArr.length) {
                        break;
                    } else if (qVarArr[i3].m12399t().m29996b(k) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f23854t.clear();
        int length = hVarArr.length;
        AbstractC8278o0[] o0VarArr3 = new AbstractC8278o0[length];
        AbstractC8278o0[] o0VarArr4 = new AbstractC8278o0[hVarArr.length];
        AbstractC3415h[] hVarArr2 = new AbstractC3415h[hVarArr.length];
        C10748q[] qVarArr2 = new C10748q[this.f38840C.length];
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (i5 < this.f38840C.length) {
            for (int i6 = 0; i6 < hVarArr.length; i6++) {
                AbstractC3415h hVar2 = null;
                if (iArr[i6] == i5) {
                    o0Var = o0VarArr2[i6];
                } else {
                    o0Var = null;
                }
                o0VarArr4[i6] = o0Var;
                if (iArr2[i6] == i5) {
                    hVar2 = hVarArr[i6];
                }
                hVarArr2[i6] = hVar2;
            }
            C10748q qVar = this.f38840C[i5];
            boolean i0 = qVar.m12409i0(hVarArr2, zArr, o0VarArr4, zArr2, j, z2);
            int i7 = 0;
            boolean z3 = false;
            while (true) {
                z = true;
                if (i7 >= hVarArr.length) {
                    break;
                }
                AbstractC8278o0 o0Var3 = o0VarArr4[i7];
                if (iArr2[i7] == i5) {
                    C7510a.m22367e(o0Var3);
                    o0VarArr3[i7] = o0Var3;
                    this.f23854t.put(o0Var3, Integer.valueOf(i5));
                    z3 = true;
                } else if (iArr[i7] == i5) {
                    if (o0Var3 != null) {
                        z = false;
                    }
                    C7510a.m22366f(z);
                }
                i7++;
            }
            if (z3) {
                qVarArr2[i4] = qVar;
                i4++;
                if (i4 == 0) {
                    qVar.m12406l0(true);
                    if (!i0) {
                        C10748q[] qVarArr3 = this.f38841D;
                        if (qVarArr3.length != 0 && qVar == qVarArr3[0]) {
                        }
                    }
                    this.f23855u.m12372b();
                    z2 = true;
                } else {
                    if (i5 >= this.f38843F) {
                        z = false;
                    }
                    qVar.m12406l0(z);
                }
            } else {
                i4 = i4;
            }
            i5++;
            o0VarArr2 = o0VarArr;
            qVarArr2 = qVarArr2;
            length = length;
            hVarArr2 = hVarArr2;
        }
        System.arraycopy(o0VarArr3, 0, o0VarArr2, 0, length);
        C10748q[] qVarArr4 = (C10748q[]) C7557q0.m22212B0(qVarArr2, i4);
        this.f38841D = qVarArr4;
        this.f38844G = this.f23856v.mo20192a(qVarArr4);
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
        for (C10748q qVar : this.f38840C) {
            qVar.m12400r();
        }
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        return (TrackGroupArray) C7510a.m22367e(this.f38839B);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
        for (C10748q qVar : this.f38841D) {
            qVar.m12398u(j, z);
        }
    }
}
