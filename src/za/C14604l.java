package za;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.C5440d0;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import p441y9.C14321b;

/* renamed from: za.l */
/* loaded from: classes3.dex */
public final class C14604l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ClientAppContext clientAppContext = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            switch (C14321b.m873k(p)) {
                case 1:
                    i = C14321b.m866r(parcel, p);
                    break;
                case 2:
                    iBinder = C14321b.m867q(parcel, p);
                    break;
                case 3:
                    iBinder2 = C14321b.m867q(parcel, p);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C14321b.m880d(parcel, p, PendingIntent.CREATOR);
                    break;
                case 5:
                    i2 = C14321b.m866r(parcel, p);
                    break;
                case 6:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 7:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 8:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 9:
                    clientAppContext = (ClientAppContext) C14321b.m880d(parcel, p, ClientAppContext.CREATOR);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new C5440d0(i, iBinder, iBinder2, pendingIntent, i2, str, str2, z, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C5440d0[i];
    }
}
