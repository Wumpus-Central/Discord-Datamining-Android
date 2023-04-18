.class public final synthetic Lq/v2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/x2;


# direct methods
.method public synthetic constructor <init>(Lq/x2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/v2;->k:Lq/x2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/v2;->k:Lq/x2;

    invoke-static {v0}, Lq/x2;->z(Lq/x2;)V

    return-void
.end method
