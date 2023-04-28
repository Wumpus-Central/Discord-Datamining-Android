package p276p3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p394w3.C13740j;

/* renamed from: p3.b */
/* loaded from: classes7.dex */
public class C11527b implements AbstractC11526a {

    /* renamed from: a */
    private final File f25717a;

    private C11527b(File file) {
        this.f25717a = (File) C13740j.m2834g(file);
    }

    /* renamed from: b */
    public static C11527b m9454b(File file) {
        return new C11527b(file);
    }

    /* renamed from: c */
    public static C11527b m9453c(File file) {
        if (file != null) {
            return new C11527b(file);
        }
        return null;
    }

    @Override // p276p3.AbstractC11526a
    /* renamed from: a */
    public InputStream mo9455a() {
        return new FileInputStream(this.f25717a);
    }

    /* renamed from: d */
    public File m9452d() {
        return this.f25717a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C11527b)) {
            return false;
        }
        return this.f25717a.equals(((C11527b) obj).f25717a);
    }

    public int hashCode() {
        return this.f25717a.hashCode();
    }

    @Override // p276p3.AbstractC11526a
    public long size() {
        return this.f25717a.length();
    }
}
