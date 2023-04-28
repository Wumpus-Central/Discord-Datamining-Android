package net.time4j.calendar;

import net.time4j.base.C10813c;

/* renamed from: net.time4j.calendar.j */
/* loaded from: classes8.dex */
public abstract class AbstractC10849j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.calendar.j$a */
    /* loaded from: classes8.dex */
    public static class C10850a extends AbstractC10849j {

        /* renamed from: a */
        final /* synthetic */ int f24057a;

        C10850a(int i) {
            this.f24057a = i;
        }

        @Override // net.time4j.calendar.AbstractC10849j
        /* renamed from: d */
        public int mo12013d() {
            return C10813c.m12198e(this.f24057a, 2636);
        }
    }

    /* renamed from: a */
    public static AbstractC10849j m12017a(int i) {
        if (i >= 1) {
            return m12016b(C10813c.m12198e(i, -2333));
        }
        throw new IllegalArgumentException("Dangi year must not be smaller than 1: " + i);
    }

    /* renamed from: b */
    public static AbstractC10849j m12016b(int i) {
        return new C10850a(i);
    }

    /* renamed from: c */
    public final int m12015c() {
        return C10813c.m12202a((mo12013d() + 1) - 1, 60) + 1;
    }

    /* renamed from: d */
    public abstract int mo12013d();

    /* renamed from: e */
    public final C10836c m12014e() {
        int i = 60;
        int c = C10813c.m12200c(mo12013d() + 1, 60);
        if (c != 0) {
            i = c;
        }
        return C10836c.m12108n(i);
    }
}
