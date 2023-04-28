package com.discord.media.engine;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"<anonymous>", "", "codecs", "", "", "invoke", "([Ljava/lang/String;)V"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MediaEngineModule$getSupportedVideoCodecs$1 extends AbstractC9679s implements Function1<String[], Unit> {
    final /* synthetic */ Callback $callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$getSupportedVideoCodecs$1(Callback callback) {
        super(1);
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String[] strArr) {
        invoke2(strArr);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String[] codecs) {
        C9677q.m14633g(codecs, "codecs");
        this.$callback.invoke(NativeArrayExtensionsKt.toNativeArray(codecs));
    }
}
