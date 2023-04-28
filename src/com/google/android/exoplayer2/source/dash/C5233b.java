package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.AbstractC5232a;
import com.google.android.exoplayer2.source.dash.C5239e;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p029b9.AbstractC3415h;
import p079e7.C6722k;
import p079e7.C6736w;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6790t;
import p081e9.AbstractC6795x;
import p103fc.C7115d;
import p119g9.C7557q0;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8252h;
import p153i8.AbstractC8278o0;
import p153i8.AbstractC8282p0;
import p153i8.AbstractC8287r;
import p153i8.C8263k;
import p153i8.C8302u0;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p194k8.C9831h;
import p229m8.AbstractC10547i;
import p229m8.C10538a;
import p229m8.C10539b;
import p229m8.C10542d;
import p229m8.C10543e;
import p229m8.C10544f;

/* renamed from: com.google.android.exoplayer2.source.dash.b */
/* loaded from: classes7.dex */
final class C5233b implements AbstractC8287r, AbstractC8282p0.AbstractC8283a<C9831h<AbstractC5232a>>, C9831h.AbstractC9833b<AbstractC5232a> {

    /* renamed from: G */
    private static final Pattern f37274G = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: H */
    private static final Pattern f37275H = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: C */
    private AbstractC8282p0 f37278C;

    /* renamed from: D */
    private C10539b f37279D;

    /* renamed from: E */
    private int f37280E;

    /* renamed from: F */
    private List<C10543e> f37281F;

    /* renamed from: k */
    final int f9402k;

    /* renamed from: l */
    private final AbstractC5232a.AbstractC0140a f9403l;

    /* renamed from: m */
    private final AbstractC6795x f9404m;

    /* renamed from: n */
    private final AbstractC9818x f9405n;

    /* renamed from: o */
    private final AbstractC5318g f9406o;

    /* renamed from: p */
    private final long f9407p;

    /* renamed from: q */
    private final AbstractC6790t f9408q;

    /* renamed from: r */
    private final AbstractC6765b f9409r;

    /* renamed from: s */
    private final TrackGroupArray f9410s;

    /* renamed from: t */
    private final C5234a[] f9411t;

    /* renamed from: u */
    private final AbstractC8252h f9412u;

    /* renamed from: v */
    private final C5239e f9413v;

    /* renamed from: x */
    private final AbstractC8233b0.C8234a f9415x;

    /* renamed from: y */
    private final AbstractC9815v.C9816a f9416y;

    /* renamed from: z */
    private AbstractC8287r.AbstractC8288a f9417z;

    /* renamed from: A */
    private C9831h<AbstractC5232a>[] f37276A = m29938F(0);

    /* renamed from: B */
    private C5238d[] f37277B = new C5238d[0];

    /* renamed from: w */
    private final IdentityHashMap<C9831h<AbstractC5232a>, C5239e.C5242c> f9414w = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.b$a */
    /* loaded from: classes7.dex */
    public static final class C5234a {

        /* renamed from: a */
        public final int[] f9418a;

        /* renamed from: b */
        public final int f9419b;

        /* renamed from: c */
        public final int f9420c;

        /* renamed from: d */
        public final int f9421d;

        /* renamed from: e */
        public final int f9422e;

        /* renamed from: f */
        public final int f9423f;

        /* renamed from: g */
        public final int f9424g;

        private C5234a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f9419b = i;
            this.f9418a = iArr;
            this.f9420c = i2;
            this.f9422e = i3;
            this.f9423f = i4;
            this.f9424g = i5;
            this.f9421d = i6;
        }

        /* renamed from: a */
        public static C5234a m29922a(int[] iArr, int i) {
            return new C5234a(3, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: b */
        public static C5234a m29921b(int[] iArr, int i) {
            return new C5234a(5, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: c */
        public static C5234a m29920c(int i) {
            return new C5234a(5, 2, new int[0], -1, -1, -1, i);
        }

        /* renamed from: d */
        public static C5234a m29919d(int i, int[] iArr, int i2, int i3, int i4) {
            return new C5234a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C5233b(int i, C10539b bVar, int i2, AbstractC5232a.AbstractC0140a aVar, AbstractC6795x xVar, AbstractC9818x xVar2, AbstractC9815v.C9816a aVar2, AbstractC5318g gVar, AbstractC8233b0.C8234a aVar3, long j, AbstractC6790t tVar, AbstractC6765b bVar2, AbstractC8252h hVar, C5239e.AbstractC5241b bVar3) {
        this.f9402k = i;
        this.f37279D = bVar;
        this.f37280E = i2;
        this.f9403l = aVar;
        this.f9404m = xVar;
        this.f9405n = xVar2;
        this.f9416y = aVar2;
        this.f9406o = gVar;
        this.f9415x = aVar3;
        this.f9407p = j;
        this.f9408q = tVar;
        this.f9409r = bVar2;
        this.f9412u = hVar;
        this.f9413v = new C5239e(bVar, bVar3, bVar2);
        this.f37278C = hVar.mo20192a(this.f37276A);
        C10544f d = bVar.m12922d(i2);
        List<C10543e> list = d.f23340d;
        this.f37281F = list;
        Pair<TrackGroupArray, C5234a[]> v = m29927v(xVar2, d.f23339c, list);
        this.f9410s = (TrackGroupArray) v.first;
        this.f9411t = (C5234a[]) v.second;
    }

    /* renamed from: A */
    private static int[][] m29943A(List<C10538a> list) {
        int i;
        C10542d w;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(list.get(i2).f23298a, i2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i2));
            arrayList.add(arrayList2);
            sparseArray.put(i2, arrayList2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            C10538a aVar = list.get(i3);
            C10542d y = m29924y(aVar.f23302e);
            if (y == null) {
                y = m29924y(aVar.f23303f);
            }
            if (y == null || (i = sparseIntArray.get(Integer.parseInt(y.f23330b), -1)) == -1) {
                i = i3;
            }
            if (i == i3 && (w = m29926w(aVar.f23303f)) != null) {
                for (String str : C7557q0.m22188N0(w.f23330b, ",")) {
                    int i4 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i4 != -1) {
                        i = Math.min(i, i4);
                    }
                }
            }
            if (i != i3) {
                List list2 = (List) sparseArray.get(i3);
                List list3 = (List) sparseArray.get(i);
                list3.addAll(list2);
                sparseArray.put(i3, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            int[] j = C7115d.m23358j((Collection) arrayList.get(i5));
            iArr[i5] = j;
            Arrays.sort(j);
        }
        return iArr;
    }

    /* renamed from: B */
    private int m29942B(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f9411t[i2].f9422e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f9411t[i5].f9420c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: C */
    private int[] m29941C(AbstractC3415h[] hVarArr) {
        int[] iArr = new int[hVarArr.length];
        for (int i = 0; i < hVarArr.length; i++) {
            AbstractC3415h hVar = hVarArr[i];
            if (hVar != null) {
                iArr[i] = this.f9410s.m29996b(hVar.mo34411k());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: D */
    private static boolean m29940D(List<C10538a> list, int[] iArr) {
        for (int i : iArr) {
            List<AbstractC10547i> list2 = list.get(i).f23300c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f23355e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    private static int m29939E(int i, List<C10538a> list, int[][] iArr, boolean[] zArr, C6722k[][] kVarArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m29940D(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            C6722k[] z = m29923z(list, iArr[i3]);
            kVarArr[i3] = z;
            if (z.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: F */
    private static C9831h<AbstractC5232a>[] m29938F(int i) {
        return new C9831h[i];
    }

    /* renamed from: H */
    private static C6722k[] m29936H(C10542d dVar, Pattern pattern, C6722k kVar) {
        String str = dVar.f23330b;
        if (str == null) {
            return new C6722k[]{kVar};
        }
        String[] N0 = C7557q0.m22188N0(str, ";");
        C6722k[] kVarArr = new C6722k[N0.length];
        for (int i = 0; i < N0.length; i++) {
            Matcher matcher = pattern.matcher(N0[i]);
            if (!matcher.matches()) {
                return new C6722k[]{kVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            kVarArr[i] = kVar.m24531a().m24505S(kVar.f14318k + ":" + parseInt).m24518F(parseInt).m24502V(matcher.group(2)).m24519E();
        }
        return kVarArr;
    }

    /* renamed from: J */
    private void m29934J(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr) {
        for (int i = 0; i < hVarArr.length; i++) {
            if (hVarArr[i] == null || !zArr[i]) {
                AbstractC8278o0 o0Var = o0VarArr[i];
                if (o0Var instanceof C9831h) {
                    ((C9831h) o0Var).m15230Q(this);
                } else if (o0Var instanceof C9831h.C9832a) {
                    ((C9831h.C9832a) o0Var).m15218c();
                }
                o0VarArr[i] = null;
            }
        }
    }

    /* renamed from: K */
    private void m29933K(AbstractC3415h[] hVarArr, AbstractC8278o0[] o0VarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < hVarArr.length; i++) {
            AbstractC8278o0 o0Var = o0VarArr[i];
            if ((o0Var instanceof C8263k) || (o0Var instanceof C9831h.C9832a)) {
                int B = m29942B(i, iArr);
                if (B == -1) {
                    z = o0VarArr[i] instanceof C8263k;
                } else {
                    AbstractC8278o0 o0Var2 = o0VarArr[i];
                    if (!(o0Var2 instanceof C9831h.C9832a) || ((C9831h.C9832a) o0Var2).f21914k != o0VarArr[B]) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    AbstractC8278o0 o0Var3 = o0VarArr[i];
                    if (o0Var3 instanceof C9831h.C9832a) {
                        ((C9831h.C9832a) o0Var3).m15218c();
                    }
                    o0VarArr[i] = null;
                }
            }
        }
    }

    /* renamed from: L */
    private void m29932L(AbstractC3415h[] hVarArr, AbstractC8278o0[] o0VarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < hVarArr.length; i++) {
            AbstractC3415h hVar = hVarArr[i];
            if (hVar != null) {
                AbstractC8278o0 o0Var = o0VarArr[i];
                if (o0Var == null) {
                    zArr[i] = true;
                    C5234a aVar = this.f9411t[iArr[i]];
                    int i2 = aVar.f9420c;
                    if (i2 == 0) {
                        o0VarArr[i] = m29928s(aVar, hVar, j);
                    } else if (i2 == 2) {
                        o0VarArr[i] = new C5238d(this.f37281F.get(aVar.f9421d), hVar.mo34411k().m19990a(0), this.f37279D.f23307d);
                    }
                } else if (o0Var instanceof C9831h) {
                    ((AbstractC5232a) ((C9831h) o0Var).m15242E()).mo29918b(hVar);
                }
            }
        }
        for (int i3 = 0; i3 < hVarArr.length; i3++) {
            if (o0VarArr[i3] == null && hVarArr[i3] != null) {
                C5234a aVar2 = this.f9411t[iArr[i3]];
                if (aVar2.f9420c == 1) {
                    int B = m29942B(i3, iArr);
                    if (B == -1) {
                        o0VarArr[i3] = new C8263k();
                    } else {
                        o0VarArr[i3] = ((C9831h) o0VarArr[B]).m15227T(j, aVar2.f9419b);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private static void m29930k(List<C10543e> list, C8302u0[] u0VarArr, C5234a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            u0VarArr[i] = new C8302u0(new C6722k.C6724b().m24505S(list.get(i2).m12850a()).m24488e0("application/x-emsg").m24519E());
            aVarArr[i] = C5234a.m29920c(i2);
            i2++;
            i++;
        }
    }

    /* renamed from: p */
    private static int m29929p(AbstractC9818x xVar, List<C10538a> list, int[][] iArr, int i, boolean[] zArr, C6722k[][] kVarArr, C8302u0[] u0VarArr, C5234a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).f23300c);
            }
            int size = arrayList.size();
            C6722k[] kVarArr2 = new C6722k[size];
            for (int i7 = 0; i7 < size; i7++) {
                C6722k kVar = ((AbstractC10547i) arrayList.get(i7)).f23352b;
                kVarArr2[i7] = kVar.m24530b(xVar.mo15277a(kVar));
            }
            C10538a aVar = list.get(iArr2[0]);
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8 + 1;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (kVarArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            u0VarArr[i5] = new C8302u0(kVarArr2);
            aVarArr[i5] = C5234a.m29919d(aVar.f23299b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                u0VarArr[i8] = new C8302u0(new C6722k.C6724b().m24505S(aVar.f23298a + ":emsg").m24488e0("application/x-emsg").m24519E());
                aVarArr[i8] = C5234a.m29921b(iArr2, i5);
            }
            if (i2 != -1) {
                u0VarArr[i2] = new C8302u0(kVarArr[i4]);
                aVarArr[i2] = C5234a.m29922a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    /* renamed from: s */
    private C9831h<AbstractC5232a> m29928s(C5234a aVar, AbstractC3415h hVar, long j) {
        boolean z;
        int i;
        C8302u0 u0Var;
        boolean z2;
        C8302u0 u0Var2;
        int i2;
        int i3 = aVar.f9423f;
        if (i3 != -1) {
            z = true;
        } else {
            z = false;
        }
        C5239e.C5242c cVar = null;
        if (z) {
            u0Var = this.f9410s.m29997a(i3);
            i = 1;
        } else {
            i = 0;
            u0Var = null;
        }
        int i4 = aVar.f9424g;
        if (i4 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            u0Var2 = this.f9410s.m29997a(i4);
            i += u0Var2.f18099k;
        } else {
            u0Var2 = null;
        }
        C6722k[] kVarArr = new C6722k[i];
        int[] iArr = new int[i];
        if (z) {
            kVarArr[0] = u0Var.m19990a(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < u0Var2.f18099k; i5++) {
                C6722k a = u0Var2.m19990a(i5);
                kVarArr[i2] = a;
                iArr[i2] = 3;
                arrayList.add(a);
                i2++;
            }
        }
        if (this.f37279D.f23307d && z) {
            cVar = this.f9413v.m29883k();
        }
        C9831h<AbstractC5232a> hVar2 = new C9831h<>(aVar.f9419b, iArr, kVarArr, this.f9403l.mo29910a(this.f9408q, this.f37279D, this.f37280E, aVar.f9418a, hVar, aVar.f9419b, this.f9407p, z, arrayList, cVar, this.f9404m), this, this.f9409r, j, this.f9405n, this.f9416y, this.f9406o, this.f9415x);
        synchronized (this) {
            this.f9414w.put(hVar2, cVar);
        }
        return hVar2;
    }

    /* renamed from: v */
    private static Pair<TrackGroupArray, C5234a[]> m29927v(AbstractC9818x xVar, List<C10538a> list, List<C10543e> list2) {
        int[][] A = m29943A(list);
        int length = A.length;
        boolean[] zArr = new boolean[length];
        C6722k[][] kVarArr = new C6722k[length];
        int E = m29939E(length, list, A, zArr, kVarArr) + length + list2.size();
        C8302u0[] u0VarArr = new C8302u0[E];
        C5234a[] aVarArr = new C5234a[E];
        m29930k(list2, u0VarArr, aVarArr, m29929p(xVar, list, A, length, zArr, kVarArr, u0VarArr, aVarArr));
        return Pair.create(new TrackGroupArray(u0VarArr), aVarArr);
    }

    /* renamed from: w */
    private static C10542d m29926w(List<C10542d> list) {
        return m29925x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: x */
    private static C10542d m29925x(List<C10542d> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C10542d dVar = list.get(i);
            if (str.equals(dVar.f23329a)) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: y */
    private static C10542d m29924y(List<C10542d> list) {
        return m29925x(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: z */
    private static C6722k[] m29923z(List<C10538a> list, int[] iArr) {
        for (int i : iArr) {
            C10538a aVar = list.get(i);
            List<C10542d> list2 = list.get(i).f23301d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C10542d dVar = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f23329a)) {
                    return m29936H(dVar, f37274G, new C6722k.C6724b().m24488e0("application/cea-608").m24505S(aVar.f23298a + ":cea608").m24519E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f23329a)) {
                    return m29936H(dVar, f37275H, new C6722k.C6724b().m24488e0("application/cea-708").m24505S(aVar.f23298a + ":cea708").m24519E());
                }
            }
        }
        return new C6722k[0];
    }

    /* renamed from: G */
    public void mo12471i(C9831h<AbstractC5232a> hVar) {
        this.f9417z.mo12471i(this);
    }

    /* renamed from: I */
    public void m29935I() {
        this.f9413v.m29879o();
        for (C9831h<AbstractC5232a> hVar : this.f37276A) {
            hVar.m15230Q(this);
        }
        this.f9417z = null;
    }

    /* renamed from: M */
    public void m29931M(C10539b bVar, int i) {
        C5238d[] dVarArr;
        this.f37279D = bVar;
        this.f37280E = i;
        this.f9413v.m29877q(bVar);
        C9831h<AbstractC5232a>[] hVarArr = this.f37276A;
        if (hVarArr != null) {
            for (C9831h<AbstractC5232a> hVar : hVarArr) {
                hVar.m15242E().mo29917i(bVar, i);
            }
            this.f9417z.mo12471i(this);
        }
        this.f37281F = bVar.m12922d(i).f23340d;
        for (C5238d dVar : this.f37277B) {
            Iterator<C10543e> it = this.f37281F.iterator();
            while (true) {
                if (it.hasNext()) {
                    C10543e next = it.next();
                    if (next.m12850a().equals(dVar.m29896b())) {
                        boolean z = true;
                        int e = bVar.m12921e() - 1;
                        if (!bVar.f23307d || i != e) {
                            z = false;
                        }
                        dVar.m29894d(next, z);
                    }
                }
            }
        }
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        return this.f37278C.mo12421b();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f37278C.mo12419c();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        C9831h<AbstractC5232a>[] hVarArr;
        for (C9831h<AbstractC5232a> hVar : this.f37276A) {
            if (hVar.f21898k == 2) {
                return hVar.m15226d(j, wVar);
            }
        }
        return j;
    }

    @Override // p194k8.C9831h.AbstractC9833b
    /* renamed from: e */
    public synchronized void mo15217e(C9831h<AbstractC5232a> hVar) {
        C5239e.C5242c remove = this.f9414w.remove(hVar);
        if (remove != null) {
            remove.m29867n();
        }
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        return this.f37278C.mo12415f(j);
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        return this.f37278C.mo12413g();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        this.f37278C.mo12411h(j);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    public long mo12470l(long j) {
        for (C9831h<AbstractC5232a> hVar : this.f37276A) {
            hVar.m15228S(j);
        }
        for (C5238d dVar : this.f37277B) {
            dVar.m29895c(j);
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        this.f9417z = aVar;
        aVar.mo20028j(this);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        return -9223372036854775807L;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
        int[] C = m29941C(hVarArr);
        m29934J(hVarArr, zArr, o0VarArr);
        m29933K(hVarArr, o0VarArr, C);
        m29932L(hVarArr, o0VarArr, zArr2, j, C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC8278o0 o0Var : o0VarArr) {
            if (o0Var instanceof C9831h) {
                arrayList.add((C9831h) o0Var);
            } else if (o0Var instanceof C5238d) {
                arrayList2.add((C5238d) o0Var);
            }
        }
        C9831h<AbstractC5232a>[] F = m29938F(arrayList.size());
        this.f37276A = F;
        arrayList.toArray(F);
        C5238d[] dVarArr = new C5238d[arrayList2.size()];
        this.f37277B = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f37278C = this.f9412u.mo20192a(this.f37276A);
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
        this.f9408q.mo24321a();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        return this.f9410s;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
        for (C9831h<AbstractC5232a> hVar : this.f37276A) {
            hVar.m15225u(j, z);
        }
    }
}
