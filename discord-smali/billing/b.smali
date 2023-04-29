.class public final synthetic Lcom/discord/billing/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv2/d;


# instance fields
.field public final synthetic a:Lcom/discord/billing/BillingManager;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/billing/b;->a:Lcom/discord/billing/BillingManager;

    iput-object p2, p0, Lcom/discord/billing/b;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/discord/billing/b;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/discord/billing/b;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 6

    iget-object v0, p0, Lcom/discord/billing/b;->a:Lcom/discord/billing/BillingManager;

    iget-object v1, p0, Lcom/discord/billing/b;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/discord/billing/b;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/discord/billing/b;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/discord/billing/BillingManager;->g(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
