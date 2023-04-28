package net.time4j.p248tz.model;

import net.time4j.C10892f0;
import net.time4j.C10906g0;
import net.time4j.C10959j;
import net.time4j.EnumC10899g;
import net.time4j.base.AbstractC10811a;
import p161ij.AbstractC8633c;

/* renamed from: net.time4j.tz.model.d */
/* loaded from: classes8.dex */
public abstract class AbstractC11012d {

    /* renamed from: k */
    private final transient long f24483k;

    /* renamed from: l */
    private final transient C10906g0 f24484l;

    /* renamed from: m */
    private final transient EnumC11017i f24485m;

    /* renamed from: n */
    private final transient int f24486n;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11012d(int i, EnumC11017i iVar, int i2) {
        if (iVar == null) {
            throw new NullPointerException("Missing offset indicator.");
        } else if (i2 == Integer.MAX_VALUE || (i2 >= -64800 && i2 <= 64800)) {
            if (i == 86400) {
                this.f24483k = 0L;
                this.f24484l = C10906g0.m11777H0();
            } else {
                C10959j S0 = C10906g0.m11776I0().m11762S0(i, EnumC10899g.f24191m);
                this.f24483k = S0.m11469a();
                this.f24484l = S0.m11468b();
            }
            this.f24485m = iVar;
            this.f24486n = i2 == Integer.MAX_VALUE ? 0 : i2;
        } else {
            throw new IllegalArgumentException("DST out of range: " + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String mo11233a() {
        AbstractC8633c cVar = (AbstractC8633c) getClass().getAnnotation(AbstractC8633c.class);
        if (cVar != null) {
            return cVar.value();
        }
        throw new IllegalStateException("Cannot find calendar type annotation: " + getClass());
    }

    /* renamed from: b */
    public abstract C10892f0 mo11232b(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final long m11238c() {
        return this.f24483k;
    }

    /* renamed from: d */
    public final EnumC11017i m11237d() {
        return this.f24485m;
    }

    /* renamed from: e */
    public final int m11236e() {
        return this.f24486n;
    }

    /* renamed from: f */
    public final C10906g0 m11235f() {
        return this.f24484l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo11227g() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo11231h(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo11230i(AbstractC10811a aVar);
}
