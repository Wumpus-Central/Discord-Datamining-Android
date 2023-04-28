package la;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p384v9.AbstractC13470f;
import p384v9.AbstractC13478k;

/* renamed from: la.j */
/* loaded from: classes3.dex */
final class C10383j extends AbstractC10386m {

    /* renamed from: c */
    final /* synthetic */ Credential f22775c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10383j(C10385l lVar, AbstractC13470f fVar, Credential credential) {
        super(fVar);
        this.f22775c = credential;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ AbstractC13478k createFailedResult(Status status) {
        return status;
    }

    @Override // la.AbstractC10386m
    /* renamed from: g */
    protected final void mo13527g(Context context, C10392s sVar) {
        sVar.m13523e(new BinderC10384k(this), new C10388o(this.f22775c));
    }
}
