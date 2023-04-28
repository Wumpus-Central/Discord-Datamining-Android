package p461z9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import na.C10770d;
import p365u9.C13217c;
import p400w9.AbstractC13817d;
import p400w9.AbstractC13825h;
import p420x9.AbstractC13974g;
import p420x9.C13964d;
import p420x9.C14022w;

/* renamed from: z9.e */
/* loaded from: classes5.dex */
public final class C14592e extends AbstractC13974g<C14588a> {

    /* renamed from: S */
    private final C14022w f39518S;

    public C14592e(Context context, Looper looper, C13964d dVar, C14022w wVar, AbstractC13817d dVar2, AbstractC13825h hVar) {
        super(context, looper, 270, dVar, dVar2, hVar);
        this.f39518S = wVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: D */
    public final String mo146D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: E */
    protected final String mo145E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: H */
    protected final boolean mo144H() {
        return true;
    }

    @Override // p420x9.AbstractC13957c, p384v9.C13456a.AbstractC13463f
    /* renamed from: n */
    public final int mo143n() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo142r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C14588a) {
            return (C14588a) queryLocalInterface;
        }
        return new C14588a(iBinder);
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: u */
    public final C13217c[] mo141u() {
        return C10770d.f23923b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p420x9.AbstractC13957c
    /* renamed from: z */
    public final Bundle mo140z() {
        return this.f39518S.m2017b();
    }
}
