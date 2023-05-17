package com.discord.media.utils;

import com.linkedin.android.litr.MediaTransformer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class Transcoder$convertCompress$3$1 extends s implements Function0<Unit> {
    final /* synthetic */ String $requestId;
    final /* synthetic */ MediaTransformer $transformer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transcoder$convertCompress$3$1(MediaTransformer mediaTransformer, String str) {
        super(0);
        this.$transformer = mediaTransformer;
        this.$requestId = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$transformer.a(this.$requestId);
    }
}
