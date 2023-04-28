package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

@Deprecated
/* renamed from: com.google.android.gms.auth.api.credentials.a */
/* loaded from: classes5.dex */
public final class C5355a extends AbstractC14320a {
    public static final Parcelable.Creator<C5355a> CREATOR = new C5359e();

    /* renamed from: k */
    final int f10028k;

    /* renamed from: l */
    private final boolean f10029l;

    /* renamed from: m */
    private final String[] f10030m;

    /* renamed from: n */
    private final CredentialPickerConfig f10031n;

    /* renamed from: o */
    private final CredentialPickerConfig f10032o;

    /* renamed from: p */
    private final boolean f10033p;

    /* renamed from: q */
    private final String f10034q;

    /* renamed from: r */
    private final String f10035r;

    /* renamed from: s */
    private final boolean f10036s;

    /* renamed from: com.google.android.gms.auth.api.credentials.a$a */
    /* loaded from: classes5.dex */
    public static final class C0149a {

        /* renamed from: a */
        private boolean f10037a;

        /* renamed from: b */
        private String[] f10038b;

        /* renamed from: c */
        private CredentialPickerConfig f10039c;

        /* renamed from: d */
        private CredentialPickerConfig f10040d;

        /* renamed from: e */
        private boolean f10041e = false;

        /* renamed from: f */
        private String f10042f = null;

        /* renamed from: g */
        private String f10043g;

        /* renamed from: a */
        public C5355a m29175a() {
            if (this.f10038b == null) {
                this.f10038b = new String[0];
            }
            if (this.f10037a || this.f10038b.length != 0) {
                return new C5355a(4, this.f10037a, this.f10038b, this.f10039c, this.f10040d, this.f10041e, this.f10042f, this.f10043g, false);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: b */
        public C0149a m29174b(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f10038b = strArr;
            return this;
        }

        /* renamed from: c */
        public C0149a m29173c(boolean z) {
            this.f10037a = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5355a(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f10028k = i;
        this.f10029l = z;
        this.f10030m = (String[]) C14004p.m2051j(strArr);
        this.f10031n = credentialPickerConfig == null ? new CredentialPickerConfig.C5354a().m29188a() : credentialPickerConfig;
        this.f10032o = credentialPickerConfig2 == null ? new CredentialPickerConfig.C5354a().m29188a() : credentialPickerConfig2;
        if (i < 3) {
            this.f10033p = true;
            this.f10034q = null;
            this.f10035r = null;
        } else {
            this.f10033p = z2;
            this.f10034q = str;
            this.f10035r = str2;
        }
        this.f10036s = z3;
    }

    /* renamed from: B */
    public boolean m29182B() {
        return this.f10033p;
    }

    /* renamed from: C */
    public boolean m29181C() {
        return this.f10029l;
    }

    /* renamed from: p */
    public String[] m29180p() {
        return this.f10030m;
    }

    /* renamed from: r */
    public CredentialPickerConfig m29179r() {
        return this.f10032o;
    }

    /* renamed from: t */
    public CredentialPickerConfig m29178t() {
        return this.f10031n;
    }

    /* renamed from: u */
    public String m29177u() {
        return this.f10035r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m855c(parcel, 1, m29181C());
        C14323c.m841q(parcel, 2, m29180p(), false);
        C14323c.m844n(parcel, 3, m29178t(), i, false);
        C14323c.m844n(parcel, 4, m29179r(), i, false);
        C14323c.m855c(parcel, 5, m29182B());
        C14323c.m842p(parcel, 6, m29176z(), false);
        C14323c.m842p(parcel, 7, m29177u(), false);
        C14323c.m855c(parcel, 8, this.f10036s);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f10028k);
        C14323c.m856b(parcel, a);
    }

    /* renamed from: z */
    public String m29176z() {
        return this.f10034q;
    }
}
