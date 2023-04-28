package p442ya;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ya.a */
/* loaded from: classes3.dex */
public class C14326a extends AbstractC14320a {
    public static final Parcelable.Creator<C14326a> CREATOR = new C14338k();

    /* renamed from: q */
    public static final C14326a f32434q;

    /* renamed from: k */
    final int f32435k;

    /* renamed from: l */
    private final List f32436l;

    /* renamed from: m */
    private final List f32437m;

    /* renamed from: n */
    private final boolean f32438n;

    /* renamed from: o */
    private final List f32439o;

    /* renamed from: p */
    private final int f32440p;

    /* renamed from: ya.a$a */
    /* loaded from: classes3.dex */
    public static final class C0463a {

        /* renamed from: d */
        private boolean f32444d;

        /* renamed from: a */
        private final Set f32441a = new HashSet();

        /* renamed from: b */
        private final List f32442b = new ArrayList();

        /* renamed from: c */
        private final Set f32443c = new HashSet();

        /* renamed from: e */
        private int f32445e = 0;

        /* renamed from: a */
        public C14326a m832a() {
            boolean z = true;
            if (!this.f32444d && this.f32441a.isEmpty()) {
                z = false;
            }
            C14004p.m2048m(z, "At least one of the include methods must be called.");
            return new C14326a(2, new ArrayList(this.f32441a), this.f32442b, this.f32444d, new ArrayList(this.f32443c), this.f32445e);
        }

        /* renamed from: b */
        public C0463a m831b() {
            this.f32444d = true;
            return this;
        }
    }

    static {
        C0463a aVar = new C0463a();
        aVar.m831b();
        f32434q = aVar.m832a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14326a(int i, List list, List list2, boolean z, List list3, int i2) {
        this.f32435k = i;
        this.f32436l = Collections.unmodifiableList((List) C14004p.m2051j(list));
        this.f32438n = z;
        this.f32437m = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.f32439o = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.f32440p = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14326a)) {
            return false;
        }
        C14326a aVar = (C14326a) obj;
        if (this.f32438n != aVar.f32438n || !C13996n.m2071b(this.f32436l, aVar.f32436l) || !C13996n.m2071b(this.f32437m, aVar.f32437m) || !C13996n.m2071b(this.f32439o, aVar.f32439o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f32436l, this.f32437m, Boolean.valueOf(this.f32438n), this.f32439o);
    }

    public String toString() {
        boolean z = this.f32438n;
        String valueOf = String.valueOf(this.f32436l);
        return "MessageFilter{includeAllMyTypes=" + z + ", messageTypes=" + valueOf + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m838t(parcel, 1, this.f32436l, false);
        C14323c.m838t(parcel, 2, this.f32437m, false);
        C14323c.m855c(parcel, 3, this.f32438n);
        C14323c.m838t(parcel, 4, this.f32439o, false);
        C14323c.m848j(parcel, 5, this.f32440p);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f32435k);
        C14323c.m856b(parcel, a);
    }
}
