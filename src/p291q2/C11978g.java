package p291q2;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import p163j$.util.Spliterator;
import p343t2.C12945f;

/* renamed from: q2.g */
/* loaded from: classes.dex */
public class C11978g {

    /* renamed from: a */
    private final AbstractC11976e f26812a;

    public C11978g(AbstractC11976e eVar) {
        this.f26812a = eVar;
    }

    /* renamed from: b */
    private static String m8085b(String str, EnumC11974c cVar, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z ? cVar.m8093a() : cVar.f26811k);
        return sb2.toString();
    }

    /* renamed from: c */
    private File m8084c(String str) {
        File file = new File(m8083d(), m8085b(str, EnumC11974c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m8083d(), m8085b(str, EnumC11974c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private File m8083d() {
        File a = this.f26812a.mo8088a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<EnumC11974c, InputStream> m8086a(String str) {
        EnumC11974c cVar;
        try {
            File c = m8084c(str);
            if (c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(c);
            if (c.getAbsolutePath().endsWith(".zip")) {
                cVar = EnumC11974c.ZIP;
            } else {
                cVar = EnumC11974c.JSON;
            }
            C12945f.m5011a("Cache hit for " + str + " at " + c.getAbsolutePath());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m8082e(String str, EnumC11974c cVar) {
        File file = new File(m8083d(), m8085b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C12945f.m5011a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C12945f.m5009c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public File m8081f(String str, InputStream inputStream, EnumC11974c cVar) {
        File file = new File(m8083d(), m8085b(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Spliterator.IMMUTABLE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
