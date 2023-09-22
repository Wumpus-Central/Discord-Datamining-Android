package com.discord.chat;

import cj.f;
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
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import pf.t;
import pf.x;
import qf.v;
import vf.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "manager", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.ChatModule$updateRows$1", f = "ChatModule.kt", l = {}, m = "invokeSuspend")

final class ChatModule$updateRows$1 extends k implements Function2<ChatListManager, Continuation<? super Unit>, Object> {
    final  String $rowsJSON;
    final  int $tag;
     Object L$0;
    int label;
    final  ChatModule this$0;

    
    
    public ChatModule$updateRows$1(ChatModule chatModule, int i10, String str, Continuation<? super ChatModule$updateRows$1> continuation) {
        super(2, continuation);
        this.this$0 = chatModule;
        this.$tag = i10;
        this.$rowsJSON = str;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatModule$updateRows$1 chatModule$updateRows$1 = new ChatModule$updateRows$1(this.this$0, this.$tag, this.$rowsJSON, continuation);
        chatModule$updateRows$1.L$0 = obj;
        return chatModule$updateRows$1;
    }

    public final Object invoke(ChatListManager chatListManager, Continuation<? super Unit> continuation) {
        return ((ChatModule$updateRows$1) create(chatListManager, continuation)).invokeSuspend(Unit.f21600a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        RowLogger rowUpdateLoggerFor;
        int i10;
        int i11;
        Map k10;
        Json json;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            ChatListManager chatListManager = (ChatListManager) this.L$0;
            rowUpdateLoggerFor = this.this$0.rowUpdateLoggerFor(this.$tag);
            rowUpdateLoggerFor.logRowsUpdate(this.$rowsJSON);
            try {
                json = this.this$0.json;
                String str = this.$rowsJSON;
                json.a();
                chatListManager.updateRows((List) json.b(new f(RowSerializer.INSTANCE), str));
            } catch (Exception e10) {
                CrashReporting crashReporting = CrashReporting.INSTANCE;
                i10 = this.this$0.previousRowUpdateTag;
                ChatModule chatModule = this.this$0;
                i11 = chatModule.previousRowUpdateTag;
                k10 = v.k(x.a("tag", String.valueOf(this.$tag)), x.a("tagRowSize", String.valueOf(chatListManager.getRowCount())), x.a("previousTag", String.valueOf(i10)), x.a("previousTagRowSize", String.valueOf(chatModule.getChatListManager(i11).getRowCount())));
                CrashReporting.addBreadcrumb$default(crashReporting, "Bad row update", k10, null, 4, null);
                crashReporting.captureException(new Exception("Failed to update rows", e10));
                String str2 = this.$rowsJSON;
                String message = e10.getMessage();
                q.e(message);
                chatListManager.handleError(str2, message);
            }
            TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Finish", 0L, null, false, 14, null);
            this.this$0.previousRowUpdateTag = this.$tag;
            return Unit.f21600a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
