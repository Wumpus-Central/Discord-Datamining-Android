package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.j */
/* loaded from: classes6.dex */
public class C5965j {

    /* renamed from: B */
    private int f37627B;

    /* renamed from: C */
    private int f37628C;

    /* renamed from: D */
    private int f37629D;

    /* renamed from: E */
    private int f37630E;

    /* renamed from: F */
    private int f37631F;

    /* renamed from: L */
    private int f37637L;

    /* renamed from: M */
    private final float f37638M;

    /* renamed from: N */
    private final float f37639N;

    /* renamed from: O */
    private final float f37640O;

    /* renamed from: a */
    final ArrayList<C5960h> f11909a;

    /* renamed from: b */
    private final ArrayList<SVGLength[]> f11910b;

    /* renamed from: c */
    private final ArrayList<SVGLength[]> f11911c;

    /* renamed from: d */
    private final ArrayList<SVGLength[]> f11912d;

    /* renamed from: e */
    private final ArrayList<SVGLength[]> f11913e;

    /* renamed from: f */
    private final ArrayList<double[]> f11914f;

    /* renamed from: g */
    private final ArrayList<Integer> f11915g;

    /* renamed from: h */
    private final ArrayList<Integer> f11916h;

    /* renamed from: i */
    private final ArrayList<Integer> f11917i;

    /* renamed from: j */
    private final ArrayList<Integer> f11918j;

    /* renamed from: k */
    private final ArrayList<Integer> f11919k;

    /* renamed from: s */
    private double f11927s;

    /* renamed from: t */
    private double f11928t;

    /* renamed from: u */
    private double f11929u;

    /* renamed from: v */
    private double f11930v;

    /* renamed from: w */
    private SVGLength[] f11931w;

    /* renamed from: l */
    private final ArrayList<Integer> f11920l = new ArrayList<>();

    /* renamed from: m */
    private final ArrayList<Integer> f11921m = new ArrayList<>();

    /* renamed from: n */
    private final ArrayList<Integer> f11922n = new ArrayList<>();

    /* renamed from: o */
    private final ArrayList<Integer> f11923o = new ArrayList<>();

    /* renamed from: p */
    private final ArrayList<Integer> f11924p = new ArrayList<>();

    /* renamed from: q */
    private double f11925q = 12.0d;

    /* renamed from: r */
    private C5960h f11926r = C5960h.f11866p;

    /* renamed from: x */
    private SVGLength[] f11932x = new SVGLength[0];

    /* renamed from: y */
    private SVGLength[] f11933y = new SVGLength[0];

    /* renamed from: z */
    private SVGLength[] f11934z = new SVGLength[0];

    /* renamed from: A */
    private double[] f37626A = {0.0d};

    /* renamed from: G */
    private int f37632G = -1;

    /* renamed from: H */
    private int f37633H = -1;

    /* renamed from: I */
    private int f37634I = -1;

    /* renamed from: J */
    private int f37635J = -1;

    /* renamed from: K */
    private int f37636K = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5965j(float f, float f2, float f3) {
        ArrayList<C5960h> arrayList = new ArrayList<>();
        this.f11909a = arrayList;
        ArrayList<SVGLength[]> arrayList2 = new ArrayList<>();
        this.f11910b = arrayList2;
        ArrayList<SVGLength[]> arrayList3 = new ArrayList<>();
        this.f11911c = arrayList3;
        ArrayList<SVGLength[]> arrayList4 = new ArrayList<>();
        this.f11912d = arrayList4;
        ArrayList<SVGLength[]> arrayList5 = new ArrayList<>();
        this.f11913e = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.f11914f = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.f11915g = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.f11916h = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.f11917i = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.f11918j = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.f11919k = arrayList11;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.f11931w = sVGLengthArr;
        this.f37638M = f;
        this.f37639N = f2;
        this.f37640O = f3;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.f11932x);
        arrayList4.add(this.f11933y);
        arrayList5.add(this.f11934z);
        arrayList6.add(this.f37626A);
        arrayList7.add(Integer.valueOf(this.f37632G));
        arrayList8.add(Integer.valueOf(this.f37633H));
        arrayList9.add(Integer.valueOf(this.f37634I));
        arrayList10.add(Integer.valueOf(this.f37635J));
        arrayList11.add(Integer.valueOf(this.f37636K));
        arrayList.add(this.f11926r);
        m26735q();
    }

    /* renamed from: a */
    private double[] m26751a(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).f11767a;
        }
        return dArr;
    }

    /* renamed from: e */
    private SVGLength[] m26747e(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i = 0; i < size; i++) {
            sVGLengthArr[i] = arrayList.get(i);
        }
        return sVGLengthArr;
    }

    /* renamed from: f */
    private C5960h m26746f(C5969l lVar) {
        if (this.f37637L > 0) {
            return this.f11926r;
        }
        for (C5969l parentTextRoot = lVar.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            C5960h b = parentTextRoot.m26728c().m26750b();
            if (b != C5960h.f11866p) {
                return b;
            }
        }
        return C5960h.f11866p;
    }

    /* renamed from: h */
    private static void m26744h(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    /* renamed from: q */
    private void m26735q() {
        this.f11920l.add(Integer.valueOf(this.f37627B));
        this.f11921m.add(Integer.valueOf(this.f37628C));
        this.f11922n.add(Integer.valueOf(this.f37629D));
        this.f11923o.add(Integer.valueOf(this.f37630E));
        this.f11924p.add(Integer.valueOf(this.f37631F));
    }

    /* renamed from: r */
    private void m26734r(C5969l lVar, ReadableMap readableMap) {
        C5960h f = m26746f(lVar);
        this.f37637L++;
        if (readableMap == null) {
            this.f11909a.add(f);
            return;
        }
        C5960h hVar = new C5960h(readableMap, f, this.f37638M);
        this.f11925q = hVar.f11867a;
        this.f11909a.add(hVar);
        this.f11926r = hVar;
    }

    /* renamed from: s */
    private void m26733s() {
        this.f37631F = 0;
        this.f37630E = 0;
        this.f37629D = 0;
        this.f37628C = 0;
        this.f37627B = 0;
        this.f37636K = -1;
        this.f37635J = -1;
        this.f37634I = -1;
        this.f37633H = -1;
        this.f37632G = -1;
        this.f11930v = 0.0d;
        this.f11929u = 0.0d;
        this.f11928t = 0.0d;
        this.f11927s = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C5960h m26750b() {
        return this.f11926r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public double m26749c() {
        return this.f11925q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m26748d() {
        return this.f37640O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m26745g() {
        return this.f37639N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public double m26743i() {
        m26744h(this.f11917i, this.f37629D);
        int i = this.f37634I + 1;
        SVGLength[] sVGLengthArr = this.f11933y;
        if (i < sVGLengthArr.length) {
            this.f37634I = i;
            this.f11929u += C5992x.m26556a(sVGLengthArr[i], this.f37639N, 0.0d, this.f37638M, this.f11925q);
        }
        return this.f11929u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public double m26742j() {
        m26744h(this.f11918j, this.f37630E);
        int i = this.f37635J + 1;
        SVGLength[] sVGLengthArr = this.f11934z;
        if (i < sVGLengthArr.length) {
            this.f37635J = i;
            this.f11930v += C5992x.m26556a(sVGLengthArr[i], this.f37640O, 0.0d, this.f37638M, this.f11925q);
        }
        return this.f11930v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public double m26741k() {
        m26744h(this.f11919k, this.f37631F);
        int min = Math.min(this.f37636K + 1, this.f37626A.length - 1);
        this.f37636K = min;
        return this.f37626A[min];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public double m26740l(double d) {
        m26744h(this.f11915g, this.f37627B);
        int i = this.f37632G + 1;
        SVGLength[] sVGLengthArr = this.f11931w;
        if (i < sVGLengthArr.length) {
            this.f11929u = 0.0d;
            this.f37632G = i;
            this.f11927s = C5992x.m26556a(sVGLengthArr[i], this.f37639N, 0.0d, this.f37638M, this.f11925q);
        }
        double d2 = this.f11927s + d;
        this.f11927s = d2;
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public double m26739m() {
        m26744h(this.f11916h, this.f37628C);
        int i = this.f37633H + 1;
        SVGLength[] sVGLengthArr = this.f11932x;
        if (i < sVGLengthArr.length) {
            this.f11930v = 0.0d;
            this.f37633H = i;
            this.f11928t = C5992x.m26556a(sVGLengthArr[i], this.f37640O, 0.0d, this.f37638M, this.f11925q);
        }
        return this.f11928t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m26738n() {
        this.f11909a.remove(this.f37637L);
        this.f11920l.remove(this.f37637L);
        this.f11921m.remove(this.f37637L);
        this.f11922n.remove(this.f37637L);
        this.f11923o.remove(this.f37637L);
        this.f11924p.remove(this.f37637L);
        int i = this.f37637L - 1;
        this.f37637L = i;
        int i2 = this.f37627B;
        int i3 = this.f37628C;
        int i4 = this.f37629D;
        int i5 = this.f37630E;
        int i6 = this.f37631F;
        this.f11926r = this.f11909a.get(i);
        this.f37627B = this.f11920l.get(this.f37637L).intValue();
        this.f37628C = this.f11921m.get(this.f37637L).intValue();
        this.f37629D = this.f11922n.get(this.f37637L).intValue();
        this.f37630E = this.f11923o.get(this.f37637L).intValue();
        this.f37631F = this.f11924p.get(this.f37637L).intValue();
        if (i2 != this.f37627B) {
            this.f11910b.remove(i2);
            this.f11931w = this.f11910b.get(this.f37627B);
            this.f37632G = this.f11915g.get(this.f37627B).intValue();
        }
        if (i3 != this.f37628C) {
            this.f11911c.remove(i3);
            this.f11932x = this.f11911c.get(this.f37628C);
            this.f37633H = this.f11916h.get(this.f37628C).intValue();
        }
        if (i4 != this.f37629D) {
            this.f11912d.remove(i4);
            this.f11933y = this.f11912d.get(this.f37629D);
            this.f37634I = this.f11917i.get(this.f37629D).intValue();
        }
        if (i5 != this.f37630E) {
            this.f11913e.remove(i5);
            this.f11934z = this.f11913e.get(this.f37630E);
            this.f37635J = this.f11918j.get(this.f37630E).intValue();
        }
        if (i6 != this.f37631F) {
            this.f11914f.remove(i6);
            this.f37626A = this.f11914f.get(this.f37631F);
            this.f37636K = this.f11919k.get(this.f37631F).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m26737o(C5969l lVar, ReadableMap readableMap) {
        m26734r(lVar, readableMap);
        m26735q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m26736p(boolean z, C5986t0 t0Var, ReadableMap readableMap, ArrayList<SVGLength> arrayList, ArrayList<SVGLength> arrayList2, ArrayList<SVGLength> arrayList3, ArrayList<SVGLength> arrayList4, ArrayList<SVGLength> arrayList5) {
        if (z) {
            m26733s();
        }
        m26734r(t0Var, readableMap);
        if (!(arrayList == null || arrayList.size() == 0)) {
            this.f37627B++;
            this.f37632G = -1;
            this.f11915g.add(-1);
            SVGLength[] e = m26747e(arrayList);
            this.f11931w = e;
            this.f11910b.add(e);
        }
        if (!(arrayList2 == null || arrayList2.size() == 0)) {
            this.f37628C++;
            this.f37633H = -1;
            this.f11916h.add(-1);
            SVGLength[] e2 = m26747e(arrayList2);
            this.f11932x = e2;
            this.f11911c.add(e2);
        }
        if (!(arrayList3 == null || arrayList3.size() == 0)) {
            this.f37629D++;
            this.f37634I = -1;
            this.f11917i.add(-1);
            SVGLength[] e3 = m26747e(arrayList3);
            this.f11933y = e3;
            this.f11912d.add(e3);
        }
        if (!(arrayList4 == null || arrayList4.size() == 0)) {
            this.f37630E++;
            this.f37635J = -1;
            this.f11918j.add(-1);
            SVGLength[] e4 = m26747e(arrayList4);
            this.f11934z = e4;
            this.f11913e.add(e4);
        }
        if (!(arrayList5 == null || arrayList5.size() == 0)) {
            this.f37631F++;
            this.f37636K = -1;
            this.f11919k.add(-1);
            double[] a = m26751a(arrayList5);
            this.f37626A = a;
            this.f11914f.add(a);
        }
        m26735q();
    }
}
