package net.time4j.calendar.service;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.C10892f0;
import net.time4j.calendar.KoreanCalendar;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;

/* renamed from: net.time4j.calendar.service.c */
/* loaded from: classes8.dex */
public class C10873c implements AbstractC8082s {
    @Override // p143hj.AbstractC8082s
    /* renamed from: a */
    public AbstractC8080q<?> mo10716a(AbstractC8080q<?> qVar, Locale locale, AbstractC8048d dVar) {
        AbstractC8079p<Integer> pVar = KoreanCalendar.f24005t;
        if (!qVar.mo11377e(pVar)) {
            return qVar;
        }
        return qVar.mo15655B(C10892f0.f24174z, qVar.mo11370s(pVar) - 2333);
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: b */
    public Set<AbstractC8079p<?>> mo10715b(Locale locale, AbstractC8048d dVar) {
        return Collections.emptySet();
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: c */
    public boolean mo10714c(Class<?> cls) {
        return cls == C10892f0.class;
    }

    @Override // p143hj.AbstractC8082s
    /* renamed from: d */
    public boolean mo10713d(AbstractC8079p<?> pVar) {
        return pVar == KoreanCalendar.f24005t;
    }
}
