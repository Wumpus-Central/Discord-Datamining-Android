.class public final synthetic Lcom/discord/chat/presentation/message/view/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function2;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/t;->k:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/t;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/t;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/t;->k:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/t;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/t;->m:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->b(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
