package la;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.C5355a;
import com.google.android.gms.common.api.Status;
import p384v9.AbstractC13470f;
import p384v9.AbstractC13478k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: la.h */
/* loaded from: classes3.dex */
public final class C10381h extends AbstractC10386m {

    /* renamed from: c */
    final /* synthetic */ C5355a f22773c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10381h(C10385l lVar, AbstractC13470f fVar, C5355a aVar) {
        super(fVar);
        this.f22773c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ AbstractC13478k createFailedResult(Status status) {
        return new C10379f(status, null);
    }

    @Override // la.AbstractC10386m
    /* renamed from: g */
    protected final void mo13527g(Context context, C10392s sVar) {
        sVar.m13522e0(new BinderC10380g(this), this.f22773c);
    }
}
