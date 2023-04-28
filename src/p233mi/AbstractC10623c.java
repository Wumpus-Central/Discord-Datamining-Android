package p233mi;

import ag.AbstractC1385a;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mi.c */
/* loaded from: classes8.dex */
public abstract class AbstractC10623c<T> implements Iterable<T>, AbstractC1385a {
    private AbstractC10623c() {
    }

    public /* synthetic */ AbstractC10623c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo12695a();

    /* renamed from: b */
    public abstract void mo12694b(int i, T t);

    public abstract T get(int i);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
