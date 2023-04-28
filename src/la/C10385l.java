package la;

import com.google.android.gms.auth.api.credentials.C5355a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p245n9.AbstractC10761b;
import p245n9.AbstractC10762c;
import p384v9.AbstractC13470f;
import p384v9.AbstractC13473g;
import p420x9.C14004p;

/* renamed from: la.l */
/* loaded from: classes3.dex */
public final class C10385l implements AbstractC10762c {
    @Override // p245n9.AbstractC10762c
    /* renamed from: a */
    public final AbstractC13473g<Status> mo12367a(AbstractC13470f fVar, Credential credential) {
        C14004p.m2050k(fVar, "client must not be null");
        C14004p.m2050k(credential, "credential must not be null");
        return fVar.mo2546b(new C10382i(this, fVar, credential));
    }

    @Override // p245n9.AbstractC10762c
    /* renamed from: b */
    public final AbstractC13473g<Status> mo12366b(AbstractC13470f fVar, Credential credential) {
        C14004p.m2050k(fVar, "client must not be null");
        C14004p.m2050k(credential, "credential must not be null");
        return fVar.mo2546b(new C10383j(this, fVar, credential));
    }

    @Override // p245n9.AbstractC10762c
    /* renamed from: c */
    public final AbstractC13473g<AbstractC10761b> mo12365c(AbstractC13470f fVar, C5355a aVar) {
        C14004p.m2050k(fVar, "client must not be null");
        C14004p.m2050k(aVar, "request must not be null");
        return fVar.mo2547a(new C10381h(this, fVar, aVar));
    }
}
