package com.discord.media.utils;

import id.zelory.compressor.constraint.Compression;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Lid/zelory/compressor/constraint/Compression;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MediaResolver$handleImage$compressed$1 extends AbstractC9973s implements Function1<Compression, Unit> {
    final /* synthetic */ int $compressionQuality;
    final /* synthetic */ boolean $shouldResize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$handleImage$compressed$1(int i, boolean z) {
        super(1);
        this.$compressionQuality = i;
        this.$shouldResize = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Compression compression) {
        invoke2(compression);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Compression compress) {
        C9971q.m14633g(compress, "$this$compress");
        compress.m19870a(new QualityAndResolutionConstraint(this.$compressionQuality, this.$shouldResize));
    }
}
