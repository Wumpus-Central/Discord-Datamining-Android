package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p420x9.C13996n;
import p420x9.C14004p;

/* renamed from: ia.k */
/* loaded from: classes5.dex */
public class C8347k implements Parcelable {
    public static final Parcelable.Creator<C8347k> CREATOR = new C8365r0();

    /* renamed from: k */
    private AbstractC8317a f18177k;

    /* renamed from: ia.k$a */
    /* loaded from: classes5.dex */
    public static class C8348a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C8348a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 51
                r0.<init>(r1)
                java.lang.String r1 = "Algorithm with COSE value "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " not supported"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p155ia.C8347k.C8348a.<init>(int):void");
        }
    }

    private C8347k(AbstractC8317a aVar) {
        this.f18177k = (AbstractC8317a) C14004p.m2051j(aVar);
    }

    /* renamed from: a */
    public static C8347k m19937a(int i) {
        EnumC8376w wVar;
        EnumC8350l[] values;
        if (i == EnumC8376w.LEGACY_RS1.mo19892a()) {
            wVar = EnumC8376w.RS1;
        } else {
            EnumC8376w[] values2 = EnumC8376w.values();
            int length = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    EnumC8376w wVar2 = values2[i2];
                    if (wVar2.mo19892a() == i) {
                        wVar = wVar2;
                        break;
                    }
                    i2++;
                } else {
                    for (EnumC8350l lVar : EnumC8350l.values()) {
                        if (lVar.mo19892a() == i) {
                            wVar = lVar;
                        }
                    }
                    throw new C8348a(i);
                }
            }
        }
        return new C8347k(wVar);
    }

    /* renamed from: b */
    public int m19936b() {
        return this.f18177k.mo19892a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C8347k) && this.f18177k.mo19892a() == ((C8347k) obj).f18177k.mo19892a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18177k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18177k.mo19892a());
    }
}
