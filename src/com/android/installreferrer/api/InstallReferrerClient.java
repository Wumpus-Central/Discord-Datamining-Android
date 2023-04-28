package com.android.installreferrer.api;

import android.content.Context;
import p413x2.AbstractC13923a;
import p413x2.C13924b;

/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    /* loaded from: classes.dex */
    public static final class C4138b {

        /* renamed from: a */
        private final Context f6929a;

        private C4138b(Context context) {
            this.f6929a = context;
        }

        /* renamed from: a */
        public InstallReferrerClient m32668a() {
            Context context = this.f6929a;
            if (context != null) {
                return new C4139a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    /* renamed from: c */
    public static C4138b m32669c(Context context) {
        return new C4138b(context);
    }

    /* renamed from: a */
    public abstract void mo32667a();

    /* renamed from: b */
    public abstract C13924b mo32666b();

    /* renamed from: d */
    public abstract void mo32665d(AbstractC13923a aVar);
}
