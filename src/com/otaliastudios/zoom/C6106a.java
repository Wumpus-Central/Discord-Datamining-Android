package com.otaliastudios.zoom;

import android.annotation.SuppressLint;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lcom/otaliastudios/zoom/a;", "", "", "alignment", "a", "(I)I", "b", "", "c", "(I)Z", "valueIfNone", "d", "(II)I", "e", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: com.otaliastudios.zoom.a */
/* loaded from: classes6.dex */
public final class C6106a {

    /* renamed from: a */
    public static final C6106a f12421a = new C6106a();

    private C6106a() {
    }

    /* renamed from: a */
    public final int m26249a(int i) {
        return i & 240;
    }

    /* renamed from: b */
    public final int m26248b(int i) {
        return i & (-241);
    }

    /* renamed from: c */
    public final boolean m26247c(int i) {
        return i == 68 || i == 0 || i == 64 || i == 4;
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: d */
    public final int m26246d(int i, int i2) {
        int a = m26249a(i);
        if (a == 16) {
            return 3;
        }
        if (a == 32) {
            return 5;
        }
        if (a != 48) {
            return i2;
        }
        return 1;
    }

    /* renamed from: e */
    public final int m26245e(int i, int i2) {
        int b = m26248b(i);
        if (b == 1) {
            return 48;
        }
        if (b == 2) {
            return 80;
        }
        if (b != 3) {
            return i2;
        }
        return 16;
    }
}
