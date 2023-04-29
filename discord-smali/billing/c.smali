.class public final synthetic Lcom/discord/billing/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv2/g;


# instance fields
.field public final synthetic a:Lcom/discord/billing/BillingManager;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/billing/c;->a:Lcom/discord/billing/BillingManager;

    iput-object p2, p0, Lcom/discord/billing/c;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/discord/billing/c;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/billing/c;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/billing/c;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/discord/billing/c;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/discord/billing/c;->g:Landroid/app/Activity;

    iput-object p8, p0, Lcom/discord/billing/c;->h:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lcom/discord/billing/c;->i:Lkotlin/jvm/internal/Ref$BooleanRef;

    return-void
.end method


# virtual methods
.method public final onSkuDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 11

    iget-object v0, p0, Lcom/discord/billing/c;->a:Lcom/discord/billing/BillingManager;

    iget-object v1, p0, Lcom/discord/billing/c;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/discord/billing/c;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/billing/c;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/billing/c;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/billing/c;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/discord/billing/c;->g:Landroid/app/Activity;

    iget-object v7, p0, Lcom/discord/billing/c;->h:Lkotlin/jvm/functions/Function0;

    iget-object v8, p0, Lcom/discord/billing/c;->i:Lkotlin/jvm/internal/Ref$BooleanRef;

    move-object v9, p1

    move-object v10, p2

    invoke-static/range {v0 .. v10}, Lcom/discord/billing/BillingManager;->b(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
