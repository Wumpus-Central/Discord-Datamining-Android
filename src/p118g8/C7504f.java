package p118g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p119g9.C7570y;

/* renamed from: g8.f */
/* loaded from: classes7.dex */
public final class C7504f extends AbstractC7497b {
    public static final Parcelable.Creator<C7504f> CREATOR = new C7505a();

    /* renamed from: k */
    public final List<C7507c> f16270k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.f$a */
    /* loaded from: classes7.dex */
    public class C7505a implements Parcelable.Creator<C7504f> {
        C7505a() {
        }

        /* renamed from: a */
        public C7504f createFromParcel(Parcel parcel) {
            return new C7504f(parcel, null);
        }

        /* renamed from: b */
        public C7504f[] newArray(int i) {
            return new C7504f[i];
        }
    }

    /* renamed from: g8.f$b */
    /* loaded from: classes7.dex */
    public static final class C7506b {

        /* renamed from: a */
        public final int f16271a;

        /* renamed from: b */
        public final long f16272b;

        /* synthetic */ C7506b(int i, long j, C7505a aVar) {
            this(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static C7506b m22383c(Parcel parcel) {
            return new C7506b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m22382d(Parcel parcel) {
            parcel.writeInt(this.f16271a);
            parcel.writeLong(this.f16272b);
        }

        private C7506b(int i, long j) {
            this.f16271a = i;
            this.f16272b = j;
        }
    }

    /* synthetic */ C7504f(Parcel parcel, C7505a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7504f m22388a(C7570y yVar) {
        int D = yVar.m22029D();
        ArrayList arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            arrayList.add(C7507c.m22377e(yVar));
        }
        return new C7504f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f16270k.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f16270k.get(i2).m22376f(parcel);
        }
    }

    private C7504f(List<C7507c> list) {
        this.f16270k = Collections.unmodifiableList(list);
    }

    private C7504f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C7507c.m22378d(parcel));
        }
        this.f16270k = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g8.f$c */
    /* loaded from: classes7.dex */
    public static final class C7507c {

        /* renamed from: a */
        public final long f16273a;

        /* renamed from: b */
        public final boolean f16274b;

        /* renamed from: c */
        public final boolean f16275c;

        /* renamed from: d */
        public final boolean f16276d;

        /* renamed from: e */
        public final long f16277e;

        /* renamed from: f */
        public final List<C7506b> f16278f;

        /* renamed from: g */
        public final boolean f16279g;

        /* renamed from: h */
        public final long f16280h;

        /* renamed from: i */
        public final int f16281i;

        /* renamed from: j */
        public final int f16282j;

        /* renamed from: k */
        public final int f16283k;

        private C7507c(long j, boolean z, boolean z2, boolean z3, List<C7506b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f16273a = j;
            this.f16274b = z;
            this.f16275c = z2;
            this.f16276d = z3;
            this.f16278f = Collections.unmodifiableList(list);
            this.f16277e = j2;
            this.f16279g = z4;
            this.f16280h = j3;
            this.f16281i = i;
            this.f16282j = i2;
            this.f16283k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static C7507c m22378d(Parcel parcel) {
            return new C7507c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static C7507c m22377e(C7570y yVar) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            int i3;
            long j;
            boolean z3;
            long j2;
            ArrayList arrayList;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            long j3;
            long j4;
            boolean z8;
            boolean z9;
            long F = yVar.m22027F();
            if ((yVar.m22029D() & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z) {
                int D = yVar.m22029D();
                if ((D & 128) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((D & 64) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((D & 32) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6) {
                    j3 = yVar.m22027F();
                } else {
                    j3 = -9223372036854775807L;
                }
                if (!z6) {
                    int D2 = yVar.m22029D();
                    ArrayList arrayList3 = new ArrayList(D2);
                    for (int i4 = 0; i4 < D2; i4++) {
                        arrayList3.add(new C7506b(yVar.m22029D(), yVar.m22027F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z7) {
                    long D3 = yVar.m22029D();
                    if ((128 & D3) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j4 = ((((D3 & 1) << 32) | yVar.m22027F()) * 1000) / 90;
                    z8 = z9;
                } else {
                    z8 = false;
                    j4 = -9223372036854775807L;
                }
                int J = yVar.m22023J();
                int D4 = yVar.m22029D();
                z2 = z6;
                i = yVar.m22029D();
                j = j4;
                arrayList = arrayList2;
                i3 = J;
                i2 = D4;
                j2 = j3;
                z3 = z8;
                z4 = z5;
            } else {
                arrayList = arrayList2;
                z4 = false;
                j2 = -9223372036854775807L;
                z3 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z2 = false;
            }
            return new C7507c(F, z, z4, z2, arrayList, j2, z3, j, i3, i2, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m22376f(Parcel parcel) {
            parcel.writeLong(this.f16273a);
            parcel.writeByte(this.f16274b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16275c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16276d ? (byte) 1 : (byte) 0);
            int size = this.f16278f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f16278f.get(i).m22382d(parcel);
            }
            parcel.writeLong(this.f16277e);
            parcel.writeByte(this.f16279g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f16280h);
            parcel.writeInt(this.f16281i);
            parcel.writeInt(this.f16282j);
            parcel.writeInt(this.f16283k);
        }

        private C7507c(Parcel parcel) {
            this.f16273a = parcel.readLong();
            boolean z = false;
            this.f16274b = parcel.readByte() == 1;
            this.f16275c = parcel.readByte() == 1;
            this.f16276d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C7506b.m22383c(parcel));
            }
            this.f16278f = Collections.unmodifiableList(arrayList);
            this.f16277e = parcel.readLong();
            this.f16279g = parcel.readByte() == 1 ? true : z;
            this.f16280h = parcel.readLong();
            this.f16281i = parcel.readInt();
            this.f16282j = parcel.readInt();
            this.f16283k = parcel.readInt();
        }
    }
}
