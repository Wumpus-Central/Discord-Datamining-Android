package p420x9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: x9.t */
/* loaded from: classes5.dex */
public class C14016t extends AbstractC14320a {
    public static final Parcelable.Creator<C14016t> CREATOR = new C14025x();

    /* renamed from: k */
    private final int f31601k;

    /* renamed from: l */
    private List<C13993m> f31602l;

    public C14016t(int i, List<C13993m> list) {
        this.f31601k = i;
        this.f31602l = list;
    }

    /* renamed from: p */
    public final int m2027p() {
        return this.f31601k;
    }

    /* renamed from: r */
    public final List<C13993m> m2026r() {
        return this.f31602l;
    }

    /* renamed from: t */
    public final void m2025t(C13993m mVar) {
        if (this.f31602l == null) {
            this.f31602l = new ArrayList();
        }
        this.f31602l.add(mVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f31601k);
        C14323c.m838t(parcel, 2, this.f31602l, false);
        C14323c.m856b(parcel, a);
    }
}
