package p426xf;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import p326ri.C12719v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¨\u0006\u0007"}, m15073d2 = {"", "", "a", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lxf/f;", "b", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/io/FilesKt")
/* renamed from: xf.k */
/* loaded from: classes8.dex */
public class C14096k {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = p326ri.C12719v.m5687Y(r8, r3, 2, false, 4, null);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int m1689a(java.lang.String r8) {
        /*
            char r1 = java.io.File.separatorChar
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            int r0 = p326ri.C12707l.m5794Y(r0, r1, r2, r3, r4, r5)
            r1 = 1
            if (r0 != 0) goto L_0x003d
            int r0 = r8.length()
            if (r0 <= r1) goto L_0x003c
            char r0 = r8.charAt(r1)
            char r3 = java.io.File.separatorChar
            if (r0 != r3) goto L_0x003c
            r4 = 2
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            int r0 = p326ri.C12707l.m5794Y(r2, r3, r4, r5, r6, r7)
            if (r0 < 0) goto L_0x003c
            char r3 = java.io.File.separatorChar
            int r4 = r0 + 1
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            int r0 = p326ri.C12707l.m5794Y(r2, r3, r4, r5, r6, r7)
            if (r0 < 0) goto L_0x0037
            int r0 = r0 + r1
            return r0
        L_0x0037:
            int r8 = r8.length()
            return r8
        L_0x003c:
            return r1
        L_0x003d:
            r2 = 58
            if (r0 <= 0) goto L_0x004b
            int r3 = r0 + (-1)
            char r3 = r8.charAt(r3)
            if (r3 != r2) goto L_0x004b
            int r0 = r0 + r1
            return r0
        L_0x004b:
            r1 = -1
            r3 = 0
            if (r0 != r1) goto L_0x005c
            r0 = 2
            r1 = 0
            boolean r0 = p326ri.C12707l.m5805P(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L_0x005c
            int r8 = r8.length()
            return r8
        L_0x005c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p426xf.C14096k.m1689a(java.lang.String):int");
    }

    /* renamed from: b */
    public static final C14085f m1688b(File file) {
        boolean z;
        List list;
        List<String> y0;
        int t;
        C9971q.m14633g(file, "<this>");
        String path = file.getPath();
        C9971q.m14634f(path, "path");
        int a = m1689a(path);
        String substring = path.substring(0, a);
        C9971q.m14634f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(a);
        C9971q.m14634f(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = C9906j.m14820i();
        } else {
            y0 = C12719v.m5661y0(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            t = C9907k.m14809t(y0, 10);
            ArrayList arrayList = new ArrayList(t);
            for (String str : y0) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new C14085f(new File(substring), list);
    }
}
