package p080e8;

import p079e7.C6722k;
import p459z7.C14576a;
import p459z7.C14578b;

/* renamed from: e8.i */
/* loaded from: classes7.dex */
public abstract class AbstractC6753i implements C14576a.AbstractC14577b {

    /* renamed from: k */
    public final String f14402k;

    public AbstractC6753i(String str) {
        this.f14402k = str;
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

    @Override // p459z7.C14576a.AbstractC14577b
    /* renamed from: g */
    public /* synthetic */ C6722k mo179g() {
        return C14578b.m177b(this);
    }

    public String toString() {
        return this.f14402k;
    }
}
