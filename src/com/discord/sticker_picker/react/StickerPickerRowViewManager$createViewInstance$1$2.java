package com.discord.sticker_picker.react;

import com.discord.reactevents.ReactEvents;
import com.discord.sticker_picker.StickerPickerRowView;
import com.discord.sticker_picker.react_events.OnLongPressStickerEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "stickerId", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class StickerPickerRowViewManager$createViewInstance$1$2 extends AbstractC9679s implements Function1<String, Unit> {
    final /* synthetic */ StickerPickerRowView $view;
    final /* synthetic */ StickerPickerRowViewManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPickerRowViewManager$createViewInstance$1$2(StickerPickerRowViewManager stickerPickerRowViewManager, StickerPickerRowView stickerPickerRowView) {
        super(1);
        this.this$0 = stickerPickerRowViewManager;
        this.$view = stickerPickerRowView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String stickerId) {
        ReactEvents reactEvents;
        C9677q.m14633g(stickerId, "stickerId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$view, new OnLongPressStickerEvent(stickerId));
    }
}
