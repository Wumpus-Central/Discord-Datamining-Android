package ug;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import p446yf.C14376a;

/* renamed from: ug.i */
/* loaded from: classes8.dex */
public final class C13291i {
    /* renamed from: a */
    public static final C13286e m4034a(Annotation[] annotationArr, C11137c fqName) {
        Annotation annotation;
        C9971q.m14633g(annotationArr, "<this>");
        C9971q.m14633g(fqName, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C9971q.m14638b(C13283d.m4053a(C14376a.m737b(C14376a.m738a(annotation))).m10816b(), fqName)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C13286e(annotation);
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C13286e> m4033b(Annotation[] annotationArr) {
        C9971q.m14633g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C13286e(annotation));
        }
        return arrayList;
    }
}
