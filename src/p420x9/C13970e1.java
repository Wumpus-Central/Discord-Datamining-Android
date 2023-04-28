package p420x9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p365u9.C13217c;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: x9.e1 */
/* loaded from: classes5.dex */
public final class C13970e1 extends AbstractC14320a {
    public static final Parcelable.Creator<C13970e1> CREATOR = new C13973f1();

    /* renamed from: k */
    Bundle f31506k;

    /* renamed from: l */
    C13217c[] f31507l;

    /* renamed from: m */
    int f31508m;

    /* renamed from: n */
    C13968e f31509n;

    public C13970e1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13970e1(Bundle bundle, C13217c[] cVarArr, int i, C13968e eVar) {
        this.f31506k = bundle;
        this.f31507l = cVarArr;
        this.f31508m = i;
        this.f31509n = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m853e(parcel, 1, this.f31506k, false);
        C14323c.m839s(parcel, 2, this.f31507l, i, false);
        C14323c.m848j(parcel, 3, this.f31508m);
        C14323c.m844n(parcel, 4, this.f31509n, i, false);
        C14323c.m856b(parcel, a);
    }
}
