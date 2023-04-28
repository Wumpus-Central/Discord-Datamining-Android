package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C2095b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import p319ra.C12541u0;
import p319ra.C12543v0;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import za.C14593a;
import za.C14605m;

/* loaded from: classes3.dex */
public class Update extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new C5442e0();

    /* renamed from: k */
    final int f10293k;

    /* renamed from: l */
    final int f10294l;

    /* renamed from: m */
    public final Message f10295m;

    /* renamed from: n */
    public final C14605m f10296n;

    /* renamed from: o */
    public final C14593a f10297o;

    /* renamed from: p */
    public final C12543v0 f10298p;

    /* renamed from: q */
    public final byte[] f10299q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Update(int i, int i2, Message message, C14605m mVar, C14593a aVar, C12543v0 v0Var, byte[] bArr) {
        this.f10293k = i;
        boolean r = m28926r(i2, 2);
        bArr = true == r ? null : bArr;
        v0Var = true == r ? null : v0Var;
        aVar = true == r ? null : aVar;
        mVar = true == r ? null : mVar;
        this.f10294l = true == r ? 2 : i2;
        this.f10295m = message;
        this.f10296n = mVar;
        this.f10297o = aVar;
        this.f10298p = v0Var;
        this.f10299q = bArr;
    }

    /* renamed from: r */
    public static boolean m28926r(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        if (this.f10294l != update.f10294l || !C13996n.m2071b(this.f10295m, update.f10295m) || !C13996n.m2071b(this.f10296n, update.f10296n) || !C13996n.m2071b(this.f10297o, update.f10297o) || !C13996n.m2071b(this.f10298p, update.f10298p) || !Arrays.equals(this.f10299q, update.f10299q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C13996n.m2070c(Integer.valueOf(this.f10294l), this.f10295m, this.f10296n, this.f10297o, this.f10298p, this.f10299q);
    }

    /* renamed from: p */
    public final boolean m28927p(int i) {
        return m28926r(this.f10294l, i);
    }

    public final String toString() {
        C2095b bVar = new C2095b();
        if (m28926r(this.f10294l, 1)) {
            bVar.add("FOUND");
        }
        if (m28926r(this.f10294l, 2)) {
            bVar.add("LOST");
        }
        if (m28926r(this.f10294l, 4)) {
            bVar.add("DISTANCE");
        }
        if (m28926r(this.f10294l, 8)) {
            bVar.add("BLE_SIGNAL");
        }
        if (m28926r(this.f10294l, 16)) {
            bVar.add("DEVICE");
        }
        if (m28926r(this.f10294l, 32)) {
            bVar.add("BLE_RECORD");
        }
        String obj = bVar.toString();
        String valueOf = String.valueOf(this.f10295m);
        String valueOf2 = String.valueOf(this.f10296n);
        String valueOf3 = String.valueOf(this.f10297o);
        String valueOf4 = String.valueOf(this.f10298p);
        String valueOf5 = String.valueOf(C12541u0.m6576a(this.f10299q));
        return "Update{types=" + obj + ", message=" + valueOf + ", distance=" + valueOf2 + ", bleSignal=" + valueOf3 + ", device=" + valueOf4 + ", bleRecord=" + valueOf5 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f10293k);
        C14323c.m848j(parcel, 2, this.f10294l);
        C14323c.m844n(parcel, 3, this.f10295m, i, false);
        C14323c.m844n(parcel, 4, this.f10296n, i, false);
        C14323c.m844n(parcel, 5, this.f10297o, i, false);
        C14323c.m844n(parcel, 6, this.f10298p, i, false);
        C14323c.m852f(parcel, 7, this.f10299q, false);
        C14323c.m856b(parcel, a);
    }
}
