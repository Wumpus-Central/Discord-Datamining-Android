.class final Lcom/discord/chat/input/views/ChatInputRootView$lineHeightMeasurer$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "height",
        "",
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

    iput-object p1, p0, Lcom/discord/chat/input/views/ChatInputRootView$lineHeightMeasurer$1;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/discord/chat/input/views/ChatInputRootView$lineHeightMeasurer$1;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/discord/chat/input/views/ChatInputRootView$lineHeightMeasurer$1;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-virtual {v0}, Lcom/discord/chat/input/views/ChatInputRootView;->getListener()Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/discord/chat/input/views/ChatInputRootView$lineHeightMeasurer$1;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    move-result v1

    float-to-int v1, v1

    .line 4
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    move-result p1

    float-to-int p1, p1

    .line 5
    invoke-interface {v0, v1, p1}, Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;->onContentSizeChange(II)V

    :cond_0
    return-void
.end method
