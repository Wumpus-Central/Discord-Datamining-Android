package io.sentry.android.core;

import android.content.Context;
import io.sentry.AbstractC8869g0;
import io.sentry.android.core.internal.util.C8743b;
import io.sentry.transport.AbstractC9081q;

/* renamed from: io.sentry.android.core.w */
/* loaded from: classes8.dex */
final class C8791w implements AbstractC9081q {

    /* renamed from: a */
    private final Context f19431a;

    /* renamed from: b */
    private final AbstractC8869g0 f19432b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.w$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C8792a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19433a;

        static {
            int[] iArr = new int[C8743b.EnumC8744a.values().length];
            f19433a = iArr;
            try {
                iArr[C8743b.EnumC8744a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19433a[C8743b.EnumC8744a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19433a[C8743b.EnumC8744a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8791w(Context context, AbstractC8869g0 g0Var) {
        this.f19431a = context;
        this.f19432b = g0Var;
    }

    @Override // io.sentry.transport.AbstractC9081q
    /* renamed from: a */
    public boolean mo17109a() {
        return m18066b(C8743b.m18223b(this.f19431a, this.f19432b));
    }

    /* renamed from: b */
    boolean m18066b(C8743b.EnumC8744a aVar) {
        int i = C8792a.f19433a[aVar.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
