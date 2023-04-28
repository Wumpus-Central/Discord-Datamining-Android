package p384v9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p384v9.AbstractC13478k;

/* renamed from: v9.p */
/* loaded from: classes5.dex */
final class C13483p<R extends AbstractC13478k> extends BasePendingResult<R> {

    /* renamed from: a */
    private final R f30086a;

    public C13483p(AbstractC13470f fVar, R r) {
        super(fVar);
        this.f30086a = r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.f30086a;
    }
}
