package io.sentry;

/* renamed from: io.sentry.m4 */
/* loaded from: classes8.dex */
public final class C8937m4 {

    /* renamed from: a */
    private final Boolean f19642a;

    /* renamed from: b */
    private final Double f19643b;

    /* renamed from: c */
    private final Boolean f19644c;

    /* renamed from: d */
    private final Double f19645d;

    public C8937m4(Boolean bool) {
        this(bool, null);
    }

    /* renamed from: a */
    public Boolean m17600a() {
        return this.f19644c;
    }

    /* renamed from: b */
    public Double m17599b() {
        return this.f19643b;
    }

    /* renamed from: c */
    public Boolean m17598c() {
        return this.f19642a;
    }

    public C8937m4(Boolean bool, Double d) {
        this(bool, d, Boolean.FALSE, null);
    }

    public C8937m4(Boolean bool, Double d, Boolean bool2, Double d2) {
        this.f19642a = bool;
        this.f19643b = d;
        this.f19644c = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f19645d = d2;
    }
}
