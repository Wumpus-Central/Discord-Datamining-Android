package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p155ia.EnumC8324c;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.C14323c;

/* renamed from: ia.p */
/* loaded from: classes5.dex */
public class C8359p extends AbstractC8378x {
    public static final Parcelable.Creator<C8359p> CREATOR = new C8383y0();

    /* renamed from: k */
    private final C8369t f18207k;

    /* renamed from: l */
    private final C8374v f18208l;

    /* renamed from: m */
    private final byte[] f18209m;

    /* renamed from: n */
    private final List<C8364r> f18210n;

    /* renamed from: o */
    private final Double f18211o;

    /* renamed from: p */
    private final List<C8362q> f18212p;

    /* renamed from: q */
    private final C8344j f18213q;

    /* renamed from: r */
    private final Integer f18214r;

    /* renamed from: s */
    private final C8380y f18215s;

    /* renamed from: t */
    private final EnumC8324c f18216t;

    /* renamed from: u */
    private final C8328d f18217u;

    /* renamed from: ia.p$a */
    /* loaded from: classes5.dex */
    public static final class C8360a {

        /* renamed from: a */
        private C8369t f18218a;

        /* renamed from: b */
        private C8374v f18219b;

        /* renamed from: c */
        private byte[] f18220c;

        /* renamed from: d */
        private List<C8364r> f18221d;

        /* renamed from: e */
        private Double f18222e;

        /* renamed from: f */
        private List<C8362q> f18223f;

        /* renamed from: g */
        private C8344j f18224g;

        /* renamed from: h */
        private Integer f18225h;

        /* renamed from: i */
        private C8380y f18226i;

        /* renamed from: j */
        private EnumC8324c f18227j;

        /* renamed from: k */
        private C8328d f18228k;

        /* renamed from: a */
        public final C8359p m19920a() {
            String str;
            C8369t tVar = this.f18218a;
            C8374v vVar = this.f18219b;
            byte[] bArr = this.f18220c;
            List<C8364r> list = this.f18221d;
            Double d = this.f18222e;
            List<C8362q> list2 = this.f18223f;
            C8344j jVar = this.f18224g;
            Integer num = this.f18225h;
            C8380y yVar = this.f18226i;
            EnumC8324c cVar = this.f18227j;
            if (cVar == null) {
                str = null;
            } else {
                str = cVar.toString();
            }
            return new C8359p(tVar, vVar, bArr, list, d, list2, jVar, num, yVar, str, this.f18228k);
        }

        /* renamed from: b */
        public final C8360a m19919b(C8344j jVar) {
            this.f18224g = jVar;
            return this;
        }

        /* renamed from: c */
        public final C8360a m19918c(byte[] bArr) {
            this.f18220c = (byte[]) C14004p.m2051j(bArr);
            return this;
        }

        /* renamed from: d */
        public final C8360a m19917d(List<C8362q> list) {
            this.f18223f = list;
            return this;
        }

        /* renamed from: e */
        public final C8360a m19916e(List<C8364r> list) {
            this.f18221d = (List) C14004p.m2051j(list);
            return this;
        }

        /* renamed from: f */
        public final C8360a m19915f(C8369t tVar) {
            this.f18218a = (C8369t) C14004p.m2051j(tVar);
            return this;
        }

        /* renamed from: g */
        public final C8360a m19914g(Double d) {
            this.f18222e = d;
            return this;
        }

        /* renamed from: h */
        public final C8360a m19913h(C8374v vVar) {
            this.f18219b = (C8374v) C14004p.m2051j(vVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8359p(C8369t tVar, C8374v vVar, byte[] bArr, List<C8364r> list, Double d, List<C8362q> list2, C8344j jVar, Integer num, C8380y yVar, String str, C8328d dVar) {
        this.f18207k = (C8369t) C14004p.m2051j(tVar);
        this.f18208l = (C8374v) C14004p.m2051j(vVar);
        this.f18209m = (byte[]) C14004p.m2051j(bArr);
        this.f18210n = (List) C14004p.m2051j(list);
        this.f18211o = d;
        this.f18212p = list2;
        this.f18213q = jVar;
        this.f18214r = num;
        this.f18215s = yVar;
        if (str != null) {
            try {
                this.f18216t = EnumC8324c.m19959a(str);
            } catch (EnumC8324c.C8325a e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f18216t = null;
        }
        this.f18217u = dVar;
    }

    /* renamed from: B */
    public String m19926B() {
        EnumC8324c cVar = this.f18216t;
        if (cVar == null) {
            return null;
        }
        return cVar.toString();
    }

    /* renamed from: C */
    public C8344j m19925C() {
        return this.f18213q;
    }

    /* renamed from: M */
    public List<C8362q> m19924M() {
        return this.f18212p;
    }

    /* renamed from: T */
    public List<C8364r> m19923T() {
        return this.f18210n;
    }

    /* renamed from: U */
    public C8369t m19922U() {
        return this.f18207k;
    }

    /* renamed from: V */
    public C8374v m19921V() {
        return this.f18208l;
    }

    public boolean equals(Object obj) {
        List<C8362q> list;
        List<C8362q> list2;
        if (!(obj instanceof C8359p)) {
            return false;
        }
        C8359p pVar = (C8359p) obj;
        if (!C13996n.m2071b(this.f18207k, pVar.f18207k) || !C13996n.m2071b(this.f18208l, pVar.f18208l) || !Arrays.equals(this.f18209m, pVar.f18209m) || !C13996n.m2071b(this.f18211o, pVar.f18211o) || !this.f18210n.containsAll(pVar.f18210n) || !pVar.f18210n.containsAll(this.f18210n) || ((((list = this.f18212p) != null || pVar.f18212p != null) && (list == null || (list2 = pVar.f18212p) == null || !list.containsAll(list2) || !pVar.f18212p.containsAll(this.f18212p))) || !C13996n.m2071b(this.f18213q, pVar.f18213q) || !C13996n.m2071b(this.f18214r, pVar.f18214r) || !C13996n.m2071b(this.f18215s, pVar.f18215s) || !C13996n.m2071b(this.f18216t, pVar.f18216t) || !C13996n.m2071b(this.f18217u, pVar.f18217u))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18207k, this.f18208l, Integer.valueOf(Arrays.hashCode(this.f18209m)), this.f18210n, this.f18211o, this.f18212p, this.f18213q, this.f18214r, this.f18215s, this.f18216t, this.f18217u);
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: p */
    public C8328d mo19890p() {
        return this.f18217u;
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: r */
    public byte[] mo19889r() {
        return this.f18209m;
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: t */
    public Integer mo19888t() {
        return this.f18214r;
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: u */
    public Double mo19887u() {
        return this.f18211o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m844n(parcel, 2, m19922U(), i, false);
        C14323c.m844n(parcel, 3, m19921V(), i, false);
        C14323c.m852f(parcel, 4, mo19889r(), false);
        C14323c.m838t(parcel, 5, m19923T(), false);
        C14323c.m850h(parcel, 6, mo19887u(), false);
        C14323c.m838t(parcel, 7, m19924M(), false);
        C14323c.m844n(parcel, 8, m19925C(), i, false);
        C14323c.m846l(parcel, 9, mo19888t(), false);
        C14323c.m844n(parcel, 10, mo19886z(), i, false);
        C14323c.m842p(parcel, 11, m19926B(), false);
        C14323c.m844n(parcel, 12, mo19890p(), i, false);
        C14323c.m856b(parcel, a);
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: z */
    public C8380y mo19886z() {
        return this.f18215s;
    }
}
