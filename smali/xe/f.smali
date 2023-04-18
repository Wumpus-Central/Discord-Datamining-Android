.class public final synthetic Lxe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lxe/g;


# direct methods
.method public synthetic constructor <init>(Lxe/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/f;->k:Lxe/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lxe/f;->k:Lxe/g;

    invoke-static {v0}, Lxe/g;->l(Lxe/g;)V

    return-void
.end method
