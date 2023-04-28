package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import p163j$.util.Spliterator;

/* renamed from: com.horcrux.svg.k */
/* loaded from: classes6.dex */
class C5967k {

    /* renamed from: a */
    private final ArrayList<Path> f11939a;

    /* renamed from: b */
    private final int[][] f11940b = new int[Spliterator.NONNULL];

    /* renamed from: c */
    private final Paint f11941c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5967k(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.f11939a = arrayList;
        this.f11941c = paint;
        arrayList.add(new Path());
    }

    /* renamed from: a */
    private int m26732a(char c) {
        int[] iArr = this.f11940b[c >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c & 255];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Path m26731b(char c, String str) {
        Path path;
        int a = m26732a(c);
        if (a != 0) {
            path = this.f11939a.get(a);
        } else {
            Path path2 = new Path();
            this.f11941c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f11940b;
            int i = c >> '\b';
            int[] iArr2 = iArr[i];
            if (iArr2 == null) {
                iArr2 = new int[Spliterator.NONNULL];
                iArr[i] = iArr2;
            }
            iArr2[c & 255] = this.f11939a.size();
            this.f11939a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
