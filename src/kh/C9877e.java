package kh;

import java.util.List;
import kotlin.jvm.internal.C9971q;
import ph.AbstractC11702i;

/* renamed from: kh.e */
/* loaded from: classes8.dex */
public final class C9877e {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <M extends AbstractC11702i.AbstractC11706d<M>, T> T m15132a(AbstractC11702i.AbstractC11706d<M> dVar, AbstractC11702i.C11709f<M, T> extension) {
        C9971q.m14633g(dVar, "<this>");
        C9971q.m14633g(extension, "extension");
        if (dVar.m8829y(extension)) {
            return (T) dVar.m8832v(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <M extends AbstractC11702i.AbstractC11706d<M>, T> T m15131b(AbstractC11702i.AbstractC11706d<M> dVar, AbstractC11702i.C11709f<M, List<T>> extension, int i) {
        C9971q.m14633g(dVar, "<this>");
        C9971q.m14633g(extension, "extension");
        if (i < dVar.m8830x(extension)) {
            return (T) dVar.m8831w(extension, i);
        }
        return null;
    }
}
