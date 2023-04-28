package ch;

import fi.EnumC7319r1;
import java.util.Set;
import kotlin.collections.C9920v;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11319f1;

/* renamed from: ch.b */
/* loaded from: classes8.dex */
public final class C4006b {
    /* renamed from: a */
    public static final C4005a m33110a(EnumC7319r1 r1Var, boolean z, boolean z2, AbstractC11319f1 f1Var) {
        Set set;
        C9971q.m14633g(r1Var, "<this>");
        if (f1Var != null) {
            set = C9920v.m14723c(f1Var);
        } else {
            set = null;
        }
        return new C4005a(r1Var, null, z2, z, set, null, 34, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C4005a m33109b(EnumC7319r1 r1Var, boolean z, boolean z2, AbstractC11319f1 f1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            f1Var = null;
        }
        return m33110a(r1Var, z, z2, f1Var);
    }
}
