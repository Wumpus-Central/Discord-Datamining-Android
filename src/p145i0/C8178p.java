package p145i0;

import androidx.core.util.C2517g;
import java.io.File;
import p145i0.C8127f;

/* renamed from: i0.p */
/* loaded from: classes.dex */
public final class C8178p extends AbstractC8188s {

    /* renamed from: a */
    private final AbstractC8180b f17703a;

    /* renamed from: i0.p$a */
    /* loaded from: classes.dex */
    public static final class C8179a {

        /* renamed from: a */
        private final AbstractC8180b.AbstractC8181a f17704a;

        public C8179a(File file) {
            AbstractC8180b.AbstractC8181a c = new C8127f.C8129b().m20526c(0L);
            this.f17704a = c;
            C2517g.m37587h(file, "File can't be null.");
            c.mo20365b(file);
        }

        /* renamed from: a */
        public C8178p m20369a() {
            return new C8178p(this.f17704a.mo20366a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.p$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC8180b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i0.p$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC8181a {
            /* renamed from: a */
            abstract AbstractC8180b mo20366a();

            /* renamed from: b */
            abstract AbstractC8181a mo20365b(File file);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract File mo20368a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo20367b();
    }

    C8178p(AbstractC8180b bVar) {
        C2517g.m37587h(bVar, "FileOutputOptionsInternal can't be null.");
        this.f17703a = bVar;
    }

    @Override // p145i0.AbstractC8188s
    /* renamed from: a */
    public long mo20345a() {
        return this.f17703a.mo20367b();
    }

    /* renamed from: b */
    public File m20370b() {
        return this.f17703a.mo20368a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8178p)) {
            return false;
        }
        return this.f17703a.equals(((C8178p) obj).f17703a);
    }

    public int hashCode() {
        return this.f17703a.hashCode();
    }

    public String toString() {
        return this.f17703a.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
