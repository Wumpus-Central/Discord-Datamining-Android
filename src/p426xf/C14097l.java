package p426xf;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p326ri.C12694d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m15073d2 = {"Ljava/io/File;", "Ljava/nio/charset/Charset;", "charset", "", "c", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/io/FilesKt")
/* renamed from: xf.l */
/* loaded from: classes8.dex */
public class C14097l extends C14096k {
    /* renamed from: c */
    public static final String m1687c(File file, Charset charset) {
        InputStreamReader inputStreamReader;
        C9971q.m14633g(file, "<this>");
        C9971q.m14633g(charset, "charset");
        try {
            String e = C14103q.m1668e(new InputStreamReader(new FileInputStream(file), charset));
            th = null;
            return e;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: d */
    public static /* synthetic */ String m1686d(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C12694d.f28536b;
        }
        return m1687c(file, charset);
    }
}
