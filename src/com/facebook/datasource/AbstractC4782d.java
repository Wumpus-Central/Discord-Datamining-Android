package com.facebook.datasource;

/* renamed from: com.facebook.datasource.d */
/* loaded from: classes7.dex */
public interface AbstractC4782d<T> {
    void onCancellation(DataSource<T> dataSource);

    void onFailure(DataSource<T> dataSource);

    void onNewResult(DataSource<T> dataSource);

    void onProgressUpdate(DataSource<T> dataSource);
}
