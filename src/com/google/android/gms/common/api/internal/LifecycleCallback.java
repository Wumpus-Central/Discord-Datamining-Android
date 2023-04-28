package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p400w9.AbstractC13821f;
import p400w9.C13819e;
import p400w9.C13834l0;
import p400w9.FragmentC13830j0;
import p420x9.C14004p;

/* loaded from: classes5.dex */
public class LifecycleCallback {

    /* renamed from: k */
    protected final AbstractC13821f f10113k;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(AbstractC13821f fVar) {
        this.f10113k = fVar;
    }

    /* renamed from: c */
    public static AbstractC13821f m29104c(Activity activity) {
        return m29103d(new C13819e(activity));
    }

    /* renamed from: d */
    protected static AbstractC13821f m29103d(C13819e eVar) {
        if (eVar.m2584d()) {
            return C13834l0.m2550f(eVar.m2586b());
        }
        if (eVar.m2585c()) {
            return FragmentC13830j0.m2557f(eVar.m2587a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static AbstractC13821f getChimeraLifecycleFragmentImpl(C13819e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m29106a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m29105b() {
        Activity c = this.f10113k.mo2553c();
        C14004p.m2051j(c);
        return c;
    }

    /* renamed from: e */
    public void mo29001e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo29000f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m29102g() {
    }

    /* renamed from: h */
    public void mo29007h() {
    }

    /* renamed from: i */
    public void mo28999i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo28998j() {
    }

    /* renamed from: k */
    public void mo28997k() {
    }
}
