.class public final synthetic Lcom/discord/security_key/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldb/e;


# instance fields
.field public final synthetic a:Lcom/discord/security_key/WebAuthn;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/security_key/WebAuthn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/security_key/b;->a:Lcom/discord/security_key/WebAuthn;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/security_key/b;->a:Lcom/discord/security_key/WebAuthn;

    invoke-static {v0, p1}, Lcom/discord/security_key/WebAuthn;->a(Lcom/discord/security_key/WebAuthn;Ljava/lang/Exception;)V

    return-void
.end method
