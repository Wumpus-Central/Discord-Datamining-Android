package com.google.android.gms.common.api.internal;

import p365u9.C13217c;
import p400w9.C13813b;
import p400w9.C13838p;
import p420x9.C13996n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: classes5.dex */
public final class C5412u {

    /* renamed from: a */
    private final C13813b<?> f10215a;

    /* renamed from: b */
    private final C13217c f10216b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5412u(C13813b bVar, C13217c cVar, C13838p pVar) {
        this.f10215a = bVar;
        this.f10216b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5412u)) {
            C5412u uVar = (C5412u) obj;
            if (C13996n.m2071b(this.f10215a, uVar.f10215a) && C13996n.m2071b(this.f10216b, uVar.f10216b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13996n.m2070c(this.f10215a, this.f10216b);
    }

    public final String toString() {
        return C13996n.m2069d(this).m2068a("key", this.f10215a).m2068a("feature", this.f10216b).toString();
    }
}
