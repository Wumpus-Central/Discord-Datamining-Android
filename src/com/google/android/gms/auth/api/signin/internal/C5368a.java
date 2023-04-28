package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import p290q1.C11962b;
import p318r9.C12473g;
import p318r9.C12490x;
import p384v9.AbstractC13470f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* loaded from: classes5.dex */
public final class C5368a implements LoaderManager.AbstractC3059a {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f10096a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5368a(SignInHubActivity signInHubActivity, C12490x xVar) {
        this.f10096a = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.AbstractC3059a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo29121a(C11962b bVar, Object obj) {
        int i;
        Intent intent;
        Void r3 = (Void) obj;
        SignInHubActivity signInHubActivity = this.f10096a;
        i = signInHubActivity.f10094n;
        intent = signInHubActivity.f10095o;
        signInHubActivity.setResult(i, intent);
        this.f10096a.finish();
    }

    @Override // androidx.loader.app.LoaderManager.AbstractC3059a
    /* renamed from: b */
    public final void mo29120b(C11962b bVar) {
    }

    @Override // androidx.loader.app.LoaderManager.AbstractC3059a
    /* renamed from: c */
    public final C11962b mo29119c(int i, Bundle bundle) {
        return new C12473g(this.f10096a, AbstractC13470f.m3614c());
    }
}
