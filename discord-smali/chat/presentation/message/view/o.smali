.class public final synthetic Lcom/discord/chat/presentation/message/view/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function3;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/o;->k:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/o;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/o;->m:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/chat/presentation/message/view/o;->n:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/o;->k:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/o;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/o;->m:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/chat/presentation/message/view/o;->n:Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/discord/chat/presentation/message/view/EmbedView;->d(Lkotlin/jvm/functions/Function3;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/view/View;)V

    return-void
.end method
