.class final Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt;->animateBackgroundColor(Landroid/view/View;JII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/animation/Animator;",
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
        "Landroid/animation/Animator;",
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
.field final synthetic $delay:J

.field final synthetic $endColor:I

.field final synthetic $startColor:I

.field final synthetic $this_animateBackgroundColor:Landroid/view/View;


# direct methods
.method constructor <init>(IIJLandroid/view/View;)V
    .locals 0

    iput p1, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$endColor:I

    iput p2, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$startColor:I

    iput-wide p3, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$delay:J

    iput-object p5, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$this_animateBackgroundColor:Landroid/view/View;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/animation/Animator;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->invoke(Landroid/animation/Animator;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/animation/Animator;)V
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-wide v1, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$delay:J

    iget-object v3, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$this_animateBackgroundColor:Landroid/view/View;

    iget v4, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$endColor:I

    iget v5, p0, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt$animateBackgroundColor$1;->$startColor:I

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt;->animateBackgroundColor$anim$default(JLandroid/view/View;IILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method
