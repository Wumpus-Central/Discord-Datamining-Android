package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p441y9.C14321b;
import p441y9.C14323c;

/* renamed from: com.google.firebase.messaging.m0 */
/* loaded from: classes3.dex */
public class C5844m0 implements Parcelable.Creator<RemoteMessage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m27097c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m853e(parcel, 2, remoteMessage.f11522k, false);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int x = C14321b.m860x(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < x) {
            int p = C14321b.m868p(parcel);
            if (C14321b.m873k(p) != 2) {
                C14321b.m861w(parcel, p);
            } else {
                bundle = C14321b.m883a(parcel, p);
            }
        }
        C14321b.m874j(parcel, x);
        return new RemoteMessage(bundle);
    }

    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
