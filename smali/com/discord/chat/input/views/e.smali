.class public final synthetic Lcom/discord/chat/input/views/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic l:Lcom/discord/chat/input/views/DCDChatInput;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/discord/chat/input/views/DCDChatInput;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/input/views/e;->k:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Lcom/discord/chat/input/views/e;->l:Lcom/discord/chat/input/views/DCDChatInput;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/input/views/e;->k:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Lcom/discord/chat/input/views/e;->l:Lcom/discord/chat/input/views/DCDChatInput;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/discord/chat/input/views/DCDChatInput;->a(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/discord/chat/input/views/DCDChatInput;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
