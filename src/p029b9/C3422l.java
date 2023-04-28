package p029b9;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import cc.AbstractC3884i0;
import java.util.ArrayList;
import java.util.Locale;
import p119g9.C7557q0;

/* renamed from: b9.l */
/* loaded from: classes5.dex */
public class C3422l implements Parcelable {
    public static final Parcelable.Creator<C3422l> CREATOR = new C3423a();

    /* renamed from: q */
    public static final C3422l f5547q;
    @Deprecated

    /* renamed from: r */
    public static final C3422l f5548r;

    /* renamed from: k */
    public final AbstractC3884i0<String> f5549k;

    /* renamed from: l */
    public final int f5550l;

    /* renamed from: m */
    public final AbstractC3884i0<String> f5551m;

    /* renamed from: n */
    public final int f5552n;

    /* renamed from: o */
    public final boolean f5553o;

    /* renamed from: p */
    public final int f5554p;

    /* renamed from: b9.l$a */
    /* loaded from: classes5.dex */
    class C3423a implements Parcelable.Creator<C3422l> {
        C3423a() {
        }

        /* renamed from: a */
        public C3422l createFromParcel(Parcel parcel) {
            return new C3422l(parcel);
        }

        /* renamed from: b */
        public C3422l[] newArray(int i) {
            return new C3422l[i];
        }
    }

    static {
        C3422l a = new C3424b().mo34407a();
        f5547q = a;
        f5548r = a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3422l(AbstractC3884i0<String> i0Var, int i, AbstractC3884i0<String> i0Var2, int i2, boolean z, int i3) {
        this.f5549k = i0Var;
        this.f5550l = i;
        this.f5551m = i0Var2;
        this.f5552n = i2;
        this.f5553o = z;
        this.f5554p = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3422l lVar = (C3422l) obj;
        if (this.f5549k.equals(lVar.f5549k) && this.f5550l == lVar.f5550l && this.f5551m.equals(lVar.f5551m) && this.f5552n == lVar.f5552n && this.f5553o == lVar.f5553o && this.f5554p == lVar.f5554p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f5549k.hashCode() + 31) * 31) + this.f5550l) * 31) + this.f5551m.hashCode()) * 31) + this.f5552n) * 31) + (this.f5553o ? 1 : 0)) * 31) + this.f5554p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f5549k);
        parcel.writeInt(this.f5550l);
        parcel.writeList(this.f5551m);
        parcel.writeInt(this.f5552n);
        C7557q0.m22164Z0(parcel, this.f5553o);
        parcel.writeInt(this.f5554p);
    }

    /* renamed from: b9.l$b */
    /* loaded from: classes5.dex */
    public static class C3424b {

        /* renamed from: a */
        AbstractC3884i0<String> f5555a;

        /* renamed from: b */
        int f5556b;

        /* renamed from: c */
        AbstractC3884i0<String> f5557c;

        /* renamed from: d */
        int f5558d;

        /* renamed from: e */
        boolean f5559e;

        /* renamed from: f */
        int f5560f;

        public C3424b(Context context) {
            this();
            mo34406b(context);
        }

        /* renamed from: c */
        private void m34405c(Context context) {
            CaptioningManager captioningManager;
            if ((C7557q0.f16368a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f5558d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f5557c = AbstractC3884i0.m33398y(C7557q0.m22175U(locale));
                }
            }
        }

        /* renamed from: a */
        public C3422l mo34407a() {
            return new C3422l(this.f5555a, this.f5556b, this.f5557c, this.f5558d, this.f5559e, this.f5560f);
        }

        /* renamed from: b */
        public C3424b mo34406b(Context context) {
            if (C7557q0.f16368a >= 19) {
                m34405c(context);
            }
            return this;
        }

        @Deprecated
        public C3424b() {
            this.f5555a = AbstractC3884i0.m33399x();
            this.f5556b = 0;
            this.f5557c = AbstractC3884i0.m33399x();
            this.f5558d = 0;
            this.f5559e = false;
            this.f5560f = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3424b(C3422l lVar) {
            this.f5555a = lVar.f5549k;
            this.f5556b = lVar.f5550l;
            this.f5557c = lVar.f5551m;
            this.f5558d = lVar.f5552n;
            this.f5559e = lVar.f5553o;
            this.f5560f = lVar.f5554p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3422l(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f5549k = AbstractC3884i0.m33401u(arrayList);
        this.f5550l = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f5551m = AbstractC3884i0.m33401u(arrayList2);
        this.f5552n = parcel.readInt();
        this.f5553o = C7557q0.m22202G0(parcel);
        this.f5554p = parcel.readInt();
    }
}
