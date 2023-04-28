package p350t9;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t9.h */
/* loaded from: classes5.dex */
public final class C13023h implements Parcelable {
    public static final Parcelable.Creator<C13023h> CREATOR = new C13021f();

    /* renamed from: k */
    Messenger f29308k;

    public C13023h(IBinder iBinder) {
        this.f29308k = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder m4725a() {
        Messenger messenger = this.f29308k;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void m4724b(Message message) {
        Messenger messenger = this.f29308k;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m4725a().equals(((C13023h) obj).m4725a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m4725a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f29308k;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
