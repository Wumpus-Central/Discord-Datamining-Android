package p426xf;

import com.facebook.react.uimanager.events.TouchesHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p326ri.C12719v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\u0000\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010*\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Ljava/io/File;", "base", "", "n", "o", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", TouchesHelper.TARGET_KEY, "", "overwrite", "", "bufferSize", "g", "i", "Lxf/f;", "m", "(Lxf/f;)Lxf/f;", "", "l", "(Ljava/util/List;)Ljava/util/List;", "j", "(Ljava/io/File;)Ljava/lang/String;", "extension", "k", "nameWithoutExtension", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/io/FilesKt")
/* renamed from: xf.n */
/* loaded from: classes8.dex */
public class C14099n extends C14098m {
    /* renamed from: g */
    public static final File m1683g(File file, File target, boolean z, int i) {
        C9971q.m14633g(file, "<this>");
        C9971q.m14633g(target, "target");
        if (file.exists()) {
            if (target.exists()) {
                if (!z) {
                    throw new C14084e(file, target, "The destination file already exists.");
                } else if (!target.delete()) {
                    throw new C14084e(file, target, "Tried to overwrite the destination, but failed to delete it.");
                }
            }
            if (!file.isDirectory()) {
                File parentFile = target.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                try {
                    C14081b.m1716a(new FileInputStream(file), new FileOutputStream(target), i);
                    th = null;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else if (!target.mkdirs()) {
                throw new C14086g(file, target, "Failed to create target directory.");
            }
            return target;
        }
        throw new C14102p(file, null, "The source file doesn't exist.", 2, null);
    }

    /* renamed from: h */
    public static /* synthetic */ File m1682h(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m1683g(file, file2, z, i);
    }

    /* renamed from: i */
    public static boolean m1681i(File file) {
        C9971q.m14633g(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : C14098m.m1684f(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    /* renamed from: j */
    public static String m1680j(File file) {
        String L0;
        C9971q.m14633g(file, "<this>");
        String name = file.getName();
        C9971q.m14634f(name, "name");
        L0 = C12719v.m5710L0(name, '.', "");
        return L0;
    }

    /* renamed from: k */
    public static String m1679k(File file) {
        String U0;
        C9971q.m14633g(file, "<this>");
        String name = file.getName();
        C9971q.m14634f(name, "name");
        U0 = C12719v.m5692U0(name, ".", null, 2, null);
        return U0;
    }

    /* renamed from: l */
    private static final List<File> m1678l(List<? extends File> list) {
        Object g0;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!C9971q.m14638b(name, ".")) {
                if (C9971q.m14638b(name, "..")) {
                    if (!arrayList.isEmpty()) {
                        g0 = C9914r.m14758g0(arrayList);
                        if (!C9971q.m14638b(((File) g0).getName(), "..")) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    arrayList.add(file);
                } else {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private static final C14085f m1677m(C14085f fVar) {
        return new C14085f(fVar.m1710a(), m1678l(fVar.m1709b()));
    }

    /* renamed from: n */
    public static String m1676n(File file, File base) {
        C9971q.m14633g(file, "<this>");
        C9971q.m14633g(base, "base");
        String o = m1675o(file, base);
        if (o != null) {
            return o;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    /* renamed from: o */
    private static final String m1675o(File file, File file2) {
        List O;
        C14085f m = m1677m(C14096k.m1688b(file));
        C14085f m2 = m1677m(C14096k.m1688b(file2));
        if (!C9971q.m14638b(m.m1710a(), m2.m1710a())) {
            return null;
        }
        int c = m2.m1708c();
        int c2 = m.m1708c();
        int min = Math.min(c2, c);
        int i = 0;
        while (i < min && C9971q.m14638b(m.m1709b().get(i), m2.m1709b().get(i))) {
            i++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i2 = c - 1;
        if (i <= i2) {
            while (!C9971q.m14638b(m2.m1709b().get(i2).getName(), "..")) {
                sb2.append("..");
                if (i2 != i) {
                    sb2.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < c2) {
            if (i < c) {
                sb2.append(File.separatorChar);
            }
            O = C9914r.m14776O(m.m1709b(), i);
            String separator = File.separator;
            C9971q.m14634f(separator, "separator");
            C9914r.m14762c0(O, sb2, separator, null, null, 0, null, null, 124, null);
        }
        return sb2.toString();
    }
}
