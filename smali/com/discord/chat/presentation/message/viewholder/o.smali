.class public final synthetic Lcom/discord/chat/presentation/message/viewholder/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:Lcom/discord/chat/bridge/sticker/Sticker;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/sticker/Sticker;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/o;->k:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/o;->l:Lcom/discord/chat/bridge/sticker/Sticker;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/viewholder/o;->k:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/viewholder/o;->l:Lcom/discord/chat/bridge/sticker/Sticker;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/viewholder/StickerLottieViewHolder;->a(Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/sticker/Sticker;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
