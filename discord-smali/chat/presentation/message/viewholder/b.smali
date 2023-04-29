.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

.field public final synthetic l:Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/b;->k:Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/b;->l:Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/b;->k:Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/b;->l:Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;->a(Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;Landroid/view/View;)V

    return-void
.end method
