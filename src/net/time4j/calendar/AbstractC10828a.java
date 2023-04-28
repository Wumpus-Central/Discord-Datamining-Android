package net.time4j.calendar;

import java.util.Locale;
import net.time4j.calendar.AbstractC10840f;
import net.time4j.calendar.service.C10871a;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8053f0;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8084u;
import p143hj.AbstractC8090y;
import p143hj.C8087x;

/* renamed from: net.time4j.calendar.a */
/* loaded from: classes8.dex */
abstract class AbstractC10828a<C extends AbstractC10840f<?, C>> implements AbstractC8084u<C> {

    /* renamed from: k */
    private final Class<C> f24025k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10828a(Class<C> cls) {
        this.f24025k = cls;
    }

    /* renamed from: a */
    public AbstractC8077o mo11615h(C c, AbstractC8048d dVar) {
        return c;
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: b */
    public AbstractC8053f0 mo11620b() {
        return AbstractC8053f0.f17431a;
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: c */
    public C8087x<?> mo11619c() {
        return null;
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: d */
    public int mo11618d() {
        return 100;
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: g */
    public String mo11616g(AbstractC8090y yVar, Locale locale) {
        return C10871a.m11926a("chinese", yVar, locale);
    }
}
