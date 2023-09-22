package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.view.InfoLinkView;
import com.discord.react_asset_fetcher.ReactAsset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/InfoLinkViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/InfoLinkView;", "(Lcom/discord/chat/presentation/message/view/InfoLinkView;)V", "bind", "", "text", "", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "onInfoLinkClicked", "Lkotlin/Function0;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class InfoLinkViewHolder extends MessagePartViewHolder {
    private final InfoLinkView view;

    
    public InfoLinkViewHolder(InfoLinkView view) {
        super(view, null);
        q.h(view, "view");
        this.view = view;
    }

    public final void bind(String text, ReactAsset icon, Function0<Unit> onInfoLinkClicked) {
        q.h(text, "text");
        q.h(icon, "icon");
        q.h(onInfoLinkClicked, "onInfoLinkClicked");
        this.view.configure(text, icon, onInfoLinkClicked);
    }
}
