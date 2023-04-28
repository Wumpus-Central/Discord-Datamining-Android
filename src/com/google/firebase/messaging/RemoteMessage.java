package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C5816c;
import java.util.Map;
import p441y9.AbstractC14320a;

/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractC14320a {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C5844m0();

    /* renamed from: k */
    Bundle f11522k;

    /* renamed from: l */
    private Map<String, String> f11523l;

    public RemoteMessage(Bundle bundle) {
        this.f11522k = bundle;
    }

    /* renamed from: p */
    public Map<String, String> m27245p() {
        if (this.f11523l == null) {
            this.f11523l = C5816c.C5817a.m27212a(this.f11522k);
        }
        return this.f11523l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5844m0.m27097c(this, parcel, i);
    }
}
