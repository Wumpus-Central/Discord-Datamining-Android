package net.time4j;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.v0 */
/* loaded from: classes8.dex */
public class C11035v0 implements AbstractC8082s {
    @Override // p143hj.AbstractC8082s
    /* renamed from: a */
    public AbstractC8080q<?> mo10716a(AbstractC8080q<?> qVar, Locale locale, AbstractC8048d dVar) {
        return qVar;
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: b */
    public Set<AbstractC8079p<?>> mo10715b(Locale locale, AbstractC8048d dVar) {
        if (locale.getCountry().isEmpty()) {
            return Collections.emptySet();
        }
        return C11045z0.m11129j(locale).m11135d();
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: c */
    public boolean mo10714c(Class<?> cls) {
        return false;
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: d */
    public boolean mo10713d(AbstractC8079p<?> pVar) {
        return false;
    }
}
