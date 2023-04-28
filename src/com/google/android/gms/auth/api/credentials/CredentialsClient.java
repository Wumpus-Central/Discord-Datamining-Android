package com.google.android.gms.auth.api.credentials;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import p230m9.C10561a;
import p245n9.C10760a;
import p384v9.AbstractC13468e;
import p400w9.C13811a;
import p420x9.C14000o;

@Deprecated
/* loaded from: classes5.dex */
public class CredentialsClient extends AbstractC13468e<C10561a.C0338a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialsClient(Context context, C10561a.C0338a aVar) {
        super(context, C10561a.f23393b, aVar, new C13811a());
    }

    @Deprecated
    /* renamed from: C */
    public Task<Void> m29187C(Credential credential) {
        return C14000o.m2065c(C10561a.f23396e.mo12366b(m3636h(), credential));
    }

    @Deprecated
    /* renamed from: D */
    public Task<C10760a> m29186D(C5355a aVar) {
        return C14000o.m2067a(C10561a.f23396e.mo12365c(m3636h(), aVar), new C10760a());
    }

    @Deprecated
    /* renamed from: E */
    public Task<Void> m29185E(Credential credential) {
        return C14000o.m2065c(C10561a.f23396e.mo12367a(m3636h(), credential));
    }
}
