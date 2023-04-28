package p029b9;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import cc.AbstractC3884i0;
import cc.AbstractC3937r1;
import cc.AbstractC3966x;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p029b9.AbstractC3415h;
import p029b9.AbstractC3419j;
import p029b9.C3399a;
import p029b9.C3422l;
import p079e7.C6722k;
import p079e7.C6732s;
import p079e7.C6734u;
import p103fc.C7115d;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.AbstractC8299u;
import p153i8.C8302u0;
import p163j$.util.Spliterator;

/* renamed from: b9.f */
/* loaded from: classes5.dex */
public class C3405f extends AbstractC3419j {

    /* renamed from: f */
    private static final int[] f5463f = new int[0];

    /* renamed from: g */
    private static final AbstractC3937r1<Integer> f5464g = AbstractC3937r1.m33316b(new Comparator() { // from class: b9.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int A;
            A = C3405f.m34499A((Integer) obj, (Integer) obj2);
            return A;
        }
    });

    /* renamed from: h */
    private static final AbstractC3937r1<Integer> f5465h = AbstractC3937r1.m33316b(new Comparator() { // from class: b9.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int B;
            B = C3405f.m34498B((Integer) obj, (Integer) obj2);
            return B;
        }
    });

    /* renamed from: d */
    private final AbstractC3415h.AbstractC3417b f5466d;

    /* renamed from: e */
    private final AtomicReference<C3409d> f5467e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b9.f$b */
    /* loaded from: classes5.dex */
    public static final class C3407b implements Comparable<C3407b> {

        /* renamed from: k */
        public final boolean f5468k;

        /* renamed from: l */
        private final String f5469l;

        /* renamed from: m */
        private final C3409d f5470m;

        /* renamed from: n */
        private final boolean f5471n;

        /* renamed from: o */
        private final int f5472o;

        /* renamed from: p */
        private final int f5473p;

        /* renamed from: q */
        private final int f5474q;

        /* renamed from: r */
        private final int f5475r;

        /* renamed from: s */
        private final int f5476s;

        /* renamed from: t */
        private final boolean f5477t;

        /* renamed from: u */
        private final int f5478u;

        /* renamed from: v */
        private final int f5479v;

        /* renamed from: w */
        private final int f5480w;

        /* renamed from: x */
        private final int f5481x;

        public C3407b(C6722k kVar, C3409d dVar, int i) {
            int i2;
            int i3;
            boolean z;
            int i4;
            this.f5470m = dVar;
            this.f5469l = C3405f.m34496D(kVar.f14320m);
            int i5 = 0;
            this.f5471n = C3405f.m34472x(i, false);
            int i6 = 0;
            while (true) {
                int size = dVar.f5549k.size();
                i2 = ViewDefaults.NUMBER_OF_LINES;
                if (i6 >= size) {
                    i3 = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                }
                i3 = C3405f.m34476t(kVar, dVar.f5549k.get(i6), false);
                if (i3 > 0) {
                    break;
                }
                i6++;
            }
            this.f5473p = i6;
            this.f5472o = i3;
            this.f5474q = Integer.bitCount(kVar.f14322o & dVar.f5550l);
            boolean z2 = true;
            if ((kVar.f14321n & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5477t = z;
            int i7 = kVar.f37969I;
            this.f5478u = i7;
            this.f5479v = kVar.f37970J;
            int i8 = kVar.f14325r;
            this.f5480w = i8;
            if ((i8 != -1 && i8 > dVar.f35790I) || (i7 != -1 && i7 > dVar.f35789H)) {
                z2 = false;
            }
            this.f5468k = z2;
            String[] g0 = C7557q0.m22150g0();
            int i9 = 0;
            while (true) {
                if (i9 >= g0.length) {
                    i4 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                }
                i4 = C3405f.m34476t(kVar, g0[i9], false);
                if (i4 > 0) {
                    break;
                }
                i9++;
            }
            this.f5475r = i9;
            this.f5476s = i4;
            while (true) {
                if (i5 < dVar.f35795N.size()) {
                    String str = kVar.f14329v;
                    if (str != null && str.equals(dVar.f35795N.get(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            this.f5481x = i2;
        }

        /* renamed from: a */
        public int compareTo(C3407b bVar) {
            AbstractC3937r1 r1Var;
            AbstractC3937r1 r1Var2;
            if (!this.f5468k || !this.f5471n) {
                r1Var = C3405f.f5464g.mo33221k();
            } else {
                r1Var = C3405f.f5464g;
            }
            AbstractC3966x f = AbstractC3966x.m33235j().mo33230g(this.f5471n, bVar.f5471n).mo33231f(Integer.valueOf(this.f5473p), Integer.valueOf(bVar.f5473p), AbstractC3937r1.m33314d().mo33221k()).mo33233d(this.f5472o, bVar.f5472o).mo33233d(this.f5474q, bVar.f5474q).mo33230g(this.f5468k, bVar.f5468k).mo33231f(Integer.valueOf(this.f5481x), Integer.valueOf(bVar.f5481x), AbstractC3937r1.m33314d().mo33221k());
            Integer valueOf = Integer.valueOf(this.f5480w);
            Integer valueOf2 = Integer.valueOf(bVar.f5480w);
            if (this.f5470m.f35796O) {
                r1Var2 = C3405f.f5464g.mo33221k();
            } else {
                r1Var2 = C3405f.f5465h;
            }
            AbstractC3966x f2 = f.mo33231f(valueOf, valueOf2, r1Var2).mo33230g(this.f5477t, bVar.f5477t).mo33231f(Integer.valueOf(this.f5475r), Integer.valueOf(bVar.f5475r), AbstractC3937r1.m33314d().mo33221k()).mo33233d(this.f5476s, bVar.f5476s).mo33231f(Integer.valueOf(this.f5478u), Integer.valueOf(bVar.f5478u), r1Var).mo33231f(Integer.valueOf(this.f5479v), Integer.valueOf(bVar.f5479v), r1Var);
            Integer valueOf3 = Integer.valueOf(this.f5480w);
            Integer valueOf4 = Integer.valueOf(bVar.f5480w);
            if (!C7557q0.m22159c(this.f5469l, bVar.f5469l)) {
                r1Var = C3405f.f5465h;
            }
            return f2.mo33231f(valueOf3, valueOf4, r1Var).mo33228i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b9.f$c */
    /* loaded from: classes5.dex */
    public static final class C3408c implements Comparable<C3408c> {

        /* renamed from: k */
        private final boolean f5482k;

        /* renamed from: l */
        private final boolean f5483l;

        public C3408c(C6722k kVar, int i) {
            this.f5482k = (kVar.f14321n & 1) == 0 ? false : true;
            this.f5483l = C3405f.m34472x(i, false);
        }

        /* renamed from: a */
        public int compareTo(C3408c cVar) {
            return AbstractC3966x.m33235j().mo33230g(this.f5483l, cVar.f5483l).mo33230g(this.f5482k, cVar.f5482k).mo33228i();
        }
    }

    /* renamed from: b9.f$e */
    /* loaded from: classes5.dex */
    public static final class C3411e extends C3422l.C3424b {

        /* renamed from: A */
        private boolean f35803A;

        /* renamed from: B */
        private AbstractC3884i0<String> f35804B;

        /* renamed from: C */
        private boolean f35805C;

        /* renamed from: D */
        private boolean f35806D;

        /* renamed from: E */
        private boolean f35807E;

        /* renamed from: F */
        private boolean f35808F;

        /* renamed from: G */
        private boolean f35809G;

        /* renamed from: H */
        private final SparseArray<Map<TrackGroupArray, C0080f>> f35810H;

        /* renamed from: I */
        private final SparseBooleanArray f35811I;

        /* renamed from: g */
        private int f5492g;

        /* renamed from: h */
        private int f5493h;

        /* renamed from: i */
        private int f5494i;

        /* renamed from: j */
        private int f5495j;

        /* renamed from: k */
        private int f5496k;

        /* renamed from: l */
        private int f5497l;

        /* renamed from: m */
        private int f5498m;

        /* renamed from: n */
        private int f5499n;

        /* renamed from: o */
        private boolean f5500o;

        /* renamed from: p */
        private boolean f5501p;

        /* renamed from: q */
        private boolean f5502q;

        /* renamed from: r */
        private int f5503r;

        /* renamed from: s */
        private int f5504s;

        /* renamed from: t */
        private boolean f5505t;

        /* renamed from: u */
        private AbstractC3884i0<String> f5506u;

        /* renamed from: v */
        private int f5507v;

        /* renamed from: w */
        private int f5508w;

        /* renamed from: x */
        private boolean f5509x;

        /* renamed from: y */
        private boolean f5510y;

        /* renamed from: z */
        private boolean f5511z;

        /* renamed from: e */
        private static SparseArray<Map<TrackGroupArray, C0080f>> m34452e(SparseArray<Map<TrackGroupArray, C0080f>> sparseArray) {
            SparseArray<Map<TrackGroupArray, C0080f>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }

        /* renamed from: f */
        private void m34451f() {
            this.f5492g = ViewDefaults.NUMBER_OF_LINES;
            this.f5493h = ViewDefaults.NUMBER_OF_LINES;
            this.f5494i = ViewDefaults.NUMBER_OF_LINES;
            this.f5495j = ViewDefaults.NUMBER_OF_LINES;
            this.f5500o = true;
            this.f5501p = false;
            this.f5502q = true;
            this.f5503r = ViewDefaults.NUMBER_OF_LINES;
            this.f5504s = ViewDefaults.NUMBER_OF_LINES;
            this.f5505t = true;
            this.f5506u = AbstractC3884i0.m33399x();
            this.f5507v = ViewDefaults.NUMBER_OF_LINES;
            this.f5508w = ViewDefaults.NUMBER_OF_LINES;
            this.f5509x = true;
            this.f5510y = false;
            this.f5511z = false;
            this.f35803A = false;
            this.f35804B = AbstractC3884i0.m33399x();
            this.f35805C = false;
            this.f35806D = false;
            this.f35807E = true;
            this.f35808F = false;
            this.f35809G = true;
        }

        /* renamed from: d */
        public C3409d mo34407a() {
            return new C3409d(this.f5492g, this.f5493h, this.f5494i, this.f5495j, this.f5496k, this.f5497l, this.f5498m, this.f5499n, this.f5500o, this.f5501p, this.f5502q, this.f5503r, this.f5504s, this.f5505t, this.f5506u, this.f5555a, this.f5556b, this.f5507v, this.f5508w, this.f5509x, this.f5510y, this.f5511z, this.f35803A, this.f35804B, this.f5557c, this.f5558d, this.f5559e, this.f5560f, this.f35805C, this.f35806D, this.f35807E, this.f35808F, this.f35809G, this.f35810H, this.f35811I);
        }

        /* renamed from: g */
        public C3411e m34450g(int i) {
            this.f5495j = i;
            return this;
        }

        /* renamed from: h */
        public C3411e mo34406b(Context context) {
            super.mo34406b(context);
            return this;
        }

        /* renamed from: i */
        public final C3411e m34448i(int i, boolean z) {
            if (this.f35811I.get(i) == z) {
                return this;
            }
            if (z) {
                this.f35811I.put(i, true);
            } else {
                this.f35811I.delete(i);
            }
            return this;
        }

        /* renamed from: j */
        public final C3411e m34447j(int i, TrackGroupArray trackGroupArray, C0080f fVar) {
            Map<TrackGroupArray, C0080f> map = this.f35810H.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f35810H.put(i, map);
            }
            if (map.containsKey(trackGroupArray) && C7557q0.m22159c(map.get(trackGroupArray), fVar)) {
                return this;
            }
            map.put(trackGroupArray, fVar);
            return this;
        }

        /* renamed from: k */
        public C3411e m34446k(int i, int i2, boolean z) {
            this.f5503r = i;
            this.f5504s = i2;
            this.f5505t = z;
            return this;
        }

        /* renamed from: l */
        public C3411e m34445l(Context context, boolean z) {
            Point N = C7557q0.m22189N(context);
            return m34446k(N.x, N.y, z);
        }

        @Deprecated
        public C3411e() {
            m34451f();
            this.f35810H = new SparseArray<>();
            this.f35811I = new SparseBooleanArray();
        }

        public C3411e(Context context) {
            super(context);
            m34451f();
            this.f35810H = new SparseArray<>();
            this.f35811I = new SparseBooleanArray();
            m34445l(context, true);
        }

        private C3411e(C3409d dVar) {
            super(dVar);
            this.f5492g = dVar.f5484s;
            this.f5493h = dVar.f5485t;
            this.f5494i = dVar.f5486u;
            this.f5495j = dVar.f5487v;
            this.f5496k = dVar.f5488w;
            this.f5497l = dVar.f5489x;
            this.f5498m = dVar.f5490y;
            this.f5499n = dVar.f5491z;
            this.f5500o = dVar.f35782A;
            this.f5501p = dVar.f35783B;
            this.f5502q = dVar.f35784C;
            this.f5503r = dVar.f35785D;
            this.f5504s = dVar.f35786E;
            this.f5505t = dVar.f35787F;
            this.f5506u = dVar.f35788G;
            this.f5507v = dVar.f35789H;
            this.f5508w = dVar.f35790I;
            this.f5509x = dVar.f35791J;
            this.f5510y = dVar.f35792K;
            this.f5511z = dVar.f35793L;
            this.f35803A = dVar.f35794M;
            this.f35804B = dVar.f35795N;
            this.f35805C = dVar.f35796O;
            this.f35806D = dVar.f35797P;
            this.f35807E = dVar.f35798Q;
            this.f35808F = dVar.f35799R;
            this.f35809G = dVar.f35800S;
            this.f35810H = m34452e(dVar.f35801T);
            this.f35811I = dVar.f35802U.clone();
        }
    }

    /* renamed from: b9.f$f */
    /* loaded from: classes5.dex */
    public static final class C0080f implements Parcelable {
        public static final Parcelable.Creator<C0080f> CREATOR = new a();

        /* renamed from: k */
        public final int f5512k;

        /* renamed from: l */
        public final int[] f5513l;

        /* renamed from: m */
        public final int f5514m;

        /* renamed from: n */
        public final int f5515n;

        /* renamed from: o */
        public final int f5516o;

        /* renamed from: b9.f$f$a */
        /* loaded from: classes5.dex */
        class a implements Parcelable.Creator<C0080f> {
            a() {
            }

            /* renamed from: a */
            public C0080f createFromParcel(Parcel parcel) {
                return new C0080f(parcel);
            }

            /* renamed from: b */
            public C0080f[] newArray(int i) {
                return new C0080f[i];
            }
        }

        public C0080f(int i, int... iArr) {
            this(i, iArr, 2, 0);
        }

        /* renamed from: a */
        public boolean m34444a(int i) {
            for (int i2 : this.f5513l) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0080f.class != obj.getClass()) {
                return false;
            }
            C0080f fVar = (C0080f) obj;
            if (this.f5512k == fVar.f5512k && Arrays.equals(this.f5513l, fVar.f5513l) && this.f5515n == fVar.f5515n && this.f5516o == fVar.f5516o) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f5512k * 31) + Arrays.hashCode(this.f5513l)) * 31) + this.f5515n) * 31) + this.f5516o;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5512k);
            parcel.writeInt(this.f5513l.length);
            parcel.writeIntArray(this.f5513l);
            parcel.writeInt(this.f5515n);
            parcel.writeInt(this.f5516o);
        }

        public C0080f(int i, int[] iArr, int i2, int i3) {
            this.f5512k = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f5513l = copyOf;
            this.f5514m = iArr.length;
            this.f5515n = i2;
            this.f5516o = i3;
            Arrays.sort(copyOf);
        }

        C0080f(Parcel parcel) {
            this.f5512k = parcel.readInt();
            int readByte = parcel.readByte();
            this.f5514m = readByte;
            int[] iArr = new int[readByte];
            this.f5513l = iArr;
            parcel.readIntArray(iArr);
            this.f5515n = parcel.readInt();
            this.f5516o = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b9.f$g */
    /* loaded from: classes5.dex */
    public static final class C3412g implements Comparable<C3412g> {

        /* renamed from: k */
        public final boolean f5517k;

        /* renamed from: l */
        private final boolean f5518l;

        /* renamed from: m */
        private final boolean f5519m;

        /* renamed from: n */
        private final boolean f5520n;

        /* renamed from: o */
        private final int f5521o;

        /* renamed from: p */
        private final int f5522p;

        /* renamed from: q */
        private final int f5523q;

        /* renamed from: r */
        private final int f5524r;

        /* renamed from: s */
        private final boolean f5525s;

        public C3412g(C6722k kVar, C3409d dVar, int i, String str) {
            boolean z;
            boolean z2;
            AbstractC3884i0<String> i0Var;
            int i2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            this.f5518l = C3405f.m34472x(i, false);
            int i3 = kVar.f14321n & (~dVar.f5554p);
            if ((i3 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5519m = z;
            if ((i3 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f5520n = z2;
            if (dVar.f5551m.isEmpty()) {
                i0Var = AbstractC3884i0.m33398y("");
            } else {
                i0Var = dVar.f5551m;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= i0Var.size()) {
                    i4 = ViewDefaults.NUMBER_OF_LINES;
                    i2 = 0;
                    break;
                }
                i2 = C3405f.m34476t(kVar, i0Var.get(i4), dVar.f5553o);
                if (i2 > 0) {
                    break;
                }
                i4++;
            }
            this.f5521o = i4;
            this.f5522p = i2;
            int bitCount = Integer.bitCount(kVar.f14322o & dVar.f5552n);
            this.f5523q = bitCount;
            if ((kVar.f14322o & 1088) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f5525s = z3;
            if (C3405f.m34496D(str) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int t = C3405f.m34476t(kVar, str, z4);
            this.f5524r = t;
            if (i2 > 0 || ((dVar.f5551m.isEmpty() && bitCount > 0) || this.f5519m || (this.f5520n && t > 0))) {
                z5 = true;
            }
            this.f5517k = z5;
        }

        /* renamed from: a */
        public int compareTo(C3412g gVar) {
            AbstractC3937r1 r1Var;
            AbstractC3966x g = AbstractC3966x.m33235j().mo33230g(this.f5518l, gVar.f5518l).mo33231f(Integer.valueOf(this.f5521o), Integer.valueOf(gVar.f5521o), AbstractC3937r1.m33314d().mo33221k()).mo33233d(this.f5522p, gVar.f5522p).mo33233d(this.f5523q, gVar.f5523q).mo33230g(this.f5519m, gVar.f5519m);
            Boolean valueOf = Boolean.valueOf(this.f5520n);
            Boolean valueOf2 = Boolean.valueOf(gVar.f5520n);
            if (this.f5522p == 0) {
                r1Var = AbstractC3937r1.m33314d();
            } else {
                r1Var = AbstractC3937r1.m33314d().mo33221k();
            }
            AbstractC3966x d = g.mo33231f(valueOf, valueOf2, r1Var).mo33233d(this.f5524r, gVar.f5524r);
            if (this.f5523q == 0) {
                d = d.mo33229h(this.f5525s, gVar.f5525s);
            }
            return d.mo33228i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b9.f$h */
    /* loaded from: classes5.dex */
    public static final class C3413h implements Comparable<C3413h> {

        /* renamed from: k */
        public final boolean f5526k;

        /* renamed from: l */
        private final C3409d f5527l;

        /* renamed from: m */
        private final boolean f5528m;

        /* renamed from: n */
        private final boolean f5529n;

        /* renamed from: o */
        private final int f5530o;

        /* renamed from: p */
        private final int f5531p;

        /* renamed from: q */
        private final int f5532q;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
            if (r10 < r8.f5490y) goto L_0x005e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
            if (r10 < r8.f5491z) goto L_0x005e;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C3413h(p079e7.C6722k r7, p029b9.C3405f.C3409d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f5527l = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L_0x0033
                int r4 = r7.f37961A
                if (r4 == r3) goto L_0x0014
                int r5 = r8.f5484s
                if (r4 > r5) goto L_0x0033
            L_0x0014:
                int r4 = r7.f37962B
                if (r4 == r3) goto L_0x001c
                int r5 = r8.f5485t
                if (r4 > r5) goto L_0x0033
            L_0x001c:
                float r4 = r7.f37963C
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L_0x0029
                int r5 = r8.f5486u
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x0033
            L_0x0029:
                int r4 = r7.f14325r
                if (r4 == r3) goto L_0x0031
                int r5 = r8.f5487v
                if (r4 > r5) goto L_0x0033
            L_0x0031:
                r4 = r1
                goto L_0x0034
            L_0x0033:
                r4 = r2
            L_0x0034:
                r6.f5526k = r4
                if (r10 == 0) goto L_0x005e
                int r10 = r7.f37961A
                if (r10 == r3) goto L_0x0040
                int r4 = r8.f5488w
                if (r10 < r4) goto L_0x005e
            L_0x0040:
                int r10 = r7.f37962B
                if (r10 == r3) goto L_0x0048
                int r4 = r8.f5489x
                if (r10 < r4) goto L_0x005e
            L_0x0048:
                float r10 = r7.f37963C
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0055
                int r0 = r8.f5490y
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L_0x005e
            L_0x0055:
                int r10 = r7.f14325r
                if (r10 == r3) goto L_0x005f
                int r0 = r8.f5491z
                if (r10 < r0) goto L_0x005e
                goto L_0x005f
            L_0x005e:
                r1 = r2
            L_0x005f:
                r6.f5528m = r1
                boolean r9 = p029b9.C3405f.m34472x(r9, r2)
                r6.f5529n = r9
                int r9 = r7.f14325r
                r6.f5530o = r9
                int r9 = r7.m24528f()
                r6.f5531p = r9
            L_0x0071:
                cc.i0<java.lang.String> r9 = r8.f35788G
                int r9 = r9.size()
                if (r2 >= r9) goto L_0x008d
                java.lang.String r9 = r7.f14329v
                if (r9 == 0) goto L_0x008a
                cc.i0<java.lang.String> r10 = r8.f35788G
                java.lang.Object r10 = r10.get(r2)
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x008a
                goto L_0x0090
            L_0x008a:
                int r2 = r2 + 1
                goto L_0x0071
            L_0x008d:
                r2 = 2147483647(0x7fffffff, float:NaN)
            L_0x0090:
                r6.f5532q = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p029b9.C3405f.C3413h.<init>(e7.k, b9.f$d, int, boolean):void");
        }

        /* renamed from: a */
        public int compareTo(C3413h hVar) {
            AbstractC3937r1 r1Var;
            AbstractC3937r1 r1Var2;
            if (!this.f5526k || !this.f5529n) {
                r1Var = C3405f.f5464g.mo33221k();
            } else {
                r1Var = C3405f.f5464g;
            }
            AbstractC3966x f = AbstractC3966x.m33235j().mo33230g(this.f5529n, hVar.f5529n).mo33230g(this.f5526k, hVar.f5526k).mo33230g(this.f5528m, hVar.f5528m).mo33231f(Integer.valueOf(this.f5532q), Integer.valueOf(hVar.f5532q), AbstractC3937r1.m33314d().mo33221k());
            Integer valueOf = Integer.valueOf(this.f5530o);
            Integer valueOf2 = Integer.valueOf(hVar.f5530o);
            if (this.f5527l.f35796O) {
                r1Var2 = C3405f.f5464g.mo33221k();
            } else {
                r1Var2 = C3405f.f5465h;
            }
            return f.mo33231f(valueOf, valueOf2, r1Var2).mo33231f(Integer.valueOf(this.f5531p), Integer.valueOf(hVar.f5531p), r1Var).mo33231f(Integer.valueOf(this.f5530o), Integer.valueOf(hVar.f5530o), r1Var).mo33228i();
        }
    }

    @Deprecated
    public C3405f(AbstractC3415h.AbstractC3417b bVar) {
        this(C3409d.f35781V, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ int m34499A(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ int m34498B(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: C */
    private static void m34497C(AbstractC3419j.C3420a aVar, int[][][] iArr, C6734u[] uVarArr, AbstractC3415h[] hVarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < aVar.m34418c(); i3++) {
            int d = aVar.m34417d(i3);
            AbstractC3415h hVar = hVarArr[i3];
            if ((d == 1 || d == 2) && hVar != null && m34495E(iArr[i3], aVar.m34416e(i3), hVar)) {
                if (d == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else if (i != -1) {
                    z = false;
                    break;
                } else {
                    i = i3;
                }
            }
        }
        z = true;
        if (!(i2 == -1 || i == -1)) {
            z2 = true;
        }
        if (z && z2) {
            C6734u uVar = new C6734u(true);
            uVarArr[i2] = uVar;
            uVarArr[i] = uVar;
        }
    }

    /* renamed from: D */
    protected static String m34496D(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: E */
    private static boolean m34495E(int[][] iArr, TrackGroupArray trackGroupArray, AbstractC3415h hVar) {
        if (hVar == null) {
            return false;
        }
        int b = trackGroupArray.m29996b(hVar.mo34411k());
        for (int i = 0; i < hVar.length(); i++) {
            if (C6732s.m24425e(iArr[b][hVar.mo34413d(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    private static AbstractC3415h.C3416a m34494F(TrackGroupArray trackGroupArray, int[][] iArr, int i, C3409d dVar) {
        int i2;
        boolean z;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C3409d dVar2 = dVar;
        if (dVar2.f35784C) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        if (!dVar2.f35783B || (i & i2) == 0) {
            z = false;
        } else {
            z = true;
        }
        int i3 = 0;
        while (i3 < trackGroupArray2.f9362k) {
            C8302u0 a = trackGroupArray2.m29997a(i3);
            int[] s = m34477s(a, iArr[i3], z, i2, dVar2.f5484s, dVar2.f5485t, dVar2.f5486u, dVar2.f5487v, dVar2.f5488w, dVar2.f5489x, dVar2.f5490y, dVar2.f5491z, dVar2.f35785D, dVar2.f35786E, dVar2.f35787F);
            if (s.length > 0) {
                return new AbstractC3415h.C3416a(a, s);
            }
            i3++;
            trackGroupArray2 = trackGroupArray;
            dVar2 = dVar;
        }
        return null;
    }

    /* renamed from: I */
    private static AbstractC3415h.C3416a m34491I(TrackGroupArray trackGroupArray, int[][] iArr, C3409d dVar) {
        int i = -1;
        C8302u0 u0Var = null;
        C3413h hVar = null;
        for (int i2 = 0; i2 < trackGroupArray.f9362k; i2++) {
            C8302u0 a = trackGroupArray.m29997a(i2);
            List<Integer> w = m34473w(a, dVar.f35785D, dVar.f35786E, dVar.f35787F);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a.f18099k; i3++) {
                C6722k a2 = a.m19990a(i3);
                if ((a2.f14322o & Spliterator.SUBSIZED) == 0 && m34472x(iArr2[i3], dVar.f35798Q)) {
                    C3413h hVar2 = new C3413h(a2, dVar, iArr2[i3], w.contains(Integer.valueOf(i3)));
                    if ((hVar2.f5526k || dVar.f35782A) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        u0Var = a;
                        i = i3;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (u0Var == null) {
            return null;
        }
        return new AbstractC3415h.C3416a(u0Var, i);
    }

    /* renamed from: p */
    private static void m34480p(C8302u0 u0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!m34470z(u0Var.m19990a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list.remove(size);
            }
        }
    }

    /* renamed from: q */
    private static int[] m34479q(C8302u0 u0Var, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        C6722k a = u0Var.m19990a(i);
        int[] iArr2 = new int[u0Var.f18099k];
        int i3 = 0;
        for (int i4 = 0; i4 < u0Var.f18099k; i4++) {
            if (i4 == i || m34471y(u0Var.m19990a(i4), iArr[i4], a, i2, z, z2, z3)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return Arrays.copyOf(iArr2, i3);
    }

    /* renamed from: r */
    private static int m34478r(C8302u0 u0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue = list.get(i11).intValue();
            if (m34470z(u0Var.m19990a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: s */
    private static int[] m34477s(C8302u0 u0Var, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        int i12;
        if (u0Var.f18099k < 2) {
            return f5463f;
        }
        List<Integer> w = m34473w(u0Var, i10, i11, z2);
        if (w.size() < 2) {
            return f5463f;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            int i13 = 0;
            String str2 = null;
            for (int i14 = 0; i14 < w.size(); i14 = i12 + 1) {
                String str3 = u0Var.m19990a(w.get(i14).intValue()).f14329v;
                if (hashSet.add(str3)) {
                    i13 = i13;
                    i12 = i14;
                    hashSet = hashSet;
                    int r = m34478r(u0Var, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, w);
                    if (r > i13) {
                        i13 = r;
                        str2 = str3;
                    }
                } else {
                    i13 = i13;
                    i12 = i14;
                    hashSet = hashSet;
                }
            }
            str = str2;
        } else {
            str = null;
        }
        m34480p(u0Var, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, w);
        return w.size() < 2 ? f5463f : C7115d.m23358j(w);
    }

    /* renamed from: t */
    protected static int m34476t(C6722k kVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(kVar.f14320m)) {
            return 4;
        }
        String D = m34496D(str);
        String D2 = m34496D(kVar.f14320m);
        if (D2 == null || D == null) {
            if (!z || D2 != null) {
                return 0;
            }
            return 1;
        } else if (D2.startsWith(D) || D.startsWith(D2)) {
            return 3;
        } else {
            if (C7557q0.m22186O0(D2, "-")[0].equals(C7557q0.m22186O0(D, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point m34475u(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = r3
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = r0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p119g9.C7557q0.m22141l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p119g9.C7557q0.m22141l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p029b9.C3405f.m34475u(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: w */
    private static List<Integer> m34473w(C8302u0 u0Var, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(u0Var.f18099k);
        for (int i4 = 0; i4 < u0Var.f18099k; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < u0Var.f18099k; i6++) {
                C6722k a = u0Var.m19990a(i6);
                int i7 = a.f37961A;
                if (i7 > 0 && (i3 = a.f37962B) > 0) {
                    Point u = m34475u(z, i, i2, i7, i3);
                    int i8 = a.f37961A;
                    int i9 = a.f37962B;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (u.x * 0.98f)) && i9 >= ((int) (u.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int f = u0Var.m19990a(((Integer) arrayList.get(size)).intValue()).m24528f();
                    if (f == -1 || f > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    protected static boolean m34472x(int i, boolean z) {
        int d = C6732s.m24426d(i);
        return d == 4 || (z && d == 3);
    }

    /* renamed from: y */
    private static boolean m34471y(C6722k kVar, int i, C6722k kVar2, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        String str;
        int i5;
        if (!m34472x(i, false) || (i3 = kVar.f14325r) == -1 || i3 > i2) {
            return false;
        }
        if (!z3 && ((i5 = kVar.f37969I) == -1 || i5 != kVar2.f37969I)) {
            return false;
        }
        if (!z && ((str = kVar.f14329v) == null || !TextUtils.equals(str, kVar2.f14329v))) {
            return false;
        }
        if (z2 || ((i4 = kVar.f37970J) != -1 && i4 == kVar2.f37970J)) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private static boolean m34470z(C6722k kVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((kVar.f14322o & Spliterator.SUBSIZED) != 0 || !m34472x(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C7557q0.m22159c(kVar.f14329v, str)) {
            return false;
        }
        int i11 = kVar.f37961A;
        if (i11 != -1 && (i7 > i11 || i11 > i3)) {
            return false;
        }
        int i12 = kVar.f37962B;
        if (i12 != -1 && (i8 > i12 || i12 > i4)) {
            return false;
        }
        float f = kVar.f37963C;
        if (f != -1.0f && (i9 > f || f > i5)) {
            return false;
        }
        int i13 = kVar.f14325r;
        return i13 == -1 || (i10 <= i13 && i13 <= i6);
    }

    /* renamed from: G */
    protected AbstractC3415h.C3416a[] m34493G(AbstractC3419j.C3420a aVar, int[][][] iArr, int[] iArr2, C3409d dVar) {
        int i;
        String str;
        int i2;
        String str2;
        C3407b bVar;
        int i3;
        boolean z;
        int c = aVar.m34418c();
        AbstractC3415h.C3416a[] aVarArr = new AbstractC3415h.C3416a[c];
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        boolean z3 = false;
        while (true) {
            i = true;
            if (i5 >= c) {
                break;
            }
            if (2 == aVar.m34417d(i5)) {
                if (!z2) {
                    AbstractC3415h.C3416a L = m34488L(aVar.m34416e(i5), iArr[i5], iArr2[i5], dVar, true);
                    aVarArr[i5] = L;
                    if (L != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (aVar.m34416e(i5).f9362k <= 0) {
                    i = false;
                }
                z3 |= i;
            }
            i5++;
        }
        int i6 = 0;
        int i7 = -1;
        C3407b bVar2 = null;
        String str3 = null;
        while (i6 < c) {
            if (i == aVar.m34417d(i6)) {
                if (dVar.f35800S || !z3) {
                    z = i;
                } else {
                    z = false;
                }
                i3 = i7;
                bVar = bVar2;
                str2 = str3;
                i2 = i6;
                Pair<AbstractC3415h.C3416a, C3407b> H = m34492H(aVar.m34416e(i6), iArr[i6], iArr2[i6], dVar, z);
                if (H != null && (bVar == null || ((C3407b) H.second).compareTo(bVar) > 0)) {
                    if (i3 != -1) {
                        aVarArr[i3] = null;
                    }
                    AbstractC3415h.C3416a aVar2 = (AbstractC3415h.C3416a) H.first;
                    aVarArr[i2] = aVar2;
                    str3 = aVar2.f5533a.m19990a(aVar2.f5534b[0]).f14320m;
                    bVar2 = (C3407b) H.second;
                    i7 = i2;
                    i6 = i2 + 1;
                    i = true;
                }
            } else {
                i3 = i7;
                bVar = bVar2;
                str2 = str3;
                i2 = i6;
            }
            i7 = i3;
            bVar2 = bVar;
            str3 = str2;
            i6 = i2 + 1;
            i = true;
        }
        String str4 = str3;
        int i8 = -1;
        C3412g gVar = null;
        while (i4 < c) {
            int d = aVar.m34417d(i4);
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        aVarArr[i4] = m34490J(d, aVar.m34416e(i4), iArr[i4], dVar);
                    } else {
                        str = str4;
                        Pair<AbstractC3415h.C3416a, C3412g> K = m34489K(aVar.m34416e(i4), iArr[i4], dVar, str);
                        if (K != null && (gVar == null || ((C3412g) K.second).compareTo(gVar) > 0)) {
                            if (i8 != -1) {
                                aVarArr[i8] = null;
                            }
                            aVarArr[i4] = (AbstractC3415h.C3416a) K.first;
                            gVar = (C3412g) K.second;
                            i8 = i4;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i4++;
            str4 = str;
        }
        return aVarArr;
    }

    /* renamed from: H */
    protected Pair<AbstractC3415h.C3416a, C3407b> m34492H(TrackGroupArray trackGroupArray, int[][] iArr, int i, C3409d dVar, boolean z) {
        AbstractC3415h.C3416a aVar = null;
        int i2 = -1;
        int i3 = -1;
        C3407b bVar = null;
        for (int i4 = 0; i4 < trackGroupArray.f9362k; i4++) {
            C8302u0 a = trackGroupArray.m29997a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a.f18099k; i5++) {
                if (m34472x(iArr2[i5], dVar.f35798Q)) {
                    C3407b bVar2 = new C3407b(a.m19990a(i5), dVar, iArr2[i5]);
                    if ((bVar2.f5468k || dVar.f35791J) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        C8302u0 a2 = trackGroupArray.m29997a(i2);
        if (!dVar.f35797P && !dVar.f35796O && z) {
            int[] q = m34479q(a2, iArr[i2], i3, dVar.f35790I, dVar.f35792K, dVar.f35793L, dVar.f35794M);
            if (q.length > 1) {
                aVar = new AbstractC3415h.C3416a(a2, q);
            }
        }
        if (aVar == null) {
            aVar = new AbstractC3415h.C3416a(a2, i3);
        }
        return Pair.create(aVar, (C3407b) C7510a.m22367e(bVar));
    }

    /* renamed from: J */
    protected AbstractC3415h.C3416a m34490J(int i, TrackGroupArray trackGroupArray, int[][] iArr, C3409d dVar) {
        C8302u0 u0Var = null;
        C3408c cVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.f9362k; i3++) {
            C8302u0 a = trackGroupArray.m29997a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a.f18099k; i4++) {
                if (m34472x(iArr2[i4], dVar.f35798Q)) {
                    C3408c cVar2 = new C3408c(a.m19990a(i4), iArr2[i4]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        u0Var = a;
                        i2 = i4;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (u0Var == null) {
            return null;
        }
        return new AbstractC3415h.C3416a(u0Var, i2);
    }

    /* renamed from: K */
    protected Pair<AbstractC3415h.C3416a, C3412g> m34489K(TrackGroupArray trackGroupArray, int[][] iArr, C3409d dVar, String str) {
        int i = -1;
        C8302u0 u0Var = null;
        C3412g gVar = null;
        for (int i2 = 0; i2 < trackGroupArray.f9362k; i2++) {
            C8302u0 a = trackGroupArray.m29997a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a.f18099k; i3++) {
                if (m34472x(iArr2[i3], dVar.f35798Q)) {
                    C3412g gVar2 = new C3412g(a.m19990a(i3), dVar, iArr2[i3], str);
                    if (gVar2.f5517k && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        u0Var = a;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (u0Var == null) {
            return null;
        }
        return Pair.create(new AbstractC3415h.C3416a(u0Var, i), (C3412g) C7510a.m22367e(gVar));
    }

    /* renamed from: L */
    protected AbstractC3415h.C3416a m34488L(TrackGroupArray trackGroupArray, int[][] iArr, int i, C3409d dVar, boolean z) {
        AbstractC3415h.C3416a aVar;
        if (dVar.f35797P || dVar.f35796O || !z) {
            aVar = null;
        } else {
            aVar = m34494F(trackGroupArray, iArr, i, dVar);
        }
        if (aVar == null) {
            return m34491I(trackGroupArray, iArr, dVar);
        }
        return aVar;
    }

    /* renamed from: M */
    public void m34487M(C3409d dVar) {
        C7510a.m22367e(dVar);
        if (!this.f5467e.getAndSet(dVar).equals(dVar)) {
            m34402c();
        }
    }

    /* renamed from: N */
    public void m34486N(C3411e eVar) {
        m34487M(eVar.mo34407a());
    }

    @Override // p029b9.AbstractC3419j
    /* renamed from: j */
    protected final Pair<C6734u[], AbstractC3415h[]> mo34421j(AbstractC3419j.C3420a aVar, int[][][] iArr, int[] iArr2, AbstractC8299u.C8300a aVar2, Timeline timeline) {
        boolean z;
        C6734u uVar;
        C3409d dVar = this.f5467e.get();
        int c = aVar.m34418c();
        AbstractC3415h.C3416a[] G = m34493G(aVar, iArr, iArr2, dVar);
        int i = 0;
        while (true) {
            AbstractC3415h.C3416a aVar3 = null;
            if (i >= c) {
                break;
            }
            if (dVar.m34460r(i)) {
                G[i] = null;
            } else {
                TrackGroupArray e = aVar.m34416e(i);
                if (dVar.m34458u(i, e)) {
                    C0080f t = dVar.m34459t(i, e);
                    if (t != null) {
                        aVar3 = new AbstractC3415h.C3416a(e.m29997a(t.f5512k), t.f5513l, t.f5515n, Integer.valueOf(t.f5516o));
                    }
                    G[i] = aVar3;
                }
            }
            i++;
        }
        AbstractC3415h[] a = this.f5466d.mo34426a(G, m34404a(), aVar2, timeline);
        C6734u[] uVarArr = new C6734u[c];
        for (int i2 = 0; i2 < c; i2++) {
            if (dVar.m34460r(i2) || (aVar.m34417d(i2) != 7 && a[i2] == null)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                uVar = C6734u.f14365b;
            } else {
                uVar = null;
            }
            uVarArr[i2] = uVar;
        }
        if (dVar.f35799R) {
            m34497C(aVar, iArr, uVarArr, a);
        }
        return Pair.create(uVarArr, a);
    }

    /* renamed from: o */
    public C3411e m34481o() {
        return m34474v().m34462j();
    }

    /* renamed from: v */
    public C3409d m34474v() {
        return this.f5467e.get();
    }

    public C3405f(Context context) {
        this(context, new C3399a.C3400b());
    }

    public C3405f(Context context, AbstractC3415h.AbstractC3417b bVar) {
        this(C3409d.m34461p(context), bVar);
    }

    public C3405f(C3409d dVar, AbstractC3415h.AbstractC3417b bVar) {
        this.f5466d = bVar;
        this.f5467e = new AtomicReference<>(dVar);
    }

    /* renamed from: b9.f$d */
    /* loaded from: classes5.dex */
    public static final class C3409d extends C3422l {

        /* renamed from: A */
        public final boolean f35782A;

        /* renamed from: B */
        public final boolean f35783B;

        /* renamed from: C */
        public final boolean f35784C;

        /* renamed from: D */
        public final int f35785D;

        /* renamed from: E */
        public final int f35786E;

        /* renamed from: F */
        public final boolean f35787F;

        /* renamed from: G */
        public final AbstractC3884i0<String> f35788G;

        /* renamed from: H */
        public final int f35789H;

        /* renamed from: I */
        public final int f35790I;

        /* renamed from: J */
        public final boolean f35791J;

        /* renamed from: K */
        public final boolean f35792K;

        /* renamed from: L */
        public final boolean f35793L;

        /* renamed from: M */
        public final boolean f35794M;

        /* renamed from: N */
        public final AbstractC3884i0<String> f35795N;

        /* renamed from: O */
        public final boolean f35796O;

        /* renamed from: P */
        public final boolean f35797P;

        /* renamed from: Q */
        public final boolean f35798Q;

        /* renamed from: R */
        public final boolean f35799R;

        /* renamed from: S */
        public final boolean f35800S;

        /* renamed from: T */
        private final SparseArray<Map<TrackGroupArray, C0080f>> f35801T;

        /* renamed from: U */
        private final SparseBooleanArray f35802U;

        /* renamed from: s */
        public final int f5484s;

        /* renamed from: t */
        public final int f5485t;

        /* renamed from: u */
        public final int f5486u;

        /* renamed from: v */
        public final int f5487v;

        /* renamed from: w */
        public final int f5488w;

        /* renamed from: x */
        public final int f5489x;

        /* renamed from: y */
        public final int f5490y;

        /* renamed from: z */
        public final int f5491z;

        /* renamed from: V */
        public static final C3409d f35781V = new C3411e().mo34407a();
        public static final Parcelable.Creator<C3409d> CREATOR = new C3410a();

        /* renamed from: b9.f$d$a */
        /* loaded from: classes5.dex */
        class C3410a implements Parcelable.Creator<C3409d> {
            C3410a() {
            }

            /* renamed from: a */
            public C3409d createFromParcel(Parcel parcel) {
                return new C3409d(parcel);
            }

            /* renamed from: b */
            public C3409d[] newArray(int i) {
                return new C3409d[i];
            }
        }

        C3409d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i10, boolean z4, AbstractC3884i0<String> i0Var, AbstractC3884i0<String> i0Var2, int i11, int i12, int i13, boolean z5, boolean z6, boolean z7, boolean z8, AbstractC3884i0<String> i0Var3, AbstractC3884i0<String> i0Var4, int i14, boolean z9, int i15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<TrackGroupArray, C0080f>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(i0Var2, i11, i0Var4, i14, z9, i15);
            this.f5484s = i;
            this.f5485t = i2;
            this.f5486u = i3;
            this.f5487v = i4;
            this.f5488w = i5;
            this.f5489x = i6;
            this.f5490y = i7;
            this.f5491z = i8;
            this.f35782A = z;
            this.f35783B = z2;
            this.f35784C = z3;
            this.f35785D = i9;
            this.f35786E = i10;
            this.f35787F = z4;
            this.f35788G = i0Var;
            this.f35789H = i12;
            this.f35790I = i13;
            this.f35791J = z5;
            this.f35792K = z6;
            this.f35793L = z7;
            this.f35794M = z8;
            this.f35795N = i0Var3;
            this.f35796O = z10;
            this.f35797P = z11;
            this.f35798Q = z12;
            this.f35799R = z13;
            this.f35800S = z14;
            this.f35801T = sparseArray;
            this.f35802U = sparseBooleanArray;
        }

        /* renamed from: e */
        private static boolean m34465e(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        private static boolean m34464f(SparseArray<Map<TrackGroupArray, C0080f>> sparseArray, SparseArray<Map<TrackGroupArray, C0080f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m34463i(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m34463i(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, p029b9.C3405f.C0080f> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, p029b9.C3405f.C0080f> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p119g9.C7557q0.m22159c(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p029b9.C3405f.C3409d.m34463i(java.util.Map, java.util.Map):boolean");
        }

        /* renamed from: p */
        public static C3409d m34461p(Context context) {
            return new C3411e(context).mo34407a();
        }

        /* renamed from: w */
        private static SparseArray<Map<TrackGroupArray, C0080f>> m34457w(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, C0080f>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((TrackGroupArray) C7510a.m22367e((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader())), (C0080f) parcel.readParcelable(C0080f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        /* renamed from: z */
        private static void m34456z(Parcel parcel, SparseArray<Map<TrackGroupArray, C0080f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map<TrackGroupArray, C0080f> valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, C0080f> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // p029b9.C3422l, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p029b9.C3422l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3409d.class != obj.getClass()) {
                return false;
            }
            C3409d dVar = (C3409d) obj;
            if (super.equals(obj) && this.f5484s == dVar.f5484s && this.f5485t == dVar.f5485t && this.f5486u == dVar.f5486u && this.f5487v == dVar.f5487v && this.f5488w == dVar.f5488w && this.f5489x == dVar.f5489x && this.f5490y == dVar.f5490y && this.f5491z == dVar.f5491z && this.f35782A == dVar.f35782A && this.f35783B == dVar.f35783B && this.f35784C == dVar.f35784C && this.f35787F == dVar.f35787F && this.f35785D == dVar.f35785D && this.f35786E == dVar.f35786E && this.f35788G.equals(dVar.f35788G) && this.f35789H == dVar.f35789H && this.f35790I == dVar.f35790I && this.f35791J == dVar.f35791J && this.f35792K == dVar.f35792K && this.f35793L == dVar.f35793L && this.f35794M == dVar.f35794M && this.f35795N.equals(dVar.f35795N) && this.f35796O == dVar.f35796O && this.f35797P == dVar.f35797P && this.f35798Q == dVar.f35798Q && this.f35799R == dVar.f35799R && this.f35800S == dVar.f35800S && m34465e(this.f35802U, dVar.f35802U) && m34464f(this.f35801T, dVar.f35801T)) {
                return true;
            }
            return false;
        }

        @Override // p029b9.C3422l
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f5484s) * 31) + this.f5485t) * 31) + this.f5486u) * 31) + this.f5487v) * 31) + this.f5488w) * 31) + this.f5489x) * 31) + this.f5490y) * 31) + this.f5491z) * 31) + (this.f35782A ? 1 : 0)) * 31) + (this.f35783B ? 1 : 0)) * 31) + (this.f35784C ? 1 : 0)) * 31) + (this.f35787F ? 1 : 0)) * 31) + this.f35785D) * 31) + this.f35786E) * 31) + this.f35788G.hashCode()) * 31) + this.f35789H) * 31) + this.f35790I) * 31) + (this.f35791J ? 1 : 0)) * 31) + (this.f35792K ? 1 : 0)) * 31) + (this.f35793L ? 1 : 0)) * 31) + (this.f35794M ? 1 : 0)) * 31) + this.f35795N.hashCode()) * 31) + (this.f35796O ? 1 : 0)) * 31) + (this.f35797P ? 1 : 0)) * 31) + (this.f35798Q ? 1 : 0)) * 31) + (this.f35799R ? 1 : 0)) * 31) + (this.f35800S ? 1 : 0);
        }

        /* renamed from: j */
        public C3411e m34462j() {
            return new C3411e(this);
        }

        /* renamed from: r */
        public final boolean m34460r(int i) {
            return this.f35802U.get(i);
        }

        /* renamed from: t */
        public final C0080f m34459t(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, C0080f> map = this.f35801T.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        /* renamed from: u */
        public final boolean m34458u(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, C0080f> map = this.f35801T.get(i);
            if (map == null || !map.containsKey(trackGroupArray)) {
                return false;
            }
            return true;
        }

        @Override // p029b9.C3422l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5484s);
            parcel.writeInt(this.f5485t);
            parcel.writeInt(this.f5486u);
            parcel.writeInt(this.f5487v);
            parcel.writeInt(this.f5488w);
            parcel.writeInt(this.f5489x);
            parcel.writeInt(this.f5490y);
            parcel.writeInt(this.f5491z);
            C7557q0.m22164Z0(parcel, this.f35782A);
            C7557q0.m22164Z0(parcel, this.f35783B);
            C7557q0.m22164Z0(parcel, this.f35784C);
            parcel.writeInt(this.f35785D);
            parcel.writeInt(this.f35786E);
            C7557q0.m22164Z0(parcel, this.f35787F);
            parcel.writeList(this.f35788G);
            parcel.writeInt(this.f35789H);
            parcel.writeInt(this.f35790I);
            C7557q0.m22164Z0(parcel, this.f35791J);
            C7557q0.m22164Z0(parcel, this.f35792K);
            C7557q0.m22164Z0(parcel, this.f35793L);
            C7557q0.m22164Z0(parcel, this.f35794M);
            parcel.writeList(this.f35795N);
            C7557q0.m22164Z0(parcel, this.f35796O);
            C7557q0.m22164Z0(parcel, this.f35797P);
            C7557q0.m22164Z0(parcel, this.f35798Q);
            C7557q0.m22164Z0(parcel, this.f35799R);
            C7557q0.m22164Z0(parcel, this.f35800S);
            m34456z(parcel, this.f35801T);
            parcel.writeSparseBooleanArray(this.f35802U);
        }

        C3409d(Parcel parcel) {
            super(parcel);
            this.f5484s = parcel.readInt();
            this.f5485t = parcel.readInt();
            this.f5486u = parcel.readInt();
            this.f5487v = parcel.readInt();
            this.f5488w = parcel.readInt();
            this.f5489x = parcel.readInt();
            this.f5490y = parcel.readInt();
            this.f5491z = parcel.readInt();
            this.f35782A = C7557q0.m22202G0(parcel);
            this.f35783B = C7557q0.m22202G0(parcel);
            this.f35784C = C7557q0.m22202G0(parcel);
            this.f35785D = parcel.readInt();
            this.f35786E = parcel.readInt();
            this.f35787F = C7557q0.m22202G0(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.f35788G = AbstractC3884i0.m33401u(arrayList);
            this.f35789H = parcel.readInt();
            this.f35790I = parcel.readInt();
            this.f35791J = C7557q0.m22202G0(parcel);
            this.f35792K = C7557q0.m22202G0(parcel);
            this.f35793L = C7557q0.m22202G0(parcel);
            this.f35794M = C7557q0.m22202G0(parcel);
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.f35795N = AbstractC3884i0.m33401u(arrayList2);
            this.f35796O = C7557q0.m22202G0(parcel);
            this.f35797P = C7557q0.m22202G0(parcel);
            this.f35798Q = C7557q0.m22202G0(parcel);
            this.f35799R = C7557q0.m22202G0(parcel);
            this.f35800S = C7557q0.m22202G0(parcel);
            this.f35801T = m34457w(parcel);
            this.f35802U = (SparseBooleanArray) C7557q0.m22145j(parcel.readSparseBooleanArray());
        }
    }
}
