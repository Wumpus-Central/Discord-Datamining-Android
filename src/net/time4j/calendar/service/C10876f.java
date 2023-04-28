package net.time4j.calendar.service;

import p143hj.AbstractC8080q;
import p143hj.AbstractC8085v;

/* renamed from: net.time4j.calendar.service.f */
/* loaded from: classes8.dex */
public class C10876f<T extends AbstractC8080q<T>> extends AbstractC10874d<Integer, T> {
    private static final long serialVersionUID = -4975173343610190782L;

    /* renamed from: n */
    private final transient int f24141n;

    /* renamed from: o */
    private final transient int f24142o;

    /* renamed from: p */
    private final transient AbstractC8085v<T> f24143p;

    /* renamed from: q */
    private final transient AbstractC8085v<T> f24144q;

    public C10876f(String str, Class<T> cls, int i, int i2, char c) {
        super(str, cls, c, str.startsWith("DAY_OF_"));
        this.f24141n = i;
        this.f24142o = i2;
        this.f24143p = null;
        this.f24144q = null;
    }

    /* renamed from: D */
    public Integer mo11059f() {
        return Integer.valueOf(this.f24142o);
    }

    /* renamed from: E */
    public Integer mo11062T() {
        return Integer.valueOf(this.f24141n);
    }

    @Override // p143hj.AbstractC8079p
    public Class<Integer> getType() {
        return Integer.class;
    }

    public C10876f(String str, Class<T> cls, int i, int i2, char c, AbstractC8085v<T> vVar, AbstractC8085v<T> vVar2) {
        super(str, cls, c, false);
        this.f24141n = i;
        this.f24142o = i2;
        this.f24143p = vVar;
        this.f24144q = vVar2;
    }
}
