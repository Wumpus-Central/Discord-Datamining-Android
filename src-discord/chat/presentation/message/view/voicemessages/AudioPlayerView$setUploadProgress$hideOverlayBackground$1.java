package com.discord.chat.presentation.message.view.voicemessages;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudioPlayerView$setUploadProgress$hideOverlayBackground$1 extends s implements Function0<Unit> {
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$setUploadProgress$hideOverlayBackground$1(AudioPlayerView audioPlayerView) {
        super(0);
        this.this$0 = audioPlayerView;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LinearLayout linearLayout = this.this$0.getBinding().uploadOverlayBackground;
        q.f(linearLayout, "binding.uploadOverlayBackground");
        linearLayout.setVisibility(8);
        this.this$0.uploadFinished = true;
    }
}
