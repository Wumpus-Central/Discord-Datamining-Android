package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import p155ia.EnumC8320b;
import p420x9.C13996n;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ia.j */
/* loaded from: classes5.dex */
public class C8344j extends AbstractC14320a {
    public static final Parcelable.Creator<C8344j> CREATOR = new C8363q0();

    /* renamed from: k */
    private final EnumC8320b f18173k;

    /* renamed from: l */
    private final Boolean f18174l;

    /* renamed from: m */
    private final EnumC8338g0 f18175m;

    /* renamed from: ia.j$a */
    /* loaded from: classes5.dex */
    public static class C8345a {

        /* renamed from: a */
        private EnumC8320b f18176a;

        /* renamed from: a */
        public C8344j m19939a() {
            String str;
            EnumC8320b bVar = this.f18176a;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.toString();
            }
            return new C8344j(str, null, null);
        }

        /* renamed from: b */
        public C8345a m19938b(EnumC8320b bVar) {
            this.f18176a = bVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8344j(String str, Boolean bool, String str2) {
        if (str == null) {
            this.f18173k = null;
        } else {
            try {
                this.f18173k = EnumC8320b.m19963a(str);
            } catch (EnumC8320b.C8321a e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f18174l = bool;
        if (str2 == null) {
            this.f18175m = null;
            return;
        }
        try {
            this.f18175m = EnumC8338g0.m19946a(str2);
        } catch (C8341h0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8344j)) {
            return false;
        }
        C8344j jVar = (C8344j) obj;
        if (!C13996n.m2071b(this.f18173k, jVar.f18173k) || !C13996n.m2071b(this.f18174l, jVar.f18174l) || !C13996n.m2071b(this.f18175m, jVar.f18175m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f18173k, this.f18174l, this.f18175m);
    }

    /* renamed from: p */
    public String m19941p() {
        EnumC8320b bVar = this.f18173k;
        if (bVar == null) {
            return null;
        }
        return bVar.toString();
    }

    /* renamed from: r */
    public Boolean m19940r() {
        return this.f18174l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 2, m19941p(), false);
        C14323c.m854d(parcel, 3, m19940r(), false);
        EnumC8338g0 g0Var = this.f18175m;
        if (g0Var == null) {
            str = null;
        } else {
            str = g0Var.toString();
        }
        C14323c.m842p(parcel, 4, str, false);
        C14323c.m856b(parcel, a);
    }
}
