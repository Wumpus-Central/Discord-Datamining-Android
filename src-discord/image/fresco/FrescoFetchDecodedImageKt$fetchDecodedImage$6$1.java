package com.discord.image.fresco;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import v4.c;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class FrescoFetchDecodedImageKt$fetchDecodedImage$6$1 extends s implements Function1<Throwable, Unit> {
    final  DataSource<CloseableReference<c>> $imageDataSource;

    
    
    public FrescoFetchDecodedImageKt$fetchDecodedImage$6$1(DataSource<CloseableReference<c>> dataSource) {
        super(1);
        this.$imageDataSource = dataSource;
    }

    @Override 
    public   Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f21036a;
    }

    
    public final void invoke2(Throwable th2) {
        this.$imageDataSource.close();
    }
}
