package p099f8;

import android.os.Parcel;
import android.os.Parcelable;
import cc.AbstractC3966x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p030bc.C3456h;
import p079e7.C6722k;
import p099f8.C7082c;
import p119g9.C7510a;
import p119g9.C7557q0;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: f8.c */
/* loaded from: classes7.dex */
public final class C7082c implements C14576a.AbstractC14577b {
    public static final Parcelable.Creator<C7082c> CREATOR = new C7083a();

    /* renamed from: k */
    public final List<C7084b> f15463k;

    /* renamed from: f8.c$a */
    /* loaded from: classes7.dex */
    class C7083a implements Parcelable.Creator<C7082c> {
        C7083a() {
        }

        /* renamed from: a */
        public C7082c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C7084b.class.getClassLoader());
            return new C7082c(arrayList);
        }

        /* renamed from: b */
        public C7082c[] newArray(int i) {
            return new C7082c[i];
        }
    }

    /* renamed from: f8.c$b */
    /* loaded from: classes7.dex */
    public static final class C7084b implements Parcelable {

        /* renamed from: k */
        public final long f15465k;

        /* renamed from: l */
        public final long f15466l;

        /* renamed from: m */
        public final int f15467m;

        /* renamed from: n */
        public static final Comparator<C7084b> f15464n = new Comparator() { // from class: f8.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b;
                b = C7082c.C7084b.m23439b((C7082c.C7084b) obj, (C7082c.C7084b) obj2);
                return b;
            }
        };
        public static final Parcelable.Creator<C7084b> CREATOR = new C7085a();

        /* renamed from: f8.c$b$a */
        /* loaded from: classes7.dex */
        class C7085a implements Parcelable.Creator<C7084b> {
            C7085a() {
            }

            /* renamed from: a */
            public C7084b createFromParcel(Parcel parcel) {
                return new C7084b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public C7084b[] newArray(int i) {
                return new C7084b[i];
            }
        }

        public C7084b(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22371a(z);
            this.f15465k = j;
            this.f15466l = j2;
            this.f15467m = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ int m23439b(C7084b bVar, C7084b bVar2) {
            return AbstractC3966x.m33235j().mo33232e(bVar.f15465k, bVar2.f15465k).mo33232e(bVar.f15466l, bVar2.f15466l).mo33233d(bVar.f15467m, bVar2.f15467m).mo33228i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7084b.class != obj.getClass()) {
                return false;
            }
            C7084b bVar = (C7084b) obj;
            if (this.f15465k == bVar.f15465k && this.f15466l == bVar.f15466l && this.f15467m == bVar.f15467m) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C3456h.m34361b(Long.valueOf(this.f15465k), Long.valueOf(this.f15466l), Integer.valueOf(this.f15467m));
        }

        public String toString() {
            return C7557q0.m22209D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f15465k), Long.valueOf(this.f15466l), Integer.valueOf(this.f15467m));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f15465k);
            parcel.writeLong(this.f15466l);
            parcel.writeInt(this.f15467m);
        }
    }

    public C7082c(List<C7084b> list) {
        this.f15463k = list;
        C7510a.m22371a(!m23443a(list));
    }

    /* renamed from: a */
    private static boolean m23443a(List<C7084b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f15466l;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f15465k < j) {
                return true;
            }
            j = list.get(i).f15466l;
        }
        return false;
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: Q */
    public /* synthetic */ byte[] mo180Q() {
        return C14578b.m178a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7082c.class != obj.getClass()) {
            return false;
        }
        return this.f15463k.equals(((C7082c) obj).f15463k);
    }

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: g */
    public /* synthetic */ C6722k mo179g() {
        return C14578b.m177b(this);
    }

    public int hashCode() {
        return this.f15463k.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f15463k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f15463k);
    }
}
