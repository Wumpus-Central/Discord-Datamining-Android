package p118g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p119g9.C7544l0;
import p119g9.C7570y;

/* renamed from: g8.d */
/* loaded from: classes7.dex */
public final class C7499d extends AbstractC7497b {
    public static final Parcelable.Creator<C7499d> CREATOR = new C7500a();

    /* renamed from: k */
    public final long f16254k;

    /* renamed from: l */
    public final boolean f16255l;

    /* renamed from: m */
    public final boolean f16256m;

    /* renamed from: n */
    public final boolean f16257n;

    /* renamed from: o */
    public final boolean f16258o;

    /* renamed from: p */
    public final long f16259p;

    /* renamed from: q */
    public final long f16260q;

    /* renamed from: r */
    public final List<C7501b> f16261r;

    /* renamed from: s */
    public final boolean f16262s;

    /* renamed from: t */
    public final long f16263t;

    /* renamed from: u */
    public final int f16264u;

    /* renamed from: v */
    public final int f16265v;

    /* renamed from: w */
    public final int f16266w;

    /* renamed from: g8.d$a */
    /* loaded from: classes7.dex */
    class C7500a implements Parcelable.Creator<C7499d> {
        C7500a() {
        }

        /* renamed from: a */
        public C7499d createFromParcel(Parcel parcel) {
            return new C7499d(parcel, null);
        }

        /* renamed from: b */
        public C7499d[] newArray(int i) {
            return new C7499d[i];
        }
    }

    /* renamed from: g8.d$b */
    /* loaded from: classes7.dex */
    public static final class C7501b {

        /* renamed from: a */
        public final int f16267a;

        /* renamed from: b */
        public final long f16268b;

        /* renamed from: c */
        public final long f16269c;

        /* synthetic */ C7501b(int i, long j, long j2, C7500a aVar) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C7501b m22392a(Parcel parcel) {
            return new C7501b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m22391b(Parcel parcel) {
            parcel.writeInt(this.f16267a);
            parcel.writeLong(this.f16268b);
            parcel.writeLong(this.f16269c);
        }

        private C7501b(int i, long j, long j2) {
            this.f16267a = i;
            this.f16268b = j;
            this.f16269c = j2;
        }
    }

    /* synthetic */ C7499d(Parcel parcel, C7500a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7499d m22395a(C7570y yVar, long j, C7544l0 l0Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z3;
        List list;
        long j3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j4;
        long j5;
        boolean z10;
        boolean z11;
        long j6;
        long F = yVar.m22027F();
        if ((yVar.m22029D() & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        List emptyList = Collections.emptyList();
        if (!z) {
            int D = yVar.m22029D();
            if ((D & 128) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((D & 64) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((D & 32) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((D & 16) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z7 || z9) {
                j4 = -9223372036854775807L;
            } else {
                j4 = C7508g.m22374b(yVar, j);
            }
            if (!z7) {
                int D2 = yVar.m22029D();
                ArrayList arrayList = new ArrayList(D2);
                for (int i4 = 0; i4 < D2; i4++) {
                    int D3 = yVar.m22029D();
                    if (!z9) {
                        j6 = C7508g.m22374b(yVar, j);
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    arrayList.add(new C7501b(D3, j6, l0Var.m22264b(j6), null));
                }
                emptyList = arrayList;
            }
            if (z8) {
                long D4 = yVar.m22029D();
                if ((128 & D4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5 = ((((D4 & 1) << 32) | yVar.m22027F()) * 1000) / 90;
                z10 = z11;
            } else {
                z10 = false;
                j5 = -9223372036854775807L;
            }
            i3 = yVar.m22023J();
            z2 = z7;
            i2 = yVar.m22029D();
            i = yVar.m22029D();
            list = emptyList;
            z3 = z10;
            j2 = j5;
            z4 = z9;
            z5 = z6;
            j3 = j4;
        } else {
            list = emptyList;
            z5 = false;
            z4 = false;
            j3 = -9223372036854775807L;
            z3 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z2 = false;
        }
        return new C7499d(F, z, z5, z2, z4, j3, l0Var.m22264b(j3), list, z3, j2, i3, i2, i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16254k);
        parcel.writeByte(this.f16255l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16256m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16257n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16258o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f16259p);
        parcel.writeLong(this.f16260q);
        int size = this.f16261r.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f16261r.get(i2).m22391b(parcel);
        }
        parcel.writeByte(this.f16262s ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f16263t);
        parcel.writeInt(this.f16264u);
        parcel.writeInt(this.f16265v);
        parcel.writeInt(this.f16266w);
    }

    private C7499d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C7501b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f16254k = j;
        this.f16255l = z;
        this.f16256m = z2;
        this.f16257n = z3;
        this.f16258o = z4;
        this.f16259p = j2;
        this.f16260q = j3;
        this.f16261r = Collections.unmodifiableList(list);
        this.f16262s = z5;
        this.f16263t = j4;
        this.f16264u = i;
        this.f16265v = i2;
        this.f16266w = i3;
    }

    private C7499d(Parcel parcel) {
        this.f16254k = parcel.readLong();
        boolean z = false;
        this.f16255l = parcel.readByte() == 1;
        this.f16256m = parcel.readByte() == 1;
        this.f16257n = parcel.readByte() == 1;
        this.f16258o = parcel.readByte() == 1;
        this.f16259p = parcel.readLong();
        this.f16260q = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C7501b.m22392a(parcel));
        }
        this.f16261r = Collections.unmodifiableList(arrayList);
        this.f16262s = parcel.readByte() == 1 ? true : z;
        this.f16263t = parcel.readLong();
        this.f16264u = parcel.readInt();
        this.f16265v = parcel.readInt();
        this.f16266w = parcel.readInt();
    }
}
