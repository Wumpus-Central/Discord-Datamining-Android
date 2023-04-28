package com.facebook.datasource;

/* renamed from: com.facebook.datasource.b */
/* loaded from: classes7.dex */
public abstract class AbstractC4779b<T> implements AbstractC4782d<T> {
    @Override // com.facebook.datasource.AbstractC4782d
    public void onCancellation(DataSource<T> dataSource) {
    }

    @Override // com.facebook.datasource.AbstractC4782d
    public void onFailure(DataSource<T> dataSource) {
        try {
            onFailureImpl(dataSource);
        } finally {
            dataSource.close();
        }
    }

    protected abstract void onFailureImpl(DataSource<T> dataSource);

    @Override // com.facebook.datasource.AbstractC4782d
    public void onNewResult(DataSource<T> dataSource) {
        boolean a = dataSource.mo32020a();
        try {
            onNewResultImpl(dataSource);
        } finally {
            if (a) {
                dataSource.close();
            }
        }
    }

    protected abstract void onNewResultImpl(DataSource<T> dataSource);

    @Override // com.facebook.datasource.AbstractC4782d
    public void onProgressUpdate(DataSource<T> dataSource) {
    }
}
