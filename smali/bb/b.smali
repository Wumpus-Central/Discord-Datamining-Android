.class public final synthetic Lbb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lbb/a;


# direct methods
.method public synthetic constructor <init>(Lbb/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbb/b;->k:Lbb/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lbb/b;->k:Lbb/a;

    invoke-static {v0}, Lbb/a;->e(Lbb/a;)V

    return-void
.end method
