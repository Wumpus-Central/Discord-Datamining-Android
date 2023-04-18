.class public final synthetic Lq/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/w;


# direct methods
.method public synthetic constructor <init>(Lq/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/s;->k:Lq/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/s;->k:Lq/w;

    invoke-virtual {v0}, Lq/w;->j0()J

    return-void
.end method
