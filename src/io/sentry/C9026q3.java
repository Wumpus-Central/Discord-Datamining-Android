package io.sentry;

import io.sentry.protocol.C9009t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.sentry.q3 */
/* loaded from: classes8.dex */
final class C9026q3 {

    /* renamed from: a */
    private final List<String> f19852a;

    /* renamed from: b */
    private final List<String> f19853b;

    public C9026q3(List<String> list, List<String> list2) {
        this.f19852a = list;
        this.f19853b = list2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C9009t> m17204a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    C9009t tVar = new C9009t();
                    tVar.m17279r(Boolean.valueOf(m17203b(className)));
                    tVar.m17277t(className);
                    tVar.m17280q(stackTraceElement.getMethodName());
                    tVar.m17281p(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        tVar.m17278s(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    tVar.m17276u(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(tVar);
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    boolean m17203b(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        List<String> list = this.f19853b;
        if (list != null) {
            for (String str2 : list) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        List<String> list2 = this.f19852a;
        if (list2 != null) {
            Iterator<String> it = list2.iterator();
            while (it.hasNext() && !str.startsWith(it.next())) {
            }
        }
        return false;
    }
}
