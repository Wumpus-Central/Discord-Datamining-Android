.class public final synthetic Lcom/discord/recycler_view/scroller/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/recycler_view/scroller/Scroller;

.field public final synthetic l:I

.field public final synthetic m:Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;

.field public final synthetic n:Lkotlin/jvm/functions/Function0;

.field public final synthetic o:Lkotlin/jvm/functions/Function0;

.field public final synthetic p:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/recycler_view/scroller/Scroller;ILcom/discord/recycler_view/scroller/Scroller$TargetAlignment;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/recycler_view/scroller/a;->k:Lcom/discord/recycler_view/scroller/Scroller;

    iput p2, p0, Lcom/discord/recycler_view/scroller/a;->l:I

    iput-object p3, p0, Lcom/discord/recycler_view/scroller/a;->m:Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;

    iput-object p4, p0, Lcom/discord/recycler_view/scroller/a;->n:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/discord/recycler_view/scroller/a;->o:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/discord/recycler_view/scroller/a;->p:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/discord/recycler_view/scroller/a;->k:Lcom/discord/recycler_view/scroller/Scroller;

    iget v1, p0, Lcom/discord/recycler_view/scroller/a;->l:I

    iget-object v2, p0, Lcom/discord/recycler_view/scroller/a;->m:Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;

    iget-object v3, p0, Lcom/discord/recycler_view/scroller/a;->n:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/discord/recycler_view/scroller/a;->o:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/discord/recycler_view/scroller/a;->p:Lkotlin/jvm/functions/Function0;

    invoke-static/range {v0 .. v5}, Lcom/discord/recycler_view/scroller/Scroller;->a(Lcom/discord/recycler_view/scroller/Scroller;ILcom/discord/recycler_view/scroller/Scroller$TargetAlignment;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
