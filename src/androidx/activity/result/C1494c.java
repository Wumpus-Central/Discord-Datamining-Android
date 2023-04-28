package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.c */
/* loaded from: classes.dex */
public final class C1494c implements Parcelable {
    public static final Parcelable.Creator<C1494c> CREATOR = new C1495a();

    /* renamed from: k */
    private final IntentSender f649k;

    /* renamed from: l */
    private final Intent f650l;

    /* renamed from: m */
    private final int f651m;

    /* renamed from: n */
    private final int f652n;

    /* renamed from: androidx.activity.result.c$a */
    /* loaded from: classes.dex */
    class C1495a implements Parcelable.Creator<C1494c> {
        C1495a() {
        }

        /* renamed from: a */
        public C1494c createFromParcel(Parcel parcel) {
            return new C1494c(parcel);
        }

        /* renamed from: b */
        public C1494c[] newArray(int i) {
            return new C1494c[i];
        }
    }

    /* renamed from: androidx.activity.result.c$b */
    /* loaded from: classes.dex */
    public static final class C1496b {

        /* renamed from: a */
        private IntentSender f653a;

        /* renamed from: b */
        private Intent f654b;

        /* renamed from: c */
        private int f655c;

        /* renamed from: d */
        private int f656d;

        public C1496b(IntentSender intentSender) {
            this.f653a = intentSender;
        }

        /* renamed from: a */
        public C1494c m40968a() {
            return new C1494c(this.f653a, this.f654b, this.f655c, this.f656d);
        }

        /* renamed from: b */
        public C1496b m40967b(Intent intent) {
            this.f654b = intent;
            return this;
        }

        /* renamed from: c */
        public C1496b m40966c(int i, int i2) {
            this.f656d = i;
            this.f655c = i2;
            return this;
        }
    }

    C1494c(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f649k = intentSender;
        this.f650l = intent;
        this.f651m = i;
        this.f652n = i2;
    }

    /* renamed from: a */
    public Intent m40974a() {
        return this.f650l;
    }

    /* renamed from: b */
    public int m40973b() {
        return this.f651m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m40972e() {
        return this.f652n;
    }

    /* renamed from: f */
    public IntentSender m40971f() {
        return this.f649k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f649k, i);
        parcel.writeParcelable(this.f650l, i);
        parcel.writeInt(this.f651m);
        parcel.writeInt(this.f652n);
    }

    C1494c(Parcel parcel) {
        this.f649k = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f650l = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f651m = parcel.readInt();
        this.f652n = parcel.readInt();
    }
}
