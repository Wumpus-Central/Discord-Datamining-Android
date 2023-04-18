.class public final synthetic Lv9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lv9/g;


# direct methods
.method public synthetic constructor <init>(Lv9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/u;->k:Lv9/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lv9/u;->k:Lv9/g;

    invoke-virtual {v0}, Lv9/g;->p()V

    return-void
.end method
