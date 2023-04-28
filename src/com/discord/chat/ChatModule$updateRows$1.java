package com.discord.chat;

import bj.C3643f;
import com.discord.chat.bridge.row.RowSerializer;
import com.discord.chat.listmanager.ChatListManager;
import com.discord.chatreplay.logger.RowLogger;
import com.discord.crash_reporting.CrashReporting;
import com.discord.tti_manager.TTIMetrics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.json.Json;
import nf.C11093t;
import nf.C11098x;
import p267of.C11289v;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m15073d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "manager", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.chat.ChatModule$updateRows$1", m14701f = "ChatModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChatModule$updateRows$1 extends AbstractC9938k implements Function2<ChatListManager, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $rowsJSON;
    final /* synthetic */ int $tag;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatModule$updateRows$1(ChatModule chatModule, int i, String str, Continuation<? super ChatModule$updateRows$1> continuation) {
        super(2, continuation);
        this.this$0 = chatModule;
        this.$tag = i;
        this.$rowsJSON = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatModule$updateRows$1 chatModule$updateRows$1 = new ChatModule$updateRows$1(this.this$0, this.$tag, this.$rowsJSON, continuation);
        chatModule$updateRows$1.L$0 = obj;
        return chatModule$updateRows$1;
    }

    public final Object invoke(ChatListManager chatListManager, Continuation<? super Unit> continuation) {
        return ((ChatModule$updateRows$1) create(chatListManager, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        RowLogger rowUpdateLoggerFor;
        int i;
        int i2;
        Map k;
        Json json;
        C13080d.m4646d();
        if (this.label == 0) {
            C11093t.m10930b(obj);
            ChatListManager chatListManager = (ChatListManager) this.L$0;
            rowUpdateLoggerFor = this.this$0.rowUpdateLoggerFor(this.$tag);
            rowUpdateLoggerFor.logRowsUpdate(this.$rowsJSON);
            try {
                json = this.this$0.json;
                String str = this.$rowsJSON;
                json.mo611a();
                chatListManager.updateRows((List) json.mo578b(new C3643f(RowSerializer.INSTANCE), str));
            } catch (Exception e) {
                CrashReporting crashReporting = CrashReporting.INSTANCE;
                i = this.this$0.previousRowUpdateTag;
                ChatModule chatModule = this.this$0;
                i2 = chatModule.previousRowUpdateTag;
                k = C11289v.m10248k(C11098x.m10921a("tag", String.valueOf(this.$tag)), C11098x.m10921a("tagRowSize", String.valueOf(chatListManager.getRowCount())), C11098x.m10921a("previousTag", String.valueOf(i)), C11098x.m10921a("previousTagRowSize", String.valueOf(chatModule.getChatListManager(i2).getRowCount())));
                CrashReporting.addBreadcrumb$default(crashReporting, "Bad row update", k, null, 4, null);
                crashReporting.captureException(new Exception("Failed to update rows", e));
                String str2 = this.$rowsJSON;
                String message = e.getMessage();
                C9971q.m14636d(message);
                chatListManager.handleError(str2, message);
            }
            TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Finish", 0L, null, false, 14, null);
            this.this$0.previousRowUpdateTag = this.$tag;
            return Unit.f22042a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
