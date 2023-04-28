package md;

import id.C8388a;
import id.C8389b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p066dd.C6441j;
import p066dd.C6446o;
import p137hd.AbstractC8004i;
import p137hd.C7997b;
import p137hd.C8002g;

/* renamed from: md.a */
/* loaded from: classes3.dex */
public final class C10589a {

    /* renamed from: a */
    private final C7997b f23432a;

    /* renamed from: b */
    private final C8389b f23433b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: md.a$b */
    /* loaded from: classes3.dex */
    public static final class C10590b {

        /* renamed from: a */
        private final C6446o f23434a;

        /* renamed from: b */
        private final C6446o f23435b;

        /* renamed from: c */
        private final int f23436c;

        /* renamed from: a */
        C6446o m12786a() {
            return this.f23434a;
        }

        /* renamed from: b */
        C6446o m12785b() {
            return this.f23435b;
        }

        /* renamed from: c */
        int m12784c() {
            return this.f23436c;
        }

        public String toString() {
            return this.f23434a + "/" + this.f23435b + '/' + this.f23436c;
        }

        private C10590b(C6446o oVar, C6446o oVar2, int i) {
            this.f23434a = oVar;
            this.f23435b = oVar2;
            this.f23436c = i;
        }
    }

    /* renamed from: md.a$c */
    /* loaded from: classes3.dex */
    private static final class C10591c implements Serializable, Comparator<C10590b> {
        private C10591c() {
        }

        /* renamed from: b */
        public int compare(C10590b bVar, C10590b bVar2) {
            return bVar.m12784c() - bVar2.m12784c();
        }
    }

    public C10589a(C7997b bVar) {
        this.f23432a = bVar;
        this.f23433b = new C8389b(bVar);
    }

    /* renamed from: a */
    private C6446o m12794a(C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4, int i) {
        float f = i;
        float d = m12791d(oVar, oVar2) / f;
        float d2 = m12791d(oVar3, oVar4);
        C6446o oVar5 = new C6446o(oVar4.m25545c() + (((oVar4.m25545c() - oVar3.m25545c()) / d2) * d), oVar4.m25544d() + (d * ((oVar4.m25544d() - oVar3.m25544d()) / d2)));
        float d3 = m12791d(oVar, oVar3) / f;
        float d4 = m12791d(oVar2, oVar4);
        C6446o oVar6 = new C6446o(oVar4.m25545c() + (((oVar4.m25545c() - oVar2.m25545c()) / d4) * d3), oVar4.m25544d() + (d3 * ((oVar4.m25544d() - oVar2.m25544d()) / d4)));
        if (!m12789f(oVar5)) {
            if (m12789f(oVar6)) {
                return oVar6;
            }
            return null;
        } else if (!m12789f(oVar6)) {
            return oVar5;
        } else {
            if (Math.abs(m12787h(oVar3, oVar5).m12784c() - m12787h(oVar2, oVar5).m12784c()) <= Math.abs(m12787h(oVar3, oVar6).m12784c() - m12787h(oVar2, oVar6).m12784c())) {
                return oVar5;
            }
            return oVar6;
        }
    }

    /* renamed from: b */
    private C6446o m12793b(C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4, int i, int i2) {
        float d = m12791d(oVar, oVar2) / i;
        float d2 = m12791d(oVar3, oVar4);
        C6446o oVar5 = new C6446o(oVar4.m25545c() + (((oVar4.m25545c() - oVar3.m25545c()) / d2) * d), oVar4.m25544d() + (d * ((oVar4.m25544d() - oVar3.m25544d()) / d2)));
        float d3 = m12791d(oVar, oVar3) / i2;
        float d4 = m12791d(oVar2, oVar4);
        C6446o oVar6 = new C6446o(oVar4.m25545c() + (((oVar4.m25545c() - oVar2.m25545c()) / d4) * d3), oVar4.m25544d() + (d3 * ((oVar4.m25544d() - oVar2.m25544d()) / d4)));
        if (!m12789f(oVar5)) {
            if (m12789f(oVar6)) {
                return oVar6;
            }
            return null;
        } else if (!m12789f(oVar6)) {
            return oVar5;
        } else {
            if (Math.abs(i - m12787h(oVar3, oVar5).m12784c()) + Math.abs(i2 - m12787h(oVar2, oVar5).m12784c()) <= Math.abs(i - m12787h(oVar3, oVar6).m12784c()) + Math.abs(i2 - m12787h(oVar2, oVar6).m12784c())) {
                return oVar5;
            }
            return oVar6;
        }
    }

    /* renamed from: d */
    private static int m12791d(C6446o oVar, C6446o oVar2) {
        return C8388a.m19876c(C6446o.m25546b(oVar, oVar2));
    }

    /* renamed from: e */
    private static void m12790e(Map<C6446o, Integer> map, C6446o oVar) {
        Integer num = map.get(oVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(oVar, Integer.valueOf(i));
    }

    /* renamed from: f */
    private boolean m12789f(C6446o oVar) {
        return oVar.m25545c() >= 0.0f && oVar.m25545c() < ((float) this.f23432a.m20917m()) && oVar.m25544d() > 0.0f && oVar.m25544d() < ((float) this.f23432a.m20920j());
    }

    /* renamed from: g */
    private static C7997b m12788g(C7997b bVar, C6446o oVar, C6446o oVar2, C6446o oVar3, C6446o oVar4, int i, int i2) {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return AbstractC8004i.m20887b().mo20886c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, oVar.m25545c(), oVar.m25544d(), oVar4.m25545c(), oVar4.m25544d(), oVar3.m25545c(), oVar3.m25544d(), oVar2.m25545c(), oVar2.m25544d());
    }

    /* renamed from: h */
    private C10590b m12787h(C6446o oVar, C6446o oVar2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int c = (int) oVar.m25545c();
        int d = (int) oVar.m25544d();
        int c2 = (int) oVar2.m25545c();
        int d2 = (int) oVar2.m25544d();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(d2 - d) > Math.abs(c2 - c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d = c;
            c = d;
            d2 = c2;
            c2 = d2;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i8 = (-abs) / 2;
        if (d < d2) {
            i = 1;
        } else {
            i = -1;
        }
        if (c >= c2) {
            i7 = -1;
        }
        C7997b bVar = this.f23432a;
        if (z) {
            i2 = d;
        } else {
            i2 = c;
        }
        if (z) {
            i3 = c;
        } else {
            i3 = d;
        }
        boolean e = bVar.m20923e(i2, i3);
        while (c != c2) {
            C7997b bVar2 = this.f23432a;
            if (z) {
                i4 = d;
            } else {
                i4 = c;
            }
            if (z) {
                i5 = c;
            } else {
                i5 = d;
            }
            boolean e2 = bVar2.m20923e(i4, i5);
            if (e2 != e) {
                i6++;
                e = e2;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (d == d2) {
                    break;
                }
                d += i;
                i8 -= abs;
            }
            c += i7;
        }
        return new C10590b(oVar, oVar2, i6);
    }

    /* renamed from: c */
    public C8002g m12792c() {
        C6446o oVar;
        C6446o oVar2;
        C7997b bVar;
        C6446o[] c = this.f23433b.m19872c();
        C6446o oVar3 = c[0];
        C6446o oVar4 = c[1];
        C6446o oVar5 = c[2];
        C6446o oVar6 = c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m12787h(oVar3, oVar4));
        arrayList.add(m12787h(oVar3, oVar5));
        arrayList.add(m12787h(oVar4, oVar6));
        arrayList.add(m12787h(oVar5, oVar6));
        C6446o oVar7 = null;
        Collections.sort(arrayList, new C10591c());
        C10590b bVar2 = (C10590b) arrayList.get(0);
        C10590b bVar3 = (C10590b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m12790e(hashMap, bVar2.m12786a());
        m12790e(hashMap, bVar2.m12785b());
        m12790e(hashMap, bVar3.m12786a());
        m12790e(hashMap, bVar3.m12785b());
        C6446o oVar8 = null;
        C6446o oVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C6446o oVar10 = (C6446o) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                oVar8 = oVar10;
            } else if (oVar7 == null) {
                oVar7 = oVar10;
            } else {
                oVar9 = oVar10;
            }
        }
        if (oVar7 == null || oVar8 == null || oVar9 == null) {
            throw C6441j.m25551a();
        }
        C6446o[] oVarArr = {oVar7, oVar8, oVar9};
        C6446o.m25543e(oVarArr);
        C6446o oVar11 = oVarArr[0];
        C6446o oVar12 = oVarArr[1];
        C6446o oVar13 = oVarArr[2];
        if (!hashMap.containsKey(oVar3)) {
            oVar = oVar3;
        } else if (!hashMap.containsKey(oVar4)) {
            oVar = oVar4;
        } else if (!hashMap.containsKey(oVar5)) {
            oVar = oVar5;
        } else {
            oVar = oVar6;
        }
        int c2 = m12787h(oVar13, oVar).m12784c();
        int c3 = m12787h(oVar11, oVar).m12784c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            oVar2 = oVar13;
            C6446o b = m12793b(oVar12, oVar11, oVar13, oVar, i, i2);
            if (b != null) {
                oVar = b;
            }
            int c4 = m12787h(oVar2, oVar).m12784c();
            int c5 = m12787h(oVar11, oVar).m12784c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            if ((c5 & 1) == 1) {
                c5++;
            }
            bVar = m12788g(this.f23432a, oVar2, oVar12, oVar11, oVar, c4, c5);
        } else {
            C6446o a = m12794a(oVar12, oVar11, oVar13, oVar, Math.min(i2, i));
            if (a != null) {
                oVar = a;
            }
            int max = Math.max(m12787h(oVar13, oVar).m12784c(), m12787h(oVar11, oVar).m12784c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            bVar = m12788g(this.f23432a, oVar13, oVar12, oVar11, oVar, max, max);
            oVar2 = oVar13;
        }
        return new C8002g(bVar, new C6446o[]{oVar2, oVar12, oVar11, oVar});
    }
}
