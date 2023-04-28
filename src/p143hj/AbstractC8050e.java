package p143hj;

import java.io.Serializable;
import java.lang.Comparable;
import net.time4j.base.AbstractC10817f;

/* renamed from: hj.e */
/* loaded from: classes8.dex */
public abstract class AbstractC8050e<V extends Comparable<V>> implements AbstractC8079p<V>, Serializable {
    private final int hash;
    private final int identity;
    private final String name;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8050e(String str) {
        if (!str.trim().isEmpty()) {
            this.name = str;
            int hashCode = str.hashCode();
            this.hash = hashCode;
            if (!mo11143y()) {
                hashCode = -1;
            } else if (hashCode == -1) {
                hashCode = ~hashCode;
            }
            this.identity = hashCode;
            return;
        }
        throw new IllegalArgumentException("Element name is empty or contains only white space.");
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC8050e<?> eVar = (AbstractC8050e) obj;
        int i = this.identity;
        if (i == eVar.identity) {
            if (i != -1) {
                return true;
            }
            if (name().equals(eVar.name()) && mo11055s(eVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.hash;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    public final String name() {
        return this.name;
    }

    /* renamed from: o */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        return ((Comparable) oVar.mo11371r(this)).compareTo(oVar2.mo11371r(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public <T extends AbstractC8080q<T>> AbstractC8091z<T, V> mo11057q(C8087x<T> xVar) {
        return null;
    }

    /* renamed from: s */
    protected boolean mo11055s(AbstractC8050e<?> eVar) {
        return true;
    }

    public String toString() {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 32);
        sb2.append(name);
        sb2.append('@');
        sb2.append(this.name);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public AbstractC8079p<?> mo11053v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public String mo20686w(C8087x<?> xVar) {
        if (!m20742x() || !AbstractC10817f.class.isAssignableFrom(xVar.m20648q())) {
            return null;
        }
        return "Accessing the local element [" + this.name + "] from a global type requires a timezone.\n- Try to apply a zonal query like \"" + this.name + ".atUTC()\".\n- Or try to first convert the global type to a zonal timestamp: \"moment.toZonalTimestamp(...)\".\n- If used in formatting then consider \"ChronoFormatter.withTimezone(TZID)\".";
    }

    /* renamed from: x */
    public boolean m20742x() {
        return true;
    }

    /* renamed from: y */
    protected boolean mo11143y() {
        return false;
    }
}
