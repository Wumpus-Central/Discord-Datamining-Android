package p115g5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p115g5.AbstractC7415b;

/* renamed from: g5.d */
/* loaded from: classes7.dex */
public class C7418d<I> extends C7414a<I> {

    /* renamed from: l */
    private final List<AbstractC7415b<I>> f15989l = new ArrayList(2);

    /* renamed from: p */
    private synchronized void m22715p(String str, Throwable th2) {
        Log.e("FwdControllerListener2", str, th2);
    }

    @Override // p115g5.C7414a, p115g5.AbstractC7415b
    /* renamed from: b */
    public void mo10515b(String str, Object obj, AbstractC7415b.C7416a aVar) {
        int size = this.f15989l.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC7415b<I> bVar = this.f15989l.get(i);
                if (bVar != null) {
                    bVar.mo10515b(str, obj, aVar);
                }
            } catch (Exception e) {
                m22715p("ForwardingControllerListener2 exception in onSubmit", e);
            }
        }
    }

    @Override // p115g5.C7414a, p115g5.AbstractC7415b
    /* renamed from: g */
    public void mo10514g(String str, AbstractC7415b.C7416a aVar) {
        int size = this.f15989l.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC7415b<I> bVar = this.f15989l.get(i);
                if (bVar != null) {
                    bVar.mo10514g(str, aVar);
                }
            } catch (Exception e) {
                m22715p("ForwardingControllerListener2 exception in onRelease", e);
            }
        }
    }

    @Override // p115g5.C7414a, p115g5.AbstractC7415b
    /* renamed from: i */
    public void mo10513i(String str, I i, AbstractC7415b.C7416a aVar) {
        int size = this.f15989l.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                AbstractC7415b<I> bVar = this.f15989l.get(i2);
                if (bVar != null) {
                    bVar.mo10513i(str, i, aVar);
                }
            } catch (Exception e) {
                m22715p("ForwardingControllerListener2 exception in onFinalImageSet", e);
            }
        }
    }

    @Override // p115g5.C7414a, p115g5.AbstractC7415b
    /* renamed from: l */
    public void mo10512l(String str, Throwable th2, AbstractC7415b.C7416a aVar) {
        int size = this.f15989l.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC7415b<I> bVar = this.f15989l.get(i);
                if (bVar != null) {
                    bVar.mo10512l(str, th2, aVar);
                }
            } catch (Exception e) {
                m22715p("ForwardingControllerListener2 exception in onFailure", e);
            }
        }
    }

    /* renamed from: n */
    public synchronized void m22716n(AbstractC7415b<I> bVar) {
        this.f15989l.add(bVar);
    }

    /* renamed from: r */
    public synchronized void m22714r(AbstractC7415b<I> bVar) {
        int indexOf = this.f15989l.indexOf(bVar);
        if (indexOf != -1) {
            this.f15989l.remove(indexOf);
        }
    }
}
