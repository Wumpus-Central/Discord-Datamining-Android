.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function2;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/g;->k:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/g;->l:Ljava/lang/String;

    iput-wide p3, p0, Lcom/discord/chat/presentation/message/viewholder/g;->m:J

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/g;->k:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/g;->l:Ljava/lang/String;

    iget-wide v2, p0, Lcom/discord/chat/presentation/message/viewholder/g;->m:J

    invoke-static {v0, v1, v2, v3, p1}, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageActionBarViewHolder;->b(Lkotlin/jvm/functions/Function2;Ljava/lang/String;JLandroid/view/View;)V

    return-void
.end method
