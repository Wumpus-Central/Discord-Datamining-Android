.class final Lcom/discord/chat/input/views/ChatInputRootView$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/input/views/ChatInputRootView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "selStart",
        "",
        "selEnd",
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
.field final synthetic this$0:Lcom/discord/chat/input/views/ChatInputRootView;


# direct methods
.method constructor <init>(Lcom/discord/chat/input/views/ChatInputRootView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/input/views/ChatInputRootView$2;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/input/views/ChatInputRootView$2;->invoke(II)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(II)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/discord/chat/input/views/ChatInputRootView$2;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-static {v0}, Lcom/discord/chat/input/views/ChatInputRootView;->access$getCurrentTextFlow$p(Lcom/discord/chat/input/views/ChatInputRootView;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    new-instance v1, Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;

    .line 3
    iget-object v2, p0, Lcom/discord/chat/input/views/ChatInputRootView$2;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-static {v2}, Lcom/discord/chat/input/views/ChatInputRootView;->access$getEditText$p(Lcom/discord/chat/input/views/ChatInputRootView;)Lcom/discord/chat/input/views/DCDChatInput;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/discord/chat/input/views/ChatInputRootView$2;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-static {v3}, Lcom/discord/chat/input/views/ChatInputRootView;->access$getLastEditId$p(Lcom/discord/chat/input/views/ChatInputRootView;)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-direct {v1, p1, p2, v2, v3}, Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method
