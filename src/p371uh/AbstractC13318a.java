package p371uh;

import kotlin.jvm.internal.C9971q;

/* renamed from: uh.a */
/* loaded from: classes8.dex */
public abstract class AbstractC13318a implements Comparable<AbstractC13318a> {
    /* renamed from: a */
    public int compareTo(AbstractC13318a other) {
        C9971q.m14633g(other, "other");
        int compareTo = mo1540b().compareTo(other.mo1540b());
        if (compareTo != 0 || mo3962c() || !other.mo3962c()) {
            return compareTo;
        }
        return 1;
    }

    /* renamed from: b */
    public abstract EnumC13319b mo1540b();

    /* renamed from: c */
    public abstract boolean mo3962c();
}
