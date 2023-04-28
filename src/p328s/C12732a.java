package p328s;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C12732a {

    /* renamed from: a */
    private final AbstractC12734c f28594a;

    /* renamed from: s.a$a */
    /* loaded from: classes.dex */
    private static class C0407a implements AbstractC12734c {

        /* renamed from: a */
        private final InputConfiguration f28595a;

        C0407a(Object obj) {
            this.f28595a = (InputConfiguration) obj;
        }

        @Override // p328s.C12732a.AbstractC12734c
        /* renamed from: a */
        public Object mo5588a() {
            return this.f28595a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AbstractC12734c)) {
                return false;
            }
            return Objects.equals(this.f28595a, ((AbstractC12734c) obj).mo5588a());
        }

        public int hashCode() {
            return this.f28595a.hashCode();
        }

        public String toString() {
            return this.f28595a.toString();
        }
    }

    /* renamed from: s.a$b */
    /* loaded from: classes.dex */
    private static final class C12733b extends C0407a {
        C12733b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: s.a$c */
    /* loaded from: classes.dex */
    private interface AbstractC12734c {
        /* renamed from: a */
        Object mo5588a();
    }

    private C12732a(AbstractC12734c cVar) {
        this.f28594a = cVar;
    }

    /* renamed from: b */
    public static C12732a m5589b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new C12732a(new C12733b(obj));
        }
        return new C12732a(new C0407a(obj));
    }

    /* renamed from: a */
    public Object m5590a() {
        return this.f28594a.mo5588a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12732a)) {
            return false;
        }
        return this.f28594a.equals(((C12732a) obj).f28594a);
    }

    public int hashCode() {
        return this.f28594a.hashCode();
    }

    public String toString() {
        return this.f28594a.toString();
    }
}
