package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaPlayerManagerModule;
import com.discord.media_player.MediaSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediaView$registerForPortal$3 extends s implements Function1<View, Unit> {
    final /* synthetic */ MediaPlayer $mediaPlayer;
    final /* synthetic */ MediaSource $mediaSource;
    final /* synthetic */ double $portal;
    final /* synthetic */ MediaView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView$registerForPortal$3(MediaView mediaView, MediaPlayer mediaPlayer, double d10, MediaSource mediaSource) {
        super(1);
        this.this$0 = mediaView;
        this.$mediaPlayer = mediaPlayer;
        this.$portal = d10;
        this.$mediaSource = mediaSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f22035a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        MediaPlayerManagerModule mediaPlayerManagerModule;
        MediaSource mediaSource;
        q.g(it, "it");
        this.this$0.mediaVolumeOn = !this.$mediaPlayer.isMuted();
        mediaPlayerManagerModule = this.this$0.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.stopPlayerProgressInterval(this.$portal);
        }
        Double portal = this.$mediaSource.getPortal();
        mediaSource = this.this$0.mediaSource;
        if (!q.a(portal, mediaSource != null ? mediaSource.getPortal() : null) || this.$mediaPlayer.hasEnded() || !this.this$0.isAttachedToWindow()) {
            this.this$0.releasePlayer();
        }
    }
}