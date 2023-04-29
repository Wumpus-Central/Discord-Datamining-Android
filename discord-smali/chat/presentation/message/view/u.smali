.class public final synthetic Lcom/discord/chat/presentation/message/view/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/FileAttachmentView;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/u;->k:Lcom/discord/chat/presentation/message/view/FileAttachmentView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/u;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/u;->m:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/chat/presentation/message/view/u;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/u;->k:Lcom/discord/chat/presentation/message/view/FileAttachmentView;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/u;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/u;->m:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/chat/presentation/message/view/u;->n:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->c(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
