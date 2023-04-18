.class public final synthetic Lq/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lq/m0$a;


# direct methods
.method public synthetic constructor <init>(Lq/m0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/l0;->a:Lq/m0$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lq/l0;->a:Lq/m0$a;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->o(Ljava/lang/Object;)V

    return-void
.end method
