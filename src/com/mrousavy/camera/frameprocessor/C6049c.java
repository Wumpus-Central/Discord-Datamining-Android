package com.mrousavy.camera.frameprocessor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m15073d2 = {"Lcom/mrousavy/camera/frameprocessor/c;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "endPerformanceSampleCollection", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.frameprocessor.c */
/* loaded from: classes6.dex */
public final class C6049c {

    /* renamed from: a */
    private final Function0<Unit> f12314a;

    public C6049c(Function0<Unit> endPerformanceSampleCollection) {
        C9971q.m14633g(endPerformanceSampleCollection, "endPerformanceSampleCollection");
        this.f12314a = endPerformanceSampleCollection;
    }

    /* renamed from: a */
    public final Function0<Unit> m26383a() {
        return this.f12314a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6049c) && C9971q.m14638b(this.f12314a, ((C6049c) obj).f12314a);
    }

    public int hashCode() {
        return this.f12314a.hashCode();
    }

    public String toString() {
        return "PerformanceSampleCollection(endPerformanceSampleCollection=" + this.f12314a + ')';
    }
}
