.class public final synthetic Lcom/discord/qr/scanner/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/qr/scanner/QRScanner;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/qr/scanner/QRScanner;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/qr/scanner/a;->k:Lcom/discord/qr/scanner/QRScanner;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/qr/scanner/a;->k:Lcom/discord/qr/scanner/QRScanner;

    invoke-static {v0}, Lcom/discord/qr/scanner/QRScanner;->a(Lcom/discord/qr/scanner/QRScanner;)V

    return-void
.end method
