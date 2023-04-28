package p019b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p019b.AbstractC3332a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: b.b */
/* loaded from: classes.dex */
public class C3333b implements Parcelable {
    public static final Parcelable.Creator<C3333b> CREATOR = new C3334a();

    /* renamed from: k */
    final boolean f5352k = false;

    /* renamed from: l */
    final Handler f5353l = null;

    /* renamed from: m */
    AbstractC3332a f5354m;

    /* renamed from: b.b$a */
    /* loaded from: classes.dex */
    class C3334a implements Parcelable.Creator<C3333b> {
        C3334a() {
        }

        /* renamed from: a */
        public C3333b createFromParcel(Parcel parcel) {
            return new C3333b(parcel);
        }

        /* renamed from: b */
        public C3333b[] newArray(int i) {
            return new C3333b[i];
        }
    }

    /* renamed from: b.b$b */
    /* loaded from: classes.dex */
    class BinderC0074b extends AbstractC3332a.AbstractBinderC0072a {
        BinderC0074b() {
        }

        @Override // p019b.AbstractC3332a
        /* renamed from: F */
        public void mo34623F(int i, Bundle bundle) {
            C3333b bVar = C3333b.this;
            Handler handler = bVar.f5353l;
            if (handler != null) {
                handler.post(new RunnableC3335c(i, bundle));
            } else {
                bVar.mo34626a(i, bundle);
            }
        }
    }

    /* renamed from: b.b$c */
    /* loaded from: classes.dex */
    class RunnableC3335c implements Runnable {

        /* renamed from: k */
        final int f5356k;

        /* renamed from: l */
        final Bundle f5357l;

        RunnableC3335c(int i, Bundle bundle) {
            this.f5356k = i;
            this.f5357l = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3333b.this.mo34626a(this.f5356k, this.f5357l);
        }
    }

    C3333b(Parcel parcel) {
        this.f5354m = AbstractC3332a.AbstractBinderC0072a.m34627b(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo34626a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f5354m == null) {
                this.f5354m = new BinderC0074b();
            }
            parcel.writeStrongBinder(this.f5354m.asBinder());
        }
    }
}
