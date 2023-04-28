package p420x9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p365u9.C13217c;
import p441y9.C14321b;

/* renamed from: x9.f1 */
/* loaded from: classes5.dex */
public final class C13973f1 implements Parcelable.Creator<C13970e1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13970e1 createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        Bundle bundle = null;
        C13968e eVar = null;
        int i = 0;
        C13217c[] cVarArr = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            int k = C14321b.m873k(p);
            if (k == 1) {
                bundle = C14321b.m883a(parcel, p);
            } else if (k == 2) {
                cVarArr = (C13217c[]) C14321b.m876h(parcel, p, C13217c.CREATOR);
            } else if (k == 3) {
                i = C14321b.m866r(parcel, p);
            } else if (k != 4) {
                C14321b.m861w(parcel, p);
            } else {
                eVar = (C13968e) C14321b.m880d(parcel, p, C13968e.CREATOR);
            }
        }
        C14321b.m874j(parcel, x);
        return new C13970e1(bundle, cVarArr, i, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13970e1[] newArray(int i) {
        return new C13970e1[i];
    }
}
