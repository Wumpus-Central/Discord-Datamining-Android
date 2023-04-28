package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaPlayerManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MediaView$registerForPortal$2 extends AbstractC9679s implements Function1<View, Unit> {
    final /* synthetic */ MediaPlayer $mediaPlayer;
    final /* synthetic */ double $portal;
    final /* synthetic */ MediaView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView$registerForPortal$2(MediaView mediaView, double d, MediaPlayer mediaPlayer) {
        super(1);
        this.this$0 = mediaView;
        this.$portal = d;
        this.$mediaPlayer = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        MediaPlayerManagerModule mediaPlayerManagerModule;
        C9677q.m14633g(it, "it");
        mediaPlayerManagerModule = this.this$0.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.startPlayerProgressInterval(this.$portal, this.$mediaPlayer);
        }
        this.this$0.play();
    }
}
