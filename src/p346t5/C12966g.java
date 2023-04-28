package p346t5;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Collections;
import java.util.List;
import p380v5.AbstractC13438i;
import p380v5.C13437h;
import p394w3.C13740j;

/* renamed from: t5.g */
/* loaded from: classes7.dex */
public class C12966g implements AbstractC12964e {

    /* renamed from: a */
    private final AbstractC12969c f29063a;

    /* renamed from: t5.g$b */
    /* loaded from: classes7.dex */
    private static class C12968b implements AbstractC12969c {
        private C12968b() {
        }

        @Override // p346t5.C12966g.AbstractC12969c
        /* renamed from: a */
        public List<Integer> mo4929a() {
            return Collections.EMPTY_LIST;
        }

        @Override // p346t5.C12966g.AbstractC12969c
        /* renamed from: b */
        public int mo4928b() {
            return 0;
        }
    }

    /* renamed from: t5.g$c */
    /* loaded from: classes7.dex */
    public interface AbstractC12969c {
        /* renamed from: a */
        List<Integer> mo4929a();

        /* renamed from: b */
        int mo4928b();
    }

    public C12966g() {
        this(new C12968b());
    }

    @Override // p346t5.AbstractC12964e
    /* renamed from: a */
    public int mo4931a(int i) {
        List<Integer> a = this.f29063a.mo4929a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (a.get(i2).intValue() > i) {
                return a.get(i2).intValue();
            }
        }
        return ViewDefaults.NUMBER_OF_LINES;
    }

    @Override // p346t5.AbstractC12964e
    /* renamed from: b */
    public AbstractC13438i mo4930b(int i) {
        boolean z;
        if (i >= this.f29063a.mo4928b()) {
            z = true;
        } else {
            z = false;
        }
        return C13437h.m3694d(i, z, false);
    }

    public C12966g(AbstractC12969c cVar) {
        this.f29063a = (AbstractC12969c) C13740j.m2834g(cVar);
    }
}
