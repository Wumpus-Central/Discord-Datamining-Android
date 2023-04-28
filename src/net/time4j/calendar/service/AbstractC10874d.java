package net.time4j.calendar.service;

import java.io.InvalidObjectException;
import java.lang.Comparable;
import net.time4j.calendar.AbstractC10865q;
import p143hj.AbstractC8050e;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.C8087x;
import p161ij.AbstractC8634d;

/* renamed from: net.time4j.calendar.service.d */
/* loaded from: classes8.dex */
public abstract class AbstractC10874d<V extends Comparable<V>, T extends AbstractC8080q<T>> extends AbstractC8634d<V> implements AbstractC10865q<V, T> {
    private final Class<T> chrono;

    /* renamed from: l */
    private final transient char f24135l;

    /* renamed from: m */
    private final transient boolean f24136m;

    public AbstractC10874d(String str, Class<T> cls, char c, boolean z) {
        super(str);
        this.chrono = cls;
        this.f24135l = c;
        this.f24136m = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public Class<T> m11919A() {
        return this.chrono;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return this.f24135l;
    }

    protected Object readResolve() {
        String name = name();
        for (AbstractC8079p<?> pVar : C8087x.m20655E(this.chrono).m20644x()) {
            if (pVar.name().equals(name)) {
                return pVar;
            }
        }
        throw new InvalidObjectException(name);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8050e
    /* renamed from: s */
    public boolean mo11055s(AbstractC8050e<?> eVar) {
        if (this.chrono == ((AbstractC10874d) eVar).chrono) {
            return true;
        }
        return false;
    }
}
