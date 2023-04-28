package za;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import p441y9.C14321b;
import p442ya.C14326a;
import p442ya.C14335i;

/* renamed from: za.k */
/* loaded from: classes3.dex */
public final class C14603k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        IBinder iBinder = null;
        C14335i iVar = null;
        IBinder iBinder2 = null;
        C14326a aVar = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
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
                    iVar = (C14335i) C14321b.m880d(parcel, p, C14335i.CREATOR);
                    break;
                case 4:
                    iBinder2 = C14321b.m867q(parcel, p);
                    break;
                case 5:
                    aVar = (C14326a) C14321b.m880d(parcel, p, C14326a.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) C14321b.m880d(parcel, p, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = C14321b.m866r(parcel, p);
                    break;
                case 8:
                    str = C14321b.m879e(parcel, p);
                    break;
                case 9:
                    str2 = C14321b.m879e(parcel, p);
                    break;
                case 10:
                    bArr = C14321b.m882b(parcel, p);
                    break;
                case 11:
                    z = C14321b.m872l(parcel, p);
                    break;
                case 12:
                    iBinder3 = C14321b.m867q(parcel, p);
                    break;
                case 13:
                    z2 = C14321b.m872l(parcel, p);
                    break;
                case 14:
                    clientAppContext = (ClientAppContext) C14321b.m880d(parcel, p, ClientAppContext.CREATOR);
                    break;
                case 15:
                    z3 = C14321b.m872l(parcel, p);
                    break;
                case 16:
                    i3 = C14321b.m866r(parcel, p);
                    break;
                case 17:
                    i4 = C14321b.m866r(parcel, p);
                    break;
                default:
                    C14321b.m861w(parcel, p);
                    break;
            }
        }
        C14321b.m874j(parcel, x);
        return new SubscribeRequest(i, iBinder, iVar, iBinder2, aVar, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SubscribeRequest[i];
    }
}
