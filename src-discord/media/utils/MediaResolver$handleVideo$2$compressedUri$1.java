package com.discord.media.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaResolver$handleVideo$2$compressedUri$1 extends s implements Function1<Float, Unit> {
    final  Uri $inputUri;
    final  MediaResolver $this_runCatching;

    
    
    public MediaResolver$handleVideo$2$compressedUri$1(MediaResolver mediaResolver, Uri uri) {
        super(1);
        this.$this_runCatching = mediaResolver;
        this.$inputUri = uri;
    }

    @Override 
    public   Unit invoke(Float f10) {
        invoke(f10.floatValue());
        return Unit.f21444a;
    }

    public final void invoke(float f10) {
        Function2 function2;
        function2 = this.$this_runCatching.onProgress;
        function2.invoke(this.$inputUri, Integer.valueOf((int) (f10 * 100)));
    }
}
