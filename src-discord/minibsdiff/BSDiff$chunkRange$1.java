package com.discord.minibsdiff;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BSDiff$chunkRange$1 extends s implements Function1<Long, Integer> {
    final  long $total;

    
    
    public BSDiff$chunkRange$1(long j10) {
        super(1);
        this.$total = j10;
    }

    public final Integer invoke(long j10) {
        return Integer.valueOf((int) Math.min(this.$total - j10, 1000000L));
    }

    @Override 
    public   Integer invoke(Long l10) {
        return invoke(l10.longValue());
    }
}
