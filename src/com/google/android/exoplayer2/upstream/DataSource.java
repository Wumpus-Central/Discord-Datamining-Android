package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p081e9.AbstractC6774h;
import p081e9.AbstractC6795x;

/* loaded from: classes5.dex */
public interface DataSource extends AbstractC6774h {

    /* loaded from: classes5.dex */
    public interface Factory {
        DataSource createDataSource();
    }

    /* renamed from: b */
    long mo12542b(C5288a aVar);

    /* renamed from: c */
    void mo12541c(AbstractC6795x xVar);

    void close();

    /* renamed from: e */
    Map<String, List<String>> mo12540e();

    /* renamed from: m */
    Uri mo12539m();
}
