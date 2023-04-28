package com.discord.media_player;

import com.discord.media_player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/media_player/MediaPlayer$Event;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class MediaPlayer$eventListener$1 extends AbstractC9679s implements Function1<MediaPlayer.Event, Unit> {
    public static final MediaPlayer$eventListener$1 INSTANCE = new MediaPlayer$eventListener$1();

    MediaPlayer$eventListener$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MediaPlayer.Event event) {
        invoke2(event);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MediaPlayer.Event it) {
        C9677q.m14633g(it, "it");
    }
}
