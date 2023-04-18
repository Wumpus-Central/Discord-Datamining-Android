.class public final synthetic Lcom/discord/chat/messagemanager/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;

.field public final synthetic l:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/messagemanager/c;->k:Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;

    iput-object p2, p0, Lcom/discord/chat/messagemanager/c;->l:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/messagemanager/c;->k:Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;

    iget-object v1, p0, Lcom/discord/chat/messagemanager/c;->l:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;->a(Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
