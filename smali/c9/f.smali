.class public final synthetic Lc9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lc9/h;


# direct methods
.method public synthetic constructor <init>(Lc9/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/f;->k:Lc9/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc9/f;->k:Lc9/h;

    invoke-static {v0}, Lc9/h;->a(Lc9/h;)V

    return-void
.end method
