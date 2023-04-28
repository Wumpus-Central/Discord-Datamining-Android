package p249nh;

import kotlin.jvm.internal.C9971q;
import kotlin.text.Regex;

/* renamed from: nh.g */
/* loaded from: classes8.dex */
public final class C11143g {

    /* renamed from: a */
    public static final C11143g f24731a = new C11143g();

    /* renamed from: b */
    private static final Regex f24732b = new Regex("[^\\p{L}\\p{Digit}]");

    private C11143g() {
    }

    /* renamed from: a */
    public static final String m10763a(String name) {
        C9971q.m14633g(name, "name");
        return f24732b.m14582h(name, "_");
    }
}
