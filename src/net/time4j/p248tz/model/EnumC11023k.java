package net.time4j.p248tz.model;

import java.util.Comparator;

/* renamed from: net.time4j.tz.model.k */
/* loaded from: classes8.dex */
enum EnumC11023k implements Comparator<AbstractC11012d> {
    INSTANCE;

    /* renamed from: b */
    public int compare(AbstractC11012d dVar, AbstractC11012d dVar2) {
        int N = dVar.mo11232b(2000).compareTo(dVar2.mo11232b(2000));
        if (N == 0) {
            return dVar.m11235f().compareTo(dVar2.m11235f());
        }
        return N;
    }
}
