.class public final synthetic Lq/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/w0;


# direct methods
.method public synthetic constructor <init>(Lw/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/o2;->k:Lw/w0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq/o2;->k:Lw/w0;

    invoke-static {v0}, Lq/p2;->j(Lw/w0;)V

    return-void
.end method
