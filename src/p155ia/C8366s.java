package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.C14323c;

/* renamed from: ia.s */
/* loaded from: classes5.dex */
public class C8366s extends AbstractC8378x {
    public static final Parcelable.Creator<C8366s> CREATOR = new C8327c1();

    /* renamed from: k */
    private final byte[] f18235k;

    /* renamed from: l */
    private final Double f18236l;

    /* renamed from: m */
    private final String f18237m;

    /* renamed from: n */
    private final List<C8362q> f18238n;

    /* renamed from: o */
    private final Integer f18239o;

    /* renamed from: p */
    private final C8380y f18240p;

    /* renamed from: q */
    private final EnumC8338g0 f18241q;

    /* renamed from: r */
    private final C8328d f18242r;

    /* renamed from: ia.s$a */
    /* loaded from: classes5.dex */
    public static final class C8367a {

        /* renamed from: a */
        private byte[] f18243a;

        /* renamed from: b */
        private Double f18244b;

        /* renamed from: c */
        private String f18245c;

        /* renamed from: d */
        private List<C8362q> f18246d;

        /* renamed from: e */
        private Integer f18247e;

        /* renamed from: f */
        private C8380y f18248f;

        /* renamed from: g */
        private C8328d f18249g;

        /* renamed from: a */
        public final C8366s m19904a() {
            return new C8366s(this.f18243a, this.f18244b, this.f18245c, this.f18246d, this.f18247e, this.f18248f, null, this.f18249g);
        }

        /* renamed from: b */
        public final C8367a m19903b(List<C8362q> list) {
            this.f18246d = list;
            return this;
        }

        /* renamed from: c */
        public final C8367a m19902c(byte[] bArr) {
            this.f18243a = (byte[]) C14004p.m2051j(bArr);
            return this;
        }

        /* renamed from: d */
        public final C8367a m19901d(String str) {
            this.f18245c = (String) C14004p.m2051j(str);
            return this;
        }

        /* renamed from: e */
        public final C8367a m19900e(Double d) {
            this.f18244b = d;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8366s(byte[] bArr, Double d, String str, List<C8362q> list, Integer num, C8380y yVar, String str2, C8328d dVar) {
        this.f18235k = (byte[]) C14004p.m2051j(bArr);
        this.f18236l = d;
        this.f18237m = (String) C14004p.m2051j(str);
        this.f18238n = list;
        this.f18239o = num;
        this.f18240p = yVar;
        if (str2 != null) {
            try {
                this.f18241q = EnumC8338g0.m19946a(str2);
            } catch (C8341h0 e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f18241q = null;
        }
        this.f18242r = dVar;
    }

    /* renamed from: B */
    public List<C8362q> m19906B() {
        return this.f18238n;
    }

    /* renamed from: C */
    public String m19905C() {
        return this.f18237m;
    }

    public boolean equals(Object obj) {
        List<C8362q> list;
        List<C8362q> list2;
        if (!(obj instanceof C8366s)) {
            return false;
        }
        C8366s sVar = (C8366s) obj;
        if (!Arrays.equals(this.f18235k, sVar.f18235k) || !C13996n.m2071b(this.f18236l, sVar.f18236l) || !C13996n.m2071b(this.f18237m, sVar.f18237m) || ((((list = this.f18238n) != null || sVar.f18238n != null) && (list == null || (list2 = sVar.f18238n) == null || !list.containsAll(list2) || !sVar.f18238n.containsAll(this.f18238n))) || !C13996n.m2071b(this.f18239o, sVar.f18239o) || !C13996n.m2071b(this.f18240p, sVar.f18240p) || !C13996n.m2071b(this.f18241q, sVar.f18241q) || !C13996n.m2071b(this.f18242r, sVar.f18242r))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(Integer.valueOf(Arrays.hashCode(this.f18235k)), this.f18236l, this.f18237m, this.f18238n, this.f18239o, this.f18240p, this.f18241q, this.f18242r);
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: p */
    public C8328d mo19890p() {
        return this.f18242r;
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: r */
    public byte[] mo19889r() {
        return this.f18235k;
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: t */
    public Integer mo19888t() {
        return this.f18239o;
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: u */
    public Double mo19887u() {
        return this.f18236l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        int a = C14323c.m857a(parcel);
        C14323c.m852f(parcel, 2, mo19889r(), false);
        C14323c.m850h(parcel, 3, mo19887u(), false);
        C14323c.m842p(parcel, 4, m19905C(), false);
        C14323c.m838t(parcel, 5, m19906B(), false);
        C14323c.m846l(parcel, 6, mo19888t(), false);
        C14323c.m844n(parcel, 7, mo19886z(), i, false);
        EnumC8338g0 g0Var = this.f18241q;
        if (g0Var == null) {
            str = null;
        } else {
            str = g0Var.toString();
        }
        C14323c.m842p(parcel, 8, str, false);
        C14323c.m844n(parcel, 9, mo19890p(), i, false);
        C14323c.m856b(parcel, a);
    }

    @Override // p155ia.AbstractC8378x
    /* renamed from: z */
    public C8380y mo19886z() {
        return this.f18240p;
    }
}
