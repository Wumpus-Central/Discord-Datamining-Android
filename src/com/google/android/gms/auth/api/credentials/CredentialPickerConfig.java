package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

@Deprecated
/* loaded from: classes5.dex */
public final class CredentialPickerConfig extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C5358d();

    /* renamed from: k */
    final int f10019k;

    /* renamed from: l */
    private final boolean f10020l;

    /* renamed from: m */
    private final boolean f10021m;

    /* renamed from: n */
    private final int f10022n;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* loaded from: classes5.dex */
    public static class C5354a {

        /* renamed from: a */
        private boolean f10023a = false;

        /* renamed from: b */
        private boolean f10024b = true;

        /* renamed from: c */
        private int f10025c = 1;

        /* renamed from: a */
        public CredentialPickerConfig m29188a() {
            return new CredentialPickerConfig(2, this.f10023a, this.f10024b, false, this.f10025c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f10019k = i;
        this.f10020l = z;
        this.f10021m = z2;
        if (i < 2) {
            this.f10022n = true == z3 ? 3 : 1;
        } else {
            this.f10022n = i2;
        }
    }

    @Deprecated
    /* renamed from: p */
    public boolean m29191p() {
        return this.f10022n == 3;
    }

    /* renamed from: r */
    public boolean m29190r() {
        return this.f10020l;
    }

    /* renamed from: t */
    public boolean m29189t() {
        return this.f10021m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m855c(parcel, 1, m29190r());
        C14323c.m855c(parcel, 2, m29189t());
        C14323c.m855c(parcel, 3, m29191p());
        C14323c.m848j(parcel, 4, this.f10022n);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f10019k);
        C14323c.m856b(parcel, a);
    }
}
