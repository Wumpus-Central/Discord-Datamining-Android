package p318r9;

import com.google.android.gms.common.api.Status;
import p384v9.AbstractC13470f;
import p384v9.AbstractC13478k;
import p384v9.C13456a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r9.m */
/* loaded from: classes5.dex */
public final class C12479m extends AbstractC12480n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12479m(AbstractC13470f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5374b
    /* renamed from: c */
    protected final /* bridge */ /* synthetic */ void mo6637c(C13456a.AbstractC13457b bVar) {
        C12475i iVar = (C12475i) bVar;
        ((C12487u) iVar.m2189C()).m6625e(new BinderC12478l(this), iVar.m6638k0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ AbstractC13478k createFailedResult(Status status) {
        return status;
    }
}
