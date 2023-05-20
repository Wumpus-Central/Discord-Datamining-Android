package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "url", "", "filename", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MessageAccessoriesAdapter$onBindViewHolder$37 extends s implements Function2<String, String, Unit> {
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onBindViewHolder$37(MessageAccessoriesAdapter messageAccessoriesAdapter) {
        super(2);
        this.this$0 = messageAccessoriesAdapter;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f22076a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String url, String filename) {
        ChatEventHandler chatEventHandler;
        String str;
        q.g(url, "url");
        q.g(filename, "filename");
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        str = this.this$0.messageId;
        q.d(str);
        chatEventHandler.mo142onLinkClickedu7_MRrM(str, url, filename);
    }
}
