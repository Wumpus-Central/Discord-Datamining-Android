.class public final synthetic Lq/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/b3;


# direct methods
.method public synthetic constructor <init>(Lq/b3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/z2;->k:Lq/b3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/z2;->k:Lq/b3;

    invoke-static {v0}, Lq/b3;->K(Lq/b3;)V

    return-void
.end method
