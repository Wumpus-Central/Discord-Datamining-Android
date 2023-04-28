package com.discord.image.fresco;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import p381v5.AbstractC13330c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class FrescoFetchDecodedImageKt$fetchDecodedImage$6$1 extends AbstractC9679s implements Function1<Throwable, Unit> {
    final /* synthetic */ DataSource<CloseableReference<AbstractC13330c>> $imageDataSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrescoFetchDecodedImageKt$fetchDecodedImage$6$1(DataSource<CloseableReference<AbstractC13330c>> dataSource) {
        super(1);
        this.$imageDataSource = dataSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        this.$imageDataSource.close();
    }
}
