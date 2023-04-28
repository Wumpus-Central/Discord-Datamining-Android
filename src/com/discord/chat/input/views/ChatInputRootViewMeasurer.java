package com.discord.chat.input.views;

import android.content.Context;
import com.discord.misc.utilities.measure.HeadlessViewMeasurer;
import com.discord.misc.utilities.measure.HeadlessViewMeasurerExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lcom/discord/chat/input/views/ChatInputRootViewMeasurer;", "", "", "emitMeasuredHeight", "Lcom/discord/chat/input/views/ChatInputRootView;", "", "measureHeight", "", "measureWhenInitialized", "measure", "chatInputRootView", "Lcom/discord/chat/input/views/ChatInputRootView;", "Lkotlin/Function1;", "onHeightChanged", "Lkotlin/jvm/functions/Function1;", "initialized", "Z", "lineCount", "I", "minimumHeightPx", "<init>", "(Lcom/discord/chat/input/views/ChatInputRootView;Lkotlin/jvm/functions/Function1;)V", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ChatInputRootViewMeasurer {
    private final ChatInputRootView chatInputRootView;
    private boolean initialized;
    private int lineCount = 1;
    private int minimumHeightPx = -1;
    private final Function1<Integer, Unit> onHeightChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputRootViewMeasurer(ChatInputRootView chatInputRootView, Function1<? super Integer, Unit> onHeightChanged) {
        C9677q.m14633g(chatInputRootView, "chatInputRootView");
        C9677q.m14633g(onHeightChanged, "onHeightChanged");
        this.chatInputRootView = chatInputRootView;
        this.onHeightChanged = onHeightChanged;
    }

    private final void emitMeasuredHeight() {
        this.onHeightChanged.invoke(Integer.valueOf(Math.max(measureHeight(this.chatInputRootView), this.minimumHeightPx)));
    }

    private final int measureHeight(ChatInputRootView chatInputRootView) {
        Context context = chatInputRootView.getContext();
        C9677q.m14634f(context, "context");
        return HeadlessViewMeasurerExtensionsKt.measureHeadlessView(context, ChatInputRootView.class, new ChatInputRootViewMeasurer$measureHeight$1(this), new HeadlessViewMeasurer.MeasureBounds(Integer.valueOf(this.chatInputRootView.getWidth()), null, 2, null)).getHeight();
    }

    public final void measure(boolean z) {
        if (this.minimumHeightPx == -1 && this.chatInputRootView.getHeight() > 0) {
            this.minimumHeightPx = this.chatInputRootView.getHeight();
        }
        Integer lineCount = this.chatInputRootView.getLineCount();
        if (lineCount == null && this.minimumHeightPx > 0) {
            this.lineCount = 1;
            emitMeasuredHeight();
        } else if (lineCount != null && this.lineCount != lineCount.intValue()) {
            this.lineCount = lineCount.intValue();
            emitMeasuredHeight();
        } else if (!this.initialized && z) {
            this.initialized = true;
            emitMeasuredHeight();
        }
    }
}
