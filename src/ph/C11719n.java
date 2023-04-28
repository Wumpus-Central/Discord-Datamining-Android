package ph;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ph.n */
/* loaded from: classes8.dex */
public class C11719n extends AbstractList<String> implements RandomAccess, AbstractC11720o {

    /* renamed from: l */
    public static final AbstractC11720o f26173l = new C11719n().mo8710q();

    /* renamed from: k */
    private final List<Object> f26174k;

    public C11719n() {
        this.f26174k = new ArrayList();
    }

    /* renamed from: b */
    private static AbstractC11691d m8792b(Object obj) {
        if (obj instanceof AbstractC11691d) {
            return (AbstractC11691d) obj;
        }
        if (obj instanceof String) {
            return AbstractC11691d.m9013i((String) obj);
        }
        return AbstractC11691d.m9015f((byte[]) obj);
    }

    /* renamed from: e */
    private static String m8791e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC11691d) {
            return ((AbstractC11691d) obj).m9020C();
        }
        return C11710j.m8812b((byte[]) obj);
    }

    /* renamed from: a */
    public void add(int i, String str) {
        this.f26174k.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f26174k.clear();
        ((AbstractList) this).modCount++;
    }

    /* renamed from: f */
    public String get(int i) {
        Object obj = this.f26174k.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC11691d) {
            AbstractC11691d dVar = (AbstractC11691d) obj;
            String C = dVar.m9020C();
            if (dVar.mo8759t()) {
                this.f26174k.set(i, C);
            }
            return C;
        }
        byte[] bArr = (byte[]) obj;
        String b = C11710j.m8812b(bArr);
        if (C11710j.m8813a(bArr)) {
            this.f26174k.set(i, b);
        }
        return b;
    }

    /* renamed from: g */
    public String remove(int i) {
        Object remove = this.f26174k.remove(i);
        ((AbstractList) this).modCount++;
        return m8791e(remove);
    }

    @Override // ph.AbstractC11720o
    /* renamed from: h */
    public List<?> mo8713h() {
        return Collections.unmodifiableList(this.f26174k);
    }

    /* renamed from: i */
    public String set(int i, String str) {
        return m8791e(this.f26174k.set(i, str));
    }

    @Override // ph.AbstractC11720o
    /* renamed from: k */
    public AbstractC11691d mo8712k(int i) {
        Object obj = this.f26174k.get(i);
        AbstractC11691d b = m8792b(obj);
        if (b != obj) {
            this.f26174k.set(i, b);
        }
        return b;
    }

    @Override // ph.AbstractC11720o
    /* renamed from: m */
    public void mo8711m(AbstractC11691d dVar) {
        this.f26174k.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // ph.AbstractC11720o
    /* renamed from: q */
    public AbstractC11720o mo8710q() {
        return new C11743x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26174k.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof AbstractC11720o) {
            collection = ((AbstractC11720o) collection).mo8713h();
        }
        boolean addAll = this.f26174k.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public C11719n(AbstractC11720o oVar) {
        this.f26174k = new ArrayList(oVar.size());
        addAll(oVar);
    }
}
