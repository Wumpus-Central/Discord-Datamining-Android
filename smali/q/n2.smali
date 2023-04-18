.class public final synthetic Lq/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/p2;


# direct methods
.method public synthetic constructor <init>(Lq/p2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/n2;->k:Lq/p2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/n2;->k:Lq/p2;

    invoke-static {v0}, Lq/p2;->i(Lq/p2;)V

    return-void
.end method
