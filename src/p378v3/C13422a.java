package p378v3;

import java.io.File;

/* renamed from: v3.a */
/* loaded from: classes7.dex */
public class C13422a {
    /* renamed from: a */
    public static boolean m3755a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= m3754b(file2);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m3754b(File file) {
        if (file.isDirectory()) {
            m3755a(file);
        }
        return file.delete();
    }

    /* renamed from: c */
    public static void m3753c(File file, AbstractC13423b bVar) {
        bVar.mo3750c(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m3753c(file2, bVar);
                } else {
                    bVar.mo3751b(file2);
                }
            }
        }
        bVar.mo3752a(file);
    }
}
