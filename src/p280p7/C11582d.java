package p280p7;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p119g9.C7570y;
import p228m7.C10513h;

/* renamed from: p7.d */
/* loaded from: classes7.dex */
final class C11582d extends AbstractC11583e {

    /* renamed from: b */
    private long f25842b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f25843c = new long[0];

    /* renamed from: d */
    private long[] f25844d = new long[0];

    public C11582d() {
        super(new C10513h());
    }

    /* renamed from: g */
    private static Boolean m9307g(C7570y yVar) {
        boolean z = true;
        if (yVar.m22029D() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    private static Object m9306h(C7570y yVar, int i) {
        if (i == 0) {
            return m9304j(yVar);
        }
        if (i == 1) {
            return m9307g(yVar);
        }
        if (i == 2) {
            return m9300n(yVar);
        }
        if (i == 3) {
            return m9302l(yVar);
        }
        if (i == 8) {
            return m9303k(yVar);
        }
        if (i == 10) {
            return m9301m(yVar);
        }
        if (i != 11) {
            return null;
        }
        return m9305i(yVar);
    }

    /* renamed from: i */
    private static Date m9305i(C7570y yVar) {
        Date date = new Date((long) m9304j(yVar).doubleValue());
        yVar.m22016Q(2);
        return date;
    }

    /* renamed from: j */
    private static Double m9304j(C7570y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.m21993w()));
    }

    /* renamed from: k */
    private static HashMap<String, Object> m9303k(C7570y yVar) {
        int H = yVar.m22025H();
        HashMap<String, Object> hashMap = new HashMap<>(H);
        for (int i = 0; i < H; i++) {
            String n = m9300n(yVar);
            Object h = m9306h(yVar, m9299o(yVar));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private static HashMap<String, Object> m9302l(C7570y yVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n = m9300n(yVar);
            int o = m9299o(yVar);
            if (o == 9) {
                return hashMap;
            }
            Object h = m9306h(yVar, o);
            if (h != null) {
                hashMap.put(n, h);
            }
        }
    }

    /* renamed from: m */
    private static ArrayList<Object> m9301m(C7570y yVar) {
        int H = yVar.m22025H();
        ArrayList<Object> arrayList = new ArrayList<>(H);
        for (int i = 0; i < H; i++) {
            Object h = m9306h(yVar, m9299o(yVar));
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    private static String m9300n(C7570y yVar) {
        int J = yVar.m22023J();
        int e = yVar.m22011e();
        yVar.m22016Q(J);
        return new String(yVar.m22012d(), e, J);
    }

    /* renamed from: o */
    private static int m9299o(C7570y yVar) {
        return yVar.m22029D();
    }

    @Override // p280p7.AbstractC11583e
    /* renamed from: b */
    protected boolean mo9297b(C7570y yVar) {
        return true;
    }

    @Override // p280p7.AbstractC11583e
    /* renamed from: c */
    protected boolean mo9296c(C7570y yVar, long j) {
        if (!(m9299o(yVar) == 2 && "onMetaData".equals(m9300n(yVar)) && m9299o(yVar) == 8)) {
            return false;
        }
        HashMap<String, Object> k = m9303k(yVar);
        Object obj = k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f25842b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f25843c = new long[size];
                this.f25844d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f25843c = new long[0];
                        this.f25844d = new long[0];
                        break;
                    }
                    this.f25843c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f25844d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public long m9310d() {
        return this.f25842b;
    }

    /* renamed from: e */
    public long[] m9309e() {
        return this.f25844d;
    }

    /* renamed from: f */
    public long[] m9308f() {
        return this.f25843c;
    }
}
