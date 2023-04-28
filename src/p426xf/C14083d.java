package p426xf;

import com.facebook.react.util.JSStackTrace;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0006"}, m15073d2 = {"Ljava/io/File;", JSStackTrace.FILE_KEY, "other", "", "reason", "b", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: xf.d */
/* loaded from: classes8.dex */
public final class C14083d {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m1711b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "sb.toString()");
        return sb3;
    }
}
