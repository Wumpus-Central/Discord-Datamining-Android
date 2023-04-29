.class public final synthetic Lcom/discord/chat/presentation/message/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/a;->k:Ljava/lang/String;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/a;->l:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/a;->k:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/a;->l:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/view/AltTextButtonView;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroid/view/View;)V

    return-void
.end method
