package la;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p245n9.AbstractC10761b;

/* renamed from: la.f */
/* loaded from: classes3.dex */
public final class C10379f implements AbstractC10761b {

    /* renamed from: k */
    private final Status f22770k;

    /* renamed from: l */
    private final Credential f22771l;

    public C10379f(Status status, Credential credential) {
        this.f22770k = status;
        this.f22771l = credential;
    }

    @Override // p384v9.AbstractC13478k
    /* renamed from: b */
    public final Status mo3607b() {
        return this.f22770k;
    }

    @Override // p245n9.AbstractC10761b
    /* renamed from: i */
    public final Credential mo12368i() {
        return this.f22771l;
    }
}
