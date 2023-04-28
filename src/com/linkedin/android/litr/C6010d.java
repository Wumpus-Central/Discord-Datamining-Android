package com.linkedin.android.litr;

import com.linkedin.android.litr.p050io.MediaRange;
import java.util.List;
import ke.AbstractC9850a;
import ke.AbstractC9851b;

/* renamed from: com.linkedin.android.litr.d */
/* loaded from: classes6.dex */
public class C6010d {

    /* renamed from: a */
    public final int f12193a;

    /* renamed from: b */
    public final List<AbstractC9851b> f12194b;

    /* renamed from: c */
    public final List<AbstractC9850a> f12195c;

    /* renamed from: d */
    public final MediaRange f12196d;

    /* renamed from: e */
    public final boolean f12197e;

    /* renamed from: f */
    public final boolean f12198f;

    /* renamed from: com.linkedin.android.litr.d$b */
    /* loaded from: classes6.dex */
    public static class C6012b {

        /* renamed from: a */
        private int f12199a = 100;

        /* renamed from: b */
        private List<AbstractC9851b> f12200b;

        /* renamed from: c */
        private List<AbstractC9850a> f12201c;

        /* renamed from: d */
        private MediaRange f12202d;

        /* renamed from: e */
        private boolean f12203e;

        /* renamed from: f */
        private boolean f12204f;

        /* renamed from: a */
        public C6010d m26438a() {
            return new C6010d(this.f12199a, this.f12200b, this.f12201c, this.f12202d, this.f12203e, this.f12204f);
        }
    }

    private C6010d(int i, List<AbstractC9851b> list, List<AbstractC9850a> list2, MediaRange mediaRange, boolean z, boolean z2) {
        this.f12193a = i;
        this.f12194b = list;
        this.f12195c = list2;
        this.f12196d = mediaRange == null ? new MediaRange(0L, Long.MAX_VALUE) : mediaRange;
        this.f12197e = z;
        this.f12198f = z2;
    }
}
