.class final Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/system/SystemMessageView;->setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $message:Lcom/discord/chat/bridge/Message;

.field final synthetic $onLongClick:Landroid/view/View$OnLongClickListener;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/system/SystemMessageView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/system/SystemMessageView;Lcom/discord/chat/bridge/Message;Landroid/view/View$OnLongClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->this$0:Lcom/discord/chat/presentation/message/system/SystemMessageView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->$message:Lcom/discord/chat/bridge/Message;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->$onLongClick:Landroid/view/View$OnLongClickListener;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->invoke$lambda$0(Landroid/view/View;)V

    return-void
.end method

.method private static final invoke$lambda$0(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->invoke(Lcom/discord/chat/presentation/message/view/MessageContentView;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/chat/presentation/message/view/MessageContentView;)V
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->this$0:Lcom/discord/chat/presentation/message/system/SystemMessageView;

    .line 3
    new-instance v1, Lcom/discord/chat/presentation/message/MessageViewAccessibilityDelegate;

    .line 4
    iget-object v2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->$message:Lcom/discord/chat/bridge/Message;

    .line 5
    new-instance v3, Lcom/discord/chat/presentation/message/system/c;

    invoke-direct {v3}, Lcom/discord/chat/presentation/message/system/c;-><init>()V

    .line 6
    iget-object v4, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;->$onLongClick:Landroid/view/View$OnLongClickListener;

    .line 7
    invoke-direct {v1, v2, p1, v3, v4}, Lcom/discord/chat/presentation/message/MessageViewAccessibilityDelegate;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/message/view/MessageContentView;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V

    .line 8
    invoke-static {v0, v1}, Landroidx/core/view/w0;->q0(Landroid/view/View;Landroidx/core/view/a;)V

    return-void
.end method
