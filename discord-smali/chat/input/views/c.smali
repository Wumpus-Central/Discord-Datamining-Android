.class public final synthetic Lcom/discord/chat/input/views/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/s0;


# instance fields
.field public final synthetic a:Lcom/discord/chat/input/views/ChatInputRootView;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/input/views/ChatInputRootView;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/input/views/c;->a:Lcom/discord/chat/input/views/ChatInputRootView;

    iput-object p2, p0, Lcom/discord/chat/input/views/c;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroidx/core/view/ContentInfoCompat;)Landroidx/core/view/ContentInfoCompat;
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/input/views/c;->a:Lcom/discord/chat/input/views/ChatInputRootView;

    iget-object v1, p0, Lcom/discord/chat/input/views/c;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1, p2}, Lcom/discord/chat/input/views/ChatInputRootView;->c(Lcom/discord/chat/input/views/ChatInputRootView;Landroid/content/Context;Landroid/view/View;Landroidx/core/view/ContentInfoCompat;)Landroidx/core/view/ContentInfoCompat;

    move-result-object p1

    return-object p1
.end method
