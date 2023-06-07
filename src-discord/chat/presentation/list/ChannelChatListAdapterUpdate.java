package com.discord.chat.presentation.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "", "updateId", "", "preCommit", "Lkotlin/Function0;", "", "postCommit", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getPostCommit", "()Lkotlin/jvm/functions/Function0;", "getPreCommit", "getUpdateId", "()I", "Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "Lcom/discord/chat/presentation/list/PortalViewUpdate;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ChannelChatListAdapterUpdate {
    private final Function0<Unit> postCommit;
    private final Function0<Unit> preCommit;
    private final int updateId;

    private ChannelChatListAdapterUpdate(int i10, Function0<Unit> function0, Function0<Unit> function02) {
        this.updateId = i10;
        this.preCommit = function0;
        this.postCommit = function02;
    }

    public /* synthetic */ ChannelChatListAdapterUpdate(int i10, Function0 function0, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function0, function02);
    }

    public Function0<Unit> getPostCommit() {
        return this.postCommit;
    }

    public Function0<Unit> getPreCommit() {
        return this.preCommit;
    }

    public int getUpdateId() {
        return this.updateId;
    }
}
