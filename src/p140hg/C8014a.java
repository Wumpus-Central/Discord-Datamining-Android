package p140hg;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import p107fg.AbstractC7140d;
import p158ig.AbstractC8453l;
import p158ig.C8503p0;
import p180jg.AbstractC9579e;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m15073d2 = {"Lkotlin/reflect/KCallable;", "", "value", "a", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "isAccessible", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: hg.a */
/* loaded from: classes8.dex */
public final class C8014a {
    /* renamed from: a */
    public static final boolean m20855a(KCallable<?> kCallable) {
        boolean z;
        Member member;
        boolean z2;
        boolean z3;
        AbstractC9579e<?> w;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C9971q.m14633g(kCallable, "<this>");
        if (kCallable instanceof AbstractC7140d) {
            KProperty kProperty = (KProperty) kCallable;
            Field b = C8016c.m20851b(kProperty);
            if (b != null) {
                z10 = b.isAccessible();
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            Method c = C8016c.m20850c(kProperty);
            if (c != null) {
                z11 = c.isAccessible();
            } else {
                z11 = true;
            }
            if (!z11) {
                return false;
            }
            Method e = C8016c.m20848e((AbstractC7140d) kCallable);
            if (e != null) {
                z12 = e.isAccessible();
            } else {
                z12 = true;
            }
            if (!z12) {
                return false;
            }
        } else if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field b2 = C8016c.m20851b(kProperty2);
            if (b2 != null) {
                z8 = b2.isAccessible();
            } else {
                z8 = true;
            }
            if (!z8) {
                return false;
            }
            Method c2 = C8016c.m20850c(kProperty2);
            if (c2 != null) {
                z9 = c2.isAccessible();
            } else {
                z9 = true;
            }
            if (!z9) {
                return false;
            }
        } else if (kCallable instanceof KProperty.AbstractC9988b) {
            Field b3 = C8016c.m20851b(((KProperty.AbstractC9988b) kCallable).mo14596i());
            if (b3 != null) {
                z6 = b3.isAccessible();
            } else {
                z6 = true;
            }
            if (!z6) {
                return false;
            }
            Method d = C8016c.m20849d((KFunction) kCallable);
            if (d != null) {
                z7 = d.isAccessible();
            } else {
                z7 = true;
            }
            if (!z7) {
                return false;
            }
        } else if (kCallable instanceof AbstractC7140d.AbstractC7141a) {
            Field b4 = C8016c.m20851b(((AbstractC7140d.AbstractC7141a) kCallable).mo14596i());
            if (b4 != null) {
                z4 = b4.isAccessible();
            } else {
                z4 = true;
            }
            if (!z4) {
                return false;
            }
            Method d2 = C8016c.m20849d((KFunction) kCallable);
            if (d2 != null) {
                z5 = d2.isAccessible();
            } else {
                z5 = true;
            }
            if (!z5) {
                return false;
            }
        } else if (kCallable instanceof KFunction) {
            KFunction kFunction = (KFunction) kCallable;
            Method d3 = C8016c.m20849d(kFunction);
            if (d3 != null) {
                z = d3.isAccessible();
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            AbstractC8453l<?> b5 = C8503p0.m19658b(kCallable);
            AccessibleObject accessibleObject = null;
            if (b5 == null || (w = b5.mo19627w()) == null) {
                member = null;
            } else {
                member = w.mo15931b();
            }
            if (member instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) member;
            }
            if (accessibleObject != null) {
                z2 = accessibleObject.isAccessible();
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            Constructor a = C8016c.m20852a(kFunction);
            if (a != null) {
                z3 = a.isAccessible();
            } else {
                z3 = true;
            }
            if (!z3) {
                return false;
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + ')');
        }
        return true;
    }
}
