.class public final synthetic Lcom/discord/security_key/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/f;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/security_key/c;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/security_key/c;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lcom/discord/security_key/WebAuthn;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method
