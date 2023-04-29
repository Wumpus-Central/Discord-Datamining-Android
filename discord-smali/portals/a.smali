.class public final synthetic Lcom/discord/portals/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:D


# direct methods
.method public synthetic constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/discord/portals/a;->k:D

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-wide v0, p0, Lcom/discord/portals/a;->k:D

    invoke-static {v0, v1}, Lcom/discord/portals/PortalViewModule;->a(D)V

    return-void
.end method
