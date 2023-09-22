package com.discord.media.utils;

import id.zelory.compressor.constraint.Compression;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/zelory/compressor/constraint/Compression;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaResolver$handleImage$compressed$1 extends s implements Function1<Compression, Unit> {
    final  int $compressionQuality;
    final  boolean $shouldResize;

    
    
    public MediaResolver$handleImage$compressed$1(int i10, boolean z10) {
        super(1);
        this.$compressionQuality = i10;
        this.$shouldResize = z10;
    }

    @Override 
    public   Unit invoke(Compression compression) {
        invoke2(compression);
        return Unit.f21600a;
    }

    
    public final void invoke2(Compression compress) {
        q.h(compress, "$this$compress");
        compress.a(new QualityAndResolutionConstraint(this.$compressionQuality, this.$shouldResize));
    }
}
