package io.sentry;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.x3 */
/* loaded from: classes8.dex */
public final class C9150x3<T> {

    /* renamed from: a */
    private final List<T> f20087a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9150x3(List<T> list) {
        this.f20087a = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    /* renamed from: a */
    public List<T> m16788a() {
        return this.f20087a;
    }
}
