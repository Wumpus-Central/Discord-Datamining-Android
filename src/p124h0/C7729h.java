package p124h0;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: h0.h */
/* loaded from: classes.dex */
class C7729h {

    /* renamed from: a */
    private int f16761a = 1;

    /* renamed from: b */
    private Map<CaptureRequest.Key<?>, Object> f16762b = new HashMap();

    /* renamed from: c */
    private List<AbstractC7722e> f16763c = new ArrayList();

    /* renamed from: h0.h$a */
    /* loaded from: classes.dex */
    private static class C7730a implements AbstractC7728g {

        /* renamed from: a */
        private final int f16764a;

        /* renamed from: b */
        private final Map<CaptureRequest.Key<?>, Object> f16765b;

        /* renamed from: c */
        private final List<AbstractC7722e> f16766c;

        C7730a(int i, Map<CaptureRequest.Key<?>, Object> map, List<AbstractC7722e> list) {
            this.f16764a = i;
            this.f16765b = map;
            this.f16766c = list;
        }

        @Override // p124h0.AbstractC7728g
        /* renamed from: a */
        public int mo21556a() {
            return this.f16764a;
        }

        @Override // p124h0.AbstractC7728g
        /* renamed from: b */
        public Map<CaptureRequest.Key<?>, Object> mo21555b() {
            return this.f16765b;
        }

        @Override // p124h0.AbstractC7728g
        /* renamed from: c */
        public List<AbstractC7722e> mo21554c() {
            return this.f16766c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7729h m21560a(AbstractC7722e eVar) {
        this.f16763c.add(eVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> C7729h m21559b(CaptureRequest.Key<T> key, T t) {
        this.f16762b.put(key, t);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC7728g m21558c() {
        return new C7730a(this.f16761a, this.f16762b, this.f16763c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C7729h m21557d(int i) {
        this.f16761a = i;
        return this;
    }
}
