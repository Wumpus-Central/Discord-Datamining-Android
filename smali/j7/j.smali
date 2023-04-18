.class public final synthetic Lj7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lj7/h;


# direct methods
.method public synthetic constructor <init>(Lj7/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/j;->k:Lj7/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj7/j;->k:Lj7/h;

    invoke-static {v0}, Lj7/i$g;->c(Lj7/h;)V

    return-void
.end method
