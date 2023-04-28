package la;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: la.g */
/* loaded from: classes3.dex */
final class BinderC10380g extends BinderC10378e {

    /* renamed from: a */
    final /* synthetic */ C10381h f22772a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10380g(C10381h hVar) {
        this.f22772a = hVar;
    }

    @Override // la.BinderC10378e, la.AbstractC10391r
    /* renamed from: A */
    public final void mo13526A(Status status, Credential credential) {
        this.f22772a.setResult(new C10379f(status, credential));
    }

    @Override // la.AbstractC10391r
    /* renamed from: d */
    public final void mo13525d(Status status) {
        this.f22772a.setResult(new C10379f(status, null));
    }
}
