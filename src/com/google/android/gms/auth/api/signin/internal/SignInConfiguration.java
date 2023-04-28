package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p318r9.C12468b;
import p318r9.C12489w;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes5.dex */
public final class SignInConfiguration extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C12489w();

    /* renamed from: k */
    private final String f10088k;

    /* renamed from: l */
    private GoogleSignInOptions f10089l;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f10088k = C14004p.m2055f(str);
        this.f10089l = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f10088k.equals(signInConfiguration.f10088k)) {
            GoogleSignInOptions googleSignInOptions = this.f10089l;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f10089l;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C12468b().m6653a(this.f10088k).m6653a(this.f10089l).m6652b();
    }

    /* renamed from: p */
    public final GoogleSignInOptions m29127p() {
        return this.f10089l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 2, this.f10088k, false);
        C14323c.m844n(parcel, 5, this.f10089l, i, false);
        C14323c.m856b(parcel, a);
    }
}
