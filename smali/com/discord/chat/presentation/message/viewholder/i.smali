.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function3;

.field public final synthetic l:Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/i;->k:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/i;->l:Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/i;->k:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/i;->l:Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;->a(Lkotlin/jvm/functions/Function3;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;Landroid/view/View;)V

    return-void
.end method
