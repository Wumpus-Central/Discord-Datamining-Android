.class public final synthetic Lcom/discord/chat/input/views/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lcom/discord/chat/input/views/ChatInputRootView;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/input/views/ChatInputRootView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/input/views/b;->a:Lcom/discord/chat/input/views/ChatInputRootView;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/input/views/b;->a:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-static {v0, p1, p2}, Lcom/discord/chat/input/views/ChatInputRootView;->b(Lcom/discord/chat/input/views/ChatInputRootView;Landroid/view/View;Z)V

    return-void
.end method
