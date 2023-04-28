package p426xf;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lxf/f;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/io/File;", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "segments", "c", "()I", "size", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: xf.f */
/* loaded from: classes8.dex */
public final class C14085f {

    /* renamed from: a */
    private final File f31795a;

    /* renamed from: b */
    private final List<File> f31796b;

    /* JADX WARN: Multi-variable type inference failed */
    public C14085f(File root, List<? extends File> segments) {
        C9971q.m14633g(root, "root");
        C9971q.m14633g(segments, "segments");
        this.f31795a = root;
        this.f31796b = segments;
    }

    /* renamed from: a */
    public final File m1710a() {
        return this.f31795a;
    }

    /* renamed from: b */
    public final List<File> m1709b() {
        return this.f31796b;
    }

    /* renamed from: c */
    public final int m1708c() {
        return this.f31796b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14085f)) {
            return false;
        }
        C14085f fVar = (C14085f) obj;
        return C9971q.m14638b(this.f31795a, fVar.f31795a) && C9971q.m14638b(this.f31796b, fVar.f31796b);
    }

    public int hashCode() {
        return (this.f31795a.hashCode() * 31) + this.f31796b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f31795a + ", segments=" + this.f31796b + ')';
    }
}
