.class final Lcom/discord/chat/presentation/message/view/MessageContentView$shadowView$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/MessageContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/MessageContentView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/MessageContentView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/MessageContentView$shadowView$2;->this$0:Lcom/discord/chat/presentation/message/view/MessageContentView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;
    .locals 4

    .line 2
    new-instance v0, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/MessageContentView$shadowView$2;->this$0:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;-><init>(Landroid/content/Context;)V

    .line 3
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/MessageContentView$shadowView$2;->this$0:Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 4
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView$shadowView$2;->invoke()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    move-result-object v0

    return-object v0
.end method
