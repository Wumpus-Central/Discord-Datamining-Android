package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.j0 */
/* loaded from: classes8.dex */
public class C9960j0 {

    /* renamed from: a */
    private final ArrayList<Object> f22089a;

    public C9960j0(int i) {
        this.f22089a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void m14660a(Object obj) {
        this.f22089a.add(obj);
    }

    /* renamed from: b */
    public void m14659b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f22089a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f22089a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f22089a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    this.f22089a.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f22089a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int m14658c() {
        return this.f22089a.size();
    }

    /* renamed from: d */
    public Object[] m14657d(Object[] objArr) {
        return this.f22089a.toArray(objArr);
    }
}
