package p260o8;

import android.net.Uri;
import cc.AbstractC3884i0;
import cc.AbstractC3899l0;
import cc.C3976z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p132h8.C7937c;
import p193k7.C9798l;

/* renamed from: o8.g */
/* loaded from: classes7.dex */
public final class C11220g extends AbstractC11227h {

    /* renamed from: d */
    public final int f25062d;

    /* renamed from: e */
    public final long f25063e;

    /* renamed from: f */
    public final long f25064f;

    /* renamed from: g */
    public final boolean f25065g;

    /* renamed from: h */
    public final int f25066h;

    /* renamed from: i */
    public final long f25067i;

    /* renamed from: j */
    public final int f25068j;

    /* renamed from: k */
    public final long f25069k;

    /* renamed from: l */
    public final long f25070l;

    /* renamed from: m */
    public final boolean f25071m;

    /* renamed from: n */
    public final boolean f25072n;

    /* renamed from: o */
    public final C9798l f25073o;

    /* renamed from: p */
    public final List<C11224d> f25074p;

    /* renamed from: q */
    public final List<C11222b> f25075q;

    /* renamed from: r */
    public final Map<Uri, C11223c> f25076r;

    /* renamed from: s */
    public final long f25077s;

    /* renamed from: t */
    public final C11226f f25078t;

    /* renamed from: o8.g$b */
    /* loaded from: classes7.dex */
    public static final class C11222b extends C11225e {

        /* renamed from: v */
        public final boolean f25079v;

        /* renamed from: w */
        public final boolean f25080w;

        public C11222b(String str, C11224d dVar, long j, int i, long j2, C9798l lVar, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j, i, j2, lVar, str2, str3, j3, j4, z);
            this.f25079v = z2;
            this.f25080w = z3;
        }

        /* renamed from: b */
        public C11222b m10420b(long j, int i) {
            return new C11222b(this.f25086k, this.f25087l, this.f25088m, i, j, this.f25091p, this.f25092q, this.f25093r, this.f25094s, this.f25095t, this.f25096u, this.f25079v, this.f25080w);
        }
    }

    /* renamed from: o8.g$c */
    /* loaded from: classes7.dex */
    public static final class C11223c {

        /* renamed from: a */
        public final Uri f25081a;

        /* renamed from: b */
        public final long f25082b;

        /* renamed from: c */
        public final int f25083c;

        public C11223c(Uri uri, long j, int i) {
            this.f25081a = uri;
            this.f25082b = j;
            this.f25083c = i;
        }
    }

    /* renamed from: o8.g$e */
    /* loaded from: classes7.dex */
    public static class C11225e implements Comparable<Long> {

        /* renamed from: k */
        public final String f25086k;

        /* renamed from: l */
        public final C11224d f25087l;

        /* renamed from: m */
        public final long f25088m;

        /* renamed from: n */
        public final int f25089n;

        /* renamed from: o */
        public final long f25090o;

        /* renamed from: p */
        public final C9798l f25091p;

        /* renamed from: q */
        public final String f25092q;

        /* renamed from: r */
        public final String f25093r;

        /* renamed from: s */
        public final long f25094s;

        /* renamed from: t */
        public final long f25095t;

        /* renamed from: u */
        public final boolean f25096u;

        /* renamed from: a */
        public int compareTo(Long l) {
            if (this.f25090o > l.longValue()) {
                return 1;
            }
            if (this.f25090o < l.longValue()) {
                return -1;
            }
            return 0;
        }

        private C11225e(String str, C11224d dVar, long j, int i, long j2, C9798l lVar, String str2, String str3, long j3, long j4, boolean z) {
            this.f25086k = str;
            this.f25087l = dVar;
            this.f25088m = j;
            this.f25089n = i;
            this.f25090o = j2;
            this.f25091p = lVar;
            this.f25092q = str2;
            this.f25093r = str3;
            this.f25094s = j3;
            this.f25095t = j4;
            this.f25096u = z;
        }
    }

    /* renamed from: o8.g$f */
    /* loaded from: classes7.dex */
    public static final class C11226f {

        /* renamed from: a */
        public final long f25097a;

        /* renamed from: b */
        public final boolean f25098b;

        /* renamed from: c */
        public final long f25099c;

        /* renamed from: d */
        public final long f25100d;

        /* renamed from: e */
        public final boolean f25101e;

        public C11226f(long j, boolean z, long j2, long j3, boolean z2) {
            this.f25097a = j;
            this.f25098b = z;
            this.f25099c = j2;
            this.f25100d = j3;
            this.f25101e = z2;
        }
    }

    public C11220g(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, long j5, boolean z2, boolean z3, boolean z4, C9798l lVar, List<C11224d> list2, List<C11222b> list3, C11226f fVar, Map<Uri, C11223c> map) {
        super(str, list, z2);
        long j6;
        this.f25062d = i;
        this.f25064f = j2;
        this.f25065g = z;
        this.f25066h = i2;
        this.f25067i = j3;
        this.f25068j = i3;
        this.f25069k = j4;
        this.f25070l = j5;
        this.f25071m = z3;
        this.f25072n = z4;
        this.f25073o = lVar;
        this.f25074p = AbstractC3884i0.m33401u(list2);
        this.f25075q = AbstractC3884i0.m33401u(list3);
        this.f25076r = AbstractC3899l0.m33378f(map);
        if (!list3.isEmpty()) {
            C11222b bVar = (C11222b) C3976z0.m33215c(list3);
            this.f25077s = bVar.f25090o + bVar.f25088m;
        } else if (!list2.isEmpty()) {
            C11224d dVar = (C11224d) C3976z0.m33215c(list2);
            this.f25077s = dVar.f25090o + dVar.f25088m;
        } else {
            this.f25077s = 0L;
        }
        if (j == -9223372036854775807L) {
            j6 = -9223372036854775807L;
        } else {
            j6 = j >= 0 ? j : this.f25077s + j;
        }
        this.f25063e = j6;
        this.f25078t = fVar;
    }

    /* renamed from: b */
    public C11220g mo7928a(List<C7937c> list) {
        return this;
    }

    /* renamed from: c */
    public C11220g m10424c(long j, int i) {
        return new C11220g(this.f25062d, this.f25102a, this.f25103b, this.f25063e, j, true, i, this.f25067i, this.f25068j, this.f25069k, this.f25070l, this.f25104c, this.f25071m, this.f25072n, this.f25073o, this.f25074p, this.f25075q, this.f25078t, this.f25076r);
    }

    /* renamed from: d */
    public C11220g m10423d() {
        if (this.f25071m) {
            return this;
        }
        return new C11220g(this.f25062d, this.f25102a, this.f25103b, this.f25063e, this.f25064f, this.f25065g, this.f25066h, this.f25067i, this.f25068j, this.f25069k, this.f25070l, this.f25104c, true, this.f25072n, this.f25073o, this.f25074p, this.f25075q, this.f25078t, this.f25076r);
    }

    /* renamed from: e */
    public long m10422e() {
        return this.f25064f + this.f25077s;
    }

    /* renamed from: f */
    public boolean m10421f(C11220g gVar) {
        if (gVar == null) {
            return true;
        }
        long j = this.f25067i;
        long j2 = gVar.f25067i;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.f25074p.size() - gVar.f25074p.size();
        if (size == 0) {
            int size2 = this.f25075q.size();
            int size3 = gVar.f25075q.size();
            if (size2 > size3) {
                return true;
            }
            if (size2 != size3 || !this.f25071m || gVar.f25071m) {
                return false;
            }
            return true;
        } else if (size > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: o8.g$d */
    /* loaded from: classes7.dex */
    public static final class C11224d extends C11225e {

        /* renamed from: v */
        public final String f25084v;

        /* renamed from: w */
        public final List<C11222b> f25085w;

        public C11224d(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, AbstractC3884i0.m33399x());
        }

        /* renamed from: b */
        public C11224d m10419b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.f25085w.size(); i2++) {
                C11222b bVar = this.f25085w.get(i2);
                arrayList.add(bVar.m10420b(j2, i));
                j2 += bVar.f25088m;
            }
            return new C11224d(this.f25086k, this.f25087l, this.f25084v, this.f25088m, i, j, this.f25091p, this.f25092q, this.f25093r, this.f25094s, this.f25095t, this.f25096u, arrayList);
        }

        public C11224d(String str, C11224d dVar, String str2, long j, int i, long j2, C9798l lVar, String str3, String str4, long j3, long j4, boolean z, List<C11222b> list) {
            super(str, dVar, j, i, j2, lVar, str3, str4, j3, j4, z);
            this.f25084v = str2;
            this.f25085w = AbstractC3884i0.m33401u(list);
        }
    }
}
